package Chap02_BasicDataStructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Q01 {
	static Map<Integer, Integer> maxHeight(int peopleNum, int[] height) {
		Map<Integer, Integer> map = new HashMap<>();
		int maxPeople = 1;
		int maxHeight = height[0];
		for (int i = 0; i < peopleNum; i++) {
			if (maxHeight < height[i]) {
				maxHeight = height[i];
				maxPeople = i + 1;
			}
		}
		map.put(maxPeople, maxHeight);
		return map;

	}

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int peopleNum = rand.nextInt(9  )+1;
		System.out.println("사람 수 : " + peopleNum);
		int[] height = new int[peopleNum];

		for (int i = 0; i < peopleNum; i++) {
			height[i] = 100 + rand.nextInt(100);
			System.out.println(i + 1 + "번째 사람의 키는 " + height[i]);
		}
		map = maxHeight(peopleNum, height);

		map.forEach((key, value) -> {
			System.out.println("가장 큰 키는 " + key + "번째 사람이 " + value + "cm입니다.");
		});

	}

}
