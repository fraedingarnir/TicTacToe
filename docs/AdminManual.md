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
When making a change on the program there are few elements that are helpfull to check before adding to github. First if you are changing the java program or making new functions you should
always run ./gradlew build and if there are any errors you can do ./gradlew test to speed things up for debugging. But when changing anything no matter how small before pushing to github you should
run the command ./gradlew build to make sure that the program builds correctly before pushing to github. As soon as you push to github Travis will run the program like ./gradlew build and after 
heroku will build the program and deploy the app. If there are nay changes made that would not build or app would crash the colliberator of heroku will get e-mail and the devoloper would get notification.


To maintain and check if the program is up to date and running all you need to do is log on github and see readme file to check if travis is green. You can also see the codecoverage to check if the tests for 
the classes are sufficient if you are making changes.



