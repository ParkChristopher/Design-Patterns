//Chris Park

public abstract class A_Component implements I_Identifiable, I_Visitable
{
	private String _id;
	private A_Component _host;
	protected DescriptorComponent _descriptor;
	
	public A_Component(DescriptorComponent descriptor)
	{
		//Throw on null object
		_id = descriptor.getID_();
		_descriptor = descriptor;
	}
	
	public DescriptorComponent getDescriptor()
	{
		return _descriptor;
	}
	
	public String getID_()
	{
		return _id;
	}
	
	public void setHost(A_Component host)
	{
		//Throw on null object
		_host = host;
	}
	
	public A_Component getHost()
	{
		return _host;
	}
	
	public boolean hasHost()
	{
		return _host != null;
	}
	
	public void visit_(Visitor visitor)
	{		
		visitor.append("<component>\n");
		_descriptor.visit_(visitor);
		visitor.append("</component>\n");
	}
}
