package com.kh.whileExample;

import java.util.Scanner;

public class while05 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;//sum�� 0�� ����
        
        System.out.println("5������ ������ �Է����ּ���.");
        int num = sc.nextInt();//���� � ���� �������� ��
       
        while(sum <= 10) {
        	sum += num;
        	num = num +1;
        	System.out.println("num :"+ num);
        	System.out.println("sum :"+ sum);
        	
        }

	}

}