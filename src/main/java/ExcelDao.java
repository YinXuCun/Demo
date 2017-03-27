import java.sql.Date;

/**
 * Created by yinxu on 2017/3/23.
 */
public class ExcelDao {
    private String name;
    private Date date;
    private String number;
    private String  flower;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFlower() {
        return flower;
    }

    public void setFlower(String flower) {
        this.flower = flower;
    }



}
