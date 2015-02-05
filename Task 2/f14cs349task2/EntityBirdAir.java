package f14cs349task2;

import f14cs349task2.contracts.I_CanAttackBirdAir;
import f14cs349task2.contracts.I_CanAttackBirdGround;
import f14cs349task2.contracts.I_CanAttackBirdWater;
import f14cs349task2.contracts.I_CanAttackDog;
import f14cs349task2.contracts.I_CanAttackTree;

//=============================================================================================================================================================
/**
 * Defines an entity for a bird in the air.
 * 
 * @author Dan Tappan [02.10.14]
 */
public class EntityBirdAir extends A_EntityBird<I_CanAttackBirdAir> implements I_CanAttackBirdAir, I_CanAttackBirdGround, I_CanAttackBirdWater, I_CanAttackDog,
      I_CanAttackTree
{
   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * Creates an entity.
    * 
    * @param id - the entity identifier
    */
   public EntityBirdAir(final String id)
   {
      super(id);
   }

   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * {@inheritDoc}
    * 
    * This augments the default behavior of accepting an attack.
    */
   @Override
   public void acceptAttackBy(final I_CanAttackBirdAir attacker)
   {
      super.acceptAttackBy(attacker);

      System.out.println(getID_() + " launched a bird dropping at " + attacker.getID_());
   }

   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * {@inheritDoc}
    * 
    * This augments the default behavior of releasing an attack.
    */
   @Override
   public void releaseAttackBy(final I_CanAttackBirdAir attacker)
   {
      super.releaseAttackBy(attacker);

      System.out.println(getID_() + " flipped " + attacker.getID_() + " the bird and flew away");
   }

}
