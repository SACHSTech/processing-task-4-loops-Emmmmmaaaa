import processing.core.PApplet;

/**
 * Draws 4 quadrents that has a grid, circles, a gradient, and a flower. 
 * @author: Emma Chan 
 *
 */
class Main {
  public static void main(String[] args) {
    
    String[] processingArgs = {"MySketch"};
	  Sketch mySketch = new Sketch();
	  PApplet.runSketch(processingArgs, mySketch);
  }
  
}