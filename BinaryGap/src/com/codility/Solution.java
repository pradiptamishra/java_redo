package BinaryGap.src.com.codility;

import java.lang.*;
import java.text.NumberFormat;
import java.util.*;

class Solution {
    public int gapMax() {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Number for Binary Max Gap: ");
        int numberFor= scanner.nextInt();
        String binaryN = Integer.toBinaryString(numberFor);
        System.out.println(binaryN);
        int n=binaryN.length();
        int gapmax=0;
        int gap=0;
        for(int i=0; i<n; i++){
            if(Integer.parseInt(String.valueOf(binaryN.charAt(i)))==0){
                gap=gap+1;
            }else{
                if (gapmax<gap) {
                    gapmax=gap;
                }
                gap=0;
            }
        }
        return gapmax;
    }

    public int leastPositive(int[] A) {
        //int L = A.length;
        //Arrays.sort(A);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int j : A) {
            if (j > 0) {
                arrayList.add(j);
            }
        }
        int leastP=0;
        while (true){
            leastP=leastP+1;
            if (!arrayList.contains(leastP)){
                break;
            }
        }
        return leastP;
    }

    public double mortgageAmt(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Principal Amount: ");
        int principal= scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        Float rate = scanner.nextFloat();
        System.out.print("Period (years): ");
        int years= scanner.nextInt();
        double mortgage=0;
        double r=rate/(100*12);
        mortgage=principal*(r*Math.pow((1+r), years*12))/(Math.pow((1+r), years*12)-1);
        return mortgage;
    }



    private void examples(){
        //primitive types variables declaration
        byte age=30;//-128 to 127
        long viewsCount=3_123_456_789L;//in java underscores used instead of comma
        final float PI=3.14F;// long & float need L & F respectively t0 store as constant
        char letter= 'A'; //single character are stored with single quote
        boolean isEligible = false;
        //Reference types variables declaration
        Date now = new Date();
        String message="Hello \"PK\"";
        int[][] numbers= new int[5][6];//print using Arrays.deepToString(numbers)
        int[] newWay={1,2,5,6,9};//array has fixed length
        //Abstract class do not need new object declaration
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String dollars = currency.format(123456.78);
    }
}