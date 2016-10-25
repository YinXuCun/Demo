package bean;

import java.sql.Date;

/**
 * Created by yinxu on 2016/10/18.
 */
public class FileBean {

    private  int  id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String  name;

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getAbsoultPath() {
        return absoultPath;
    }

    public void setAbsoultPath(String absoultPath) {
        this.absoultPath = absoultPath;
    }

    private Date  updatetime;
    private String  absoultPath;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FileBean(String  name){
        this.name=name;
    }
}
