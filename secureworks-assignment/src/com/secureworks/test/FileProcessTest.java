package com.secureworks.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FileProcessTest {

	public void findLargestWordAndTranspose(String filePath) {

		File inputFile = new File(filePath);
		try {
			BufferedReader br = new BufferedReader(new FileReader(inputFile));
			String line;
			int maxLength = 0;
			String largestWord = null;
			while ((line = br.readLine()) != null) {
				String word = line.trim();
				int length = word.length();
				if (length > maxLength) {
					maxLength = length;
					largestWord = word;
				}
			}
			if (largestWord != null) {
				StringBuffer transferWord = new StringBuffer(largestWord).reverse();
				System.out.println(largestWord);
				System.out.println(transferWord.toString());
			} else {
				System.out.println("File is empty");
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found in the path " + filePath);
		} catch (IOException e) {
			System.out.println("Error while reading the file in the path " + filePath);
		}

	}

	public void findLargestWordsAndTranspose(String filePath) {
		File inputFile = new File(filePath);
		try {
			BufferedReader br = new BufferedReader(new FileReader(inputFile));
			String line;
			int maxLength = 0;
			Set<String> largestWords = new HashSet<String>();
			while ((line = br.readLine()) != null) {
				String word = line.trim();
				int length = word.length();
				if(length!=0) {
				if (length > maxLength) {
					maxLength = length;
					largestWords.clear();
					largestWords.add(word);
				} else if (length == maxLength) {
					largestWords.add(word);
				}
				}
			}
			if (largestWords.size() > 0) {
				StringBuffer transferWord;
				for (String largestWord : largestWords) {
					transferWord = new StringBuffer(largestWord).reverse();
					System.out.println(largestWord);
					System.out.println(transferWord.toString());
					System.out.println();
				}

			} else {

				System.out.println("File is empty");
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found in the path " + filePath);
		} catch (IOException e) {
			System.out.println("Error while reading the file in the path " + filePath);
		}

	}

	public static void main(String[] args) {

		FileProcessTest testObj = new FileProcessTest();

		// test case 1 - postitve test case
		 System.out.println("Output for FileWithAlphaNumericWords");
		 System.out.println("====================================");
		 testObj.findLargestWordsAndTranspose("./input/FileWithAlphaNumericWords.txt");
		 System.out.println("");
		 System.out.println("");

		// test case 2 - positive test case
		 System.out.println("Output for File With SpecialCharacter Words");
		 System.out.println("================================");
		 testObj.findLargestWordsAndTranspose("./input/FileWithSpecialCharacterWords.txt");
		 System.out.println("");
		 System.out.println("");

		// test case 3 - negative test case
		 System.out.println("Output for Empty File");
		 System.out.println("==========");
		 testObj.findLargestWordsAndTranspose("./input/EmptyFile.txt");
		 System.out.println("");
		 System.out.println("");

		// test case 4 - negative test case
		 System.out.println("Output for File Not Present In The Path");
		 System.out.println("============================");
		 testObj.findLargestWordsAndTranspose("./input/FileNotPresent.txt");
		 System.out.println("");
		 System.out.println("");

		// test case 5 - postitve test case
		System.out.println("Output for File With More Than One Largest Words");
		System.out.println("=====================================");
		testObj.findLargestWordsAndTranspose("./input/FileWithMoreThanOneLargestWords.txt");
		System.out.println("");
		System.out.println("");

		// test case 6
		System.out.println("Output for File With Duplicate Largest Words");
		System.out.println("=================================");
		testObj.findLargestWordsAndTranspose("./input/FileWithDuplicateLargestWords.txt");
		System.out.println("");
		System.out.println("");
		
		// test case 7
		System.out.println("Output for File With Largest Word Having Only Spaces");
		System.out.println("=================================");
		testObj.findLargestWordsAndTranspose("./input/FileWithLargestWordContainsOnlySpaces.txt");
		System.out.println("");
		System.out.println("");
		
		 
		

	}

}
