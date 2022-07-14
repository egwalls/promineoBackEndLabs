import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class week1Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	int num = in.nextInt();
	
	System.out.println("Multiplication Table of " + num);
	
	for (int i = 1; i <= 10; i++) {
		System.out.printf("%d x %d = %d \n", num, i, num *i);}
		
	}

}
