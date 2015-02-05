//Chris Park

public class DescriptorComponent extends A_Descriptor implements I_Identifiable
{
	private String _id;
	private DescriptorSpatial _descriptor;
	
	public DescriptorComponent(String id, DescriptorSpatial descriptor)
	{
		//Throw on null objects
		_id = id;
		_descriptor = descriptor;
	}
	
	public DescriptorSpatial getDescriptorSpatial()
	{
		return _descriptor;
	}
	
	public String getID_()
	{
		return _id;
	}
	
	public void visit_(Visitor visitor)
	{
		visitor.append("<descriptor id=\"" + _id + "\">\n");
		_descriptor.visit_(visitor);
		visitor.append("</descriptor>\n");
	}
}
