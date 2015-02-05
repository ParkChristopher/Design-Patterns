//Chris Park

public abstract class A_Powerplant implements I_Powerplant
{
	protected final String _ID;
	protected A_Vehicle _hostVehicle;
	
	public A_Powerplant(String ID)
	{
		_ID = ID;
		_hostVehicle = null;
	}
	
	public String getID()
	{
		return _ID;
	}
	
	public void setHost(A_Vehicle hostVehicle)
	{
		if(_hostVehicle != null)
			throw new RuntimeException("Host vehicle " + 
				_hostVehicle.getSaltedID() + " already found");
			
		_hostVehicle = hostVehicle;
	}
	
	public A_Vehicle getHost()
	{
		if(_hostVehicle == null)
			throw new RuntimeException("no host vehicle set");
		
		return _hostVehicle;
	}
	
	public void removeHost()
	{
		if(_hostVehicle == null)
			throw new RuntimeException("no host vehicle to remove");
		
		_hostVehicle = null;
	}
	
	public boolean hasHost()
	{
		if(_hostVehicle != null)
			return true;
		
		return false;
	}
	
	public abstract void generate();
}
