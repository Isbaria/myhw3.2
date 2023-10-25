public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int kg = 98; // Масса тела, кг.
        double m = 1.87; // Длинна тела, м.
        Double bmiIndex = service.calculate(kg, m); // должно получиться 28
        System.out.println(bmiIndex);


        System.out.println("кг. 105, м. 2.08");
        System.out.println(service.calculate(105, 2.08));

        System.out.println("кг. 54, м. 1.67");
        System.out.println(service.calculate(54, 1.67));



    }
}