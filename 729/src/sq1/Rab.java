package sq1;

import java.util.Scanner;

public class Rab {
	public static void main(String[] args) {
           System.out.println("please enter");
		   Scanner sc = new Scanner(System.in);
           int a = sc.nextInt();
           System.out.println(fun(a));
	}
	
	public static int fun(int a){
		if(a==1||a==2){
			return 1;
		}else{
			return fun(a-1)+fun(a-2);
		}		
	}
}
