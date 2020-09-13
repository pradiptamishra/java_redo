import java.util.*;
import java.lang.*;

class Solution {
    public int solution(int N) {
       String binaryn = Integer.toBinaryString(N);
       int n=binaryn.length();
       int gapmax=-1;
       int gap=0;
       for(int i=0; i<n; i++){
          
          if(Integer.parseInt(String.valueOf(binaryn.charAt(i)))==0){  
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
}