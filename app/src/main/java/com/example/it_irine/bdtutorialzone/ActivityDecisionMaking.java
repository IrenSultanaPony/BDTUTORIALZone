package com.example.it_irine.bdtutorialzone;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class ActivityDecisionMaking extends AppCompatActivity {
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decision_making);
        mToolbar=(Toolbar)findViewById(R.id.toolbar);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        setSupportActionBar(mToolbar);

    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.scientific:
                startActivity(new Intent(ActivityDecisionMaking.this,ScientificCalculator.class));
                break;
            case R.id.digitConverter:
                startActivity(new Intent(ActivityDecisionMaking.this, DigitConversionActivity.class));
                break;
            case R.id.calculator:
                startActivity(new Intent(ActivityDecisionMaking.this,CalculatorActivity.class));

        }
        }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
