package CollectionFramework;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import org.omg.CORBA.OMGVMCID;

public class SortFilesInFolder {
public static void main(String[] args) {
	File file = new File("C:\\Program Files");
	File str[]=file.listFiles();
	
for (File file2 : str) {
	System.out.println(file2.getName());
}

Arrays.sort(str, new Comparator<File>() {

	@Override
	public int compare(File o1, File o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
});

System.out.println("-------------------------------------");
for (File file2 : str) {
	System.out.println(file2.getName());
}

}
}
