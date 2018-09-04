package com.demoTest.algorthims;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FindRepeated {

	public static void main(String[] args) {
		//String literatureText = "Rose is a flower red  is rose are flower";
		String literatureText = "Jack and Jill went to market to buy bread and cheese.Cheese is jack's and Jill's favouitr food";

		List<String> wordsToExclude = new ArrayList<>();
		wordsToExclude.add("is");
		wordsToExclude.add("are");
		wordsToExclude.add("a");
		int fileSize=6;
		List<String> loglines=new ArrayList<String>();
		loglines.add("t2 13 121 98" );
		loglines.add("r1 box ape bit" );
		loglines.add("b4 xi me nu" );
		List<String> dd=reorderLines( fileSize,	 loglines);

		/*List<String> s = retrieveMostFrequentlyUsedWords(literatureText,
				wordsToExclude);*/
	}

	private static List<String> reorderLines(int fileSize, List<String> loglines) {
		
		
		loglines.stream().sorted().forEach((x) -> System.out.println(x));

		System.out.println(loglines);
		return null;
	}

	private static List<String> retrieveMostFrequentlyUsedWords(
			String literatureText, List<String> wordsToExclude) {

		System.out.println(literatureText);
		Map<String, Integer> hashMapVariable = new HashMap<>();

		String[] words = literatureText.toLowerCase().split("[^\\w]+");
	
		List<String> li=new ArrayList<>();
		for (String word : words) {
			System.out.println(word);
			if (hashMapVariable.containsKey(word)) {
				hashMapVariable.put(word, hashMapVariable.get(word) + 1);
			} else {
				hashMapVariable.put(word, 1);
			}
		}
		
		for (Entry<String, Integer> wordsRepeated : hashMapVariable.entrySet()) {
			wordsRepeated.getValue();
			if(wordsRepeated.getValue()>=2){
					if(!wordsToExclude.contains(wordsRepeated.getKey())){
						li.add(wordsRepeated.getKey());
			    }
				
			}
		}
		
		System.out.println("hashMapVariable==="+hashMapVariable);
		return null;
	}

}
