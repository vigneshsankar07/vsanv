package com.test.vigsa;

import android.content.Intent;
import android.provider.SyncStateContract;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.daimajia.androidanimations.library.Techniques;
import com.test.vigsa.util.Constants;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

public class AnimateSplash extends AwesomeSplash {

        //DO NOT OVERRIDE onCreate()!
        //if you need to start some services do it in initSplash()!

        @Override
        public void initSplash(ConfigSplash configSplash) {

			/* you don't have to override every property */

            //Customize Circular Reveal
            configSplash.setBackgroundColor(R.color.personColor); //any color you want form colors.xml
            configSplash.setAnimCircularRevealDuration(2000); //int ms
            configSplash.setRevealFlagX(Flags.REVEAL_RIGHT);  //or Flags.REVEAL_LEFT
            configSplash.setRevealFlagY(Flags.REVEAL_BOTTOM); //or Flags.REVEAL_TOP

            //Choose LOGO OR PATH; if you don't provide String value for path it's logo by default

            //Customize Logo
            configSplash.setLogoSplash(R.drawable.ic_app_logo_splash); //or any other drawable
            configSplash.setOriginalHeight(2000);
            configSplash.setOriginalHeight(2000);
            configSplash.setAnimLogoSplashDuration(1000); //int ms
            configSplash.setAnimLogoSplashTechnique(Techniques.SlideInUp); //choose one form Techniques


            //Customize Path
          // configSplash.setPathSplash(Constants.DROID_LOGO); //set path String
            configSplash.setOriginalHeight(400); //in relation to your svg (path) resource
            configSplash.setOriginalWidth(400); //in relation to your svg (path) resource
            configSplash.setAnimPathStrokeDrawingDuration(3000);
            configSplash.setPathSplashStrokeSize(3); //I advise value be <5
            configSplash.setPathSplashStrokeColor(R.color.personColor); //any color you want form colors.xml
            configSplash.setAnimPathFillingDuration(2000);
            configSplash.setPathSplashFillColor(R.color.personColor); //path object filling color


            //Customize Title
            configSplash.setTitleSplash("VsanV");
            configSplash.setTitleTextColor(R.color.black);
            configSplash.setTitleTextSize(35f); //float value
            configSplash.setAnimTitleDuration(1000);
            configSplash.setAnimTitleTechnique(Techniques.SlideInUp);
            configSplash.setTitleFont("fonts/appfont.otf"); //provide string to your font located in assets/fonts/

        }

        @Override
        public void animationsFinished() {

            //transit to another activity here
            //or do whatever you want
            Intent login = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(login);
            finish();
        }
}
