package com.example.translator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private Spinner fromSpinner,toSpinner;
    private TextInputEditText sourceEdt;
    private ImageView micIV;
    private MaterialButton translateBtn;
    private TextView translatedTv;
    String[] fromLanguages = {"from","English","French"};
    String[] toLanguages = {"to","English","French"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fromSpinner = findViewById(R.id.idFromSpinner);
        toSpinner = findViewById(R.id.idToSpinner);
        sourceEdt = findViewById(R.id.idEdtSource);
        micIV = findViewById(R.id.idIVMic);
        translateBtn = findViewById(R.id.idBtnTranslate);
        translatedTv = findViewById(R.id.idTVTranslatedTV);
    }
}