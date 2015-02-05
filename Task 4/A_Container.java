//Chris Park


//check nulls on get methods

import java.util.*;
import java.awt.Point;
import java.awt.Dimension;

public abstract class A_Container extends A_Entity
{
	protected Point _origin;
	protected Dimension _size;
	protected ArrayList<A_Entity> _childList;
	//protected ArrayList<Point> _pointList;
	
	public A_Container(String ID, Point origin, Dimension size)
	{
		super(ID);
		
		if(origin == null)
			throw new RuntimeException("No origin set");
		
		if(size == null)
			throw new RuntimeException("No size set");
		
		_origin = origin;
		_size = size;
		_childList = new ArrayList<A_Entity>();
	}
	
	public Point getOrigin()
	{
		return _origin;
	}
	
	public Dimension getSize()
	{
		return _size;
	}
	
	public void addEntity(A_Entity child)
	{
		child.setContainer(this);
		_childList.add(child);
	}
	
	public void removeEntity(String ID)
	{
		for(A_Entity entity : _childList)
			if(entity.getID().equals(ID))
			{
				entity.releaseContainer(this);
				_childList.remove(entity);
				return;
			}
		
		throw new RuntimeException("Entity to be removed not found");
	}
	
	public boolean hasEntity(String ID)
	{
		for(A_Entity child : _childList)
			if(child.getID().equals(ID))
				return true;
			
		return false;
	}
	
	public boolean hasEntity(A_Entity entity)
	{
		for(A_Entity child : _childList)
			if(entity == child)
				return true;
			
		return false;
	}
	
	public A_Entity getEntity(String ID)
	{
		for(A_Entity child : _childList)
			if(child.getID().equals(ID))
				return child;
			
		throw new RuntimeException("Entity not found");
	}
	
	public ArrayList<A_Entity> getEntities()
	{
		if(_childList == null)
			throw new RuntimeException("No child entities");
		
		return _childList;
	}
	
	
	public void setOrigin(Point origin)
	{
		_origin = origin;
		if(_parentContainer != null)
			_parentContainer.update();
	}
	
	public void setSize(Dimension size)
	{
		_size = size;
		if(_parentContainer != null)
			_parentContainer.update();
	}
	
	public ArrayList<Point> update()
	{
		ArrayList<Point> temp = new ArrayList<Point>();
		
		for(A_Entity child : _childList)
			temp.addAll(child.update());
		
		return temp;
	}
	
	public boolean isRenderable(Point location)
	{
		
		//double check logic here
		if(location.getX() < _origin.getX() || location.getY() < _origin.getY() ||
			location.getX() > _size.getWidth() || location.getY() > _size.getHeight())
			return false;
			
		return true;
	}
	
	//adjust this to deal with double precision (for circles)
	public Point calculatePointAbsolute(Point location)
	{
		int x, y;
		Point temp;
		
		x = (int)(_origin.getX() + location.getX());
		y = (int)(_origin.getY() + location.getY());
		temp = new Point(x, y);
		
		if(_parentContainer != null)
			temp = _parentContainer.calculatePointAbsolute(temp);
		
		return temp;
	}
}
