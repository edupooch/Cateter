package br.edu.ufcspa.cateter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void iniciaAprendendo(View view) {
        startActivity(new Intent(MainActivity.this, AprendendoActivity.class));
    }

    public void iniciaICS(View view) {
        startActivity(new Intent(MainActivity.this, IcsCvcActivity.class));
    }

    public void iniciaAvaliacao(View view) {
        startActivity(new Intent(MainActivity.this, AvaliandoActivity.class));

    }

    public void iniciaOutrasInfo(View view) {
        startActivity(new Intent(MainActivity.this, OutrasInfoActivity.class));

    }

    public void iniciaEducando(View view) {
        startActivity(new Intent(MainActivity.this, EducandoActivity.class));
    }

    public void iniciaQuiz(View view) {
        startActivity(new Intent(MainActivity.this, QuizActivity.class));

    }
}
