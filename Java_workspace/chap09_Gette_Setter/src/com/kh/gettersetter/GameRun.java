package com.kh.gettersetter;

public class GameRun {

	public static void main(String[] args) {
		// �÷��� ������ �����
		PlayerCharacter player1 = new PlayerCharacter();

		
		
		player1.setName("������");
		player1.setHealth(100);
		player1.setAttackPower(50);
		
		player1.displayInfo();
		
		PlayerCharacter player2 = new PlayerCharacter();
		
		player2.setName("�ΰ��");
		player2.setHealth(50);
		player2.setAttackPower(15);
		
		player2.displayInfo();
		System.out.println();
		System.out.println("attack!!!!");
		
		player1.attack(player2);
	  //  player2.attack(player1);
	}

}
