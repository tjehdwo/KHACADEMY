package com.kh.IiteratorMain;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Iterator
 * 		�÷���(������ ũ��)�� �ݺ�(iterate)�ϸ鼭 ��ҿ� �����ϴµ� ���Ǵ� �������̽�
 * 		�پ��� �÷��� ����(ArrayList, HashSet ��)�� ����� �� ����
 * 		�÷����� ��Ҹ� �а� �����ϴµ� ���
 * 		�÷����� ũ�⳪ ���� ������ ������� ��ҿ� ������ �� ����
 * */
public class IiteratorMain {

	public static void main(String[] args) {
		//ArrayList ���� �� ��� �߰�
		ArrayList<String> music = new ArrayList<>();
		music.add("�߶��");
		music.add("����");
		music.add("R&B");
		
		//Iterator ����
		Iterator<String> iter = music.iterator();
		
		//Iterator�� ����Ͽ� ��� �ݺ�
		while(iter.hasNext()) {
			String msc = iter.next();
			System.out.println(msc);
		}
		
		//Iterator�� ����Ͽ� ��� ����
		iter = music.iterator();
		while(iter.hasNext()) {
			String msc = iter.next();
			//���࿡ R&B������ ����
			if(msc.equals("R&B")) {
				iter.remove(); //���� ��� ����
			}
			System.out.println(msc);
		}
		//���� �� ArrayList���
		System.out.println("���� �� ���");
		for (String a : music) {
			System.out.println(a);
		}
		

	}

}