/**
 * Created by eero on 25/12/16.
 */

public class Exercise_8_8 {

    /**
     * Exercise 8.8
     *1. Write a method called maxInRange that takes an array of integers and
     two indexes, lowIndex and highIndex, and finds the maximum value
     in the array, but only considering the elements between lowIndex and
     highIndex, including both.
     */

    public static double maxInRange(double[]a,int lowInd,int highInd){
        if (lowInd==highInd){
            return a[highInd];
        }


        if(a[lowInd]>=a[highInd]){
            //writing to array[highindex]the highest (searched) value
            a[highInd]=a[lowInd];
            double answer=maxInRange(a,lowInd+1,highInd);
            return answer;
        }else {
            return   maxInRange(a,lowInd+1,highInd);
        }
    }

    //Checking methods maxInRange and max
    public static void main(String[]args){
        double[]array={11,22,13,21,111,0,0,1};
        System.out.println(maxInRange(array,2,3));
        System.out.print(max(array));
    }

    //Write a method called max that takes an array and uses maxInRange to
    //find and return the largest element.
    public static double max(double[]a){
        return maxInRange(a,0,a.length-1);
    }
}

