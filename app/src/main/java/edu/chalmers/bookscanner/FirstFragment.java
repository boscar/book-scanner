package edu.chalmers.bookscanner;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

public class FirstFragment extends Fragment {

private static final String TAG="Tab1Fragment";

    private ImageButton fanArtButton;
    private ImageButton fanArtButton1;
    private ImageButton fanArtButton2;
    private ImageButton fanArtButton3;
    private ImageButton fanArtButton4;

    private PopupWindow popupWindow;
    private LayoutInflater layoutInflater;
    private FrameLayout bookLayout;
    private ImageView testview;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment, container, false);

        fanArtButton = (ImageButton) view.findViewById(R.id.FanartButton);
        fanArtButton1 = (ImageButton) view.findViewById(R.id.FanartButton1);
        fanArtButton2 = (ImageButton) view.findViewById(R.id.FanartButton2);
        fanArtButton3 = (ImageButton) view.findViewById(R.id.FanartButton3);
        fanArtButton4 = (ImageButton) view.findViewById(R.id.FanartButton4);

        bookLayout = (FrameLayout) view.findViewById(R.id.bookframe);
        testview = (ImageView) view.findViewById(R.id.testcerseiimage);

        fanArtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                layoutInflater = (LayoutInflater) getContext().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View view = (View)  layoutInflater.inflate(R.layout.test,null);

                ImageView image = (ImageView)view.findViewById(R.id.testcerseiimage);
                image.setImageResource(R.drawable.concept0small);

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

        fanArtButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                layoutInflater = (LayoutInflater) getContext().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View view = (View)  layoutInflater.inflate(R.layout.test,null);

                ImageView image = (ImageView)view.findViewById(R.id.testcerseiimage);
                image.setImageResource(R.drawable.concept1small);

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

        fanArtButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                layoutInflater = (LayoutInflater) getContext().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View view = (View)  layoutInflater.inflate(R.layout.test,null);

                ImageView image = (ImageView)view.findViewById(R.id.testcerseiimage);
                image.setImageResource(R.drawable.concept2small);

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

        fanArtButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                layoutInflater = (LayoutInflater) getContext().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View view = (View)  layoutInflater.inflate(R.layout.test,null);

                ImageView image = (ImageView)view.findViewById(R.id.testcerseiimage);
                image.setImageResource(R.drawable.concept3small);

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

        fanArtButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                layoutInflater = (LayoutInflater) getContext().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View view = (View)  layoutInflater.inflate(R.layout.test,null);

                ImageView image = (ImageView)view.findViewById(R.id.testcerseiimage);
                image.setImageResource(R.drawable.concept4small);

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
                Intent intent = new Intent(context, fanArtView.class);
                startActivity(intent);
            }
        });

        return view;
    }
}

