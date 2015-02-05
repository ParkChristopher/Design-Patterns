//Chris Park

import java.util.*;

public class Test
{
	public static void main(String[] args)
	{
		Text sentence = new Text();
		
		Style styleBold = new Style(true, false, false);
		Style styleItalic = new Style(false, true, false);
		Style styleUnderline = new Style(false, false, true);
		
		sentence.addWord(new Word("the"));
		sentence.addWord(new Word("dog"));
		sentence.addWord(new Word("ate"));
		sentence.addWord(new Word("the"));
		sentence.addWord(new Word("cat"));
		sentence.addWord(new Word("slowly"));
		sentence.addWord(new Word("and"));
		sentence.addWord(new Word("with"));
		sentence.addWord(new Word("great"));
		sentence.addWord(new Word("pleasure"));
		
		String result = sentence.generate(false);
		double compression = sentence.calculateCompressionFactor();
		System.out.println(result);
		System.out.println(compression);
		System.out.println();
		
		sentence.unionStyle(styleBold, 0, 4);
		sentence.unionStyle(styleItalic, 1, 5);
		sentence.unionStyle(styleUnderline, 3, 7);
		
		result = sentence.generate(true);
		compression = sentence.calculateCompressionFactor();
		System.out.println(result);
		System.out.println(compression);
		System.out.println();
		
		sentence.unionStyle(styleUnderline, 0, 4);
		
		result = sentence.generate(true);
		compression = sentence.calculateCompressionFactor();
		System.out.println(result);
		System.out.println(compression);
		System.out.println();
		
		sentence.intersectStyle(styleBold, 1, 5);
		sentence.intersectStyle(styleUnderline, 1, 5);
		
		result = sentence.generate(true);
		compression = sentence.calculateCompressionFactor();
		System.out.println(result);
		System.out.println(compression);
		System.out.println();
		
		sentence.replaceWord(new Word("balls"), 0);
		sentence.replaceWord(new Word("balls"), 1);
		sentence.replaceWord(new Word("balls"), 2);
		sentence.replaceWord(new Word("balls"), 3);
		sentence.replaceWord(new Word("balls"), 4);
		sentence.replaceWord(new Word("balls"), 5);
		sentence.replaceWord(new Word("balls"), 6);
		sentence.replaceWord(new Word("balls"), 7);
		sentence.replaceWord(new Word("balls"), 8);
		sentence.replaceWord(new Word("durp"), 9);

		
		result = sentence.generate(true);
		compression = sentence.calculateCompressionFactor();
		System.out.println(result);
		System.out.println(compression);
		System.out.println();
		
	}
}
