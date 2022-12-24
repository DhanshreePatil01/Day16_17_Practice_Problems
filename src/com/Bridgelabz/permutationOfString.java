package com.Bridgelabz;

import java.util.ArrayList;

public class permutationOfString {
	
	public static void stringPermutationItertively(String word) { 
		
					
			ArrayList<String> permutationWords = new ArrayList<>();
			permutationWords.add(String.valueOf(word.charAt(0)));
			
			
			for(int i=1;i<word.length();i++) {
				for(int k=permutationWords.size()-1;k>=0;k--) {
					String currentPermutation = permutationWords.remove(k);
					for(int j=0;j<=currentPermutation.length();j++) {
						String output = currentPermutation.substring(0,j)+word.charAt(i)+currentPermutation.substring(j);
						permutationWords.add(output);
					}
				}
			}
			System.out.println(permutationWords);
		}
		
		public static void permutationRecursively(String word, String permutedString) {
			
			if(word.length()==0) {
				System.out.println(permutedString);
				return;
			}
			
			
			for(int i = 0;i<word.length();i++) {
				char ithcharelement = word.charAt(i);
				String remaingStr = word.substring(0,i)+word.substring(i + 1);
				
				permutationRecursively(remaingStr,permutedString+ithcharelement);
			}
			
		}
		
		
		public static void main(String[] args) {
			permutationRecursively("example","");
		}
	}
