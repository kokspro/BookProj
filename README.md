# BookProj
Sun Devil Book Exchange
Welcome to the Sun Devil Book Exchange project! This is a JavaFX application that allows users to manage and exchange books in a community-oriented platform. This README provides all the information you need to set up and run the project.

Table of Contents
Prerequisites
Getting Started
Setting Up JavaFX
Building the Project
Running the Application
Project Structure
Contributing
License
Prerequisites


Before you begin, ensure you have the following installed:

Java Development Kit (JDK) 17 or higher. You can download it from Adoptium or Oracle.
Apache Maven: This is used to manage project dependencies and build the application. You can download it from Maven's official website.

Getting Started
Clone the Repository:
git clone https://github.com/yourusername/SunDevilBookExchange.git
cd SunDevilBookExchange


Set Up Environment Variables:
Create an environment variable JAVA_FX_SDK that points to the JavaFX SDK installation directory.
For example, on Windows:
set JAVA_FX_SDK="C:\Program Files\Java\javafx-sdk-17.0.13"

Setting Up JavaFX
JavaFX is not included in the JDK from version 11 onwards. You need to download the JavaFX SDK separately.
Download JavaFX SDK:
Go to GluonHQ and download the JavaFX SDK version that matches your JDK.
Unzip the downloaded file to a directory of your choice.

Set the Environment Variable:
Ensure the JAVA_FX_SDK environment variable points to the lib folder of the unzipped JavaFX SDK.
Building the Project
Once you have the prerequisites and environment variables set up, you can build the project using Maven.

Open your terminal or command prompt.
Navigate to the project directory.
Run the following command:
mvn clean package
This will compile the code and package it into a JAR file.

Running the Application
To run the application, use the following command in the terminal:

mvn javafx:run
This command starts the JavaFX application using the configuration specified in the pom.xml.

Project Structure
Here’s a brief overview of the project structure:

SunDevilBookExchange/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── sundevilbookexchange/
│   │   │           ├── MainApp.java          # Main application entry point
│   │   │           └── controllers/
│   │   │               └── AdminController.java # Controller for Admin functionalities
│   │   └── resources/
│   │       └── fxml/
│   │           └── Admin.fxml                # FXML layout for Admin interface
├── pom.xml                                   # Maven configuration file
└── README.md                                  # Project documentation
Contributing
If you'd like to contribute to this project, please fork the repository and submit a pull request with your changes. Make sure to follow the project's coding standards and include appropriate tests for your changes.

License
This project is licensed under the MIT License. See the LICENSE file for details.


