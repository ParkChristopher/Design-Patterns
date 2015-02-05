//Chris Park

import java.util.*;
public class TestEntity
{
	public static void main(String[] args)
	{
		Entity dog = new EntityDawg("Rover");
		Entity ghost = new EntityGhost("Casper");
		Entity tree = new EntityTree("Oak");
		Entity cat = new EntityCat("Oliver");
		Entity alien = new EntityAlien("E.T.");
		
		System.out.println("Test Output");
		System.out.println();
		
		System.out.println("Entity IDs");
		System.out.println(dog.getID());
		System.out.println(ghost.getID());
		System.out.println(tree.getID());
		System.out.println(cat.getID());
		System.out.println(alien.getID());
		
		System.out.println();
		System.out.println("Attack Tests");
		System.out.println();
		
		dog.initiateAttack(dog);
		dog.initiateAttack(ghost);
		dog.initiateAttack(tree);
		dog.initiateAttack(cat);
		dog.initiateAttack(alien);
		
		System.out.println();
		
		ghost.initiateAttack(dog);
		ghost.initiateAttack(ghost);
		ghost.initiateAttack(tree);
		ghost.initiateAttack(cat);
		ghost.initiateAttack(alien);
		
		System.out.println();
		
		tree.initiateAttack(dog);
		tree.initiateAttack(ghost);
		tree.initiateAttack(tree);
		tree.initiateAttack(cat);
		tree.initiateAttack(alien);
		
		System.out.println();
		
		cat.initiateAttack(dog);
		cat.initiateAttack(ghost);
		cat.initiateAttack(tree);
		cat.initiateAttack(cat);
		cat.initiateAttack(alien);
		
		System.out.println();

		alien.initiateAttack(dog);
		alien.initiateAttack(ghost);
		alien.initiateAttack(tree);
		alien.initiateAttack(cat);
		alien.initiateAttack(alien);
		
		System.out.println();
		
		dog.move();
		ghost.move();
		tree.move();
		cat.move();
		alien.move();

		
	}
}
