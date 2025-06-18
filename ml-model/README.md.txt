Machine Learning- Expense Category Classification


This module is the part of the Expense Tracker System. It classifies expenses into categories like 'Food','Medical','Transport',etc. using a J48 Decision Tree Classifier from the Weka Library.

##Files
-'App.java'-Main Java class that trains and evaluates the model.
-'MyTransaction.csv'-Sample dataset used for training.
-'pom.xml'-Maven configuration with all dependencies.
-'model-output.txt'-Summary of model performance and usage.

##Technologies used
-Java
-Weka ML Library
-Maven (for build management)
-CSV (as input format)


##How to run
1.Open the project in Eclipse or IntelliJ.
2.Ensure 'MyTransaction.csv' is present in 'src/main/resources/'.
3.Run 'App.java' as a Java application.
4.Model outputs and accuracy will be printed in the console.


##The final '.java' class can be integrated with the JDBC backend and JavaFx frontend.
Use the trained model logic to auto-classify new expense entries at runtime.

##Model used
-'weka.classifiers.trees.J48'
-Accuracy Acheived:93.54%
