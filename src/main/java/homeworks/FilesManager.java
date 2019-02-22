package homeworks;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesManager {

  private String currentPosition = new String("C:\\");

  public String getCurrentPosition() {
    return currentPosition;
  }

  // public void setCurrentPosition(String currentPosition) {
  // this.currentPosition = currentPosition;
  // }

  public void open(String path) {
    Path p1 = Paths.get(path);
    if (Files.exists(p1)) {
    }
  }

}
