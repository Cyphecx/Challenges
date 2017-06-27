package codeAbbey;

import java.util.Scanner;

public class AplusB {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		char[] chars = input.toCharArray();
		int num1 = 0;
		int num2 = 0;
		for(int i = 0; i < chars.length; i++){
			if(chars[i] == ' '){
				num1 = Integer.parseInt(input.substring(0, i));
				num2 = Integer.parseInt(input.substring(i));
			}
		}
		System.out.println(num2+num1);

	}

}
