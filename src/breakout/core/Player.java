package breakout.core;

import java.awt.Color;
import java.awt.Graphics;

public class Player { 
	
	private int player_x,  player_y,  player_width,  player_height;
	private Color playercolor, playeroutline;
	
	public Player(int player_x, int player_y, int player_width,int player_height, Color playercolor, Color playeroutline) {
		super();
		this.player_x = player_x;
		this.player_y = player_y;
		this.player_width = player_width;
		this.player_height = player_height;
		this.playercolor = playercolor;
		this.playeroutline = playeroutline;
	}

	public void drawPlayer(Graphics g){
		
		g.setColor(playercolor);
		g.fillRect(player_x, player_y, player_width, player_height);
		g.setColor(playeroutline);
		g.drawRect(player_x, player_y, (player_width), (player_height));
	}

	public int getPlayer_x() {
		return player_x;
	}

	public void setPlayer_x(int player_x) {
		this.player_x = player_x;
	}

	public int getPlayer_y() {
		return player_y;
	}

	public void setPlayer_y(int player_y) {
		this.player_y = player_y;
	}
	
	public String getPlayerColor(Color playercolor) {
		 return playercolor.toString();
	}
	
	public void setPlayerColor(Color playercolor) {
		this.playercolor = playercolor;
	}
	
	public String getPlayerOutline(Color playeroutline) {
		 return playeroutline.toString();
	}
	
	public void setPlayerOutline(Color playeroutline) {
		this.playeroutline = playeroutline;
	}
	
	public int getPlayer_width() {
		return player_width;
	}

	public void setPlayer_width(int player_width) {
		this.player_width = player_width;
	}

	
	public int getPlayer_height() {
		return player_height;
	}

	public void setPlayer_height(int player_height) {
		this.player_height = player_height;
	}

	public void playDeath(){
		
	}
	
}
