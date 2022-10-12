package com.si5a.implicitsi5a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etUrl, etLokasi, etTeks;
    Button btnbukaWebsite, btnbukaLokasi, btnbagikanTeks;
    String Url, Lokasi, Nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUrl = findViewById(R.id.et_Url);
        etLokasi = findViewById(R.id.etLokasi);
        etTeks = findViewById(R.id.etTeks);
        btnbukaWebsite = findViewById(R.id.btn_buka_website);
        btnbukaLokasi = findViewById(R.id.btn_buka_lokasi);
        btnbagikanTeks = findViewById(R.id.btn_bagikan_teks);

        btnbukaWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlWebsite = etUrl.getText().toString();
                Uri uriurlWebsite = Uri.parse(urlWebsite);
                Intent intentWebsite = new Intent(Intent.ACTION_VIEW, uriurlWebsite);
                try {
                    startActivity(intentWebsite);
                }catch (Exception e){
                    etUrl.setError("Url Tidak Sesuai");
                }
            }
        });
    }
}