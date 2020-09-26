
public class ClassA {
private int num=0,count=0;
	public String method(int num) {
		try {
			if(num>5) {
				System.out.println("num="+num);
			}else if(num>10) {count++;
				throw new NullPointerException("null ponit ex...");
			}else {
				this.num=num;
				
				
			}
		}catch(NullPointerException e) {
			return "excepyion";
			
		}
		
		return "valid";
		
	}
}
