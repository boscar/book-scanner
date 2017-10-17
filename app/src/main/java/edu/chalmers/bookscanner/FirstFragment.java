package edu.chalmers.bookscanner;

import android.content.Context;
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
import android.widget.PopupWindow;

public class FirstFragment extends Fragment {

private static final String TAG="Tab1Fragment";

    private ImageButton cercieButton1;
    private PopupWindow popupWindow;
    private LayoutInflater layoutInflater;
    private FrameLayout bookLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment, container, false);

        cercieButton1 = (ImageButton) view.findViewById(R.id.Cercie1);
        bookLayout = (FrameLayout) view.findViewById(R.id.bookframe);


        cercieButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                layoutInflater = (LayoutInflater) getContext().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View view = (View)  layoutInflater.inflate(R.layout.test,null);

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

        return view;
    }
}
