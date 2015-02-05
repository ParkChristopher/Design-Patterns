//Chris Park

import java.util.List;

public class ComponentStaticFuselage extends A_ComponentStatic
{
	private ComponentStaticWingLeft _wingLeft;
	private ComponentStaticWingRight _wingRight;
	private ComponentStaticStabilizerHorizontal _stabilizerLeft;
	private ComponentStaticStabilizerHorizontal _stabilizerRight;
	private ComponentStaticStabilizerVertical _stabilizerVertical;
	private ComponentDynamicGearNose _gear;
	private EngineManager _engineManager;
	
	public ComponentStaticFuselage(DescriptorComponent descriptor,
		ComponentStaticWingLeft wingLeft, ComponentStaticWingRight wingRight,
		ComponentStaticStabilizerHorizontal stabilizerLeft,
		ComponentStaticStabilizerHorizontal stabilizerRight,
		ComponentStaticStabilizerVertical stabilizerVertical,
		ComponentDynamicGearNose gear)
	{
		//Throw on null object
		super(descriptor);
		_wingLeft = wingLeft;
		_wingRight = wingRight;
		_stabilizerLeft = stabilizerLeft;
		_stabilizerRight = stabilizerRight;
		_stabilizerVertical = stabilizerVertical;
		_gear = gear;
		
		_wingLeft.setHost(this);
		_wingRight.setHost(this);
		_stabilizerLeft.setHost(this);
		_stabilizerRight.setHost(this);
		_stabilizerVertical.setHost(this);
		_gear.setHost(this);
		
		_engineManager = new EngineManager(this);
		registerEngines();
	}
	
	private void registerEngines()
	{
		List<ComponentDynamicEngine> enginesLeft;
		List<ComponentDynamicEngine> enginesRight;
		
		enginesLeft = _wingLeft.getEngines();
		enginesRight = _wingRight.getEngines();
		
		for(ComponentDynamicEngine engine : enginesLeft)
			_engineManager.registerEngineLeft(engine);
			
		for(ComponentDynamicEngine engine : enginesRight)
			_engineManager.registerEngineRight(engine);
	}
	
	public ComponentDynamicGearNose getGear()
	{
		return _gear;
	}
	
	public ComponentStaticStabilizerHorizontal getStabilizerLeft()
	{
		return _stabilizerLeft;
	}
	
	public ComponentStaticStabilizerHorizontal getStabilizerRight()
	{
		return _stabilizerRight;
	}
	
	public ComponentStaticStabilizerVertical getStabilizerVertical()
	{
		return _stabilizerVertical;
	}
	
	public ComponentStaticWingLeft getWingLeft()
	{
		return _wingLeft;
	}
	
	public ComponentStaticWingRight getWingRight()
	{
		return _wingRight;
	}
	
	public EngineManager getEngineManager()
	{
		return _engineManager;
	}
	
	public void visit_(Visitor visitor)
	{
		visitor.append("<fuselage>\n");
		super.visit_(visitor);
		_wingLeft.visit_(visitor);
		_wingRight.visit_(visitor);
		_stabilizerLeft.visit_(visitor);
		_stabilizerRight.visit_(visitor);
		_stabilizerVertical.visit_(visitor);
		_gear.visit_(visitor);
		visitor.append("</fuselage>\n");
	}
}
