package com.selfLearning;

public class Main {

    public static void main(String[] args) {

        String[] statements = {
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0",
        };

        CalculateHelper helper = new CalculateHelper();
        for(String statement:statements){
            helper.process(statement);
            System.out.println(helper.toString());
        }
    }

    /*
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
*/

/*
        System.out.printf("\n" + "Using overloads: " + "\n");

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        MathEquation equationOverloaded = new MathEquation('d');

        equationOverloaded.execute(leftDouble,rightDouble);
        System.out.println("result = " + equationOverloaded.getResult());

        System.out.printf("\n" + "Using inheritance: " + "\n");
        CalculateBase[] calculators = {
                new Divider(100.0d, 50.0d),
                new Adder(25.0d, 92.0d),
                new Subtracter(225.0d, 17.0d),
                new Multiplier(11.0d, 3.0d),
        };

        for(CalculateBase calculator:calculators){
            calculator.calculate();
            System.out.println("result = " + calculator.getResult());
        }
    */

}
