package Strategy;

/**
 *
 * @author user
 */
public class StudentStrategy {
  
    private Student s;
    public StudentStrategy(Student s) {
          this.s = s;
    }
 
   public double calculateGrade(double mid,double lab , double finl){
      return s.calculateGrade(mid,lab,finl);
   }
    
    
}
