package assignment;

import java.util.ArrayList;
import java.util.List;

public class RemoverArray {
public static void main(String[] args) {
	List<String>list_String=new ArrayList<String>();
	list_String.add("red");
	list_String.add("Green");
	list_String.add("yellow");
	list_String.add("White");
	list_String.add("black");
	
	 	System.out.println(list_String);
	 	 
	 	list_String.remove(3);
	 	
	 	System.out.println("after removing third element from the list:\n"+list_String);
	 	
}
}

