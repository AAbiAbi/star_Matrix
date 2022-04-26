//# -*- coding: utf-8 -*-
//# !/usr/bin/env java

public class starmatrix{
	 public static void main(String[] args) {
	 	drawTriangle(18);
		
	}

	public static void drawTriangle(int N){
		int line = 1;
	 	//String star = "*";
	 	while(line < N){
	 		int row_Number = 1;
	 		while(row_Number <= line){ //double loop, accroding to the line and row_Number
	 			System.out.print("*");
	 			row_Number ++;
	 		}
	 		System.out.println();
	 		line ++;

	 	}
	}
}