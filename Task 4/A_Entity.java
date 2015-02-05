//Chris Park

import java.util.*;
import java.awt.Point;
import java.awt.Dimension;

public abstract class A_Entity
{
	protected String _ID;
	protected A_Container _parentContainer;
	
	public A_Entity(String ID)
	{
		if(ID == "")
			throw new RuntimeException("Identifier must be non empty string");
		
		_ID = ID;
	}
	
	public String getID()
	{
		return _ID;
	}
	
	public void setContainer(A_Container container)
	{
		//error checking for self or null
		_parentContainer = container;
	}
	
	public void releaseContainer(A_Container container)
	{
		
		if(_parentContainer == container)
			_parentContainer = null;// <---Dumb
		else
			throw new RuntimeException("Wrong container or no container found");
	}
	
	public boolean hasContainer()
	{
		if(_parentContainer != null)
			return true;
		
		return false;
	}
	
	public A_Container getContainer()
	{
		if(_parentContainer == null)
			throw new RuntimeException("No container to retrieve");
		
		return _parentContainer;
	}
	
	public abstract ArrayList<Point> update();
}
