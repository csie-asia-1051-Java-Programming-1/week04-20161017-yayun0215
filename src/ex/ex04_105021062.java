package ex;
import java.util.Scanner;
/*
 * Topic: 讓使用者輸入 一個正整數 n 及一個字元符號，然後顯示出下列圖形 (例 n = 4,字元符號= @)
    @@@@
    @@@  
    @@  
    @
 * Date: 2016/10/17
 * Author: 105021062 鄭雅韵
 */

public class ex04_105021062 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入符號");
		char a=scn.next().charAt(0);
		System.out.println("請輸入n");
		int n=scn.nextInt();
		for(int i=0;i<n;i++){
			for(int j=n;j>i;j--){
				System.out.print(a);
			}
			System.out.println();
		}

	}

}
