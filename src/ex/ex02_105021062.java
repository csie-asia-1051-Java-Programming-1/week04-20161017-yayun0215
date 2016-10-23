package ex;
import java.util.Scanner;
/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 105021062 鄭雅韵
 */

public class ex02_105021062 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		char a = 0;
		while (a == 'Y' || a == 'y') {
			System.out.println("請輸入n m的數值");
		}
			int n = scn.nextInt();
			int m = scn.nextInt();
			
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
					System.out.print(i * j + "\t");
				}
				System.out.println();
			}
			a = scn.next().charAt(0);
			if (a == 'n' || a == 'N') {
				System.out.println("掰掰");
    {
    	
    }

	}
	
 
}
}
