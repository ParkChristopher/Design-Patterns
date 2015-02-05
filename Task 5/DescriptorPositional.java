//Chris Park

public class DescriptorPositional extends A_Descriptor
{
	private double _x, _y, _z;
	
	public DescriptorPositional(double x, double y, double z)
	{
		_x = x;
		_y = y;
		_z = z;
	}
	
	public double getX()
	{
		return _x;
	}
	
	public double getY()
	{
		return _y;
	}
	
	public double getZ()
	{
		return _z;
	}
	
	public void visit_(Visitor visitor)
	{
		visitor.append("<position x=\"" + _x + "\" y=\"" + 
			_y + "\" z=\"" + _z + "\"/>\n");
	}
}
