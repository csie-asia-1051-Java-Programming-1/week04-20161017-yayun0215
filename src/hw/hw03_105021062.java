package hw;
import java.util.Scanner;

public class hw03_105021062 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		while  (d!=999)  {
			 System.out.print("請輸入整數\n"+"輸入999為停止\n");
			 d=scn.nextInt();
			 if(d>0){
				 a=a+1;
			 }else if(d<0){
				 b=b+1;
				 
			 }else if (d==0){
				 c=c+1;
			 }
			 	
		}System.out.println(a-1+"個正數"+b+"個負數"+c+"個0");

	}

}
