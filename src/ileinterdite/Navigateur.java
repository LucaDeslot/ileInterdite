
import ileinterdite.Aventurier;
import ileinterdite.Tuile;

public class Navigateur extends Aventurier {
        private String role = "navigateur";

    
    @Override
    public String getRole() {
        return role;
    }

    
    public void setRole(String role) {
        this.role = role;
    }
    
    
}