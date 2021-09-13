package com.example.movieapp;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MovieViewHolder extends RecyclerView.ViewHolder {
    private ImageView mIvNowShowingMovie;
    public MovieViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView){
        mIvNowShowingMovie = itemView.findViewById(R.id.ivMovieImg);
        mIvNowShowingMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    public void setData(MovieModal movieModal){
        movieModal.getMovieTitle().toString();
        movieModal.getPosterImgId();
    }

}
