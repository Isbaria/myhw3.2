public class BmiService {
    public int calculate(int kg, double m) {
        double bmiIndex = (kg / (m * m));
        return (int) bmiIndex;
    }
}
