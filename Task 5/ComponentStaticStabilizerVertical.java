//Chris Park

public class ComponentStaticStabilizerVertical extends A_ComponentStatic
{
	private ComponentDynamicRudder _rudder;
	
	public ComponentStaticStabilizerVertical(DescriptorComponent descriptor,
		ComponentDynamicRudder rudder)
	{
		super(descriptor);
		
		//Throw on null object
		_rudder = rudder;
		_rudder.setHost(this);
	}
	
	public ComponentDynamicRudder getRudder()
	{
		return _rudder;
	}
	
	public void visit_(Visitor visitor)
	{
		visitor.append("<stabilizer-vertical>\n");
		super.visit_(visitor);
		_rudder.visit_(visitor);
		visitor.append("</stabilizer-vertical>\n");	
	}
}
