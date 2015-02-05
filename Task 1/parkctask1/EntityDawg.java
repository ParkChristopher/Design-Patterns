//Chris Park
import java.util.*;

public class EntityDawg extends Entity
{
	private String attackType;
	
	public EntityDawg(String n)
	{
		super(n);
		attackType = "biting";
	}
	
	public void move()
	{
		System.out.println(name +
			" moves by walking.");
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
