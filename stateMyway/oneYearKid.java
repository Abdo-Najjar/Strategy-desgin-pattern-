package stateMyway;

/**
 *
 * @author user
 */
public class oneYearKid implements KidState{

    @Override
    public void play() {
        System.out.println("One year kid is playing");
    }

    @Override
    public void eat() {
        System.out.println("One year kid is eating");
    }
    
}
