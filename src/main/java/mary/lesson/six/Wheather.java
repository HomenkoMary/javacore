package mary.lesson.six;



import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Wheather {


    public static String getWeather(Double lat, Double lon) throws IOException
    {
        String url = "https://api.weather.yandex.ru/v2/forecast?lat=" + lat + "&lon=" + lon;
        String jsonData = HttpClient.getData(url);

        JsonNode cityName = parseJson(jsonData, "/geo_object/locality/name");
        JsonNode forecast = parseJson(jsonData, "/forecast");

        System.out.println(forecast.asText());
        return "";
    }




    private static JsonNode parseJson(String jsonData, String nodeName) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode node = objectMapper
                .readTree(jsonData)
                .at(nodeName);

        return node;
    }

}
