#!/bin/bash
# set -o xtrace
set -o nounset
set -o pipefail

readonly work_dir="$(dirname "$(readlink --canonicalize-existing "${0}")")"
readonly work_dir_relative="$(dirname "${0}")"
readonly target_dir="${work_dir}/target"
readonly build_file="${work_dir}/build.sh"
readonly error_missing_jar_file=80
readonly error_build_file_not_found=81

get_jar_file() {
    ls -1 "${target_dir}" | grep --extended-regexp "jar$"
}

get_main_classes() {
    grep --fixed-strings --files-with-matches --recursive \
        'public static void main' "${work_dir}/src" | \
        grep --extended-regexp --only-matching 'src/main/java.*' | \
            sed 's#src/main/java/##' | sed 's#.java##' | tr '/' '.'
}

if [[ ! -f "${build_file}" ]]; then
    echo "error: build file not found (${build_file})" >&2
    exit ${error_build_file_not_found}
fi

if [[ ${#} == 1 ]] && [[ "${1}" == "b" ]]; then
    "${build_file}"
fi

jar_file=$(get_jar_file)
if [[ -z "${jar_file}" ]]; then
    echo "no jar file found in ${target_dir}" >&2
    exit ${error_missing_jar_file}
fi

jar_file="${target_dir}/${jar_file}"

class_to_run=$(get_main_classes | dmenu -b -l 30 -nb "#100" -nf "#b9c0af" -sb "#000" -sf "#afff2f" -i)
if [[ -z "${class_to_run}" ]]; then
    exit 0
fi

java --class-path "${jar_file}" "${class_to_run}"

exit 0