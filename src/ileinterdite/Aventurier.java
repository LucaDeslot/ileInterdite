package ileinterdite;

import java.util.ArrayList;

public abstract class Aventurier {
	public ArrayList<Carte_Tresor_Abs_> _main = new ArrayList<Carte_Tresor_Abs_>();
	private Joueur _joueurassocié;
	private Tuile _positionActuelle;

	public Aventurier getRole() {
		throw new UnsupportedOperationException();
	}
        
        
}