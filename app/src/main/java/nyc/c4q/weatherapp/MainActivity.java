package nyc.c4q.weatherapp;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.johnhiott.darkskyandroidlib.ForecastApi;

import nyc.c4q.weatherapp.fragments.MainFragment;
import nyc.c4q.weatherapp.token.Token;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ForecastApi.create(Token.getToken());

        MainFragment mainFragment = new MainFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.main_container,mainFragment).commit();
    }
}
