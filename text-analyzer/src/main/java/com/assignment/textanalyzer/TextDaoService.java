package com.assignment.textanalyzer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import org.springframework.stereotype.Component;


@Component
public class TextDaoService {
	
	public Text save(Text text) {
		 String sentence= text.getInput();
		 String letters = sentence.replaceAll("[^a-zA-Z]", "");
	     HashMap<String, Integer> counter = new HashMap();
	     char[] sortedLetters = letters.toCharArray();
	     Arrays.sort(sortedLetters);
	     String sorted = new String(sortedLetters);
	     
//	       for(char c : sortedLetters){
//	            String str = c+"";
//	            if(!counter.containsKey(str)){
//	                counter.put(str, 1);
//	            }else{
//	                counter.put(str, counter.get(str)+1);
//	            }
//	       }	       
//	       text.setCharacterCount(counter.toString());
	     
	     
	     Map<Character, Integer> numChars = new HashMap<Character, Integer>();
	     
	     for (int i = 0; i < sorted.length(); ++i)
	     {
	         char charAt = sorted.charAt(i);
	      
	         if (!numChars.containsKey(charAt))
	         {
	             numChars.put(charAt, 1);
	         }
	         else
	         {
	             numChars.put(charAt, numChars.get(charAt) + 1);
	         }
	     }
	     text.setCharacterCount(numChars.toString());
	       StringTokenizer tokens = new StringTokenizer(sentence);
	       text.setText_length(sentence.length());
	       text.setText_length_nospaces(sentence.replaceAll("\\s","").length());
	       text.setWord_count(tokens.countTokens());

		return text;
		
	}
}
