public class BmiService {
    public double calculate(double weight, double growth) {

        int b = 2;
        double bmi = weight / Math.pow(growth, b);
        //return bmi;
        double result = Math.floor(bmi);
        return result;
    }

}
