package edu.chalmers.bookscanner;

import android.text.Spannable;
import android.text.SpannableString;
import android.widget.TextView;

/**
 * Created by Oscar on 10/20/2017.
 */

public class TypefaceUtils {

    public static void setTypeface(TextView view, TypefaceSpan typeface){
        SpannableString s = new SpannableString(view.getText());
        s.setSpan(typeface, 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        view.setText(s);
    }
}
