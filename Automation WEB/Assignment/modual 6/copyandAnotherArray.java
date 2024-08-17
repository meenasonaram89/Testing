package assignment;

public class copyandAnotherArray {
	public static void main(String[] args) {
	
	}
	 int copy_Array (int a[],int b[],int n,int i) {
		if(i<n) {
			b[i]=a[i];
			copy_Array(a,b,n,i++);
			}
		return i;
	
	 } 
	 int array(int a[], int n) {
	 
	     int i; 
	     for (i = 0; i < n; i++) { 
	   
	         System.out.printf("%d",a[i]); 
	     }
		return i; 
		   
	 int main() {
	 
	     int k[] = { 3, 6, 9, 2, 5 }, n = 5; 
	     int l[] = k; 
	   
	     copy_Array("k, l, n, 0"); 
	     
	   
	     System.out.printf("first array : "); 
	     array(k, n); 
	   
	     
	     System.out.println("\nsecond array : "); 
	     return array(l, n); 
	 }
	 
 
 

}


		
		
		
	}
