//Chris Park

public interface I_Powerable
{
	public A_Powerplant getPowerplant();
	public void removePowerplant();
	public void installPowerplant(A_Powerplant powerplant);
	public boolean hasPowerplant();
	public void move();
}
