//Chris Park

public class ComponentDynamicElevator extends A_ComponentDynamic
{
	public ComponentDynamicElevator(DescriptorComponent descriptor)
	{
		super(descriptor);
	}
	
	public void visit_(Visitor visitor)
	{
		visitor.append("<elevator>\n");
		super.visit_(visitor);
		visitor.append("</elevator>\n");
	}
}
