package id.ac.unikom.bloodshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

//Tanggal Pengerjaan: 18 April 2019
//NIM: 10116551
//Nama: Divian Ajie Permana
//Kelas: AKB-12
public class Register extends AppCompatActivity {
    Spinner spinner, spinner1;
    ArrayAdapter<CharSequence> adapter, adapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button btn = (Button)findViewById(R.id.btnRegis);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),AlmostThere.class);
                startActivity(i);
            }
        });

    }
}




