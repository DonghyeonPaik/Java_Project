package homework01;

public class pp {

	   public static void main(String[] args) {
	      int max = 0;
	      int[] array = {4,0,2,4,5};
	      for(int i = 0; i< array.length ; i++ ) {
	            if(array[i]>max) max = array[i]; 
	      }System.out.println("max: " + max);
	   }      
}
