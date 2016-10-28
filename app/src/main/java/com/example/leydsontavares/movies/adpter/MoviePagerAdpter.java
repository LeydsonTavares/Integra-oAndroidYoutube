package com.example.leydsontavares.movies.adpter;

import android.content.Context;

import com.example.leydsontavares.movies.model.Movie;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.leydsontavares.movies.R;
import com.example.leydsontavares.movies.fragments.GridMovieFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LeydsonTavares on 19/04/2016.
 */
public class MoviePagerAdpter extends FragmentStatePagerAdapter {



    String mFiccao;
    String mTerror;
    String mComedia;
    String mAventura;
    String mAcao;
    String mFantasia;


    List<Movie> mMovies;

    public MoviePagerAdpter(FragmentManager fm, List<Movie> movies, Context context) {
        super(fm);
        this.mMovies = movies;

        //Nomeando as viewpager com as Strings criadas no res


        mComedia = context.getResources().getString(R.string.comedia);
        mFiccao = context.getResources().getString(R.string.ficcao);
        mAventura = context.getResources().getString(R.string.aventura);
        mAcao = context.getResources().getString(R.string.acao);
        mTerror = context.getResources().getString(R.string.terror);
        mFantasia = context.getResources().getString(R.string.fantasia);
    }

    protected MoviePagerAdpter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        GridMovieFragment statusDemandaFragment = new GridMovieFragment();

        switch (position) {

            case 0:
                statusDemandaFragment.setmMovies(filtrarPorStatus(mMovies, mFiccao));
                break;

            case 1:
                statusDemandaFragment.setmMovies(filtrarPorStatus(mMovies, mTerror));
                break;
            case 2:
                statusDemandaFragment.setmMovies(filtrarPorStatus(mMovies, mComedia));
                break;
            case 3:
                statusDemandaFragment.setmMovies(filtrarPorStatus(mMovies, mAventura));
                break;
            case 4:
                statusDemandaFragment.setmMovies(filtrarPorStatus(mMovies, mAcao));
                break;
            case 5:
                statusDemandaFragment.setmMovies(filtrarPorStatus(mMovies, mFantasia));
                break;

            default:
                break;
        }

        return statusDemandaFragment;

    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return mFiccao;
            case 1:
                return mTerror;
            case 2:
                return mComedia;
            case 3:
                return mAventura;
            case 4:
                return mAcao;
            case 5:
                return mFantasia;
            default:
                return "";
        }


    }

    @Override
    public int getCount() {
        return 6;
    }

    private List<Movie> filtrarPorStatus(List<Movie> movies, String statusMovie) {

        List<Movie> moviesFiltradas = new ArrayList<>();

        for (Movie movie : movies) {

            if (statusMovie.equals(movie.getmTipos())) {
                moviesFiltradas.add(movie);
            }

        }

        return moviesFiltradas;

    }

}


