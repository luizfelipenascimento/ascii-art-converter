#!/bin/bash

# Create the 'out' directory if it does not exist
mkdir -p out

# Find and compile all .java files in the src directory, placing .class files in the out directory
javac -d out $(find src -name "*.java")