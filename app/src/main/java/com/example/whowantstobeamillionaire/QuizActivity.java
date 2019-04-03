package com.example.whowantstobeamillionaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    TextView scoreView;
    TextView moneyView;
    TextView questionView;
    RadioButton choiceOne;
    RadioButton choiceTwo;
    RadioButton choiceThree;
    RadioButton choiceFour;
    Button confirmButton;
    QuestionLibrary questionLibrary = new QuestionLibrary();
    int score = 0;
    int currentQuestion = 0;
    int chances = 1;
    String correctAnswer = questionLibrary.getCorrectAnswer(currentQuestion);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        scoreView = findViewById(R.id.score_view);
        moneyView = findViewById(R.id.money_view);
        questionView = findViewById(R.id.question_view);
        questionView.setText(questionLibrary.questions[0]);

        choiceOne = findViewById(R.id.radio_one);
        choiceOne.setText(questionLibrary.getChoiceFour(0));

        choiceTwo = findViewById(R.id.radio_two);
        choiceTwo.setText(questionLibrary.getChoiceTwo(0));

        choiceThree = findViewById(R.id.radio_three);
        choiceThree.setText(questionLibrary.getChoiceThree(0));

        choiceFour = findViewById(R.id.radio_four);
        choiceFour.setText(questionLibrary.getChoiceFour(0));

        confirmButton = findViewById(R.id.confirmButton);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (choiceOne.isChecked()) {
                    validateChoice(choiceOne);
                } else if (choiceTwo.isChecked()) {
                    validateChoice(choiceTwo);
                } else if (choiceThree.isChecked()) {
                    validateChoice(choiceThree);
                } else {
                    validateChoice(choiceFour);
                }
            }
        });

    }

    private void validateChoice(RadioButton choice) {
        if (choice.getText().equals(correctAnswer)) {
            score = questionLibrary.getMoney(currentQuestion);
            Toast.makeText(QuizActivity.this, "This is the CORRECT answer. You've earned " + score, Toast.LENGTH_LONG).show();
            updateQuestion();
        } else {
            Toast.makeText(QuizActivity.this, "This is the INCORRECT answer. The CORRECT answer is " + correctAnswer + ". You have " + chances + " more chance left", Toast.LENGTH_LONG).show();
            currentQuestion = -1;
            if (chances == 0) {
                startActivity(new Intent(QuizActivity.this, Lose.class));
            }
            chances--;
            score = 0;
            updateQuestion();
        }
    }


    private void updateQuestion() {
        currentQuestion++;
        if (currentQuestion > questionLibrary.questions.length - 1) {
            startActivity(new Intent(QuizActivity.this, Won.class));
        }
        try {
            moneyView.setText(score + "");
            questionView.setText(questionLibrary.getQuestion(currentQuestion));
            choiceOne.setText(questionLibrary.getChoiceOne(currentQuestion));
            choiceTwo.setText(questionLibrary.getChoiceTwo(currentQuestion));
            choiceThree.setText(questionLibrary.getChoiceThree(currentQuestion));
            choiceFour.setText(questionLibrary.getChoiceFour(currentQuestion));
            correctAnswer = questionLibrary.getCorrectAnswer(currentQuestion);
        } catch (ArrayIndexOutOfBoundsException e) {

        }
    }

}