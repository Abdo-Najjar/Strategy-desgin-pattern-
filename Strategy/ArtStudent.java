package Strategy;

/**
 *
 * @author user
 */
public class ArtStudent implements Student{
  
    @Override
    public double calculateGrade(double mid,double lab , double finl) {
        return mid*0.20+lab*0.30+finl*0.50;
    }
    
}
