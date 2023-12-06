package Arquivo;

import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Arquivo2 {
  public static void main(String[] args) {
	  
	  Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
	  for(Path path : dirs) {
		  System.out.println(path);
	  }
  }
}
