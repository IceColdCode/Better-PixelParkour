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
  public int numberOfImages = 10;
  BufferedImage[numberOfImages] images;
  
  Graphics2D graphics;
  
  // getters and setters
  public void setXVector(int v) {
    dx = v;
  }
  public int getXVector() {
    return dx;
  }
  public void setYVector(int v) {}
  public int getYVector() {}
  public void setX(int x) {}
  public int getX() {}
  public void setY(int y) {}
  public void getY() {}
  
  public void init(int x, int y) {
    initAnimation();
    draw(graphics,x, y);
  }
  public void initAnimation() {}
  public void draw(Graphics g, int x, int y) {
    
    for(BufferedImage image : this.images) {
      g.drawImage(image, x, y, null);
    }
    
  }
  public void move() {}
  
  /**
   * overloaded constructors
   * @param path
  **/
  public void Sprite(String path) {
    // this needs to change for the animatiion
    try{
      image = ImageIO.read(getClass().getResourceAsStream(path));
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
  
  /**
   * @param path, x, y
  **/
  public void Sprite(String path, int x, int y) {
  try{
    image = ImageIO.read(getClass().getResourceAsStream(path));
  }catch (Exception e) {
    e.printStackTrace();
  }
  draw(x, y);
} 
    
  }
  }
}
