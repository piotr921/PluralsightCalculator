package com.selfLearning;

/**
 * Created by Comarch on 2016-10-03.
 */
public abstract class CalculateBase {
    private double leftVal;
    private double rightVal;
    private double result;

    public double getLeftVal(){return leftVal;};
    public void setLeftVal(double leftVal){this.leftVal = leftVal;};
    public double getRightVal(){return rightVal;};
    public void setRightVal(double rightVal){this.rightVal = rightVal;};
    public double getResult(){return result;};
    public void setResult(double result){this.result = result;};

    public CalculateBase(){}
    public CalculateBase(double leftVal, double rightVal){

    }

    public abstract void calculate();


}
