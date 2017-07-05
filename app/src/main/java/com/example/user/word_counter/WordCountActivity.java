package com.example.user.word_counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WordCountActivity extends AppCompatActivity {

    EditText sentenceEditText;
    Button wordCountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);
        Log.d(getClass().toString(), "onCreate called");

        sentenceEditText = (EditText) findViewById(R.id.sentence_text);
        wordCountButton = (Button) findViewById(R.id.wordCount_button);
    }

    public void onTypeButtonClicked(View button) {
        String sentence = sentenceEditText.getText().toString();
        Log.d(getClass().toString(), "onTypeButtonCLicked was called");
        Log.d(getClass().toString(), "The sentence typed was '" + sentence + "'");
        wordCount = new WordCount();
        int count = wordCount.getWordCount();

        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("answer", answer);

        startActivity(intent);
    }
}
