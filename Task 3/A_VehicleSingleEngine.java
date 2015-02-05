//Chris Park

import java.util.*;

public abstract class A_VehicleSingleEngine extends A_Vehicle implements I_Powerable
{
	private A_Powerplant _powerplant;
	
	public A_VehicleSingleEngine(String ID, A_Powerplant powerplant)
	{
		super(ID);
		
		_powerplant = powerplant;
		_powerplant.setHost(this);
	}
	
	public A_Powerplant getPowerplant()
	{
		if(_powerplant == null)
			throw new RuntimeException("no installed powerplant");
		
		return _powerplant;
	}
	
	public void removePowerplant()
	{
		if(_powerplant == null)
			throw new RuntimeException("no installed powerplant");
		
		_powerplant.removeHost();
		_powerplant = null;
	}
	
	public void installPowerplant(A_Powerplant powerplant)
	{
		if (_powerplant != null)
			throw new RuntimeException("powerplant " + _powerplant.getID() +
				" already installed.");
			
			_powerplant = powerplant;
			_powerplant.setHost(this);
	}
	
	public boolean hasPowerplant()
	{
		if(_powerplant != null)
			return true;
		
		return false;
	}
	
	public void move()
	{
		if(_powerplant == null)
			throw new RuntimeException("no installed powerplant");
		
		System.out.print(_saltedID + ": ");
		if(_powerplant == null)
			System.out.println("no powerplant");
		else
			_powerplant.generate();
	}
}
