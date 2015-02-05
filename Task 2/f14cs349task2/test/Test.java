package f14cs349task2.test;

import f14cs349task2.EntityBirdAir;
import f14cs349task2.EntityDog;
import f14cs349task2.EntityGhost;

//=============================================================================================================================================================
/**
 * Defines tests for the entities.
 * 
 * @author Dan Tappan [02.10.14]
 */
public class Test
{
   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * Creates and executes the tests.
    * 
    * @param arguments - any comment-line arguments; there are none
    */
   public static void main(final String[] arguments)
   {
      Test test = new Test();

      test.runTest2();
   }

   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * Runs a test.
    */
   public void runTest1()
   {
      EntityDog dog1 = new EntityDog("Dog1");
      EntityDog dog2 = new EntityDog("Dog2");

      dog2.acceptAttackBy(dog1);
      dog2.refreshAttackBy(dog1);
      dog2.releaseAttackBy(dog1);

      System.out.println();

      EntityGhost ghost1 = new EntityGhost("Ghost1");

      dog2.acceptAttackBy(ghost1);
      dog2.refreshAttackBy(ghost1);
      dog2.releaseAttackBy(ghost1);

      // ghost1.acceptAttackBy(dog2);
      
      System.out.println();

      EntityBirdAir airbird1 = new EntityBirdAir("AirBird1");

      dog2.acceptAttackBy(airbird1);
      dog2.refreshAttackBy(airbird1);
      dog2.releaseAttackBy(airbird1);

      System.out.println();

      airbird1.acceptAttackBy(ghost1);
      airbird1.refreshAttackBy(ghost1);
      airbird1.releaseAttackBy(ghost1);

   }
   
   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * Runs a test.
    */
   public void runTest2()
   {
      EntityBirdAir airbird = new EntityBirdAir("AirBird");
      EntityDog dog = new EntityDog("Dog");

      dog.acceptAttackBy(airbird);
      dog.refreshAttackBy(airbird);
      dog.releaseAttackBy(airbird);

      System.out.println();
   }
}
