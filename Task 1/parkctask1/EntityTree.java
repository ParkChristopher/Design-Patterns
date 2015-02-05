//Chris Park
import java.util.*;

public class EntityTree extends Entity
{
	private String attackType;
		
	public EntityTree(String n)
	{
		super(n);
		attackType = "";
	}
	
	public void move()
	{
		System.out.println(name + 
			" moves by swaying.");
	}
	public void initiateAttack(Entity ent)
	{
		System.out.println("Trees can't attack.");
	}
}
