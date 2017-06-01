import ileinterdite.Aventurier;
import ileinterdite.Tuile;

public class Ingenieur extends Aventurier {
    private String role = "ingénieur";

    
    public String getRole() {
        return role;
    }

    
    public void setRole(String role) {
        this.role = role;
    }

    public Tuile getPosition() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}