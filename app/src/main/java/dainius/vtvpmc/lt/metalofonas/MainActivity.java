package dainius.vtvpmc.lt.metalofonas;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private final int NR_OF_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = -1.0f;
    private final int PRIORITY = 0;
    private final int NO_LOOP = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    SoundPool mSoundPool;
    int mCSoundID;
    int mDSoundID;
    int mESoundID;
    int mFSoundID;
    int mGSoundID;
    int mASoundID;
    int mBSoundID;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            mSoundPool = new SoundPool.Builder().setMaxStreams(NR_OF_SOUNDS).build();
        }else {
            mSoundPool = new SoundPool(NR_OF_SOUNDS, AudioManager.STREAM_MUSIC, 0);
            mCSoundID = mSoundPool.load(getApplicationContext(), R.raw.note1_c,1);
            mDSoundID = mSoundPool.load(getApplicationContext(), R.raw.note2_d,1);
            mESoundID = mSoundPool.load(getApplicationContext(), R.raw.note3_e,1);
            mFSoundID = mSoundPool.load(getApplicationContext(), R.raw.note4_f,1);
            mGSoundID = mSoundPool.load(getApplicationContext(), R.raw.note5_g,1);
            mASoundID = mSoundPool.load(getApplicationContext(), R.raw.note6_a,1);
            mBSoundID = mSoundPool.load(getApplicationContext(), R.raw.note7_b,1);
        }


    }

    public void playC(View view) {
        mSoundPool.play(mCSoundID, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playF(View view) {
        mSoundPool.play(mFSoundID, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playG(View view) {
        mSoundPool.play(mGSoundID, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playA(View view) {
        mSoundPool.play(mASoundID, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playE(View view) {
        mSoundPool.play(mESoundID, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playD(View view) {
        mSoundPool.play(mDSoundID, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playB(View view) {
        mSoundPool.play(mBSoundID, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
}
