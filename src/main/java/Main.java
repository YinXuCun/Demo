/**
 * Created by yinxu on 2016/11/6.
 */
public class Main {
    public static void main(String[] args) {
        String s="下游|0:00|9.22";
       String[]strings= s.split("\\|");
       for (String ss:strings){
           System.out.println(ss);
       }
       /* FTPClientUtil f = new FTPClientUtil("123.206.30.169", 21, "anonymous", "");
        try {
            if (f.open()) {
                // 远程路径为相对路径
                f.get("/ddyx.xls", "C:\\Users\\yinxu\\Documents\\ddyxs.xls");
                f.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}






      /*
      Scanner in =new Scanner(System.in);
        int i,j,s=1;
        while (in.hasNext()) {

            int h = in.nextInt();
            if (h >= 1 && h <= 30) {
                System.out.printf("1\n");
                for (i = 2; i <= h; s = 1, i++)         // 行数 i 从 2 到层高
                {
                    System.out.printf("1 ");                // 第一个 1
                    for (j = 1; j <= i - 2; j++) // 列位置 j 绕过第一个直接开始循环
                        //printf("%d ", (s = (i - j) / j * s));
                        System.out.printf("%d ", (s = (i - j) * s / j));
                    System.out.printf("1\n");               // 最后一个 1，换行
                }
                System.out.println();
            }
        }

      Scanner filesc=new Scanner(new File("C:/Users/yinxu/Documents/one.txt"));
        FileWriter fileWriter=new FileWriter("C:/Users/yinxu/1.txt");
        while (filesc.hasNext()){
            String string=filesc.nextLine();
            if(string.contains("")){
                fileWriter.write(string+"\n");
                fileWriter.flush();
            }

        }
        fileWriter.close();
        filesc.close();
*/

 /* Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while(testCases>0){
            String pattern = in.nextLine();
           try {
               Pattern.compile(pattern);
               System.out.println("Valid");
           }
           catch(Exception e){
            System.out.println("Invalid");
            }
            testCases--;
        }






          //Write your code

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
       String[] strings= s.split("[^a-zA-Z]");

        int  num=0;
       for(String ss:strings){
           if(!ss.equals(" ")&&!ss.equals("")){
               num++;
           }
       }
       System.out.println(num);
        for (String ss:strings) {
            if(!ss.equals(" ")&&!ss.equals("")) {
                System.out.println(ss);
            }
        }
        scan.close();
              Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        if(A.compareTo(B)>0){
            System.out.println("Yes");

        }
        else  System.out.println("No");
        char[] chars=A.toCharArray();
       chars[0]= Character.toUpperCase(chars[0]);
        A=String.valueOf(chars);
        chars=B.toCharArray();
        chars[0]= Character.toUpperCase(chars[0]);
        B=String.valueOf(chars);
        System.out.println(A+" "+B);
   Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        sc.close();
        boolean res=isAnagram(A,B);System.out.println((res)?"Angargs":"No a");
       char[] chars=A.toCharArray();
        StringBuilder stringBuilder=new StringBuilder();
      String s;
        for(int i=chars.length-1;i>=0;i--){
            stringBuilder.append(chars[i]);
        }
        s=stringBuilder.toString();
      if(s.endsWith(A)){
          System.out.println("Yes");
      }
      else  System.out.println("No");*/
       /* Scanner in = new Scanner(System.in);
        String S = in.next();
        int length = in.nextInt();
         ArrayList<String> list=new ArrayList<String>();
        for (int i=0;i<S.length()-length+1;i++){
           list.add( S.substring(i,i+length));
        }
        Collections.sort(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
*/

       /* Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();


        NumberFormat currencyFormatG = NumberFormat
                .getCurrencyInstance(Locale.FRANCE);
        String  mo2= currencyFormatG.format(payment);
        Format fm1=new DecimalFormat("#,###.00");
        String  mo = fm1.format(payment);
        String  china="￥"+mo;
        String  us="$"+mo;
        String    india= "Rs."+mo;
        Format format=new DecimalFormat("#"+' '+"###.00");
        String france=mo2;
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
*/
       /* Scanner in = new Scanner(System.in);

        String nextLine;
        while (in.hasNext()){
            nextLine=in.nextLine();

                char[] chars=nextLine.toCharArray();
            ArrayList<Character> list =new ArrayList<Character>();
                for(char c:chars){

                    list.add(c);
                    list.add(' ');

                }
                list.remove(list.size()-1);
            Collections.sort(list);
            for(char c:list){

                System.out.print(c);
            }

                System.out.println();

            }
*/

/*static boolean isAnagram(String a, String b) {
        char[] chars =a.toCharArray();
        char [] chars1=b.toCharArray();
        ArrayList<Character> list=new ArrayList<Character>();
        if(chars.length==chars1.length){

        for(char c:chars){
            list.add(c);
        }
        for (char c:chars1){

            if (!list.remove((Character)c)) {

                if(!list.remove((Character)(Character.toLowerCase(c)))){
                    if(!list.remove((Character)(Character.toUpperCase(c)))){
                        break;
                    }

                }


            }


        }
        if (list.size()==0){
            return true;
        }
        }
        return  false;
        // Complete the function by writing your code here.

    }*/

/*
class MyRegex{

    String  pattern= "^(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[0-9])\\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[0-9])$";


}*/
