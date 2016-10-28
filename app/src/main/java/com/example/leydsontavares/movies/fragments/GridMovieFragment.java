package com.example.leydsontavares.movies.fragments;

import com.example.leydsontavares.movies.model.Movie;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.leydsontavares.movies.R;
import com.example.leydsontavares.movies.adpter.MovieGridAdapter;
import com.example.leydsontavares.movies.view.DescricaoMovieActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnItemClick;

/**
 * Created by LeydsonTavares on 19/04/2016.
 */
public class GridMovieFragment extends Fragment {

    @Bind(R.id.gd_movies)
    GridView mGvMovie;

    MovieGridAdapter mAdapter;

    List<Movie> mMovies;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.grid_activity, null);
        ButterKnife.bind(this, view);

        mAdapter = new MovieGridAdapter(getmMovie(), getActivity().getBaseContext());
        mGvMovie.setAdapter(mAdapter);


        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    public List<Movie> getmMovie() {
        if (mMovies == null) {
            mMovies = new ArrayList<>();
        }

        return mMovies;
    }

    public void setmMovies(List<Movie> mMovies) {
        this.mMovies = mMovies;
    }



    //Pegando o item Clicado GridView
    @OnItemClick(R.id.gd_movies)
    @Nullable
        protected void itemClicado(int position) {
        Movie movie = (Movie)  mGvMovie.getItemAtPosition(position);
        Intent intent = new Intent(getActivity(), DescricaoMovieActivity.class);
        intent.putExtra("movie", movie);
        startActivity(intent);

    }
}



