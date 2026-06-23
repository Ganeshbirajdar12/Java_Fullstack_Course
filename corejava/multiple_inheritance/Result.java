package multiple_inheritance;

public class Result extends Marks implements Display {

	@Override
	public void disp() {
		 int total = math+english+marathi;
		 
		 System.out.println("Total marks : "+total);
		
	}

}
