//Chris Park
import java.util.*;

public class EntityAlien extends Entity
{
	private String attackType;
	
	public EntityAlien(String n)
	{
		super(n);
		attackType = "raygun";
	}
	
	public void move()
	{
		System.out.println(name +
			" moves by teleporting.");
	}
	
	public void initiateAttack(Entity ent)
	{	
		System.out.println(name + 
		" initiated " + attackType + 
		" attack against " + ent.getID() + ".");
		
		ent.receiveAttack(this);
	}
}
