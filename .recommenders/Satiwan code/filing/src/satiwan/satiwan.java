package satiwan;

import java.io.*;
import java.util.ArrayList;

import java.util.Scanner;

public class satiwan {
	static String filename;
	int count;
	
	public static void main(String[] args) {
		System.out.println("Enter you file path/name");
		Scanner input = new Scanner(System.in);
		filename = input.nextLine();
		String line = null;
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<Integer> count = new ArrayList<Integer>();
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			while ((line = br.readLine()) != null) {
		
				String[] split = line.split(" ");
			      String first = split[0];
			      String email = split[1];
			      System.out.println("First word: "+first);
				System.out.println(line);
				
				
			
			
			}

		} catch (IOException e) {
			
			System.out.println("file " + filename + "not found");

		}
	}
}
