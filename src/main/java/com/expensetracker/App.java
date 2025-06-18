package com.expensetracker;

import weka.classifiers.Classifier;
import weka.classifiers.trees.J48;
import weka.core.Instances;
import weka.core.converters.CSVLoader;
import weka.core.SerializationHelper;

import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        CSVLoader loader = new CSVLoader();
        loader.setSource(new File("src/main/resources/MyTransaction1.csv"));
        Instances data = loader.getDataSet();
        data.setClassIndex(0); 
        Classifier classifier = new J48();
        classifier.buildClassifier(data);

        SerializationHelper.write("src/main/resources/j48-expense.model", classifier);

        int correct = 0;
        for (int i = 0; i < data.numInstances(); i++) {
            double predicted = classifier.classifyInstance(data.instance(i));
            if (predicted == data.instance(i).classValue()) {
                correct++;
            }
        }

        int total = data.numInstances();
        double accuracy = 100.0 * correct / total;

        System.out.println("Model: J48");
        System.out.println("Total Samples: " + total);
        System.out.println("Correct Predictions: " + correct);
        System.out.printf("Accuracy: %.2f%%\n", accuracy);
    }
}
