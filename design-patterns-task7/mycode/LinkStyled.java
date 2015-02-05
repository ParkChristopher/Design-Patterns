//Chris Park

public class LinkStyled
{
	private Link _link;
	private Style _style;
	
	public LinkStyled(Link link)
	{
		validateObject(link);
		_link = link;
		_style = new Style();
	}
	
	public LinkStyled(Link link, Style style)
	{
		validateObject(link);
		validateObject(style);
		_link = link;
		_style = style;
	}
	
	public Link getLink()
	{
		return _link;
	}
	
	public Style getStyle()
	{
		return _style;
	}
	
	public String toString()
	{
		return "LinkStyled{link=" + _link + " style=" + _style + "}";
	}
	
	private void validateObject(Object object)
	{
		if(object == null)
			throw new RuntimeException("Error - Object is null");
	}
}
