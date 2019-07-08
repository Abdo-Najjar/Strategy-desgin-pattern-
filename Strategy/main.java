package Strategy;

/**
 *
 * @author user
 */
public class main {
    public static void main(String[] args) {
        StudentStrategy s = new StudentStrategy(new ITStudent());
        System.out.println(s.calculateGrade(50, 42, 12));
    }
    
}
