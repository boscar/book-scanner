package edu.chalmers.bookscanner;

import android.app.Activity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * Created by anupamadhareshwar on 20/10/17.
 */

public class fanArtView extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_fanart);
        setCustomTitleTypeface();
        hideStatusBar();
    }

    private void setCustomTitleTypeface(){
        TextView title = findViewById(R.id.title);
        SpannableString s = new SpannableString(title.getText());
        s.setSpan(new TypefaceSpan(this, "Montserrat-Medium.ttf"), 0, s.length(),
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        title.setText(s);
    }

    private void hideStatusBar(){
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
    }

}
