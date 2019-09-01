import java.awt.*;

public class WeatherIndicatorJava {

    void rateWeather(int celsius, WeatherSign visualizer) {
        String status;
        Color color;
        if (celsius < 5) {
            status = "Brrrrrr!";
            color = Color.BLUE;
        } else if (celsius >= 5 && celsius < 20) {
            status = "Feels okay";
            color = Color.ORANGE;
        } else {
            status = "Holiday!";
            color = Color.RED;
        }
        visualizer.show(status, color);
    }
}
