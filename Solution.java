import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {
    
    public void nCr(int n,int r){
            int i,j;
            BigInteger m;
            long x = (long)Math.pow(10,9);
            BigInteger p = new BigInteger(Long.toString(x));
            BigInteger num = new BigInteger("1");
            BigInteger den = new BigInteger("1");
            for(i=n,j=1;j<=r;i--,j++){
                num = num.multiply(new BigInteger(Integer.toString(i)));
                den = den.multiply(new BigInteger(Integer.toString(j)));
            }
        m = (num.divide(den)).mod(p); 
        if(((num.divide(den)).toString().length())>8)
            System.out.print(m +" ");
        else
            System.out.print((num.divide(den))+" ");
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Solution s = new Solution();
        int n;
        for(int j=0; j<t; j++){
            n = scan.nextInt();
            for(int k =0; k<=n;k++){
            s.nCr(n,k);
            }
         System.out.println();   
        }
    }
}
