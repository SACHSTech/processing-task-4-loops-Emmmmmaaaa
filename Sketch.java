import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // grid quadrent 
    for (int lineX = 20; lineX < 200; lineX += 20) {
      stroke (0,0,0); 
      line(lineX, 0, lineX, 200); 
    } 
    for (int lineY = 20; lineY <= 200; lineY += 20) {
      stroke (0,0,0); 
      line(0, lineY, 200, lineY); 
    }

    // Circle quadrent 
    for (int circleY = 30; circleY <=200; circleY += 35) {
      for (int circleX = 230; circleX <= 400; circleX += 35){
        fill (212, 15, 125); 
        stroke (0,0,0); 
        ellipse (circleX, circleY, 20,20); 
      }
    }

    // Gradient quadrent 
      double colour = 0;  
      for (int lineX = 0; lineX <= 200; lineX ++){
        line (lineX, 200, lineX, 400);
  
        colour += 1.25; 
        stroke ((int)colour, (int)colour, (int)colour); 
      }

    //Flower Quadrent 
      //draw petals 
      
      for(int i = 0; i < 2; i++){
        rotate(radians(45*i));
        fill(219, 84, 37);
        stroke(0, 0, 0);
        ellipse(424*sin(radians(45+45*i)), 424*cos(radians(45+45*i)), 125, 18);

        fill(219, 84, 37);
        stroke(0, 0, 0);
        ellipse(424*sin(radians(45+45*i)), 424*cos(radians(45+45*i)), 18, 125);  
      }

      // Reset the coordiante system
      rotate(radians(315));

      //circle 
      fill(37, 108, 45); 
      ellipse (300,300,32,32); 
    } 
  }
  
  // define other methods down here