package com.example.leydsontavares.movies.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by LeydsonTavares on 19/04/2016.
 */
public class Movie implements Parcelable {
    private String mTitulo;
    private String mDescricao;
    private String mTipos;
    private String mVideoID;
    private String mDuracao;
    private String mPoster;
    private String mAno;
    private String mQualificação;

    public Movie(Parcel in) {

        mTitulo = in.readString();
        mDescricao = in.readString();
        mTipos = in.readString();
        mVideoID = in.readString();
        mDuracao = in.readString();
        mPoster = in.readString();
        mAno = in.readString();
        mQualificação = in.readString();

    }

    public Movie() {
    }

    //Método responsavel pelas  funcionalidades de um DataInputStream e DataOutputStream
    // para serializar e deserializar objetos.
    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };


    // int que identifica a classe
    @Override
    public int describeContents() {
        return 0;
    }

    //Serializa as informações da classe
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mTitulo);
        dest.writeString(mDescricao);
        dest.writeString(mTipos);
        dest.writeString(mVideoID);
        dest.writeString(mDuracao);
        dest.writeString(mPoster);
        dest.writeString(mAno);
        dest.writeString(mQualificação);

    }


    public String getmVideoID() {
        return mVideoID;
    }

    public void setmVideoID(String mVideoID) {
        this.mVideoID = mVideoID;
    }

    public String getmTipos() {
        return mTipos;
    }

    public void setmTipos(String mTipos) {
        this.mTipos = mTipos;
    }


    public String getmTitulo() {
        return mTitulo;
    }

    public void setmTitulo(String mTitulo) {
        this.mTitulo = mTitulo;
    }

    public String getmDescricao() {
        return mDescricao;
    }

    public void setmDescricao(String mDescricao) {
        this.mDescricao = mDescricao;
    }

    public String getmDuracao() {
        return mDuracao;
    }

    public void setmDuracao(String mDuracao) {
        this.mDuracao = mDuracao;
    }

    public String getmPoster() {
        return mPoster;
    }

    public void setmPoster(String mPoster) {
        this.mPoster = mPoster;
    }

    public String getmAno() {
        return mAno;
    }

    public void setmAno(String mAno) {
        this.mAno = mAno;
    }

    public String getmQualificação() {
        return mQualificação;
    }

    public void setmQualificação(String mQualificação) {
        this.mQualificação = mQualificação;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "mTitulo='" + mTitulo + '\'' +
                ", mDescricao='" + mDescricao + '\'' +
                ", mTipos='" + mTipos + '\'' +
                ", mVideoID='" + mVideoID + '\'' +
                ", mDuracao=" + mDuracao +
                ", mPoster=" + mPoster +
                ", mAno=" + mAno +
                ", mQualificação=" + mQualificação +
                '}';
    }


}
