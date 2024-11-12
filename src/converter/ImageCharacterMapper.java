package converter;

public class ImageCharacterMapper {
  
  private String mapString =  "`^\",:;Il!i~+_-?][}{1)(|\\/tfjrxnuvczXYUJCLQ0OZmwqpdbkhao*#MW&8%B@$"; 

  public ImageCharacterMapper (String mapString) {
    this.mapString = mapString;
  }

  public ImageCharacterMapper () {}

  public char map (int brightness) {
    int index = (int)((brightness / 255.0) * (mapString.length() - 1));
    return mapString.charAt(index);
  }

}
