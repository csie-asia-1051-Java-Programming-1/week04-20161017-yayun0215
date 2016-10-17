package ex;
import java.util.Scanner;
/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 105021062 鄭雅韵
 */

public class ex01_105021062 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入數值");
		int n=scn.nextInt();
		int a=0;
		int sum=0;
		while(n!=-1){
			sum=sum+n;
			a+=1;
		int b=scn.nextInt();
		n=b;
		}
System.out.println(sum);
			System.out.println(sum/a);
	}

}
