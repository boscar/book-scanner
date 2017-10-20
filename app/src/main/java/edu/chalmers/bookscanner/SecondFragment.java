package edu.chalmers.bookscanner;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PixelFormat;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.VideoView;
import android.widget.MediaController;


public class SecondFragment extends Fragment {
    private static final String TAG="Tab2Fragment";

    ImageButton playButton;


    private ImageButton castButton;
    private ImageButton castButton1;
    private ImageButton castButton2;
    private ImageButton castButton3;
    private ImageButton castButton4;

    private PopupWindow popupWindow;
    private LayoutInflater layoutInflater;
    private LinearLayout bookLayout;
    private ImageView testview;

    //getWindow().setFormat(PixelFormat.UNKNOWN);

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.second_fragment, container, false);


        castButton = (ImageButton) view.findViewById(R.id.CastButton);
        castButton1 = (ImageButton) view.findViewById(R.id.CastButton1);
        castButton2 = (ImageButton) view.findViewById(R.id.CastButton2);
        castButton3 = (ImageButton) view.findViewById(R.id.CastButton3);
        castButton4 = (ImageButton) view.findViewById(R.id.CastButton4);

        bookLayout = (LinearLayout) view.findViewById(R.id.xml_full_img_linear_below_view);
        testview = (ImageView) view.findViewById(R.id.testcerseiimage);

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

        castButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                layoutInflater = (LayoutInflater) getContext().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View view = (View)  layoutInflater.inflate(R.layout.test,null);

                ImageView image = (ImageView)view.findViewById(R.id.testcerseiimage);
                image.setImageResource(R.drawable.cersei);

                popupWindow = new PopupWindow(view,400,400,true);
                popupWindow.showAtLocation(bookLayout, Gravity.CENTER,0,0);

                view.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean  onTouch(View view, MotionEvent motionEvent) {
                        popupWindow.dismiss();
                        return true;
                    }
                });
            }
        });

        castButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                layoutInflater = (LayoutInflater) getContext().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View view = (View)  layoutInflater.inflate(R.layout.test,null);

                ImageView image = (ImageView)view.findViewById(R.id.testcerseiimage);
                image.setImageResource(R.drawable.daeny);

                popupWindow = new PopupWindow(view,400,400,true);
                popupWindow.showAtLocation(bookLayout, Gravity.CENTER,0,0);

                view.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean  onTouch(View view, MotionEvent motionEvent) {
                        popupWindow.dismiss();
                        return true;
                    }
                });
            }
        });

        castButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                layoutInflater = (LayoutInflater) getContext().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View view = (View)  layoutInflater.inflate(R.layout.test,null);

                ImageView image = (ImageView)view.findViewById(R.id.testcerseiimage);
                image.setImageResource(R.drawable.jon);

                popupWindow = new PopupWindow(view,400,400,true);
                popupWindow.showAtLocation(bookLayout, Gravity.CENTER,0,0);

                view.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean  onTouch(View view, MotionEvent motionEvent) {
                        popupWindow.dismiss();
                        return true;
                    }
                });
            }
        });

        castButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                layoutInflater = (LayoutInflater) getContext().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View view = (View)  layoutInflater.inflate(R.layout.test,null);

                ImageView image = (ImageView)view.findViewById(R.id.testcerseiimage);
                image.setImageResource(R.drawable.sansa);

                popupWindow = new PopupWindow(view,400,400,true);
                popupWindow.showAtLocation(bookLayout, Gravity.CENTER,0,0);

                view.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean  onTouch(View view, MotionEvent motionEvent) {
                        popupWindow.dismiss();
                        return true;
                    }
                });
            }
        });

        castButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                layoutInflater = (LayoutInflater) getContext().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View view = (View)  layoutInflater.inflate(R.layout.test,null);

                ImageView image = (ImageView)view.findViewById(R.id.testcerseiimage);
                image.setImageResource(R.drawable.tyrion);

                popupWindow = new PopupWindow(view,400,400,true);
                popupWindow.showAtLocation(bookLayout, Gravity.CENTER,0,0);

                view.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean  onTouch(View view, MotionEvent motionEvent) {
                        popupWindow.dismiss();
                        return true;
                    }
                });
            }
        });
        final Context context= this.getContext();
        final TextView seeMore = (TextView) view.findViewById(R.id.seeMore);

        seeMore.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(context, castView.class);
                startActivity(intent);
            }
        });

        return view;
    }
}