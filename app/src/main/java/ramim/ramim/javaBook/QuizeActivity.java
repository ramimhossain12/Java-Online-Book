package ramim.ramim.javaBook;




import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class QuizeActivity extends AppCompatActivity {


    int totalScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quize);


    }

    /**
     * This method is called when the submit quiz button is clicked.
     */
    public void submitQuiz(View view) {
        //reset totalScore to zero (in case there was previous submission)
        totalScore = 0;

        //Calculate score
        question_1();
        question_2();
        question_3();
        question_4();
        question_5();
        question_6();
        question_7();
        question_8();
        question_9();
        question_10();
        question_11();



        // Get user's name
        EditText nameField = (EditText) findViewById(R.id.txt_name);
        Editable nameEditable = nameField.getText();
        String name = nameEditable.toString().trim(); //trim is used to ensure there are no trailing spaces

        String message;
        //ensure user entered name
        if (name.length() == 0) {
            message = getString(R.string.empty_name_field_msg);
        } else {
            message = getString(R.string.user_score_msg, name, totalScore);
        }

        // Display message in a Toast
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }


    /**
     * This method is called when the Reset button is clicked.
     */
    public void resetQuiz(View view) {
        //reset totalScore to 0
        totalScore = 0;

        //remove selection on all radio buttons
        RadioGroup grp_1 = findViewById(R.id.rad_grp_1);
        RadioGroup grp_3 = findViewById(R.id.rad_grp_3);
        RadioGroup grp_4 = findViewById(R.id.rad_grp_4);
        RadioGroup grp_5 = findViewById(R.id.rad_grp_5);
        RadioGroup grp_7 = findViewById(R.id.rad_grp_7);
        RadioGroup grp_8 = findViewById(R.id.rad_grp_8);
        RadioGroup grp_10 = findViewById(R.id.rad_grp_10);
        RadioGroup grp_11 = findViewById(R.id.rad_grp_11);
        grp_1.clearCheck();
        grp_3.clearCheck();
        grp_4.clearCheck();
        grp_5.clearCheck();
        grp_7.clearCheck();
        grp_8.clearCheck();
        grp_10.clearCheck();
        grp_11.clearCheck();

        //clear all checkboxes
        CheckBox chk_6a = (CheckBox) findViewById(R.id.chk_6a);
        CheckBox chk_6b = (CheckBox) findViewById(R.id.chk_6b);
        CheckBox chk_6c = (CheckBox) findViewById(R.id.chk_6c);
        CheckBox chk_6d = (CheckBox) findViewById(R.id.chk_6d);
        CheckBox chk_6e = (CheckBox) findViewById(R.id.chk_6e);
        chk_6a.setChecked(false);
        chk_6b.setChecked(false);
        chk_6c.setChecked(false);
        chk_6d.setChecked(false);
        chk_6e.setChecked(false);

        //clear all edittext fields
        EditText txt_name = findViewById(R.id.txt_name);
        EditText txt_ans_2 = findViewById(R.id.txt_ans_2);
        EditText txt_ans_9 = findViewById(R.id.txt_ans_9);
        txt_name.setText("");
        txt_ans_2.setText("");
        txt_ans_9.setText("");

    }


    /**
     * Question 1.
     */
    private void question_1() {
        //check if correct option was selected: Option B
        RadioButton radBtn = (RadioButton) findViewById(R.id.rad_1b);
        boolean isCorrectOption = radBtn.isChecked();
        // If correct option, increment totalScore
        if (isCorrectOption) {
            totalScore++;
        }
    }


    /**
     * Question 2.
     */
    private void question_2() {
        // Get entered answer
        EditText txt_ans = (EditText) findViewById(R.id.txt_ans_2);
        Editable edit_ans = txt_ans.getText();
        String ans = edit_ans.toString().trim();
        // If correct answer (algorithm), increment totalScore
        //Note: equalsIgnoreCase is used so any case used will be accepted as correct
        if (ans.equalsIgnoreCase("algorithm")) {
            totalScore++;
        }
    }


    /**
     * Question 3.
     */
    private void question_3() {
        //check if correct option was selected: Option A
        RadioButton radBtn = (RadioButton) findViewById(R.id.rad_3a);
        boolean isCorrectOption = radBtn.isChecked();
        // If correct option, increment totalScore
        if (isCorrectOption) {
            totalScore++;
        }
    }


    /**
     * Question 4.
     */
    private void question_4() {
        //check if correct option was selected: Option C
        RadioButton radBtn = (RadioButton) findViewById(R.id.rad_4c);
        boolean isCorrectOption = radBtn.isChecked();
        // If correct option, increment totalScore
        if (isCorrectOption) {
            totalScore++;

        }
    }


    /**
     * Question 5.
     */
    private void question_5() {
        //check if correct option was selected: Option C
        RadioButton radBtn = (RadioButton) findViewById(R.id.rad_5c);
        boolean isCorrectOption = radBtn.isChecked();
        // If correct option, increment totalScore
        if (isCorrectOption) {
            totalScore++;
        }
    }


    /**
     * Question 6.
     */
    private void question_6() {
        CheckBox chk_6a = (CheckBox) findViewById(R.id.chk_6a);
        CheckBox chk_6b = (CheckBox) findViewById(R.id.chk_6b);
        CheckBox chk_6c = (CheckBox) findViewById(R.id.chk_6c);
        CheckBox chk_6d = (CheckBox) findViewById(R.id.chk_6d);
        CheckBox chk_6e = (CheckBox) findViewById(R.id.chk_6e);

        boolean selected_6a = chk_6a.isChecked();
        boolean selected_6b = chk_6b.isChecked();
        boolean selected_6c = chk_6c.isChecked();
        boolean selected_6d = chk_6d.isChecked();
        boolean selected_6e = chk_6e.isChecked();

        //Correct Options: B, C, E
        //Wrong Options: A, D

        //check if ONLY options B, C, and E were selected and increment total score
        if (selected_6b && selected_6c && selected_6e && !selected_6a && !selected_6d) {
            totalScore++;
        }
    }


    /**
     * Question 7.
     */
    private void question_7() {
        //check if correct option was selected: Option D
        RadioButton radBtn = (RadioButton) findViewById(R.id.rad_7d);
        boolean isCorrectOption = radBtn.isChecked();
        // If correct option, increment totalScore
        if (isCorrectOption) {
            totalScore++;
        }
    }


    /**
     * Question 8.
     */
    private void question_8() {
        //check if correct option was selected: Option B
        RadioButton radBtn = (RadioButton) findViewById(R.id.rad_8b);
        boolean isCorrectOption = radBtn.isChecked();
        // If correct option, increment totalScore
        if (isCorrectOption) {
            totalScore++;
        }
    }


    /**
     * Question 9.
     */
    private void question_9() {
        // Get entered answer
        EditText txt_ans = (EditText) findViewById(R.id.txt_ans_9);
        Editable edit_ans = txt_ans.getText();
        String str_ans = edit_ans.toString().trim();
        //ensure field is not empty to avoid app crashing at runtime
        if (str_ans.length() == 0) {
            return;
        }
        int ans = Integer.parseInt(str_ans);
        // If correct answer (8), increment totalScore
        if (ans == 8) {
            totalScore++;
        }
    }


    /**
     * Question 10.
     */
    private void question_10() {
        //check if correct option was selected: Option D
        RadioButton radBtn = (RadioButton) findViewById(R.id.rad_10d);
        boolean isCorrectOption = radBtn.isChecked();
        // If correct option, increment totalScore
        if (isCorrectOption) {
            totalScore++;
        }
    }

    /**
     * Question 11.
     */
    private void question_11() {
        //check if correct option was selected: Option D
        RadioButton radBtn = (RadioButton) findViewById(R.id.rad_11d);
        boolean isCorrectOption = radBtn.isChecked();
        // If correct option, increment totalScore
        if (isCorrectOption) {
            totalScore++;
        }
    }









}



