package helpme.helpmetest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;


public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EasySplashScreen config = new EasySplashScreen(SplashScreen.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(5000)
                .withBackgroundColor(Color.parseColor("#074E72"))
                .withLogo(R.mipmap.ic_launcher)
                .withHeaderText("Welcome!!!")
                .withFooterText("Copyright 2019")
                .withBeforeLogoText("HelpMe")
                .withAfterLogoText("Service Provider");

        //set text color
        config.getHeaderTextView().setTextColor (android.graphics.Color.WHITE);
        config.getFooterTextView().setTextColor(android.graphics.Color.WHITE);
        config.getAfterLogoTextView().setTextColor(android.graphics.Color.WHITE);

        //Set to view
        View view = config.create();

        //Set view to content view
        setContentView(view);

    }
}
