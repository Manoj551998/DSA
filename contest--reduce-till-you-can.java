package arrays;
import java.util.*;
import java.io.*;


class MissingNumber {
	
    

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int a_thres = sc.nextInt();
        int b = sc.nextInt();
        int b_thres = sc.nextInt();
        int n = sc.nextInt();

        int val1 = solve(a,b,a_thres,b_thres,n);
        System.out.println("a: "+a+" b:"+b);
        int val2 = solve(b,a,b_thres,a_thres,n);
        System.out.println("a: "+a+" b:"+b);
    }


    static int solve(int a, int b , int a_thres, int b_thres, int n){
        int t = Math.min(n,a - a_thres);
        a = a - t;
        n = n - t;
        t = Math.min(n,b-b_thres);
        b = b - t;
        return (a*b);
    }
}
