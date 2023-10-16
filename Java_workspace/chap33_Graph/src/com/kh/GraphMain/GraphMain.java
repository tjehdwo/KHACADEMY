package com.kh.GraphMain;

import com.kh.Practice.DFSGraph;

public class GraphMain {

	public static void main(String[] args) {
		int ver = 5;
		DFSGraph graph = new DFSGraph(ver);
		
		graph.addEdge(0,1); //��� 0���� ���1�� ������ �ִ� ������ �߰�
		graph.addEdge(0,2); //��� 0���� ���2�� ������ �ִ� ������ �߰�
		graph.addEdge(1,3);	//��� 1���� ���3�� ������ �ִ� ������ �߰�
		graph.addEdge(2,4); //��� 2���� ���4�� ������ �ִ� ������ �߰�
		
		System.out.println("DFS Ž�� ��� : ");
		
		// DFS Ž���� ������ ����� ��ȣ�� ����
		//0���� ������
		graph.DFS(0);
		
	
	}

}
/*
DFS Ž���� �����Ͽ� �� ����� ���
Ž�� ����� ���� ��忡�� ����Ͽ�
���� �켱���� Ž�� �� ��带 �湮�� ������� ���
*/