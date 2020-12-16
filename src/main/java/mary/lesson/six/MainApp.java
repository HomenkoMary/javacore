package mary.lesson.six;


import java.io.IOException;

public class MainApp {

    public static void main(String args[]) throws IOException {

        Double[][] geoData = {
                {53.2001, 50.15},
                {47.2313, 39.7233},
                {45.0448, 38.976},
                {59.9386, 30.3141},
        };

        for (int i = 0; i < geoData.length; i++) {

            Wheather.getWeather(geoData[i][0], geoData[i][1]);

        }

    }

}
