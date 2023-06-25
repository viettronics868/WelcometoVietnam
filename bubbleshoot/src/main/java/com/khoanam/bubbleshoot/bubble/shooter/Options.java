package com.khoanam.bubbleshoot.bubble.shooter;

import com.khoanam.bubbleshoot.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.startapp.android.publish.StartAppAd;
import com.startapp.android.publish.StartAppSDK;
import com.startapp.android.publish.splash.SplashConfig;

public class Options extends Activity {

	public static boolean soundBoolean  = true;
	public static boolean vibrateBoolean  = true;
	//public static boolean fotohBoolean  = false;
	CheckBox cbSound ;
	CheckBox cbVibrate ;
	//CheckBox cbFotoh ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		StartAppSDK.init(this, "204708372", true);
		//StartAppAd.showSplash(this, savedInstanceState);
		StartAppAd.showSplash(this, savedInstanceState,
				new SplashConfig()
						.setTheme(SplashConfig.Theme.OCEAN)
						.setLogo(R.drawable.logo)
						.setAppName("Welcome To Vietnam")
		);

		setContentView(R.layout.options_layout);
		cbSound = (CheckBox) findViewById(R.id.checkBox1);
		cbVibrate = (CheckBox) findViewById(R.id.checkBox2);
		//cbFotoh = (CheckBox) findViewById(R.id.checkBox3);
		cbSound.setChecked(soundBoolean);
		cbVibrate.setChecked(vibrateBoolean);
		//cbFotoh.setChecked(fotohBoolean);


		AdView mAdView = (AdView) findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder()
				//.addTestDevice("AC98C820A50B4AD8A2106EDE96FB87D4")
				.build();
		mAdView.loadAd(adRequest);
	}
	
	public void check(View v){
		soundBoolean = cbSound.isChecked();
		vibrateBoolean = cbVibrate.isChecked();
		//fotohBoolean = cbFotoh.isChecked();
	}
}
