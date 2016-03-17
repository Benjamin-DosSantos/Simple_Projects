package breakout.core;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {

	private static int ball_x;
	private static int ball_y;
	private static int ball_width;
	private static int ball_height;
	private static Color ballcolor;
	private static Color balloutline;
	
	public Ball(int ball_x, int ball_y, int ball_width,int ball_height, Color ballcolor, Color balloutline) {
		super();
		this.ball_x = ball_x;
		this.ball_y = ball_y;
		this.ball_width = ball_width;
		this.ball_height = ball_height;
		this.ballcolor = ballcolor;
		this.balloutline = balloutline;
	}
	
public void drawBall(Graphics g){
		
		g.setColor(ballcolor);
		g.fillOval(ball_x, ball_y, ball_width, ball_height);
		g.setColor(balloutline);
		g.drawOval(ball_x, ball_y, (ball_width), (ball_height));
	}

	public int getBall_x() {
		return ball_x;
	}

	public void setBall_x(int Ball_x) {
		this.ball_x = Ball_x;
	}

	public int getBall_y() {
		return ball_y;
	}

	public void setBall_y(int Ball_y) {
		this.ball_y = Ball_y;
	}
	
	public String getBallColor(Color Ballcolor) {
		 return Ballcolor.toString();
	}
	
	public void setBallColor(Color Ballcolor) {
		this.ballcolor = Ballcolor;
	}
	
	public String getBallOutline(Color Balloutline) {
		 return Balloutline.toString();
	}
	
	public void setBallOutline(Color Balloutline) {
		this.balloutline = Balloutline;
	}
	
	public int getBall_width() {
		return ball_width;
	}

	public void setBall_width(int Ball_width) {
		this.ball_width = Ball_width;
	}

	
	public int getBall_height() {
		return ball_height;
	}

	public void setBall_height(int Ball_height) {
		this.ball_height = Ball_height;
	}

	public void playDeath(){
		
	}
	
}
