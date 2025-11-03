package converter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import errors.FileNotFound;
import utils.Display;

public class ImageLoader {
  public static BufferedImage load(String imagePath) throws IOException {
      File file;
      file = new File(imagePath);

      if (!file.exists()) {
        Display.error(new FileNotFound(file.getAbsolutePath()));
        System.exit(1);
      }

      BufferedImage img = ImageIO.read(file);
      System.out.println("Successfully loaded image!");
      System.out.println("Image Size: " + img.getWidth() + " x " + img.getHeight());
      return img;
  }
}
