//Chris Park

public class ComponentDynamicPropeller extends A_ComponentDynamic
{
	public ComponentDynamicPropeller(DescriptorComponent descriptor)
	{
		super(descriptor);
	}
	
	public void visit_(Visitor visitor)
	{
		visitor.append("<propeller>\n");
		super.visit_(visitor);
		visitor.append("</propeller>\n");
	}
}
