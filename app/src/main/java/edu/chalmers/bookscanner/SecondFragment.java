package edu.chalmers.bookscanner;


import android.graphics.Color;
import android.graphics.PixelFormat;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.VideoView;
import android.widget.MediaController;


public class SecondFragment extends Fragment {
    private static final String TAG="Tab2Fragment";

    ImageButton playButton;


    //getWindow().setFormat(PixelFormat.UNKNOWN);

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.second_fragment, container, false);

        final VideoView mVideoView2 = (VideoView) view.findViewById(R.id.VideoView1);

        String uriPath2 = "android.resource://edu.chalmers.bookscanner/"+ R.raw.gotseason2;
        Uri uri2 = Uri.parse(uriPath2);
        mVideoView2.setVideoURI(uri2);
        mVideoView2.requestFocus();

        final android.widget.MediaController mediaController = new MediaController(getContext());
        mediaController.setAnchorView(mVideoView2);
        mVideoView2.setMediaController(mediaController);

        mVideoView2.pause();

        playButton = (ImageButton) view.findViewById(R.id.play_button);
        playButton.setColorFilter(Color.argb(255,255,255,255));
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

        return view;
    }
}