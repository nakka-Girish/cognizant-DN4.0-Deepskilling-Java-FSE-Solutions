public class FinancialForecast {
    public static double forecast(double principal, double rate, int years) {
        if (years == 0) {        
            return principal;
        }
        return forecast(principal, rate, years - 1) * (1 + rate);  
    }

    public static void main(String[] args) {
        double p = 10000; 
        double r = 0.05;  
        int y = 3;

        double fv = forecast(p, r, y);
        System.out.printf("Future Value after %d years = %f\n", y, fv);
    }
}