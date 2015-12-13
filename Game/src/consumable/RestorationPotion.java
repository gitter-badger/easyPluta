package consumable;

import item.Item;
import effect.Effect;
import effect.Heal;
import effect.ManaReplenish;

public class RestorationPotion extends Item {

		public RestorationPotion(int amount) {
			
			this.effects = new Effect[1];
			this.effects[0] = new Heal(amount);
			this.effects = new Effect[1];
			this.effects[0] = new ManaReplenish(amount);
		}
	//test collaborateur
}
