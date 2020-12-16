package mary.lesson.six;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class HttpClient {

    public static String getData(String url) throws IOException
    {
        OkHttpClient httpClient = new OkHttpClient();

        Request httpRequest = new Request.Builder()
                .url(url)
                .addHeader("X-Yandex-API-Key", "a7033c96-4594-458d-82b2-449e246aa1ff")
                .build();

        Response response = httpClient.newCall(httpRequest).execute();

        return response.body().string();
    }

}
