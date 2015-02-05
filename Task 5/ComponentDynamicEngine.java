//Chris Park

public class ComponentDynamicEngine extends A_ComponentDynamic
{
	private ComponentDynamicPropeller _propeller;
	private double _power;
	
	public ComponentDynamicEngine(DescriptorComponent descriptor,
		ComponentDynamicPropeller propeller)
		{
			super(descriptor);
			
			//Throw on null object
			_propeller = propeller;
			_propeller.setHost(this);
			_power = 0;
		}
	
	public ComponentDynamicPropeller getPropeller()
	{
		return _propeller;
	}
	
	public void setPower(double power)
	{
		_power = power;
	}
	
	public double getPower()
	{
		return _power;
	}
	
	public void visit_(Visitor visitor)
	{
		visitor.append("<engine power=\"" + _power + "\">\n");
		super.visit_(visitor);
		_propeller.visit_(visitor);
		visitor.append("</engine>\n");
	}
}
