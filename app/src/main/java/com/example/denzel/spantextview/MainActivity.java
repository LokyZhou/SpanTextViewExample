package com.example.denzel.spantextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String TEST = "很多精神病患者都是在小的时候受到过各式各样的心理创伤。有些创伤的成因在成人看来似乎不算啥，根本不是个事儿。但是在孩子的眼中，周边的环境、成人的行为所带来的影响都被放大了，有些甚至是扭曲的。很多时候，也正是如此，有些人藉此得到了常人得不到的能力——即便那不是他们希望的。";
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
    }

    private void initview() {
        textView = (TextView) findViewById(R.id.textView2);
        SpannableString span = new SpannableString(TEST);
        span.setSpan(new TextAppearanceSpan(getApplicationContext(), R.style.TextStyle1), 0, TEST.length() / 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        span.setSpan(new TextAppearanceSpan(getApplicationContext(), R.style.TextStyle2), TEST.length() / 2, TEST.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(span);
    }
}
