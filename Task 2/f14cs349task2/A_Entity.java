package f14cs349task2;

import f14cs349task2.contracts.I_CanAttack;
import f14cs349task2.contracts.I_Identifiable;

//=============================================================================================================================================================
/**
 * Defines the shared elements of an entity.
 * 
 * @author Dan Tappan [02.10.14]
 */
public abstract class A_Entity<_ATTACKER_ extends I_CanAttack> implements I_Identifiable
{
   /** the entity identifier */
   private final String _id;

   /** a description of the method used for defense, grammatically formed in the progressive tense */
   private final String _defenseMethod;

   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * Creates an entity.
    * 
    * @param id - the entity identifier
    * @param defenseMethod - a description of the method used for defense, grammatically formed in the progressive tense
    */
   public A_Entity(final String id, final String defenseMethod)
   {
      if ((id == null) || (defenseMethod == null))
      {
         throw new NullPointerException();
      }

      if (id.isEmpty())
      {
         throw new RuntimeException("missing id");
      }

      if (defenseMethod.isEmpty())
      {
         throw new RuntimeException("missing defense method");
      }

      _id = id;
      _defenseMethod = defenseMethod;
   }

   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * Starts an episode of another entity attacking this entity. Call this to attack this entity, then {@link #refreshAttackBy(I_CanAttack)} any number of times
    * to continue the attack, and finally {@link #releaseAttackBy(I_CanAttack)} to end the episode.
    * 
    * This method is the way a client initiates an episode. Do not directly call {@link f14cs349task2.contracts.I_CanAttack#beginAttackOn_(A_Entity)},
    * {@link f14cs349task2.contracts.I_CanAttack#updateAttackOn_(A_Entity)}, or {@link f14cs349task2.contracts.I_CanAttack#endAttackOn_(A_Entity)} on the
    * attacking entity.
    * 
    * @param attacker - the entity attacking
    */
   public void acceptAttackBy(final _ATTACKER_ attacker)
   {
      if (attacker == null)
      {
         throw new NullPointerException();
      }

      attacker.beginAttackOn_(this);

      System.out.println(getID_() + " is being attacked by " + attacker.getID_() + " by " + attacker.getAttackMethod_());
   }

   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * Gets a description of the method used for defense, grammatically formed in the progressive tense.
    * 
    * @return the description
    */
   public String getDefenseMethod()
   {
      return _defenseMethod;
   }

   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * {@inheritDoc}
    */
   @Override
   public String getID_()
   {
      return _id;
   }

   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * Updates an episode of another entity attacking this entity.
    * 
    * @param attacker - the entity attacking
    */
   public void refreshAttackBy(final _ATTACKER_ attacker)
   {
      if (attacker == null)
      {
         throw new RuntimeException();
      }

      attacker.updateAttackOn_(this);

      System.out.println(getID_() + " is defending itself against " + attacker.getID_() + " by " + getDefenseMethod());
   }

   // ---------------------------------------------------------------------------------------------------------------------------------------------------------
   /**
    * Ends an episode of another entity attacking this entity.
    * 
    * @param attacker - the entity attacking
    */
   public void releaseAttackBy(final _ATTACKER_ attacker)
   {
      if (attacker == null)
      {
         throw new NullPointerException();
      }

      attacker.endAttackOn_(this);

      System.out.println(getID_() + " is no longer being attacked by " + attacker.getID_() + " by " + attacker.getAttackMethod_());
   }
}
