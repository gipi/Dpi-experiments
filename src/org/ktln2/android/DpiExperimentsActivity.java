package org.ktln2.android;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

// http://developer.android.com/guide/practices/screens_support.html

public class DpiExperimentsActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


	DisplayMetrics displayMetrics = getResources().getDisplayMetrics();

	TextView text = (TextView)findViewById(R.id.text_display);
	text.setText(String.format("%dx%d dpi: %d %f", displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.densityDpi, displayMetrics.density));
    }
}
