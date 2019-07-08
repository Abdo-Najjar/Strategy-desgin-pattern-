package stateMyway;

/**
 *
 * @author user
 */
public class TwoYearKid implements KidState{

    @Override
    public void play() {
        System.out.println("Two years kid is playing");
    }

    @Override
    public void eat() {
        System.out.println("Two years kid is eating");
    }
    
}
