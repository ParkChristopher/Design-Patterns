package f14cs349task2;

import f14cs349task2.contracts.I_CanAttack;

//=============================================================================================================================================================
/**
 * Defines the shared elements of an entity that can attack another entity.
 * 
 * @author Dan Tappan [02.10.14]
 */
public abstract class A_EntityAttacking<_ATTACKER_ extends I_CanAttack> extends A_Entity<_ATTACKER_> implements I_CanAttack
{
   /** a description of the method used for attacking, grammatically formed in the progressive tense */
   private final String _attackMethod;

   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * Creates an entity.
    * 
    * @param id - the entity identifier
    * @param attackMethod - a description of the method used for attacking, grammatically formed in the progressive tense
    * @param defenseMethod - a description of the method used for defense, grammatically formed in the progressive tense
    */
   public A_EntityAttacking(final String id, final String attackMethod, final String defenseMethod)
   {
      super(id, defenseMethod);

      if (attackMethod == null)
      {
         throw new NullPointerException();
      }

      _attackMethod = attackMethod;
   }

   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * {@inheritDoc}
    */
   @Override
   public void beginAttackOn_(final A_Entity<?> attackee)
   {
      assert (attackee != null);

      System.out.println(getID_() + " has begun attacking " + attackee.getID_() + " by " + getAttackMethod_());
   }

   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * {@inheritDoc}
    */
   @Override
   public void endAttackOn_(final A_Entity<?> attackee)
   {
      assert (attackee != null);

      System.out.println(getID_() + " has finished attacking " + attackee.getID_() + " by " + getAttackMethod_());

      // [XXX] cannot synchronize to make sure start, refresh, and end are executed in the correct order by the same entity
   }

   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * {@inheritDoc}
    */
   @Override
   public String getAttackMethod_()
   {
      return _attackMethod;
   }

   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * {@inheritDoc}
    */
   @Override
   public void updateAttackOn_(final A_Entity<?> attackee)
   {
      assert (attackee != null);

      System.out.println(getID_() + " is again attacking " + attackee.getID_() + " by " + getAttackMethod_());
   }
}
