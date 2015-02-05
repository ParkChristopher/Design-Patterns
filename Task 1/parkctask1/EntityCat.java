//Chris Park
import java.util.*;

public class EntityCat extends Entity
{
	private String attackType;
	
	public EntityCat(String n)
	{
		super(n);
		attackType = "claw";
	}
	
	public void move()
	{
		System.out.println(name +
			" moves by slinking.");
	}
	
	public void initiateAttack(Entity ent)
	{
		if(ent.getClass() == EntityGhost.class ||
			ent.getClass() == EntityAlien.class)
		{
			System.out.println(name +
				" can't attack that.");
			return;
		}
		
		System.out.println(name + 
		" initiated " + attackType + 
		" attack against " + ent.getID() + ".");
		
		ent.receiveAttack(this);
	}
}
