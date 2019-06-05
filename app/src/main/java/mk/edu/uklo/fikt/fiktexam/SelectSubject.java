package mk.edu.uklo.fikt.fiktexam;

import android.content.Intent;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;


public class SelectSubject extends Activity {

    private Button button; //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);// activity_main is corresponding XML file

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                /*
                 * Intent is just like glue which helps to navigate one activity
                 * to another.
                 */Intent intent = new Intent(SelectSubject.this,
                        StartScreen.class);
                startActivity(intent); // startActivity allow you to move
            }
        });
    }

}