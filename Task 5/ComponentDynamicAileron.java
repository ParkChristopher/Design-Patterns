//Chris Park

public class ComponentDynamicAileron extends A_ComponentDynamic
{
	public ComponentDynamicAileron(DescriptorComponent descriptor)
	{
		super(descriptor);
	}
	
	public void visit_(Visitor visitor)
	{
		visitor.append("<aileron>\n");
		super.visit_(visitor);
		visitor.append("</aileron>\n");
	}
}
