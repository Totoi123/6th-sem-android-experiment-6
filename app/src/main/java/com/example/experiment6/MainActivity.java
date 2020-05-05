package com.example.experiment6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        spinner = (Spinner) findViewById(R.id.spinner);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (spinner.getSelectedItemId()==0){
                    imageView.setImageResource(R.drawable.operating);
                }
                else if (spinner.getSelectedItemId()==1){
                    imageView.setImageResource(R.drawable.android);
                }
                else if (spinner.getSelectedItemId()==2){
                    imageView.setImageResource(R.drawable.download);
                }
                else if (spinner.getSelectedItemId()==3){
                    imageView.setImageResource(R.drawable.windows);
                }
                else if (spinner.getSelectedItemId()==4){
                    imageView.setImageResource(R.drawable.linux);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });
    }
}
