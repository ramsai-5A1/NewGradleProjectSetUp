package org.example;

import com.google.gson.annotations.SerializedName;

public class Rating{

	@SerializedName("rate")
	private Object rate;

	@SerializedName("count")
	private int count;

	public void setRate(Object rate){
		this.rate = rate;
	}

	public Object getRate(){
		return rate;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}
}