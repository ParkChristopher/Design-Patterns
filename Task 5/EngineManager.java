//Chris Park

import java.util.List;
import java.util.ArrayList;

public class EngineManager
{
	private ComponentStaticFuselage _host;
	private ArrayList<ComponentDynamicEngine> _enginesLeft;
	private ArrayList<ComponentDynamicEngine> _enginesRight;
	private boolean _engineLock;
	
	public EngineManager(ComponentStaticFuselage host)
	{
		//Throw on null object
		_host = host;
		_enginesLeft = new ArrayList<ComponentDynamicEngine>();
		_enginesRight = new ArrayList<ComponentDynamicEngine>();
		_engineLock = false;
	}
	
	public ComponentStaticFuselage getHost()
	{
		return _host;
	}
	
	public void registerEngineLeft(ComponentDynamicEngine engine)
	{
		//Throw on null object
		if(!_engineLock)
			_enginesLeft.add(engine);
	}
	
	public void registerEngineRight(ComponentDynamicEngine engine)
	{
		//Throw on null object
		if(!_engineLock)
			_enginesRight.add(engine);
	}
	
	List<ComponentDynamicEngine> getEngines()
	{
		ArrayList<ComponentDynamicEngine> engineList =
		new ArrayList<ComponentDynamicEngine>();
		
		engineList.addAll(_enginesLeft);
		engineList.addAll(_enginesRight);
		
		return engineList;
	}
	
	public void setPower(double power)
	{
		for(ComponentDynamicEngine engine : _enginesLeft)
			engine.setPower(power);
		
		for(ComponentDynamicEngine engine : _enginesRight)
			engine.setPower(power);
	}
	
	public void commit()
	{
		if(_enginesLeft.size() == _enginesRight.size())
		{
			lockEngines(true);
		}
		else
			throw new RuntimeException("Error: Engines are unbalanced");
	}
	
	private void lockEngines(boolean isLocked)
	{
		_engineLock = isLocked;
	}
}
