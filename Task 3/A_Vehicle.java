//Chris Park

import java.util.*;

public abstract class A_Vehicle implements I_Identifiable
{
	protected final String _ID;
	protected final String _saltedID;
	private IdentifierSaltManager saltManager;
	
	public A_Vehicle(String ID)
	{
		_ID = ID;
		saltManager.getInstance();
		_saltedID = saltManager.getIDSalted(_ID);
	}
	
	public String getID()
	{
		return _ID;
	}
	
	public String getSaltedID()
	{
		return _saltedID;
	}
}
