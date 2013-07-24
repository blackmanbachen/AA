package com.tmacsky.activity;

import com.tmacsky.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;

public class SplashActivity extends Activity {
	private LinearLayout sLayout;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);//����û�б���
		setContentView(R.layout.splash);
		sLayout = (LinearLayout)findViewById(R.id.splashLayout);
		startAnimation();
	}

	private void startAnimation() {
		//splash��һ������������������
		AlphaAnimation tAnimation = new AlphaAnimation(0.1f, 1.0f);
    	tAnimation.setDuration(1000);
    	sLayout.setAnimation(tAnimation);
    	sLayout.startAnimation(tAnimation);
    	//ִ��activity��ת����activityҳ��
    	new Handler().postDelayed(new loadSplash(), 1000);
	}
	private class loadSplash implements Runnable{

		public void run() {
			// TODO Auto-generated method stub
			Intent intent = new Intent(SplashActivity.this,ActivityMain.class);
			startActivity(intent);
			finish();
		}
		
	}

}
