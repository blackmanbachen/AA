package com.tmacsky.activity;
import com.tmacsky.R;
import com.tmacsky.activity.base.ActivityFrame;
import android.app.Activity;
import android.os.Bundle;
public class AboutActivity extends ActivityFrame {
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		AppendMainBody(R.layout.about);
	}
}
