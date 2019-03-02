package com.assignment.textanalyzer;



public class Text {
	
	//Scanner sc = new Scanner(System.in);
    private String input;
    private int text_length;
    private int text_length_nospaces;
    private int word_count;
    private String characterCount;
    
    
    
    public int getText_length_nospaces() {
		return text_length_nospaces;
	}

	public void setText_length_nospaces(int text_length_nospaces) {
		this.text_length_nospaces = text_length_nospaces;
	}

	public int getWord_count() {
		return word_count;
	}

	public void setWord_count(int word_count) {
		this.word_count = word_count;
	}

	public String getCharacterCount() {
		return characterCount;
	}

	public void setCharacterCount(String characterCount) {
		this.characterCount = characterCount;
	}

	public int getText_length() {
		return text_length;
	}

	public void setText_length(int text_length) {
		this.text_length = text_length;
	}

public Text() {
	}
    
	public Text(String input) {
		//super();
		this.input = input;
	}
	

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}


	@Override
	public String toString() {
		return "Text [input=" + input + "]";
	}
    
	
    
   // 
   // private int characterCount; 
   // private int with_spaceCount; 
    
}
