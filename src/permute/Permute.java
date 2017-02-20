package permute;



public class Permute {

	public static void main(String[] args) {

		int[] a={1,2,3};
		permute(0, a);    
		}

		public  static void permute(int start, int[] input ) {
		        if (start == input.length) {
		           
		            for(int x: input){
		            System.out.print(x);
		            
		        }
		        System.out.println("");
		        System.out.println("----");
		        return;
		    }
		    for (int i = start; i < input.length; i++) {
		        // swapping
		        int temp = input[i];
		        input[i] = input[start];
		        input[start] = temp;
		        permute(start + 1, input);
		        int temp2 = input[i];
		        input[i] = input[start];
		        input[start] = temp2;
		    }
		}

}