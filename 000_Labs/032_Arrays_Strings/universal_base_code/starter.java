/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		String[] lyrics = new String[10];
		lyrics[0] = "어둠 속에 유폐당한";
		lyrics[1] = "고독한 밤의 친우여";
		lyrics[2] = "39800원 한정 판매가";
		lyrics[3] = "전향 계약 키트™를 추천하오";
		lyrics[4] = "빛의 세계와 고별한";
		lyrics[5] = "굳게 잠근 방문이여";
		lyrics[6] = "초회특전 모조 피를 흡혈하며";
		lyrics[7] = "진정한 어둠에 취해보시오";
		lyrics[8] = "너도 뱀파이어 ";
		lyrics[9] = "나도 뱀파이어";
		for (int i = 0; i < 10; i++) {
			System.out.println(lyrics[i]);
		}
	}
}
