package edu.chalmers.bookscanner;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FirstFragment extends Fragment {

private static final String TAG="Tab1Fragment";

    private ImageButton cercieButton1;
    private PopupWindow popupWindow;
    private LayoutInflater layoutInflater;
    private RelativeLayout relativeLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment, container, false);


        cercieButton1 = (ImageButton) view.findViewById(R.id.Cercie);
        relativeLayout = (RelativeLayout) view.findViewById(R.id.test);

        cercieButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                layoutInflater.getContext().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                ViewGroup container = (ViewGroup)  layoutInflater.inflate(R.layout.second_fragment,null);

                popupWindow = new PopupWindow(container,400,400,true);
                popupWindow.showAtLocation(relativeLayout, Gravity.NO_GRAVITY,500,500);

                container.setOnTouchListener(new View.OnTouchListener() {
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
