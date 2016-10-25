public class HelloWord {
	private String  str;
	
	public HelloWord(){
		
	}
 public HelloWord(String  args){
	 str=args;
 }
 
 public String getStr() {
	return str;
}

public void setStr(String str) {
	this.str = str;
}

void s(){
	 System.out.println(str);
 }
}
