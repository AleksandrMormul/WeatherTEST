package Util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    public static String API_KEY = "8c663a98c2e083ddd906a7d584d914dc";
    public static String API_LINK = "http://api.openweathermap.org/data/2.5/weather";

    public static String apiRequest(String lat, String lgn)
    {
        StringBuilder sb = new StringBuilder(API_KEY);
        sb.append(String.format("?lat=%s&lon=%lon=%s&APPID=%s&units=metric",lat,lgn, API_KEY));
        return sb.toString();
    }

    public static String dateTime(double unixTime)
    {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        date.setTime((long)unixTime * 1000);
        return dateFormat.format(date);
    }

    public static String getImage(String icon)
    {
        return String.format("http://openweathermap.org/img/w/%s.png", icon);
    }

    public static String dateNow()
    {
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy  HH:mm");
        Date date = new Date();
        return  dateFormat.format(date);
    }




}
