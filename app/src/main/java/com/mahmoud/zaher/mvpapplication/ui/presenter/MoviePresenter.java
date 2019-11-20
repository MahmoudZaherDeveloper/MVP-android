package com.mahmoud.zaher.mvpapplication.ui.presenter;

import com.mahmoud.zaher.mvpapplication.pojo.MovieModel;
import com.mahmoud.zaher.mvpapplication.ui.view.IViewMovie;

public class MoviePresenter {
    IViewMovie view;

    public MoviePresenter(IViewMovie view) {
        this.view = view;
    }

    public void getMovieName() {
        view.onGetMovieName(getMovieNameFromDb().getMovieName());
    }

    private MovieModel getMovieNameFromDb() {
        return new MovieModel(1, "Spider Man", "very Nice Movie");
    }
}
