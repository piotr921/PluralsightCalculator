package com.selfLearning.calcengine;

/**
 * Created by Comarch on 2016-10-06.
 */
public interface MathProcessing {
    String SEPARATOR = " ";
    String getKeyword();
    char getSymbol();
    double doCalculation(double leftVal, double rightVal);
}
