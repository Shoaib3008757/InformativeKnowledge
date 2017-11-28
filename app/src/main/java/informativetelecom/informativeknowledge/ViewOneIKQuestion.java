package informativetelecom.informativeknowledge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewOneIKQuestion extends AppCompatActivity {
    String value;
    TextView QuestionText , AnswerText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_one_ikquestion);
        value = getIntent().getExtras().getString("id");

        initiate();
        setQuestionAnswer();

    }
    public void initiate()
    {
        QuestionText = (TextView) findViewById(R.id.question);
        AnswerText = (TextView) findViewById(R.id.answer);
    }
    public void setQuestionAnswer()
    {
        if(value.equals("1"))
        {
            QuestionText.setText("What is the meaning of Pakistan?");
            AnswerText.setText("Holy Land");
        }
        if(value.equals("2"))
        {
            QuestionText.setText("In which year did Pakistan win the Cricket World Cup?");
            AnswerText.setText("1992");
        }

        if(value.equals("3"))
        {
            QuestionText.setText("When did Pakistan win Olympic gold medal in Hockey for the first time?");
            AnswerText.setText("1960");
        }

        if(value.equals("4"))
        {
            QuestionText.setText("Where is the tomb of Mughal Emperor Jahangir?");
            AnswerText.setText("Lahore");
        }

        if(value.equals("5"))
        {
            QuestionText.setText("When did Pakistan become a Republic?");
            AnswerText.setText("23/03/1956");
        }

        if(value.equals("6"))
        {
            QuestionText.setText(" Which is the national flower of Pakistan?");
            AnswerText.setText("Jasmine");
        }

        if(value.equals("7"))
        {
            QuestionText.setText("Who designed Pakistan’s national flag?");
            AnswerText.setText("Ameer-ud-din Khidwai");
        }

        if(value.equals("8"))
        {
            QuestionText.setText("Which is the national animal of Pakistan?");
            AnswerText.setText("Markhor");
        }

        if(value.equals("9"))
        {
            QuestionText.setText("Which is the national bird of Pakistan?");
            AnswerText.setText("Chakor");
        }


        if(value.equals("10"))
        {
            QuestionText.setText("Who is the first Governor General of Pakistan?");
            AnswerText.setText("Mohammed Ali Jinnah");
        }
    }
}
