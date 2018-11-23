package com.neha.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void changeImageToTweety(View view) {

        Log.d("Debug","changeImageToJerry");
        ImageView jerry = (ImageView) findViewById(R.id.jerryImageView);

        jerry.animate().translationXBy(1000f).translationYBy(1000f).rotationBy(3600).setDuration(2000);

        //jerry.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);

        //jerry.animate().rotation(1800f).setDuration(2000);
        //jerry.animate().rotation(180f).setDuration(2000);

        //jerry.animate().translationYBy(2000f).setDuration(2000);
        //jerry.animate().translationXBy(-1000f).setDuration(2000);

        //ImageView tweety = (ImageView) findViewById(R.id.tweetyImageView);
        //tweety.animate().alpha(1f).setDuration(2000);
        //jerry.animate().alpha(0f).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView jerry = (ImageView) findViewById(R.id.jerryImageView);
        jerry.animate().translationX(-1000f);
        jerry.animate().translationY(-1000f);
    }
}
