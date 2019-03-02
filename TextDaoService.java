package com.assignment.textanalyzer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

import org.springframework.stereotype.Component;


@Component
public class TextDaoService {
	
	public Text save(Text text) {
		 String sentence= text.getInput();
		 String letters = sentence.replaceAll("[^a-zA-Z]", "");
		 Character[] charArray = new Character[letters.length()];
		    for (int i = 0; i < letters.length(); i++) {
		        charArray[i] = letters.charAt(i);
		    }
		    
		    Arrays.sort(charArray, Comparator.comparingInt(Character::toLowerCase));
		    StringBuilder sb = new StringBuilder(charArray.length);
		    for (Character c : charArray)
		        sb.append(c.charValue());
		    String sorted = sb.toString();
 
	     NavigableMap<Character, Integer> numChars = new TreeMap<Character, Integer>();
	     for(char c : sorted.toCharArray()) {
	         if(numChars.get(c)==null){
	             numChars.put(c, 1);
	         }
	         else {
	             numChars.put(c, numChars.get(c)+1);
	         }           
	     }       
	     for (Map.Entry<Character, Integer> entry : numChars.entrySet()) {
	         System.out.print(entry.getKey() + ":" + entry.getValue() );
	         if(!numChars.lastKey().equals(entry.getKey())){
	             System.out.print(", ");
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
