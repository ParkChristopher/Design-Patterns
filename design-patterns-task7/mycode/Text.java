//Chris Park

import java.util.*;

public class Text
{
	WordPool _wordPool;
	ArrayList<LinkStyled> _passage;
	
	public Text()
	{
		_wordPool = new WordPool();
		_passage = new ArrayList<LinkStyled>();
	}
	
	public Text(List<Word> words)
	{
		validateObject(words);
		Iterator<Word> iter = words.iterator();
		Word temp;
		
		_wordPool = new WordPool();
		_passage = new ArrayList<LinkStyled>();
		
		while(iter.hasNext())
		{
			temp = iter.next();
			_passage.add(new LinkStyled(_wordPool.addWord(temp)));
		}
	}
	
	public LinkStyled addWord(Word word)
	{	
		validateObject(word);
		LinkStyled linkStyled;
		
		linkStyled = new LinkStyled(_wordPool.addWord(word));
		_passage.add(linkStyled);
		return linkStyled;
	}
	
	public double calculateCompressionFactor()
	{
		ArrayList<Word> pool;
		int poolSize, passageSize;
		poolSize = passageSize = 0;
		
		pool = new ArrayList<Word>(_wordPool.getWords());
		for(Word word : pool)
			poolSize += word.getSize();
		
		for(LinkStyled ls : _passage)
			passageSize += _wordPool.getWord(ls.getLink()).getSize();
		
		return (double)poolSize / (double)passageSize;
	}
	
	public String generate(boolean isStyled)
	{
		int i;
		String str = "";
		LinkStyled temp;
		
		if(isStyled)
		{
			for(i = 0; i < _passage.size() - 1; i++)
			{
				temp = _passage.get(i);
				str += temp.getStyle().generateTagOpen();
				str += _wordPool.getWord(temp.getLink()).getLexeme();
				str += temp.getStyle().generateTagClose();
				str += " ";
			}
			temp = _passage.get(i);
			str += temp.getStyle().generateTagOpen();
			str += _wordPool.getWord(temp.getLink()).getLexeme();
			str += temp.getStyle().generateTagClose();
		
			return str;
		}
		
		//No Styles
		for(i = 0; i < _passage.size() - 1; i++)
		{
			temp = _passage.get(i);
			str += _wordPool.getWord(temp.getLink()).getLexeme();
			str += " ";
		}
		temp = _passage.get(i);
		str += _wordPool.getWord(temp.getLink()).getLexeme();
		
		return str;
	}
	
	public List<LinkStyled> getLinksStyled(int... positions)
	{
		List<LinkStyled> list = new ArrayList<LinkStyled>();
		
		for(int pos : positions)
		{
			list.add(_passage.get(pos));
		}
		
		return list;
	}
	
	public Word getWord(int position)
	{
		return _wordPool.getWord(_passage.get(position).getLink());
	}
	
	public Word getWord(Link link)
	{
		validateObject(link);
		return _wordPool.getWord(link);
	}
	
	public WordPool getWordPool()
	{
		return _wordPool;
	}
	
	public LinkStyled insertWord(Word word, int position)
	{
		validateObject(word);
		validatePosition(position);
		LinkStyled temp = new LinkStyled(_wordPool.addWord(word));
		
		_passage.add(position, temp);
		
		return temp;
	}
	
	public void intersectStyle(Style style, int... positions)
	{
		validateObject(style);
		Style temp;
		
		for(int pos : positions)
		{
			temp = _passage.get(pos).getStyle();
			temp.intersect(style);
		}
	}
	
	public Word removeWord(int position)
	{
		LinkStyled tempLinkStyled;
		Link tempLink;
		
		tempLinkStyled = _passage.remove(position);
		tempLink = tempLinkStyled.getLink();
		
		for(LinkStyled linkStyled : _passage)
		{
			if(tempLink.equals(linkStyled.getLink()))
				return _wordPool.getWord(linkStyled.getLink());
		}
		
		return _wordPool.removeWord(tempLink);
	}
	
	public Word replaceWord(Word word, int position)
	{
		validateObject(word);
		Word temp;
		
		temp = removeWord(position);
		
		if(position == _passage.size())
			addWord(word);
		else
			insertWord(word, position);
		
		return temp;
	}

	public void unionStyle(Style style, int... positions)
	{
		validateObject(style);
		Style temp;
		
		for(int pos : positions)
		{
			temp = _passage.get(pos).getStyle();
			temp.union(style);
		}
	}
	
	private void validatePosition(int position)
	{
		if(position < 0  || position >= _passage.size())
			throw new IllegalArgumentException("Error - Invalid position");
	}
	
	private void validateObject(Object object)
	{
		if(object == null)
			throw new RuntimeException("Error - Object is null");
	}
}
