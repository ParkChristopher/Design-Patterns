//Chris Park

public class ComponentStaticAirplane extends A_ComponentStatic
{
	private ComponentStaticFuselage _fuselage;
	
	public ComponentStaticAirplane(DescriptorComponent descriptor,
		ComponentStaticFuselage fuselage)
	{
		super(descriptor);
		
		//Throw on null object
		_fuselage = fuselage;
		_fuselage.setHost(this);
	}
	
	public ComponentStaticFuselage getFuselage()
	{
		return _fuselage;
	}
	
	public void visit_(Visitor visitor)
	{
		visitor.append("<airplane>\n");
		super.visit_(visitor);
		_fuselage.visit_(visitor);
		visitor.append("</airplane>\n");
	}
}
