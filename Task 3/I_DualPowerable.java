//Chris Park

public interface I_DualPowerable
{
	public A_Powerplant getPowerplantPrimary();
	public A_Powerplant getPowerplantSecondary();
	public void isPrimaryOrSecondary(boolean isPrimary);
	public boolean isPrimaryOrSecondary();
	public void removePowerplantPrimary();
	public void removePowerplnatSecondary();
	public boolean hasPowerplantPrimary();
	public boolean hasPowerplantSecondary();
	public void installPowerplantPrimary(A_Powerplant primaryPowerplant);
	public void installPowerplantSecondary(A_Powerplant secondaryPowerplant);
	public void move();
}
