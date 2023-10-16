package com.kh.fileIO;

import java.io.File;

public class File_Rename_Main {

	public static void main(String[] args) {
		String originFile = "C:\\User\\user1\\Desktop\\love.png";
		String newFile = "C:\\User\\user1\\Desktop\\cute22.png";
		
		File currentFile = new File(originFile);
		File renameFile = new File(newFile);
		//파일 이름 변경하기
		//만약에 파일이 있다면!
		if (currentFile.renameTo(renameFile)) {
			System.out.println("파일 이름 변경 성공!");
		}else {
			System.out.println("파일 이름 변경 실패.");
		}
	}

}
