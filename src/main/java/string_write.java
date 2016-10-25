import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class string_write {

	 String path;
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public  void wirte(ArrayList<String> list) throws IOException {
		File name_file=new File(path);
		FileWriter fw=new FileWriter(name_file);
		
		for(String s:list){
			fw.write(s+"\n");

		}
		fw.flush();
		fw.close();

	}

}
