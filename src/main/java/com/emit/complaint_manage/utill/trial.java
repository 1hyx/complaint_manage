package com.emit.complaint_manage.utill;
import weka.classifiers.Classifier;
import weka.classifiers.bayes.NaiveBayesMultinomial;
import weka.classifiers.functions.MultilayerPerceptron;
import weka.core.Instance;
import weka.core.Instances;

public class trial {

    public Classifier classifier(Instances instance) throws Exception {
        MultilayerPerceptron m = new MultilayerPerceptron();
        m.buildClassifier(instance);
        return m;
    }
}
