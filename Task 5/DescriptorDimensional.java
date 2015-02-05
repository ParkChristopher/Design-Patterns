//Chris Park

public class DescriptorDimensional extends A_Descriptor
{
	private double _height, _width, _depth;
	public DescriptorDimensional(double height, double width, double depth)
	{
		_height = height;
		_width = width;
		_depth = depth;
	}
	
	public double getDepth()
	{
		return _depth;
	}
	
	public double getHeight()
	{
		return _height;
	}
	
	public double getWidth()
	{
		return _width;
	}
	
	public void visit_(Visitor visitor)
	{
		visitor.append("<dimensions height=\"" + _height + "\" width=\"" + 
			_width + "\" depth=\"" + _depth + "\"/>\n");
	}
}
