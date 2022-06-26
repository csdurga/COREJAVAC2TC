
public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // for loop
		  for(int i=1,j=1; i<10||j<10;i++,j++)
		  { 
			  j++;
			  System.out.println("i="+i+" and j="+j); 
		  }


		  // while loop 
			  int i=1,j=1;
			  while(i<10 || j<10)
			  { 
				  i++; j++;
			      System.out.println("i="+i+" and j="+j); 
			  }	
			
		// Do while loop
			int y=1,x=1;
			do {
				x++;
				y++;
				System.out.println("x=" + x + " and y=" + y);
			    } while (x < 10 || y < 10);
		}
	

	}


