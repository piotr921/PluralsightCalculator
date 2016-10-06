package com.selfLearning.calcengine;

/**
 * Created by Comarch on 2016-10-03.
 */
public class Divider extends CalculateBase {
    public Divider(){}
    public Divider(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){
        double value = getLeftVal() / getRightVal();
        setResult(value);
    }
}
