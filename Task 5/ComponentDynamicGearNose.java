//Chris Park

public class ComponentDynamicGearNose extends A_ComponentDynamicGear
{
	public ComponentDynamicGearNose(DescriptorComponent descriptor)
	{
		super(descriptor);
	}
	
	public void visit_(Visitor visitor)
	{
		visitor.append("<gear-nose>\n");
		super.visit_(visitor);
		visitor.append("</gear-nose>\n");
	}
}
