import java.util.Random;

import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";
		Random r = new Random();
		/* 1. Get the panel to show */
		panel.showPanel();
		/* 2. Set the background image of the panel to the Galapagos Islands */
        panel.setBackgroundImage(galapagosIslands);
		/* 3. Instantiate a Turtle and add it to the panel */
		//panel.addTurtle(turt);
		/* 4. Put 50 Turtles on the beach. */
		for(int a = 1;a<51;a++){
			
			Turtle turt=new Turtle();
			int x = r.nextInt(1920);
			int y = r.nextInt(920);
			turt.setX(x);
			turt.setY(y);
			panel.addTurtle(turt);
		}
	}
}

