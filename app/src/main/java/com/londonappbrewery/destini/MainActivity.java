package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {




    // TODO: Steps 4 & 8 - Declare member variables here:

    private TextView storyDisplay;
    private Button tpButton;
    private Button blButton;
    private int mStoryIndex = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        storyDisplay = (TextView) findViewById(R.id.storyTextView);
        tpButton = (Button) findViewById(R.id.buttonTop);
        blButton = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        tpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1 || mStoryIndex == 2){
                    storyDisplay.setText(R.string.T3_Story);
                    tpButton.setText(R.string.T3_Ans1);
                    blButton.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;

            }else if (mStoryIndex == 3) {
                    storyDisplay.setText(R.string.T6_End);
                    tpButton.setVisibility(View.GONE);
                    blButton.setVisibility(View.GONE);
                }
            }
       });

        blButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if(mStoryIndex == 1){
                    storyDisplay.setText(R.string.T2_Story);
                    tpButton.setText(R.string.T2_Ans1);
                    blButton.setText(R.string.T2_Ans2);
                    mStoryIndex= 2;
                    }else if(mStoryIndex == 2){
                        storyDisplay.setText(R.string.T4_End);
                        tpButton.setVisibility(View.GONE);
                        blButton.setVisibility(View.GONE);
                    }else if(mStoryIndex == 3){
                        storyDisplay.setText(R.string.T5_End);
                        tpButton.setVisibility(View.GONE);
                        blButton.setVisibility(View.GONE);
                    }

            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }

}
