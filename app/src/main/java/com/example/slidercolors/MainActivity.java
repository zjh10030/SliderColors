package com.example.slidercolors;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.slidercolors.R;

import org.w3c.dom.Text;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private int red = 0;
    private int blue = 0;
    private int green = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SeekBar bar1 = findViewById(R.id.seekbar1);
        SeekBar bar2 = findViewById(R.id.seekbar2);
        SeekBar bar3 = findViewById(R.id.seekbar3);


        bar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                int value = seekBar.getProgress();
                red = value;

                //sets color
                TextView view = findViewById(R.id.output);
                view.setBackgroundColor(Color.rgb(red,green,blue));


                //set number
                String hexNumber =  Integer.toHexString(red) + Integer.toHexString(green) + Integer.toHexString(blue);
                view.setText(String.format(Locale.US, "%s", hexNumber));

            }
        });
        bar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                int value = seekBar.getProgress();
                green = value;

                //sets color
                TextView view = findViewById(R.id.output);
                view.setBackgroundColor(Color.rgb(red,green,blue));


                //set number
                String hexNumber =  Integer.toHexString(red) + Integer.toHexString(green) + Integer.toHexString(blue);
                view.setText(String.format(Locale.US, "%s", hexNumber));
            }
        });

        bar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                int value = seekBar.getProgress();
                blue = value;
                //sets color
                TextView view = findViewById(R.id.output);
                view.setBackgroundColor(Color.rgb(red,green,blue));


                //set number
                String hexNumber =  Integer.toHexString(red) + Integer.toHexString(green) + Integer.toHexString(blue);
                view.setText(String.format(Locale.US, "%s", hexNumber));

            }
        });

    }

}
