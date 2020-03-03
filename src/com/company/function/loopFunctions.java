package com.company.function;

public class loopFunctions {

    public int[] whileFunc(int val, int fact) {
        int[] result = new int[2];
        result[0] = val;
        result[1] = fact;

        while (val > 1) {
            fact = fact * val;

            val--;

            System.out.println("inside while loop:" + fact);
        }
        System.out.print("outside while loop: " + fact);
        return result;

    }

    public int[] doWhileFunc(int iVal) {
        int[] result = new int[1];
        result[0]=iVal;
        do {
            iVal = iVal * 2;
            System.out.println("inside do While loop:"+iVal);
        } while (iVal < 25);
        System.out.print("outside do While loop:"+iVal);
       return result;

    }

    public int arraysFunction()
    {
        float[] vals = new float[3];
        vals[0] = 10.0f;
        vals[1] = 20.0f;
        vals[2] = 15.0f;

        float sum = 0.0f;

        for(int index = 0 ; index < vals.length;index++)
        {
            sum = sum + vals[index];

            System.out.println(sum);
        }
        return (int) sum;

    }

}
