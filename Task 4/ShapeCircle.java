//Chris Park

import java.util.*;
import java.awt.Point;

public class ShapeCircle extends A_Shape
{
	protected Point _center;
	protected double _radius;
	
	public ShapeCircle(String ID, Point center, double radius)
	{
		super(ID);
		
		if(center == null)
			throw new RuntimeException("no center defined");
		
		_center = center;
		_radius = radius;
	}
	
	public Point getCenter()
	{
		return _center;
	}
	
	public double getRadius()
	{
		return _radius;
	}
	
	public void setCenter(Point center)
	{
		_center = center;
		_parentContainer.update();
	}
	
	public void setRadius(double radius)
	{
		_radius = radius;
		_parentContainer.update();
	}
	
	public ArrayList<Point> update()
	{
		int i, x, y;
		Point temp;
		ArrayList<Point> pointList = new ArrayList<Point>();
		
		for(i = 1; i < 361; i++)
		{
			x = (int)(_center.getY() +
				Math.round(_radius * Math.sin(Math.toRadians(i))));
			y = (int)(_center.getX() +
				Math.round(_radius * Math.cos(Math.toRadians(i))));
			
			temp = new Point(x, y);
			temp = _parentContainer.calculatePointAbsolute(temp);
			
			if(_parentContainer.isRenderable(temp))
				pointList.add(temp);
		}
		
		return pointList;
	}
}
