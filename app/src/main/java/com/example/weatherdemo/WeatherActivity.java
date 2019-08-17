package com.example.weatherdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class WeatherActivity extends AppCompatActivity {

    public DrawerLayout drawerLayout;

    public SwipeRefreshLayout swipeRefresh;

    private ScrollView weatherLayout;

    private Button navButton;

    private TextView titleCity;

    private TextView titleUpdateTime;

    private TextView degreeText;

    private TextView weatherInfoText;

    private LinearLayout forecastLayout;

    private TextView aqiText;

    private TextView pm25Text;

    private TextView comfortText;

    private TextView carWashText;

    private TextView sportText;

    private ImageView bingPicImg;

    private String mWeatherId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        ini();
    }

    private void ini() {
        // 初始化各控件
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

//        bingPicImg = (ImageView) findViewById(R.id.bing_pic_img);
//        weatherLayout = (ScrollView) findViewById(R.id.weather_layout);
//        titleCity = (TextView) findViewById(R.id.title_city);
//        titleUpdateTime = (TextView) findViewById(R.id.title_update_time);
//        degreeText = (TextView) findViewById(R.id.degree_text);
//        weatherInfoText = (TextView) findViewById(R.id.weather_info_text);
//        forecastLayout = (LinearLayout) findViewById(R.id.forecast_layout);
//        aqiText = (TextView) findViewById(R.id.aqi_text);
//        pm25Text = (TextView) findViewById(R.id.pm25_text);
//        comfortText = (TextView) findViewById(R.id.comfort_text);
//        carWashText = (TextView) findViewById(R.id.car_wash_text);
//        sportText = (TextView) findViewById(R.id.sport_text);
//        swipeRefresh = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh);
//        swipeRefresh.setColorSchemeResources(R.color.colorPrimary);
//        navButton = (Button) findViewById(R.id.nav_button);
    }
}
