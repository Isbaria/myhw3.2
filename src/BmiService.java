public class BmiService {
    public double calculate(int kg, double m) {
        double bmiIndex = (int) (kg / (m * m));
        return bmiIndex;
    }
}
