//Chris Park

import java.util.*;

public class WordPool
{
	private HashMap<Link, Word> _wordPool;
	
	public WordPool()
	{
		_wordPool = new HashMap<Link, Word>();
	}
	
	public Link addWord(Word word)
	{
		validateObject(word);
		
		//does map contain word?
		if(_wordPool.containsValue(word))
		{			
			for(Map.Entry<Link, Word> entry : _wordPool.entrySet())
				if(entry.getValue().equals(word))
					return entry.getKey();
		}
		
		Link temp = new Link();
		_wordPool.put(temp, word);
		
		return temp;
	}
	
	public List<Link> getLinks()
	{
		List<Link> list = new ArrayList<Link>();
		for(Map.Entry<Link, Word> entry : _wordPool.entrySet())
			list.add(entry.getKey());
		
		return list;
	}
	
	public int getSize()
	{
		return _wordPool.size();
	}
	
	public Word getWord(Link link)
	{
		validateObject(link);
		validateLink(link);
		return _wordPool.get(link);
	}
	
	public List<Word> getWords()
	{
		List<Word> list = new ArrayList<Word>();
		
		for(Map.Entry<Link, Word> entry : _wordPool.entrySet())
			list.add(entry.getValue());
		
		return list;
	}
	
	public boolean hasLink(Link link)
	{
		validateObject(link);
		return link.isAlive();
	}
	
	public boolean hasWord(Word word)
	{
		validateObject(word);
		return _wordPool.containsValue(word);
	}
	
	public Word removeWord(Link link)
	{
		Word temp;
		
		validateObject(link);
		validateLink(link);
		temp = _wordPool.remove(link);
		link.kill();
		
		return temp;
	}
	
	private void validateLink(Link link)
	{
		if(!link.isAlive() || _wordPool.get(link) == null)
			throw new IllegalArgumentException("Error - Dead link or unknown word");
	}
	
	private void validateObject(Object object)
	{
		if(object == null)
			throw new RuntimeException("Error - Object is null");
	}
}
