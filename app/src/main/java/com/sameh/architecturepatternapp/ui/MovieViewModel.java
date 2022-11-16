package com.sameh.architecturepatternapp.ui;

import androidx.lifecycle.MutableLiveData;

import com.sameh.architecturepatternapp.pojo.MovieModel;

public class MovieViewModel {

    MutableLiveData<String> movieNameMutableLiveData = new MutableLiveData<>();

    public void getMovieName() {
        String movieName = getMovieFromDataBase().getName();
        movieNameMutableLiveData.setValue(movieName);
    }

    private MovieModel getMovieFromDataBase() {
        return new MovieModel("fel azrak", "2-3-2003", "this is good", 1);
    }

}
