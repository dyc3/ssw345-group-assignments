#!/bin/bash

cd "$(dirname "$0")" || exit 1

# check for mermaid cli
if ! command -v mmdc &> /dev/null; then
	echo "mermaid cli could not be found"
	exit 1
fi

find ./Figures -type f -name "*.mmd" | while read -r file; do
	mmdc -i "$file" -o "${file%.*}.png"
done
