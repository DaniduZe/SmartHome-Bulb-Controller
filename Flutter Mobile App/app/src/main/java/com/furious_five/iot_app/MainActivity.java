package com.furious_five.iot_app;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    Button onBtn,offBtn;
    TextView humidity,tempr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onBtn = findViewById(R.id.btnOn);
        offBtn = findViewById(R.id.btnOff);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference temp = database.getReference("Temp");
        DatabaseReference hum = database.getReference("Humidity");


        temp.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                tempr = findViewById(R.id.Temp);

                Double value = snapshot.getValue(Double.class);
                tempr.setText(value+"°C");

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Log.w(TAG, "Failed to read value.", error.toException());

            }
        });

        hum.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                humidity = findViewById(R.id.humidity);

                Double value = snapshot.getValue(Double.class);
                humidity.setText(value+"%");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Log.w(TAG, "Failed to read value.", error.toException());

            }
        });

        onBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseReference Bulb = database.getReference("Bulb");

                Bulb.setValue(1);
            }
        });

        offBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseReference Bulb = database.getReference("Bulb");

                Bulb.setValue(0);
            }
        });

    }
}