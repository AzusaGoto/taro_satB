package com.example.taro2213taro.firstgrademath_special;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static android.R.id.edit;
import static android.R.id.inputExtractEditText;
import static android.support.constraint.R.id.none;


public class HitoketaplusActivity extends AppCompatActivity {

    int excounter = 0;
    int rightcounter = 0;
    int answercount = 0;
    int answerint;
    int number1;
    int number2;
    boolean bl;
    TextView edittext;
    int answerA;

    Handler handler = new Handler(); // (1)

    /*int[] number_1;
    int[] number_2;
    int[] answer;*/





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitoketaplus);

        TextView EXcounttext = (TextView)findViewById(R.id.textView2);
        TextView EXtext = (TextView)findViewById(R.id.textView);

       /* number_1 = new int[5];
        number_2 = new int[5];
        answer = new int[5];*/

        makeQuestions();

        EXcounttext.setText(excounter+"/5");


        EXtext.setText(number1 + "+" + number2 + "=");



    }

    private void makeQuestions() {

        Random random1 = new Random();
        number1 = random1.nextInt(10);
        Random random2 = new Random();
        number2 = random2.nextInt(10);
        answerint = number1 + number2;

        while (answerint > 10) {

            random1 = new Random();
            number1 = random1.nextInt(10);
            random2 = new Random();
            number2 = random2.nextInt(10);
            answerint = number1 + number2;
        }


    }

    public void answer ( View v){

        edittext = (EditText)findViewById(R.id.editText);
        String str = edittext.getText().toString();
        if(str.isEmpty()){
            answerA = 0;
        }else{
            answerA = Integer.parseInt(str);
        }


        excounter++;

            if (answerA == number1 + number2) {
                if (excounter < 5) {
                    rightcounter++;
                    TextView EXtext = (TextView) findViewById(R.id.textView);

                    makeQuestions();

                    EXtext.setText(number1 + "+" + number2 + "=");

                    TextView EXcounttext = (TextView) findViewById(R.id.textView2);
                    EXcounttext.setText(excounter + "/5");
                    new AlertDialog.Builder(this)
                            .setMessage("せいかい！！")
                            .show();
                    edittext.setText("");
                }
                if (excounter == 5) {
                    rightcounter++;
                    if(rightcounter == 0) {
                        new AlertDialog.Builder(this)
                                .setMessage("しゅうりょうです！！" + "\n" + "残念ながら正解はありませんでした..." + "\n" + "つぎはがんばりましょう！！")
                                .setOnCancelListener(new DialogInterface.OnCancelListener() {
                                    public void onCancel(DialogInterface dialog) {
                                        Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);  //インテントの作成
                                        startActivity(intent2);
                                    }
                                })
                                .show();
                    }
                    else{
                        new AlertDialog.Builder(this)
                                .setMessage("しゅうりょうです！！" + "\n" + "あなたは"+rightcounter+"こ正解しました！！")
                                .setOnCancelListener(new DialogInterface.OnCancelListener() {
                                    public void onCancel(DialogInterface dialog) {
                                        Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);  //インテントの作成
                                        startActivity(intent2);
                                    }
                                })
                                .show();
                    }
                }
            }
            else {
                if (excounter < 5) {
                    int number3 = number1 + number2;
                    TextView EXtext = (TextView) findViewById(R.id.textView);
                    makeQuestions();
                    EXtext.setText(number1 + "+" + number2 + "=");
                    TextView EXcounttext = (TextView) findViewById(R.id.textView2);
                    EXcounttext.setText(excounter + "/5");
                    new AlertDialog.Builder(this)
                            .setMessage("ざんねん！  せいかいは" + number3)
                            .show();
                    edittext.setText("");
                }
                if (excounter == 5) {
                    if(rightcounter == 0) {
                        new AlertDialog.Builder(this)
                                .setMessage("しゅうりょうです！！" + "\n" + "残念ながら正解はありませんでした..." + "\n" + "つぎはがんばりましょう！！")
                                .setOnCancelListener(new DialogInterface.OnCancelListener() {
                                    public void onCancel(DialogInterface dialog) {
                                        Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);  //インテントの作成
                                        startActivity(intent2);
                                    }
                                })
                                .show();
                    }
                    else{
                        new AlertDialog.Builder(this)
                                .setMessage("しゅうりょうです！！" + "\n" + "あなたは"+rightcounter+"こ正解しました！！")
                                .setOnCancelListener(new DialogInterface.OnCancelListener() {
                                    public void onCancel(DialogInterface dialog) {
                                        Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);  //インテントの作成
                                        startActivity(intent2);
                                    }
                                })
                                .show();
                    }
                }
            }

    }

    /*public void help(View v) {
        new AlertDialog.Builder(this)
                .setTitle("もんだいのときかた")
                .setMessage("たとえばボールが1こあります。" + "\n" + "おとうさんにもうひとつ"+"\n"+"かってもらったとしましょう。" + "\n" + "ボールは2こですね。" + "\n" + "これを式にすると..." +
                        "\n" + "\n" + "1+1=2" + "\n" + "\n" + "となります。"+"\n"+"ボールなどで考えてやると"+"\n"+"わかりやすいですよ。"+"\n"+"ちなみに0のときは"+"よこのすうじがこたえになります！")
                .show();
    }*/
}