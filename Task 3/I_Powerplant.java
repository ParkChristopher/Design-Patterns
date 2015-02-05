//Chris Park

public interface I_Powerplant
{
	public String getID();
	public void setHost(A_Vehicle hostVehicle);
	public A_Vehicle getHost();
	public void removeHost();
	public boolean hasHost();
	public void generate();
}
