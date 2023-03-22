package com.norton.soccernews.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.norton.soccernews.R;
import com.norton.soccernews.databinding.ActivityDetailBinding;
import com.norton.soccernews.databinding.ActivityMainBinding;

public class DetailActivity extends AppCompatActivity {

    public static String Extras;
    private ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_detail);
    }
}