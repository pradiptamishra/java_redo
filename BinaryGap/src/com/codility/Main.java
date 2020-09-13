package BinaryGap.src.com.codility;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Solution a= new Solution();
        //NumberFormat currency = NumberFormat.getCurrencyInstance();

	    //System.out.println(a.gapMax());
        //System.out.println( currency.format(a.mortgageAmt()));

        int[] A= {1,2,3,4,5,6};
        RotatingArray a= new RotatingArray();
        System.out.println(Arrays.toString(a.solution(A,11)));
    }
}
