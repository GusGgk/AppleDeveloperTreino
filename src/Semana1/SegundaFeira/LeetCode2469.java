package Semana1.SegundaFeira;

public class LeetCode2469 {
        public double[] convertTemperature(double celsius) {
            if(0 <= celsius && celsius <= 1000){
                double kelvin = celsius + 273.15;
                double fahrenheit = celsius * 1.80 + 32.00;

                double[] ans = new double[2];
                ans[0] = kelvin;
                ans[1] = fahrenheit;

                return ans;
            }
            return null;
        }
}
