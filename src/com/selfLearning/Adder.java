package com.selfLearning;

/**
 * Created by Comarch on 2016-10-03.
 */
public class Adder extends CalculateBase{

    public Adder(){}
    public Adder(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){
        double value = getLeftVal() + getRightVal();
        setResult(value);
    }
}
