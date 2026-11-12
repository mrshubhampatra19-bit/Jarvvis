package com.jarvis.app;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.Gravity;
import android.widget.TextView;
import java.util.Locale;

public class MainActivity extends Activity {
    TextToSpeech tts;

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        TextView t = new TextView(this);
        t.setText("J.A.R.V.I.S\n\nNATIVE CORE ONLINE\n\nTap to test voice");
        t.setTextColor(Color.parseColor("#00E5FF"));
        t.setBackgroundColor(Color.parseColor("#020B14"));
        t.setGravity(Gravity.CENTER);
        t.setTextSize(22);
        setContentView(t);

        tts = new TextToSpeech(this, status -> tts.setLanguage(new Locale("en", "IN")));
        t.setOnClickListener(v ->
            tts.speak("Hello. I am JARVIS. Native core online.",
                      TextToSpeech.QUEUE_FLUSH, null, "x"));
    }
}
