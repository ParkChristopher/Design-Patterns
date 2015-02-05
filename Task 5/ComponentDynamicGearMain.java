//Chris Park

public class ComponentDynamicGearMain extends A_ComponentDynamicGear
{
	public ComponentDynamicGearMain(DescriptorComponent descriptor)
	{
		super(descriptor);
	}
	
	public void visit_(Visitor visitor)
	{
		visitor.append("<gear-main>\n");
		super.visit_(visitor);
		visitor.append("</gear-main>\n");
	}
}
