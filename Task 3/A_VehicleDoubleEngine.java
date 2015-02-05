//Chris Park

public abstract class A_VehicleDoubleEngine extends A_Vehicle implements I_DualPowerable
{

	private A_Powerplant _primaryPowerplant;
	private A_Powerplant _secondaryPowerplant;
	private boolean _isPrimary;
	
	public A_VehicleDoubleEngine(String ID, A_Powerplant primaryPowerplant,
			A_Powerplant secondaryPowerplant)
	{
		super(ID);
		
		if (primaryPowerplant == secondaryPowerplant)
			throw new RuntimeException("Two unique powerplants required");
		
		_primaryPowerplant = primaryPowerplant;
		_secondaryPowerplant = secondaryPowerplant;
		_primaryPowerplant.setHost(this);
		_secondaryPowerplant.setHost(this);
		_isPrimary = true;
	}
	
	public A_Powerplant getPowerplantPrimary()
	{
		if(_primaryPowerplant == null)
			throw new RuntimeException("no installed primary powerplant");
		
		return _primaryPowerplant;
	}
	
	public A_Powerplant getPowerplantSecondary()
	{
		if(_secondaryPowerplant == null)
			throw new RuntimeException("no installed secondary powerplant");
		
		return _secondaryPowerplant;
	}
	
	public void isPrimaryOrSecondary(boolean isPrimary)
	{
		_isPrimary = isPrimary;
	}
	
	public boolean isPrimaryOrSecondary()
	{
		return _isPrimary;
	}
	
	public void removePowerplantPrimary()
	{
		if(_primaryPowerplant == null)
			throw new RuntimeException("no installed primary powerplant");
		
		_primaryPowerplant.removeHost();
		_primaryPowerplant = null;
	}
	
	public void removePowerplnatSecondary()
	{
		if(_secondaryPowerplant == null)
			throw new RuntimeException("no installed secondary powerplant");
		
		_secondaryPowerplant.removeHost();
		_secondaryPowerplant = null;
	}
	
	public boolean hasPowerplantPrimary()
	{
		if (_primaryPowerplant != null)
			return true;
		
		return false;
	}
	
	public boolean hasPowerplantSecondary()
	{
		if(_secondaryPowerplant != null)
			return true;
		
		return false;
	}
	
	public void installPowerplantPrimary(A_Powerplant primaryPowerplant)
	{
		if(_primaryPowerplant != null)
			throw new RuntimeException("primary powerplant " +
				_primaryPowerplant.getID() + " already installed");
			
		_primaryPowerplant = primaryPowerplant;
		_primaryPowerplant.setHost(this);
	}
	
	public void installPowerplantSecondary(A_Powerplant secondaryPowerplant)
	{
		if(_secondaryPowerplant != null)
			throw new RuntimeException("secondary powerplant " +
				_secondaryPowerplant.getID() + " already installed");
			
		_secondaryPowerplant = secondaryPowerplant;
		_secondaryPowerplant.setHost(this);
	}
	
	public void move()
	{
		if(_isPrimary)
		{	
			
			System.out.print(_saltedID + ": ");
			if(_primaryPowerplant == null)
				System.out.println("no primary powerplant");
			else
				_primaryPowerplant.generate();
			
			return;
		}
		
		System.out.print(_saltedID + ": ");
		if(_secondaryPowerplant == null)
			System.out.println("no secondary powerplant");
		else
			_secondaryPowerplant.generate();
	}
}
