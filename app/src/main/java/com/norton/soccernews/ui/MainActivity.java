package com.norton.soccernews.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.norton.soccernews.data.MatchesApi;
import com.norton.soccernews.databinding.ActivityMainBinding;
import com.norton.soccernews.domain.Match;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MatchesApi matchesApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupHttpClient();
    }

    private void setupHttpClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://github.com/NortonLiaz88/matches-simulator-api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        matchesApi = retrofit.create(MatchesApi.class);
    }

    private void setupMatchesList() {
        matchesApi.getMacthes().enqueue(new Callback<List<Match>>() {
            @Override
            public void onResponse(Call<List<Match>> call, Response<List<Match>> response) {

            }

            @Override
            public void onFailure(Call<List<Match>> call, Throwable t) {

            }
        });
    }
}