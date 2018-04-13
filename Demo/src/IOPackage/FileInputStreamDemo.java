package IOPackage;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileInputStreamDemo {
public static void main(String[] args) throws Exception {
	FileInputStream in = null;
    FileOutputStream out = null;
    
    File inputfile=new File("D:\\New Text Document.txt");
    File outputfile=new File("D:\\logs.txt");

    try {
       in = new FileInputStream(inputfile);
       
       BufferedInputStream bin=new BufferedInputStream(in);    

       out = new FileOutputStream(outputfile);
       
       int c;
       while ((c = bin.read()) != -1) {
          out.write(c);
       }
    }finally {
       if (in != null) {
          in.close();
       }
       if (out != null) {
          out.close();
       }
    }
}
}
