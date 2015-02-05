//Chris Park

import java.util.*;
import java.awt.Point;

public class ShapeDot extends A_Shape
{
	protected Point _origin;
	
	public ShapeDot(String ID, Point origin)
	{
		super(ID);
		
		if(origin == null)
			throw new RuntimeException("No origin set");
		
		_origin = origin;
	}
	
	public Point getOrigin()
	{
		return _origin;
	}
	
	public void setOrigin(Point origin)
	{
		_origin = origin;
		_parentContainer.update();
	}
	
	public ArrayList<Point> update()
	{
		Point temp;
		ArrayList<Point> theList = new ArrayList<Point>();
		
		temp = _parentContainer.calculatePointAbsolute(_origin);
		
		if(_parentContainer.isRenderable(temp))
			theList.add(temp);
		
		return theList;
	}
	
	
}
