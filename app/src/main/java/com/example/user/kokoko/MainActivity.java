package com.example.user.kokoko;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private List<EmailItem> list = generateEmailList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);

        RecyclerView emailRecycler = findViewById(R.id.rv);

        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_home:

                            case R.id.action_vocabluary:

                                break;
                            case R.id.action_history:

                                break;
                        }
                        return false;
                    }
                });

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        emailRecycler.setLayoutManager(new LinearLayoutManager(this));
        EmailAdapter emailAdapter = new EmailAdapter(list, this, this);
        emailRecycler.setAdapter(emailAdapter);


    }

    private List<EmailItem> generateEmailList() {
        List<EmailItem> list = new ArrayList<>();

        list.add(new EmailItem(getString(R.string.name_of_test)));
        list.add(new EmailItem(getString(R.string.name_of_test)));
        list.add(new EmailItem(getString(R.string.name_of_test)));
        list.add(new EmailItem(getString(R.string.name_of_test)));
        list.add(new EmailItem(getString(R.string.name_of_test)));
        list.add(new EmailItem(getString(R.string.name_of_test)));
        list.add(new EmailItem(getString(R.string.name_of_test)));
        return list;
    }

}
