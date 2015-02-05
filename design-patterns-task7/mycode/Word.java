//Chris Park

import java.util.*;
import java.util.regex.*;

public class Word
{
	private String _lexeme;
	
	public Word(String lexeme)
	{
		validateLexeme(lexeme);
		_lexeme = lexeme.toLowerCase();
	}
	
	@Override
	public boolean equals(Object object)
	{
		validateObject(object);
		Word temp = (Word) object;
		return _lexeme.equals(temp.getLexeme());
	}
	
	public String getLexeme()
	{
		return _lexeme;
	}
	
	@Override
	public int hashCode()
	{
		return _lexeme.hashCode();
	}
	
	@Override
	public String toString()
	{
		return "Word{lexeme=[\"" + _lexeme + "\"]}";
	}
	
	public int getSize()
	{
		return _lexeme.length();
	}
	
	private void validateLexeme(String lexeme)
	{
		Pattern pattern = Pattern.compile("[^a-zA-Z]");
		
		if(lexeme == null || lexeme.length() == 0 || pattern.matcher(lexeme).find())
			throw new IllegalArgumentException("Invalid lexeme");
	}
	
	private void validateObject(Object object)
	{
		if(object == null)
			throw new RuntimeException("Error - Object is null");
	}
}
