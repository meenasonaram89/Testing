package Assiment;

public class getData {
			public static void main(String[] args) {
				ExcelReader e= new ExcelReader("C:\\Users\\meena\\OneDrive\\Documents\\test excle.xlsx", "login");
				int numofrow=e.rowCount();
				int numofcol=e.colCount();
				String data=e.getData(numofrow, numofcol);
				System.out.println(data);
				
			}
}
