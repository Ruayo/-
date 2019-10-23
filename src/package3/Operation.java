package package3;


import java.util.*;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Ruayo
 * @project arithmetic-generator
 * @package package3
 * @date 2019/10/22 20:38
 */
public class Operation {
	public static void main(String[] args) {
		Random u = new Random();
		String[] str = new String[]{"+", "-", "*", "/"};
		System.out.println("你想要题目的数量");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		System.out.println("你想要题目的范围");
		Scanner in1 = new Scanner(System.in);
		int y = in1.nextInt();
		int i, z;
		for (i = 0; i < x; i++) {
			String s = "";
			int a = (int) (Math.random() * y);
			int b = (int) (Math.random() * y);
			String op = str[u.nextInt(str.length)];
			if (op == "+") {
				z = a + b;
				System.out.println(a + "+" + b + " =" + z);
			} else if (op == "-") {
				z = a - b;
				System.out.println(a + "-" + b + " =" + z);
			} else if (op == "*") {
				z = a * b;
				System.out.println(a + "*" + b + " =" + z);
			} else if (op == "/") {
				z = a / b;
				System.out.println(a + "/" + b + " =" + z);
			}
		}
	}
}
