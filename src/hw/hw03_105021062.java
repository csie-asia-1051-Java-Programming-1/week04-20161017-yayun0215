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
			 System.out.print("�п�J���\n"+"��J999������\n");
			 d=scn.nextInt();
			 if(d>0){
				 a=a+1;
			 }else if(d<0){
				 b=b+1;
				 
			 }else if (d==0){
				 c=c+1;
			 }
			 	
		}System.out.println(a-1+"�ӥ���"+b+"�ӭt��"+c+"��0");

	}

}
