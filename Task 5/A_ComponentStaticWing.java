//Chris Park

import java.util.List;

public abstract class A_ComponentStaticWing extends A_ComponentStatic
{
	private java.util.List<ComponentDynamicEngine> _engines;
	private java.util.List<ComponentDynamicAileron> _ailerons;
	private ComponentDynamicFlap _flap;
	private ComponentDynamicGearMain _gear;
	
	public A_ComponentStaticWing(DescriptorComponent descriptor,
		java.util.List<ComponentDynamicEngine> engines,
		java.util.List<ComponentDynamicAileron> ailerons,
		ComponentDynamicFlap flap, ComponentDynamicGearMain gear)
	{
		super(descriptor);
		
		//Throw on null object
		_engines = engines;
		_ailerons = ailerons;
		_flap = flap;
		_gear = gear;
		
		for(ComponentDynamicEngine engine : _engines)
			engine.setHost(this);
		
		for(ComponentDynamicAileron aileron : _ailerons)
			aileron.setHost(this);
		
		_gear.setHost(this);
	}
	
	public List<ComponentDynamicAileron> getAilerons()
	{
		return _ailerons;
	}
	
	public List<ComponentDynamicEngine> getEngines()
	{
		return _engines;
	}
	
	public ComponentDynamicFlap getFlap()
	{
		return _flap;
	}
	
	public ComponentDynamicGearMain getGear()
	{
		return _gear;
	}
	
	public void visit_(Visitor visitor)
	{
		visitor.append("<wing>\n");
		super.visit_(visitor);
		
		for(ComponentDynamicEngine engine : _engines)
			engine.visit_(visitor);
		
		for(ComponentDynamicAileron aileron : _ailerons)
			aileron.visit_(visitor);
		
		_flap.visit_(visitor);
		_gear.visit_(visitor);
		visitor.append("</wing>\n");
	}
}
