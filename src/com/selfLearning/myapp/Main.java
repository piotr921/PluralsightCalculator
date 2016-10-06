package com.selfLearning.myapp;

import com.selfLearning.calcengine.CalculateHelper;
import com.selfLearning.calcengine.DynamicHelper;
import com.selfLearning.calcengine.InvalidStatementException;
import com.selfLearning.calcengine.MathEquation;
import com.selfLearning.calcengine.CalculateBase;
import com.selfLearning.calcengine.Adder;
import com.selfLearning.calcengine.MathProcessing;
import com.selfLearning.calcengine.Subtracter;
import com.selfLearning.calcengine.Multiplier;
import com.selfLearning.calcengine.Divider;


public class Main {

    public static void main(String[] args) {

        String[] statements = {
                "add 25.0 92.0",
        };

        DynamicHelper helper = new DynamicHelper(new MathProcessing[]{
                new Adder()
        });

        for(String statement:statements){
            String output = helper.process(statement);
            System.out.println(output);
        }

    }

     static void useCalculateHelper () {
        String[] statements = {
                "add 1.0",
                "add xx 25.0",
                "addX 25.0 25.0",
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0",
        };

        CalculateHelper helper = new CalculateHelper();
        for (String statement : statements) {
            try {
                helper.process(statement);
                System.out.println(helper.toString());
            } catch (InvalidStatementException e) {
                System.out.println(e.getMessage());
                if (e.getCause() != null)
                    System.out.println(" Orginal exception: " + e.getCause().getMessage());
            }
        }
    }

        static void useMathEquation(){

            MathEquation[] equations = new MathEquation[4];
            equations[0] = new MathEquation('d', 100.0d, 50.0d);
            equations[1] = new MathEquation('a', 25.0d, 92.0d);
            equations[2] = new MathEquation('s', 225.0d, 17.0d);
            equations[3] = new MathEquation('m', 11.0d, 3.0d);

            for(MathEquation equation: equations){
                equation.execute();
                System.out.println("result = " + equation.getResult());
            }

    }

    static void useCalculatorBase() {
        System.out.printf("\n" + "Using overloads: " + "\n");

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        MathEquation equationOverloaded = new MathEquation('d');

        equationOverloaded.execute(leftDouble, rightDouble);
        System.out.println("result = " + equationOverloaded.getResult());

        System.out.printf("\n" + "Using inheritance: " + "\n");
        CalculateBase[] calculators = {
                new Divider(100.0d, 50.0d),
                new Adder(25.0d, 92.0d),
                new Subtracter(225.0d, 17.0d),
                new Multiplier(11.0d, 3.0d),
        };

        for (CalculateBase calculator : calculators) {
            calculator.calculate();
            System.out.println("result = " + calculator.getResult());
        }
    }
}
