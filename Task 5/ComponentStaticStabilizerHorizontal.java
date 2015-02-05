//Chris Park

public class ComponentStaticStabilizerHorizontal extends A_ComponentStatic
{
	private ComponentDynamicElevator _elevator;
	
	public ComponentStaticStabilizerHorizontal(DescriptorComponent descriptor,
		ComponentDynamicElevator elevator)
	{
		super(descriptor);
		
		//Throw on null object
		_elevator = elevator;
		_elevator.setHost(this);
	}
	
	public ComponentDynamicElevator getElevator()
	{
		return _elevator;
	}
	
	public void visit_(Visitor visitor)
	{
		visitor.append("<stabilizer-horizontal>\n");
		super.visit_(visitor);
		_elevator.visit_(visitor);
		visitor.append("</stabilizer-horizontal>\n");	
	}
}
