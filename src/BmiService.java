public class BmiService {
    public double calculate(int kg, double m) {
        double bmiIndex = (kg / (m * m));
        return (int) bmiIndex;
    }
}
