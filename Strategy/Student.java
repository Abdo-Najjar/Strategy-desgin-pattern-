package Strategy;

/**
 *
 * @author user
 */
  @FunctionalInterface
public interface Student {
    public abstract double calculateGrade(double mid,double lab , double finl);
}
