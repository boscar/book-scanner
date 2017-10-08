package edu.chalmers.bookscanner;

import android.graphics.PixelFormat;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;
import android.widget.MediaController;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        getWindow().setFormat(PixelFormat.UNKNOWN);

        // Displays a video file

        VideoView mVideoView2 = (VideoView) findViewById(R.id.VideoView1);

        String uriPath2 = "android.resource://edu.chalmers.bookscanner/"+ R.raw.gotseason2;
        Uri uri2 = Uri.parse(uriPath2);
        mVideoView2.setVideoURI(uri2);
        mVideoView2.requestFocus();
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(mVideoView2);
        mVideoView2.setMediaController(mediaController);

        mVideoView2.start();
    }
}
