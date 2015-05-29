/* This class is for all images in the game, except the 
 * Background class. It is not meant to be instantiated,
 * but rather extended for my own purposes. do not use 
 * this class however, as it is intended only to make 
 * the Sprite and AnimatedSprite classes. Time For the
 * JavaDoc!
 */

package TileMap;

import java.awt.*;

abstract class GameImage {
  /**
   * @version 1
   * @since Pixel Parkour v0.1 beta
   * @author r3xth33nc0d3r@gmail.com
   * @see Sprite
   * @see AnimatedSprite
   * @depeciated
  */
  // positions on the screen
  private int x;
  private int y;
  private int dx;
  private int dy;
  
  // image
  BufferedImage image;
  
  public void setImage(BufferedImage img) {
    image = img;
  }
  
  public BufferedImage getImage() {
    return image;
  }
  
  public abstract void loadImage(String file);
  public abstract void move();

}
