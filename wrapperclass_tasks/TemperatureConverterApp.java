package wrapperclass_tasks;

//task 7

import java.util.ArrayList;
import java.util.Arrays;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        String[] tempStrings = { "36", "38", "40" };

        ArrayList<Integer> celsiusTemps = new ArrayList<>();
        for (String tempStr : tempStrings)
        {
            celsiusTemps.add(Integer.parseInt(tempStr)); 
        }

        ArrayList<Double> fahrenheitTemps = new ArrayList<>();
        for (int celsius : celsiusTemps)
        {
            double fahrenheit = celsius * 9.0 / 5 + 32;
            fahrenheitTemps.add(fahrenheit); 
        }

        System.out.println("Temperature Conversion:");
        for (int i = 0; i < celsiusTemps.size(); i++) 
        {
            System.out.println(celsiusTemps.get(i) + "°C = " + fahrenheitTemps.get(i) + "°F");
        }
	}

}

       