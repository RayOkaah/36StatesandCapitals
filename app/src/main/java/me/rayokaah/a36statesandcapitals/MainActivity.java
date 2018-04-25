package me.rayokaah.a36statesandcapitals;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Copyright 2017 Ray Okaah. +2348178547182 | email: rayokaah@gmail.com| www.rayokaah.me |
 * Part of my Andela Learning Community Assessment 2.0 2017.
 * Thank You for reading through my code.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
/** score and firstName are variables with a global scope.
    This enables them to be called from inner methods.
 */
    public float score = 0;
    String firstName ="";

    // Starts the quiz on click of main button.
    public void startQues (View view){
        setQuizDisplay();
        question1();
    }
    //Simple method to calculate the games score
    public void calcScore(){
         score = score + 1 ;
    }

    // This method handles prepares the interface for the quiz questions and options
    public void setQuizDisplay(){
        EditText editText = (EditText) findViewById(R.id.editText);
        String firstName = editText.getText().toString();
        editText.setVisibility(View.GONE);
        ImageView imgView = (ImageView) findViewById(R.id.display_image);
        imgView.setVisibility(View.GONE);
        RadioGroup radioGroup = (RadioGroup)  findViewById(R.id.radio_group);
        radioGroup.setVisibility(View.VISIBLE);
        TextView welcomeText = (TextView) findViewById(R.id.welcome);
        welcomeText.setText("Hello " + firstName);
    }

/**We have question()1 to question()10
 * Handles the display of questions
 * and checks for correct answer.
 * If there is a correct answer, it adds 1 to the total score
 */
    public void question1 (){
        String question = "What state can we find Dutse ?";
        String option1 = "Kogi" ;
        String option2 = "Jigawa" ;
        String option3 = "Taraba" ;
        String option4 = "Yobe" ;
        displayoption1 (option1);
        displayoption2 (option2);
        displayoption3 (option3);
        displayoption4 (option4);
        displayQuestion (question);
        RadioGroup radioGroup = (RadioGroup)  findViewById(R.id.radio_group);
        radioGroup.clearCheck();
        final RadioButton answer = (RadioButton) findViewById(R.id.option2_radio);
        final Button mButton = (Button) findViewById(R.id.main_button);
        mButton.setText("Next");
        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){

                if (answer.isChecked()){
                    calcScore();
                    question2();
                }
                else question2();
            }
        });
    }

    public void question2 (){
        String question = "What state can we find Asaba ?";
        String option1 = "Benin" ;
        String option2 = "Kwara" ;
        String option3 = "Delta" ;
        String option4 = "Rivers" ;
        displayoption1 (option1);
        displayoption2 (option2);
        displayoption3 (option3);
        displayoption4 (option4);
        displayQuestion (question);
        RadioGroup radioGroup = (RadioGroup)  findViewById(R.id.radio_group);
        radioGroup.clearCheck();
        final RadioButton answer = (RadioButton) findViewById(R.id.option3_radio);
        final Button mButton = (Button) findViewById(R.id.main_button);
        mButton.setText("Next");
        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                if (answer.isChecked()){
                    calcScore();
                    question3();
                }
                else question3();
            }
        });
    }

    public void question3 (){
        String question = "What state can we find Ilorin ?";
        String option1 = "Delta" ;
        String option2 = "Kebbi" ;
        String option3 = "Oyo" ;
        String option4 = "Kwara" ;
        displayoption1 (option1);
        displayoption2 (option2);
        displayoption3 (option3);
        displayoption4 (option4);
        displayQuestion (question);
        RadioGroup radioGroup = (RadioGroup)  findViewById(R.id.radio_group);
        radioGroup.clearCheck();
        final RadioButton answer = (RadioButton) findViewById(R.id.option4_radio);
        final Button mButton = (Button) findViewById(R.id.main_button);
        mButton.setText("Next");
        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                if (answer.isChecked()){
                    calcScore();
                    question4();
                }
                else question4();
            }
        });
    }

    public void question4(){
        final CheckBox check1 = (CheckBox) findViewById(R.id.checkbox1);
        final CheckBox check2 = (CheckBox) findViewById(R.id.checkbox2);
        final CheckBox check3 = (CheckBox) findViewById(R.id.checkbox3);
        final RadioGroup radioGroup = (RadioGroup)  findViewById(R.id.radio_group);
        radioGroup.setVisibility(View.GONE);
        check1.setChecked(false);
        check2.setChecked(false);
        check3.setChecked(false);
        check1.setVisibility(View.VISIBLE);
        check2.setVisibility(View.VISIBLE);
        check3.setVisibility(View.VISIBLE);
        String question ="Which of the following places is in Eastern Nigeria";
        displayQuestion(question);
        check1.setText("Abia");
        check2.setText("Ondo");
        check3.setText("Abakaliki");
        final Button mButton = (Button) findViewById(R.id.main_button);
        mButton.setText("Next");
        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (check1.isChecked()) {
                    calcScore();
                }
                if (check3.isChecked()) {
                    calcScore();
                }
                check1.setVisibility(View.GONE);
                check2.setVisibility(View.GONE);
                check3.setVisibility(View.GONE);
                radioGroup.setVisibility(View.VISIBLE);
                question5();
            }
        });
    }

    public void question5 (){
        String question = "What state can we find Yola ?";
        String option1 = "CrossRiver" ;
        String option2 = "Adamawa" ;
        String option3 = "AkwaIbom" ;
        String option4 = "Bauchi" ;
        displayoption1 (option1);
        displayoption2 (option2);
        displayoption3 (option3);
        displayoption4 (option4);
        displayQuestion (question);
        RadioGroup radioGroup = (RadioGroup)  findViewById(R.id.radio_group);
        radioGroup.clearCheck();
        final RadioButton answer = (RadioButton) findViewById(R.id.option2_radio);
        final Button mButton = (Button) findViewById(R.id.main_button);
        mButton.setText("Next");
        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                if (answer.isChecked()){
                    calcScore();
                    question6();
                }
                else question6();
            }
        });
    }

    public void question6 (){
        String question = "What is the capital of Rivers state ?";
        String option1 = "Yenegoa" ;
        String option2 = "Port Harcourt" ;
        String option3 = "Ondo" ;
        String option4 = "Owerri" ;
        displayoption1 (option1);
        displayoption2 (option2);
        displayoption3 (option3);
        displayoption4 (option4);
        displayQuestion (question);
        RadioGroup radioGroup = (RadioGroup)  findViewById(R.id.radio_group);
        radioGroup.clearCheck();
        final RadioButton answer = (RadioButton) findViewById(R.id.option2_radio);
        final Button mButton = (Button) findViewById(R.id.main_button);
        mButton.setText("Next");
        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                if (answer.isChecked()){
                    calcScore();
                    question7();
                }
                else question7();
            }
        });
    }

    public void question7(){
        final CheckBox check1 = (CheckBox) findViewById(R.id.checkbox1);
        final CheckBox check2 = (CheckBox) findViewById(R.id.checkbox2);
        final CheckBox check3 = (CheckBox) findViewById(R.id.checkbox3);
        final RadioGroup radioGroup = (RadioGroup)  findViewById(R.id.radio_group);
        radioGroup.setVisibility(View.GONE);
        check1.setVisibility(View.VISIBLE);
        check2.setVisibility(View.VISIBLE);
        check3.setVisibility(View.VISIBLE);
        check1.setChecked(false);
        check2.setChecked(false);
        check3.setChecked(false);
        String question ="Which of the following are places in Northern Nigeria";
        displayQuestion(question);
        check1.setText("Kwara");
        check2.setText("Niger");
        check3.setText("Plateau");
        final Button mButton = (Button) findViewById(R.id.main_button);
        mButton.setText("Next");
        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (check2.isChecked()) {
                    calcScore();
                }
                if (check3.isChecked()) {
                    calcScore();
                }
                check1.setVisibility(View.GONE);
                check2.setVisibility(View.GONE);
                check3.setVisibility(View.GONE);
                radioGroup.setVisibility(View.VISIBLE);
                question8();
            }
        });
    }

    public void question8 (){
        String question = "Where can we find Lokoja?";
        String option1 = "Kwara" ;
        String option2 = "Lagos State" ;
        String option3 = "Kogi" ;
        String option4 = "Osun" ;
        displayoption1 (option1);
        displayoption2 (option2);
        displayoption3 (option3);
        displayoption4 (option4);
        displayQuestion (question);
        RadioGroup radioGroup = (RadioGroup)  findViewById(R.id.radio_group);
        radioGroup.clearCheck();
        final RadioButton answer = (RadioButton) findViewById(R.id.option3_radio);
        final Button mButton = (Button) findViewById(R.id.main_button);
        mButton.setText("Next");
        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                if (answer.isChecked()){
                    calcScore();
                    question9();
                }
                else question9();
            }
        });
    }

    public void question9 (){
        String question = "Markurdi is the Capital of ?";
        String option1 = "Benue" ;
        String option2 = "Borno" ;
        String option3 = "Kaduna" ;
        String option4 = "Bauchi" ;
        displayoption1 (option1);
        displayoption2 (option2);
        displayoption3 (option3);
        displayoption4 (option4);
        displayQuestion (question);
        RadioGroup radioGroup = (RadioGroup)  findViewById(R.id.radio_group);
        radioGroup.clearCheck();
        final RadioButton answer = (RadioButton) findViewById(R.id.option1_radio);
        final Button mButton = (Button) findViewById(R.id.main_button);
        mButton.setText("Next");
        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                if (answer.isChecked()){
                    calcScore();
                    question10();
                }
                else question10();
            }
        });
    }

    public void question10 (){
        String question = "What is the capital of Edo ?";
        String option1 = "Port Harcourt" ;
        String option2 = "Benin" ;
        String option3 = "Delta" ;
        String option4 = "Rivers" ;
        displayoption1 (option1);
        displayoption2 (option2);
        displayoption3 (option3);
        displayoption4 (option4);
        displayQuestion (question);
        RadioGroup radioGroup = (RadioGroup)  findViewById(R.id.radio_group);
        radioGroup.clearCheck();
        final RadioButton answer = (RadioButton) findViewById(R.id.option2_radio);
        final Button mButton = (Button) findViewById(R.id.main_button);
        mButton.setText("Check Result");
        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                if (answer.isChecked()){
                    calcScore();
                    result();
                }
                else result();
            }
        });
    }

    // Displays the result in percentage and offers a restart quiz button.
    public void result(){
        ImageView imgView = (ImageView) findViewById(R.id.display_image);
        imgView.setVisibility(View.VISIBLE);
        RadioGroup radioGroup = (RadioGroup)  findViewById(R.id.radio_group);
        radioGroup.setVisibility(View.INVISIBLE);
        Toast.makeText(this, "Hi " +firstName+ " You scored : " + (score * (100/12)) + "%", Toast.LENGTH_LONG).show();
        displayQuestion("Thank you for playing 36 States and Capitals. This is your score : " + (score * (100/12)) + "%" );
        final Button mButton = (Button) findViewById(R.id.main_button);
        mButton.setText("Restart Quiz");
        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                score = 0;
                ImageView imgView = (ImageView) findViewById(R.id.display_image);
                imgView.setVisibility(View.GONE);
                RadioGroup radioGroup = (RadioGroup)  findViewById(R.id.radio_group);
                radioGroup.setVisibility(View.VISIBLE);
                question1();
            }
        });
    }

// Handles The display of the quiz question
    public void displayQuestion (String question){
        TextView display = (TextView) findViewById(R.id.question);
                display.setText(question);
    }
//  Handles the display of answer options to the quiz questions
    public void displayoption1 (String option){
        RadioButton display = (RadioButton) findViewById(R.id.option1_radio);
        display.setText(option);
    }

    public void displayoption2 (String option){
        RadioButton display = (RadioButton) findViewById(R.id.option2_radio);
        display.setText(option);
    }

    public void displayoption3 (String option){
        RadioButton display = (RadioButton) findViewById(R.id.option3_radio);
        display.setText(option);
    }

    public void displayoption4 (String option){
        RadioButton display = (RadioButton) findViewById(R.id.option4_radio);
        display.setText(option);
    }
}