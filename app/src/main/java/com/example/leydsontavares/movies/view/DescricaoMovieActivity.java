package com.example.leydsontavares.movies.view;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.leydsontavares.movies.R;
import com.example.leydsontavares.movies.model.Movie;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;

public class DescricaoMovieActivity extends AppCompatActivity {

    @Bind(R.id.img_play)
    ImageView mPlayMovie;

    @Bind(R.id.add_favorite)
    RadioButton mFavorite;

    @Bind(R.id.img_poster)
    ImageView mPoster;

    @Bind(R.id.toolbar)
    Toolbar mToolbar;

    @Bind(R.id.txt_ano)
    TextView mAno;

    @Bind(R.id.txt_descricao)
    TextView mDescricao;

    @Bind(R.id.txt_duracao)
    TextView mDuracao;

    @Bind(R.id.txt_nota)
    TextView mNota;


    Movie mMovie;
    Movie movie;


    public static final String PREFS_NAME = "Preferences";
    boolean PREFS_BOOLEAN = false;

    private String mVideoID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descricao_movie);
        ButterKnife.bind(this);



        //Restaura as preferencias gravadas
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
       mFavorite.setChecked(settings.getBoolean("PrefUsuario", PREFS_BOOLEAN));




        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey("movie")) {
            movie = (Movie) extras.getParcelable("movie");
            mMovie = movie;

        }

        preencherDescricao();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_grid_movie, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @OnCheckedChanged(R.id.add_favorite)
    public void onChecked(boolean checked) {

        if(checked == true ){
            SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
            SharedPreferences.Editor editor = settings.edit();
            editor.putBoolean("PrefUsuario",true);
            PREFS_BOOLEAN = true;
            editor.commit();
        }
        else{
            SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
            SharedPreferences.Editor editor = settings.edit();
            editor.putBoolean("PrefUsuario",false);
            PREFS_BOOLEAN = false;
            editor.commit();
        }

    }





    public String getmVideoID() {
        return mVideoID;
    }

    public void setmVideoID(String mVideoID) {
        this.mVideoID = mVideoID;
    }

    @OnClick(R.id.img_play)
    public void acessarYouTube() {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:" + getmVideoID())));
    }

    public void preencherDescricao() {
        mToolbar.setTitle(mMovie.getmTitulo());
        mAno.setText(mMovie.getmAno());
        mDescricao.setText(mMovie.getmDescricao());
        mDuracao.setText(mMovie.getmDuracao());
        mNota.setText(mMovie.getmQualificação());
        mPoster.setImageDrawable(ContextCompat.getDrawable(getBaseContext(), Integer.parseInt(movie.getmPoster())));
        setmVideoID(mMovie.getmVideoID());
    }


}
