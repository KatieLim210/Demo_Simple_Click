package sg.edu.rp.c346.id21023701.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
Button btn;
TextView txtView;
EditText et;
ToggleButton tb;
RadioGroup rgGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.buttonDisplay);
        et = findViewById(R.id.et1);
        txtView = findViewById(R.id.txtviewDisplay);
        tb = findViewById(R.id.toggleButton);
        rgGender = findViewById(R.id.radioGroup);
     btn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

             String Gender="";
             String txt=et.getText().toString();
             String stringResponse = et.getText().toString();
             int checkedRadioId = rgGender.getCheckedRadioButtonId();
             if(checkedRadioId == R.id.radioButtonGenderMale){
                 // Write the code when male selected
                 Gender = "He says";
             }
             else{
                 // Write the code when female selected

             }
             txtView.setText(stringResponse);


         }

     });
     tb.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             if(tb.isChecked()){
                 et.setEnabled(true);
             }else{
                 et.setEnabled(false);
             }
         }
     });
    }
}