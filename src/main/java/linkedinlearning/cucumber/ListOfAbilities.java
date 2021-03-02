package linkedinlearning.cucumber;

import java.util.ArrayList;

public class ListOfAbilities {

	ArrayList<Ability> Abilities = new ArrayList<Ability>();
	
	public boolean addAbility(Ability ab) {
		return Abilities.add(ab);
	}
	
}
