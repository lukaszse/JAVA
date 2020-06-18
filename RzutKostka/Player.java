
package rzut.kostka;

import java.util.Random;



public class Player {
    private Random brain = new Random();

//private String type field name was added to Player class
    private String name ="John Smith";
    
    public int guess(){
        return brain.nextInt(6) + 1;
    }
//following getter and setter methods which allow to get and set value of name field were added

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
