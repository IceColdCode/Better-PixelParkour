package TileMap;

import java.awt.*;
import javax.imageio.ImageIO;
import java.util.*;

class Sprite extends GameImage {
  
  // numbers
  public int x;
  public int y;
  private int dx;
  private int dy;
  
  // imaging
  public String[] paths;
  public int numberOfImages = 10;
  public int index = 0;
  BufferedImage[numberOfImages] images;
  
  Graphics2D graphics;
  
  // animation thread
  Thread animationThread = new Thread("Animation Thread", new Sprite())
  
  // getters and setters
  public void setXVector(int v) {
    dx = v;
  }
  public int getXVector() {
    return dx;
  }
  public void setYVector(int v) {
    this.dy = v;
  }
  public int getYVector() {
    rturn dy;
  }
  public void setX(int x) {
    this.x = x;
  }
  public int getX() {
    return x;
  }
  public void setY(int y) {
    this.y = y;
  }
  public void getY() {
    return y;
  }
  
  // methods
  public void init(int x, int y) {
    loadAnimation();
    draw(graphics,x, y);
  }
  public void loadAnimation(String[] paths) {
    for(int i = 0; 1<paths.length; i++) {
      images[i] = ImageIO.read(getClass.getResourceAsStream(paths[i]);
    }
  }
  public void draw(Graphics g, int x, int y) {
    
    for(BufferedImage image : this.images) {
      g.drawImage(image, x, y, null);
    }
    
  }
  public void play(int x, int y) {
    if(AnimationThread == null) {
      AnimationThread.start();
    }
    for (BufferedImage image : images) {
      graphics.drawImage(image, x, y, null);
    }
  }
  
  /**
   * overloaded constructors
   * @param path
  **/
  public void Sprite(String[] paths) {
    // this needs to change for the animation
    this.paths = paths;
    loadAnimation();
  }
  
  /**
   * @param path, x, y
  **/
  public void Sprite(String[] imgPaths, int x, int y) {
    loadAnimation();
    draw(x, y);
  } 

}
