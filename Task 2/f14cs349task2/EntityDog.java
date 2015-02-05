package f14cs349task2;

import f14cs349task2.contracts.I_CanAttackBirdGround;
import f14cs349task2.contracts.I_CanAttackClam;
import f14cs349task2.contracts.I_CanAttackDog;
import f14cs349task2.contracts.I_CanAttackTree;

//=============================================================================================================================================================
/**
 * Defines an entity for a dog.
 * 
 * @author Dan Tappan [02.10.14]
 */
public class EntityDog extends A_EntityAttacking<I_CanAttackDog> implements I_CanAttackBirdGround, I_CanAttackClam, I_CanAttackDog, I_CanAttackTree
{
   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * Creates an entity.
    * 
    * @param id - the entity identifier
    */
   public EntityDog(final String id)
   {
      super(id, "biting", "barking");
   }

   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * {@inheritDoc}
    * 
    * This augments the default behavior of beginning an attack.
    */
   @Override
   public void beginAttackOn_(final A_Entity<?> attackee)
   {
      System.out.println(getID_() + " bared its teeth, raised its tail, and started growling back at " + attackee.getID_());

      super.beginAttackOn_(attackee);
   }

   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * {@inheritDoc}
    * 
    * This augments the default behavior of ending an attack.
    */
   @Override
   public void endAttackOn_(final A_Entity<?> attackee)
   {
      super.endAttackOn_(attackee);

      System.out.println(getID_() + " closed its mouth and walked away looking back at " + attackee.getID_());
   }

   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * {@inheritDoc}
    * 
    * This augments the default behavior of updating an attack.
    */
   @Override
   public void updateAttackOn_(final A_Entity<?> attackee)
   {
      super.endAttackOn_(attackee);

      System.out.println(getID_() + " made nasty noises back at " + attackee.getID_());
   }
}
