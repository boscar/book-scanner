package edu.chalmers.bookscanner;

import android.graphics.Color;
import android.graphics.PixelFormat;
import android.media.Image;
import android.media.ImageWriter;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.VideoView;
import android.widget.MediaController;



public class MainActivity extends AppCompatActivity {
    ImageButton playButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // playButton.setOnClickListener(new

        getWindow().setFormat(PixelFormat.UNKNOWN);

        // Displays a video file

        final VideoView mVideoView2 = (VideoView) findViewById(R.id.VideoView1);

        String uriPath2 = "android.resource://edu.chalmers.bookscanner/"+ R.raw.gotseason2;
        Uri uri2 = Uri.parse(uriPath2);
        mVideoView2.setVideoURI(uri2);
        mVideoView2.requestFocus();
        final MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(mVideoView2);
        mVideoView2.setMediaController(mediaController);

        mVideoView2.pause();

        playButton = (ImageButton) findViewById(R.id.play_button);
        playButton.setColorFilter(Color.argb(255,255,255,255));     // Sets the color of the playbutton to what you specify
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mVideoView2.isPlaying()) {
                    mVideoView2.pause();

                } else {
                    mVideoView2.start();
                    mediaController.show();
                    playButton.setVisibility(View.GONE);
                }
            }
        });


    }
}
