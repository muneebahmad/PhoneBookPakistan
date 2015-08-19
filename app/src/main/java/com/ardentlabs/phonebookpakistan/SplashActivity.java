package com.ardentlabs.phonebookpakistan;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by muneebahmad on 20/02/15.
 */
public class SplashActivity extends Activity {

    private ImageView splashLogo;
    private Animation splashAnim;

    /**
     *
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_layout);
        this.splashLogo = (ImageView) findViewById(R.id.splash_logo);
        makeAnimation();
    }

    private void makeAnimation() {
        this.splashAnim = AnimationUtils.loadAnimation(this, R.anim.anim_splash);
        this.splashLogo.setAnimation(this.splashAnim);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}/** end class. */
