package hw;
import java.util.Scanner;

public class hw01_105021062 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int a=1;
		int b=1;
		int c=0;
		System.out.print("1,1,");
		while(a!=c){
			 c=a+b;
			 b=a;
			 a=c;
			 System.out.print(c+",");

	}
	}
}
