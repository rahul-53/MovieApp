package com.example.movieapp;

import java.util.List;

public class Response{

	private List<ComingSoonItem> comingSoon;

	private List<NowShowingItem> nowShowing;

	public List<ComingSoonItem> getComingSoon(){
		return comingSoon;
	}

	public List<NowShowingItem> getNowShowing(){
		return nowShowing;
	}
}