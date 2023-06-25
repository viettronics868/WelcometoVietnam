package com.khoanam.bubbleshoot.bubble.shooter;

import java.io.IOException;
import java.io.InputStream;

import org.json.simple.parser.ParseException;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.khoanam.bubbleshoot.game.engine.SurfaceViewHandler;
import com.khoanam.bubbleshoot.R;
import com.startapp.android.publish.StartAppAd;
import com.startapp.android.publish.StartAppSDK;
import com.startapp.android.publish.splash.SplashConfig;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.EditText;
import android.widget.TextView;

public class BubbleShootActivity extends Activity {
    /** Called when the activity is first created. */
	GameScene scene;
	static Vibrator vibrator ;
	public static InputStream inputStream;
	public static BubbleShootActivity BubbleActivity ;
	public static MediaPlayer hitPlayer;
	public static MediaPlayer fallPlayer;
	public static MediaPlayer winPlayer;
	public static MediaPlayer losePlayer;
	
	static Generate generator;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

		StartAppSDK.init(this, "204708372", true);
		//StartAppAd.showSplash(this, savedInstanceState);
		StartAppAd.showSplash(this, savedInstanceState,
				new SplashConfig()
						.setTheme(SplashConfig.Theme.OCEAN)
						.setLogo(R.drawable.logo)
						.setAppName("Welcome To Vietnam")
		);

       setContentView(R.layout.game_layout);

		AdView mAdView = (AdView) findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder()
				//.addTestDevice("AC98C820A50B4AD8A2106EDE96FB87D4")
				.build();
		mAdView.loadAd(adRequest);
       
//       Stream of JSON file
       inputStream = getResources().openRawResource(R.raw.file);
       BubbleActivity = this;
       vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
       SurfaceViewHandler handler = (SurfaceViewHandler)findViewById(R.id.surface);
//       System.out.println(handler);
       scene = new GameScene(handler);
       scene.resources = getResources();
       try {
		generator = new Generate();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (ParseException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

       //create Players
       hitPlayer = MediaPlayer.create(this,R.raw.hit);
       losePlayer = MediaPlayer.create(this,R.raw.lose);
       fallPlayer = MediaPlayer.create(this,R.raw.fall);
       winPlayer = MediaPlayer.create(this,R.raw.win);
       
//        scene.initialize();
    }
    @Override
    protected void onPause() {
//    	call Garbage collector
    	System.gc();
    	scene.pause();
    	super.onPause();
    }
    @Override
    protected void onResume() {
//    	System.out.println("resume Scene:" + scene);
    	if(scene != null){
    	    	scene.resume();
    	}
    	super.onResume();
    }
    @Override
    protected void onDestroy() {
    	
    	// release all Players
    	hitPlayer.release();
    	fallPlayer.release();
    	winPlayer.release();
    	losePlayer.release();
    	// TODO Auto-generated method stub
    	System.out.println("destored");
    	if(scene != null){
    		scene.started = false;
    		scene.getSurfaceViewHandler().started = false;
    	}
    	
    	//call Garbage collector
    	System.gc();
    	super.onDestroy();
    }

}