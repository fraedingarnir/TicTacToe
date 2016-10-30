Aministration Manual
===================
by Fræðingarnir
---------------------


* Alex Kári Ívarsson
* Arnar Jóhannsson
* Egill Örn Benediktsson
* Hjálmar Diego Arnórsson
* Jón Heiðar Sigmundsson


##Introduction
Welcome to the TicTacToe project by Fræðingarnir. This manual will provide you with all the information How to deploy, run and maintain the web application.


##Getting Started 
These tools will be needed to run the following project


>* Git	
* Java JDK 8
* Gradle


###Installing tools


 1. Install and set up Git: https://help.github.com/articles/set-up-git/

 2. Install and set up Java JDK 8, run in your favorite shell

 3. Install and set up Gradle, run in your favorite shell
 
 4. Install Travis

 5. Install Heroku

 >* Fork the TicTacToe repository 
 >* Clone the repository to your local computer


#Deploying and maintaining
When making a change to the program there are few things that are helpful to check before adding to github. First if you are changing a java file or making new functions you should always run '$ ./gradlew build'. If there are any build errors you can do '$ ./gradlew test' to debug the problem. When changing anything no matter how small you should always run the command '$ ./gradlew build' before pushing to github to make sure that the program builds correctly. As soon as you push to github Travis will build the program and afterwards heroku will build the app and deploy it to the web. If there are any changes made that would not build or app would crash the colliberator of Heroku and Travis will get an e-mail and the devoloper would get a notification.


To maintain and check if the program is up to date and running, all you need to do is log on to github and look at the readme file to check if travis is green and passing. You can also see the codecoverage to check if the tests for the classes are sufficient to your changes.



