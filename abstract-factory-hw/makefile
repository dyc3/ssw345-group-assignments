JAVA_FILES = $(shell find src -name '*.java')

all:
	mkdir -p bin
	javac -d bin $(JAVA_FILES)

run: all
	java -classpath bin abstract_factory_hw.Main

test: all
	javac -d bin -cp bin:../junit-platform-console-standalone-1.9.0.jar test/**/*.java
	java -jar ../junit-platform-console-standalone-1.9.0.jar --class-path bin --scan-class-path

clean:
	rm -rf bin
