package Strategy;

/**
 *
 * @author user
 */
public class ITStudent implements Student{
    
    @Override
    public double calculateGrade(double mid,double lab , double finl) {
        return (mid*0.30+lab*0.20+finl*0.50);
    }
    
}
