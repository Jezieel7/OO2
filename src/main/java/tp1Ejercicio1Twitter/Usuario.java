package tp1Ejercicio1Twitter;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String screenName;
	private List<Tweet> tweets = new ArrayList<Tweet>();
	
	public Usuario() {
		
	}
	
	public Usuario(String screenName, List<Tweet> tweets) {
		this.screenName = screenName;
		this.tweets = tweets;
	}
	
	public boolean verificarScreenName(String screenName2) {
		return this.screenName.equals(screenName2);
	}
	
	public String getScreenName(){
		return this.screenName;
	}
	
	public void agregarTweet(Tweet tweet) {
		if(verificarLongitud(tweet))
			this.tweets.add(tweet);
	}
	
	public boolean verificarLongitud(Tweet tweet) {
		return (tweet.getTexto().length() >= 1) && (tweet.getTexto().length() <= 140);
	}
	
	public void eliminarTweets() {
		this.tweets.removeAll(this.tweets);
	}
	
	public void eliminarTweet(Tweet tweet) {
		this.tweets.remove(tweet);
	}

	public List<Tweet> getTweets() {
		return tweets;
	}

	public void setTweets(List<Tweet> tweets) {
		this.tweets = tweets;
	}
	

}
