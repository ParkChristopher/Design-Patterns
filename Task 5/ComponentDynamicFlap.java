//Chris Park

public class ComponentDynamicFlap extends A_ComponentDynamic
{
	public ComponentDynamicFlap(DescriptorComponent descriptor)
	{
		super(descriptor);
	}
	
	public void visit_(Visitor visitor)
	{
		visitor.append("<flap>\n");
		super.visit_(visitor);
		visitor.append("</flap>\n");
	}
}
