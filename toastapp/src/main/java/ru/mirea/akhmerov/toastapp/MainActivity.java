package ru.mirea.akhmerov.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.toast_layout, null);
        Toast toast = new Toast(this);
        toast.setView(view);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();

//        Toast toast = Toast.makeText(MainActivity.this,
//                "Hi MIREA! Akhmerov A A",Toast.LENGTH_LONG);
//        toast.setGravity(Gravity.CENTER,0,0);
//        Log.d(MainActivity.class.getSimpleName().toString(), toast.toString());
//        LinearLayout toastContainer = (LinearLayout) toast.getView();
//        LinearLayout linearLayout = new LinearLayout(this);
//        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//
//        ImageView catImageView = new ImageView(getApplicationContext());
//        catImageView.setImageResource(R.drawable.ic_launcher_background);
////        catImageView.getLayoutParams().height = 96;
////        catImageView.getLayoutParams().width = 96;
//        linearLayout.addView(catImageView);
//
//        TextView textView = new TextView(this);
//        textView.setText("I'm best student");
//
//        linearLayout.addView(textView);
//
//        toast.setView(linearLayout);
//        toast.show();
    }
}