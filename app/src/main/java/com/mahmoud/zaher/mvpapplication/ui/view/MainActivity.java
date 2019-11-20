package com.mahmoud.zaher.mvpapplication.ui.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.mahmoud.zaher.mvpapplication.R;
import com.mahmoud.zaher.mvpapplication.ui.presenter.MoviePresenter;

public class MainActivity extends AppCompatActivity implements IViewMovie, View.OnClickListener {
    TextView movieNameTv;
    Button getMovieNameBtn;

    MoviePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movieNameTv = findViewById(R.id.textView);
        getMovieNameBtn = findViewById(R.id.button);
        getMovieNameBtn.setOnClickListener(this);
        presenter = new MoviePresenter(this);
    }


    @Override
    public void onGetMovieName(String movieName) {
        movieNameTv.setText(movieName);
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button) {
            presenter.getMovieName();
        }
    }
}
