package TileMap;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.*;

abstract class GameImage {
  
  // positions on the screen
  private int x;
  private int y;
  private int dx;
  private int dy;
  
  // image
  BufferedImage image;
  
  public void loadImage(String file);
  
  public void move();
}
