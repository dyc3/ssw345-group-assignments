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

if [[ ! -f plantuml.jar ]]; then
	echo "plantuml.jar could not be found, downloading..."
	curl -L -o plantuml.jar https://github.com/plantuml/plantuml/releases/download/v1.2023.6/plantuml.jar
fi

java -jar plantuml.jar "Figures/*.puml"
