//Chris Park

public class IdentifierSaltManager
{
	private static IdentifierSaltManager _instance = null; 
	private static int saltNum = 1;
	
	private IdentifierSaltManager()
	{
	}
	
	public static IdentifierSaltManager getInstance()
	{
		if (_instance == null)
			_instance = new IdentifierSaltManager();
		
		return _instance;
	}
	
	public static String getIDSalted(String ID)
	{
		String result;
		
		result = ID + "#" + saltNum;
		saltNum++;
		return result;
	}
	
	public static int getSaltNext()
	{
		return saltNum + 1;
	}
}
