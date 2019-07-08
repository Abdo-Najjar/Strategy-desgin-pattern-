package stateMyway;

/**
 *
 * @author user
 */
public class Kid {

    private KidState state;
    private final int age;

    public Kid(int age) {
        this.age = age;
        switch (age) {
            case 1:
                state = new oneYearKid();
                break;
            case 2:
                state = new TwoYearKid();
                break;
            default:
                state = new oneYearKid();
                break;
        }
    }

    public void kidPlay() {
        state.play();
    }

    public void kidEat() {
        state.eat();
    }

}
