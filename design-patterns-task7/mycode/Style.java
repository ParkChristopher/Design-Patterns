//Chris Park

import java.util.*;

public class Style
{
	private boolean _isBold, _isItalic, _isUnderline;
	
	public Style()
	{
		_isBold = _isItalic = _isUnderline = false;
	}
	
	public Style(boolean isBold, boolean isItalic, boolean isUnderline)
	{
		_isBold = isBold;
		_isItalic = isItalic;
		_isUnderline = isUnderline;
	}
	
	public String generateTagClose()
	{
		String res = "";
		
		if(_isUnderline)
			res += "</u>";
		if(_isItalic)
			res += "</i>";
		if(_isBold)
			res += "</b>";
		
		return res;
	}
	
	public String generateTagOpen()
	{
		String res = "";
		
		if(_isBold)
			res += "<b>";
		if(_isItalic)
			res += "<i>";
		if(_isUnderline)
			res += "<u>";
		
		return res;
	}
	
	public void intersect(Style style)
	{
		validateObject(style);
		_isBold = (this.isBold() && style.isBold());
		_isItalic = (this.isItalic() && style.isItalic());
		_isUnderline = (this.isUnderline() && style.isUnderline());
	}
	
	public boolean isBold()
	{
		return _isBold;
	}
	
	public void isBold(boolean isBold)
	{
		_isBold = isBold;
	}
	
	public boolean isItalic()
	{
		return _isItalic;
	}
	
	public void isItalic(boolean isItalic)
	{
		_isItalic = isItalic;
	}
	
	public boolean isUnderline()
	{
		return _isUnderline;
	}
	
	public void isUnderline(boolean isUnderline)
	{
		_isUnderline = isUnderline;
	}
	
	@Override
	public String toString()
	{
		return "Style{isBold=" + _isBold + " isItalic=" + _isItalic +
			" isUnderline=" + _isUnderline + "}";
	}
	
	public void union(Style style)
	{
		validateObject(style);
		_isBold = (this.isBold() || style.isBold());
		_isItalic = (this.isItalic() || style.isItalic());
		_isUnderline = (this.isUnderline() || style.isUnderline());
	}
	
	private void validateObject(Object object)
	{
		if(object == null)
			throw new RuntimeException("Error - Object is null");
	}
}
