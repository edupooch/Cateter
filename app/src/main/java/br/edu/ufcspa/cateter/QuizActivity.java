package br.edu.ufcspa.cateter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.edu.ufcspa.cateter.quiz.JogoActivity;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    public void iniciaQuiz1(View view) {
        startActivity(new Intent(QuizActivity.this, JogoActivity.class));
    }

    public void iniciaQuiz2(View view) {
    }
}
