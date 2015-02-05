//Chris Park
import java.util.*;

public abstract class Entity
{
	public String name;
	
	public Entity(String n)
	{
		name = n;
	}
	
	public String getID()
	{
		return name;
	}
	
	public void receiveAttack(Entity ent)
	{
		System.out.println(name + 
			" received attack by " +
			ent.getID() + ".");
	}
	public abstract void initiateAttack(Entity ent);
	public abstract void move(); 
}
