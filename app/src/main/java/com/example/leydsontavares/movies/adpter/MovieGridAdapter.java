package com.example.leydsontavares.movies.adpter;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.example.leydsontavares.movies.R;
import com.example.leydsontavares.movies.model.Movie;
import java.util.List;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by LeydsonTavares on 19/04/2016.
 */
public class MovieGridAdapter extends BaseAdapter {

    List<Movie> movieList;

    Context mContext;
    LayoutInflater mInflater;

    public MovieGridAdapter(List<Movie> movies, Context mContext) {
        this.movieList = movies;
        this.mContext = mContext;
        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return movieList.size();
    }

    @Override
    public Object getItem(int position) {
        return movieList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view;
        ViewHolder holder;
        if (convertView == null) {
            view = mInflater.inflate(R.layout.item_grid, parent, false);
            holder = new ViewHolder(view);
            Movie movie = movieList.get(position);

            holder.mPoster.setImageDrawable(ContextCompat.getDrawable(mContext ,Integer.parseInt(movie.getmPoster())));

        } else {
            view = convertView;
        }


        return view;
    }


    class ViewHolder {

        @Bind(R.id.poster)
        ImageView mPoster;


        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }


    }
}


