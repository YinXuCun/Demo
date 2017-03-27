import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by yinxu on 2017/3/23.
 */
public class ExtractDataFromeExcel {



    /**
     *获取excel表格中的有效数据    通过if语句过滤了所有的无效数据据例如：开机状态
     *根据excel表格的结构和逻辑性自动计算出所有的数据的状态
     *下一步是导出这些数据
     *
     *
     * */

    private String filepath;
    private  int      Water_level;
    private  int  control_water_level;
    private int  keep_water_level;
    private HSSFWorkbook wb;
    private  HSSFSheet sheet;
    private InputStream excel;
    private HashMap hashMap;
    private  int  firstcolumn;
    private int lastcolumn;
    private   int  station_num;
    private int   station_name_cplumn;
    public ExtractDataFromeExcel(String filepath) throws IOException {
         this.filepath = filepath;
         excel = new FileInputStream(filepath);
         wb = new HSSFWorkbook(excel);

         getColumn();
    }


/*
    public   ArrayList<String> ExtraDatas(){}
*/
    public   ArrayList<String> ExtractData(){
        DecimalFormat df = new DecimalFormat("#.##");
        ArrayList<String> arrayList=new ArrayList<String>(60);
            StringBuilder result=null;
            Iterator<Row> rows = sheet.rowIterator();
            Cell cell;
            String  namess;
            while (rows.hasNext()) {
                result=new StringBuilder();
                /*
                *
                * 遍历每一行
                * */
            HSSFRow row = (HSSFRow) rows.next();
            if (row.getRowNum()>1/*&&!row.getCell(0).getStringCellValue().equals("流量")&&!row.getCell(0).getStringCellValue()
                    .equals("开机状态")*/) {


                /*
                * 过滤掉了所有的无效数据
                *
                 */
                if (row.getCell(0).getStringCellValue().equals("流量")||row.getCell(0).getStringCellValue()
                        .equals("开机状态")){

                    result.append(sheet.getRow(row.getRowNum()-1).getCell(0).getStringCellValue()+row.getCell(0).getStringCellValue() + " ");
                }else {
                    result.append(row.getCell(0).getStringCellValue() + " ");


                }/*result.append(((row.getCell(station_num).getCellType()==Cell.CELL_TYPE_NUMERIC))?
                        (row.getCell(station_num).getNumericCellValue()):((row.getCell(station_num).getCellType()==Cell.CELL_TYPE_STRING)?
                        (row.getCell(station_num).getStringCellValue()):(null)));*/
                    result.append("flower");
                    Iterator<Cell> cellIterator = row.cellIterator();
                    while (cellIterator.hasNext()) {
                        cell = cellIterator.next();
                        if (Water_level>firstcolumn&&cell.getAddress().getColumn()==Water_level){
                            if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC)
                            result.append("设计水位"+cell.getNumericCellValue()+" ");
                            else
                                result.append("设计水位"+cell.getStringCellValue()+" ");

                        }
                         if (cell.getAddress().getColumn()==keep_water_level&&keep_water_level>firstcolumn){
                            if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC)
                                result.append("保温水位"+cell.getNumericCellValue()+" ");
                            else
                                result.append("保温水位"+cell.getStringCellValue()+" ");
                         }
                         if (cell.getAddress().getColumn()==control_water_level&&control_water_level>firstcolumn){

                             if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC)
                                 result.append("控制水位"+cell.getNumericCellValue()+" ");
                             else
                                 result.append("控制水位"+cell.getStringCellValue()+" ");
                         }
                        if (cell.getAddress().getColumn() >= firstcolumn && cell.getAddress().getColumn()
                                <= lastcolumn && cell.getCellType() == Cell.CELL_TYPE_STRING) {
                        /*
                         * 通过三元表达式以及逻辑运算自动输出所有的有效数据并进行备注
                         *
                         * */
                            result.append(((cell.getAddress().getColumn() - firstcolumn)
                                    <= 1 ? (cell.getAddress().getColumn() - firstcolumn == 0 ?
                                    ("上游,0:00" + ",") : ("下游,0:00" + ",")) : (
                                    ((cell.getAddress().getColumn() - firstcolumn) % 2 == 0) ?
                                            ("上游," + (((cell.getAddress().getColumn() - firstcolumn) / 2)) * 2 + ":00") : ("下游," + ((
                                            (cell.getAddress().getColumn() - firstcolumn) / 2)) * 2 + ":00")) + ","
                                    + cell.getStringCellValue() + " "
                            ));

                        }
                        if (cell.getAddress().getColumn() >= firstcolumn && cell.getAddress().getColumn()
                                <= lastcolumn && cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
                            result.append((((cell.getAddress().getColumn() - firstcolumn)
                                    <= 1 ? (cell.getAddress().getColumn() - firstcolumn == 0 ? ("上游,0:00" + ",") : ("下游,0:00" + ","))
                                    : (((cell.getAddress().getColumn() - firstcolumn) % 2 == 0) ?
                                    ("上游," + (((cell.getAddress().getColumn() - firstcolumn) / 2)) * 2 + ":00") : ("下游," + ((
                                    (cell.getAddress().getColumn() - firstcolumn) / 2)) * 2 + ":00")) + ","
                            ) + df.format(cell.getNumericCellValue()) + " "
                            ));
                        }
                    }
                    arrayList.add(result.toString());
                }

            }


        try {
            excel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;

    }

    public void    getColumn() {
        sheet=wb.getSheetAt(0);
        Iterator<Row> rows = sheet.rowIterator();
        hashMap=new HashMap<String,Integer>();
        while (rows.hasNext()) {
            HSSFRow row = (HSSFRow) rows.next();
            Iterator<Cell> cells = row.cellIterator();
            while (cells.hasNext()) {
                HSSFCell cell = (HSSFCell) cells.next();
                switch (cell.getCellType()) {
                    case HSSFCell.CELL_TYPE_STRING:
                        String s = cell.getStringCellValue();
                        if (s.equals("0:00")){
                            firstcolumn=cell.getAddress().getColumn();
                        }
                        if (s.equals("22:00")){
                            lastcolumn=cell.getAddress().getColumn();
                        }
                        if (s.equals("站名")){
                            station_name_cplumn=cell.getAddress().getColumn();

                        }
                        if (s.equals("桩号")){
                            station_num=cell.getAddress().getColumn();

                        }
                        if (s.equals("设计水位")){
                            Water_level=cell.getAddress().getColumn();
                        }
                        if (s.equals("控制水位")){
                         control_water_level=cell.getAddress().getColumn();
                        }
                        if (s.equals("保温水位")){
                            keep_water_level=cell.getAddress().getColumn();
                        }

                        break;
                    default:
                        break;
                }
            }



        }





    }
    public String getSheetName()  {
            if (sheet!=null) {
                sheet = wb.getSheetAt(0);
                return sheet.getSheetName();
            }
        else {

            return   "sheet not found";
        }

    }
}



