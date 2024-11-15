# ASCII Art Image Converter in Java

Welcome to the **ASCII Art Image Converter** project! This Java application is designed as a learning exercise to convert images into ASCII art, providing a unique and creative way to display visual content using text.

## Learning Goals
* Practice Java programming skills through a real-world application.
* Understand image processing basics, including pixel manipulation and grayscale conversion.
* Explore loops, conditional statements, and basic data structures in Java.
* Develop a command-line Java application that takes image input and produces ASCII output.
* Implement Design Patterns.

## Getting Started

### Prerequisites
* Java Development Kit (JDK) - JDK 8 or later.
* Text Editor or IDE - Choose an editor like Visual Studio Code, IntelliJ, or Eclipse, VSCODE.

## Setup
1. Clone or download this repository.
2. Open the project folder in your IDE or text editor.
3. Compile the Java files using:
  1. Run compile.sh (for Linux/macOS):
  2. Run compile.ps1 (for Windows):
4. Run the program with:
```bash
java -cp out App
```

## How It Works
1. **Grayscale Conversion:** The program loads the image and converts each pixel to grayscale.

2. **Mapping to ASCII Characters:** Each grayscale value is mapped to an ASCII character based on brightness.

3. **Display Output:** The ASCII representation of the image is displayed in the terminal.

## Example Output
For an input image, the output might look something like:

```bash
@@@@@@@@@@@@@@%%%%#####***++=----::::::::....                
@@@@@@@@@@@@@%%%###***++==--:::::::.....                     
@@@@@@@@@@@@%%%###**++==--::::.....                          
@@@@@@@@@@%%%###**++==--::::....                             
```

## Resources
* [Robert Heaton's ASCII Art Tutorial](https://robertheaton.com/2018/06/12/programming-projects-for-advanced-beginners-ascii-art/) - Inspiration for this project.

## License

This project is licensed under the MIT License - see the LICENSE file for details.
