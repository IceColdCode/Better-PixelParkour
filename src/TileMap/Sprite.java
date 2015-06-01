package TileMap;

import java.awt.*;
import javax.imageio.ImageIO;

class Sprite extends GameImage {
  
  // numbers
  public int x;
  public int y;
  private int dx;
  private int dy;
  
  // imaging
  BufferedImage image;
  
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
  public void draw(Graphics g) {}
  public void move() {}
  
  /**
   * overloaded constructors
   * @param path
  **/
  public void Sprite(String path) {
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
