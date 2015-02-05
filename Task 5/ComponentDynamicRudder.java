//Chris Park

public class ComponentDynamicRudder extends A_ComponentDynamic
{
	public ComponentDynamicRudder(DescriptorComponent descriptor)
	{
		super(descriptor);
	}
	
	public void visit_(Visitor visitor)
	{
		visitor.append("<rudder>\n");
		super.visit_(visitor);
		visitor.append("</rudder>\n");
	}
}
