package com.khoanam.bubbleshoot.bubble.shooter;

import com.khoanam.bubbleshoot.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.startapp.android.publish.StartAppAd;
import com.startapp.android.publish.StartAppSDK;
import com.startapp.android.publish.splash.SplashConfig;

public class StartMenu  extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		StartAppSDK.init(this, "204708372", true);
		//StartAppAd.showSplash(this, savedInstanceState);
		StartAppAd.showSplash(this, savedInstanceState,
				new SplashConfig()
						.setTheme(SplashConfig.Theme.OCEAN)
						.setLogo(R.drawable.logo)
						.setAppName("Welcome To Vietnam")
		);

		setContentView(R.layout.start_menu);

		AdView mAdView = (AdView) findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder()
				//.addTestDevice("AC98C820A50B4AD8A2106EDE96FB87D4")
				.build();
		mAdView.loadAd(adRequest);


	}
	
	public void playButton(View v)
	{
		Intent intent = new Intent(this,LevelSelectMenu.class);
		startActivity(intent);
	}
	public void optionButton(View v)
	{
		startActivity(new Intent(this,Options.class));
	}
}
