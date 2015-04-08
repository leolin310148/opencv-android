package me.leolin.android.opencv;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import org.opencv.core.Mat;


public class MainActivity extends ActionBarActivity {


    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    static {
        System.loadLibrary("opencv_java");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Mat mat = new Mat();
        Log.d(LOG_TAG, mat.toString());
    }


}
