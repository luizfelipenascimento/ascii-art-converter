# Create the 'out' directory if it does not exist
if (!(Test-Path -Path out)) {
    New-Item -ItemType Directory -Path out
}

# Recursively find and compile all .java files in the src directory, placing .class files in the out directory
Get-ChildItem -Recurse -Filter *.java -Path src | ForEach-Object {
    javac -d out $_.FullName
}