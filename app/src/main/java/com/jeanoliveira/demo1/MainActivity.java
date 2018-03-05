package com.jeanoliveira.demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spnGroup, spnTopic;

    ArrayAdapter<CharSequence> groupAdapter, newsAdapter, sportsAdapter, opinionsAdapter,
            entertainmentAdapter, livingAdapter;
    String userChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnGroup = findViewById(R.id.spnGroup);
        spnTopic = findViewById(R.id.spnTopic);

        groupAdapter = ArrayAdapter.createFromResource(this, R.array.group, android.R.layout.simple_spinner_item);
        groupAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        newsAdapter = ArrayAdapter.createFromResource(this, R.array.news, android.R.layout.simple_spinner_item);
        newsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sportsAdapter = ArrayAdapter.createFromResource(this, R.array.sports, android.R.layout.simple_spinner_item);
        sportsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        opinionsAdapter = ArrayAdapter.createFromResource(this, R.array.opinions, android.R.layout.simple_spinner_item);
        opinionsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        entertainmentAdapter = ArrayAdapter.createFromResource(this, R.array.entertainment, android.R.layout.simple_spinner_item);
        entertainmentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        livingAdapter = ArrayAdapter.createFromResource(this, R.array.living, android.R.layout.simple_spinner_item);
        livingAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spnGroup.setAdapter(groupAdapter);
        spnGroup.setOnItemSelectedListener(this);

        spnTopic.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()) {

            case R.id.spnGroup:
                switch (position){
                    case 0:
                        spnTopic.setAdapter(newsAdapter);
                        break;
                    case 1:
                        spnTopic.setAdapter(sportsAdapter);
                        break;
                    case 2:
                        spnTopic.setAdapter(opinionsAdapter);
                        break;
                    case 3:
                        spnTopic.setAdapter(entertainmentAdapter);
                        break;
                    case 4:
                        spnTopic.setAdapter(livingAdapter);
                        break;
                }

            case R.id.spnTopic:

                userChoice = spnTopic.getSelectedItem().toString();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
