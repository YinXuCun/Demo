import bean.FileBean;
import com.mysql.cj.mysqlx.protobuf.MysqlxCrud;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class listFile  {
	String path;
	int id=1;
	File file;
	Queue<File> queue;
	long  time;
	java.sql.Date date;
	FileBean  fileBean;
	ArrayList<FileBean> list;
	public   ArrayList<FileBean>  list_the_File() throws IOException{
		
		file=new File(path);
		list=new ArrayList<FileBean>();
		queue=new ConcurrentLinkedQueue<File>();
		ArrayList<FileBean> list= getFileName(file);
		return list;

	}
	 public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	ArrayList<FileBean> getFileName(File fils){
			queue.add(fils);
			File f;
			while(!queue.isEmpty()){
				f=queue.poll();
				if(f.isFile()) {
					time=f.lastModified();
					 date=new Date(time);
					fileBean=new FileBean(f.getName());
					fileBean.setAbsoultPath(f.getPath());
					fileBean.setUpdatetime(date);
					fileBean.setId(id);
					id++;
					System.out.println(f.getAbsoluteFile());
					list.add(fileBean);
					continue;
				}else
					for(File fs:f.listFiles()){
						queue.add(fs);
					}
			}
		return list;
		
	}

}
