package id.ac.unikom.bloodshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//Tanggal Pengerjaan: 18 April 2019
//NIM: 10116551
//Nama: Divian Ajie Permana
//Kelas: AKB-12
public class AlmostThere extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);

        Button btn = (Button)findViewById(R.id.btnVerify);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Verify.class);
                startActivity(i);
            }
        });
    }
}
