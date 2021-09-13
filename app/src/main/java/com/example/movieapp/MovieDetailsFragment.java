package com.example.movieapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieDetailsFragment extends Fragment {
    private TextView mTvMovieTitle, mTvMovieDescription, mTvMovieReleaseDate;
    private ImageView mIvMovieDetailsImage;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie_details, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);

    }
    private  void initView(View view){
        mIvMovieDetailsImage = view.findViewById(R.id.ivMovieDetailsImg);
        mTvMovieTitle = view.findViewById(R.id.tvMovieTitle);
        mTvMovieReleaseDate = view.findViewById(R.id.tvReleaseDate);
        mTvMovieDescription = view.findViewById(R.id.tvMovieDescription);

        mIvMovieDetailsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}