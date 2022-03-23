package com.example.iraise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman);

    }
    public void profile(View view) {
        Intent profile = new Intent(MainActivity.this, profile.class);
        startActivity(profile);

    }
    public void beranda(View view) {
        Intent beranda = new Intent(MainActivity.this, beranda.class);
        startActivity(beranda);
    }
    public void faq(View view) {
        Intent faq = new Intent(MainActivity.this, FAQ.class);
        startActivity(faq);
    }
    public void pesan(View view) {
        Intent pesan = new Intent(MainActivity.this, pesan.class);
        startActivity(pesan);
    }
    public void wisuda(View view) {
        Intent wisuda = new Intent(MainActivity.this, wisuda.class);
        startActivity(wisuda);
    }
    public void cuti(View view) {
        Intent cuti = new Intent(MainActivity.this, cuti.class);
        startActivity(cuti);
    }
}