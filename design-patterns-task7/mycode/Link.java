//Chris Park

public class Link
{
	private static int _nextIndex = 0;
	private int _index;
	private boolean _isAlive;
	
	public Link()
	{
		_isAlive = true;
		_index = _nextIndex;
		_nextIndex++;
	}
	
	@Override
	public boolean equals(Object object)
	{
		validateObject(object);
		
		return this == object;
	}
	
	public int getIndex()
	{
		return _index;
	}
	
	@Override
	public int hashCode()
	{
		return _index;
	}
	
	public boolean isAlive()
	{
		return _isAlive;
	}
	
	public void kill()
	{
		_isAlive = false;
	}
	
	@Override
	public String toString()
	{
		return "Link{index=" + _index + " isAlive=" + _isAlive + "}";
	}
	
	private void validateObject(Object object)
	{
		if(object == null)
			throw new RuntimeException("Error - Object is null");
	}
}
