package com.techreviewsandhelp.getoutoftheway;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

/**
 * Created by crua9 on 4/3/2015.
 */
public class Help extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);

/**
 * Button to go back to main screen
 * */
        final Context c = this;
        Button back = (Button)findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(c, MainActivity.class));
            }
        });


    }
}
