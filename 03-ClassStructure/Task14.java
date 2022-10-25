public class Task14 {
    
    static double kelvinToCelcius(double kelvin){
        return kelvin - 272.15;
    }

    static double kelvinToFahrenheit(double kelvin){
        return kelvin * (9.0 / 5.0) - 459.67;
    }

    static double celciusToKevin(double celcius){
        return celcius + 273.15;
    }

    static double celciusToFahrenheit(double celcius){
        return celcius * 1.8 + 32;
    }
    
    static double fahrenheitToCelcius(double fahrenheit){
        return (fahrenheit - 32)/1.8;
    }
    
    static double fahrenheitToKelvin(double fahrenheit){
        return (fahrenheit + 459.67) / (5.0/9.0);
    }

    public static void main(String[] args){
        System.out.println(celciusToKevin(25.0));
        System.out.println(celciusToFahrenheit(25.0));
        System.out.println(fahrenheitToCelcius(100.0));
        System.out.println(fahrenheitToKelvin(100.0));
        System.out.println(kelvinToCelcius(0));
        System.out.println(kelvinToFahrenheit(0));
    }
}
