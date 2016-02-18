package com.longfeisun.mobile.kukudm.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.longfeisun.mobile.kukudm.R;

public class MainActivity extends AppCompatActivity {
    private Toolbar mToolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = ((Toolbar) findViewById(R.id.toolbar));
        setSupportActionBar(mToolbar);

    }
}
