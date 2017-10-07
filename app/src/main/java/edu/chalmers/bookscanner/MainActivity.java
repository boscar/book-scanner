package edu.chalmers.bookscanner;

import android.graphics.PixelFormat;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttonplayvideo2 = (Button)findViewById(R.id.Button1);

        getWindow().setFormat(PixelFormat.UNKNOWN);

        // Displays a video file

        VideoView mVideoView2 = (VideoView) findViewById(R.id.VideoView1);

        String uriPath2 = "android.resource://edu.chalmers.bookscanner/"+ R.raw.gotseason2;
        Uri uri2 = Uri.parse(uriPath2);
        mVideoView2.setVideoURI(uri2);
        mVideoView2.requestFocus();
        mVideoView2.start();

        buttonplayvideo2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoView mVideoView2 = (VideoView) findViewById(R.id.VideoView1);
                // VideoView mVideoView = new VideoView(this);
                String uriPath = "android.resource://edu.chalmers.bookscanner/" + R.raw.gotseason2;
                Uri uri2 = Uri.parse(uriPath);
                mVideoView2.setVideoURI(uri2);
                mVideoView2.requestFocus();
                mVideoView2.start();
            }
        });
    }
}
