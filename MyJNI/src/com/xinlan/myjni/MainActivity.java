package com.xinlan.myjni;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
	static{
		System.loadLibrary("my");
	}
	private TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		textView = (TextView) findViewById(R.id.text);
		textView.setText(getFromC());
	}

	public static native String getFromC();
}//end class
