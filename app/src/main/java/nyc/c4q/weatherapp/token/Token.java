package nyc.c4q.weatherapp.token;

/**
 * Created by Shant on 11/19/2017.
 */

public class Token {

    private static String token = "dda9baeb6dfee95de9324d66329d14d3";

    public static String getToken() {
        return token;
    }

    public static void setToken(String token) {
        Token.token = token;
    }
}
