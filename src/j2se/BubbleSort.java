package j2se;

public class BubbleSort {
	public static void main(String[] args) {
		int[] ori = new int[] {(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100)};
	    for (int i = 0 ; i<ori.length ; i++) {
	    	System.out.println(ori[i]);
	    }
	    System.out.println(" ");
		for (int j = 0; j < ori.length ; j++) {
	    	for (int i = 0; i < ori.length-j-1; i++) {
	    		if (ori[i]>ori[i+1]) {
	    			int temp = ori[i];
	    			ori[i] = ori[i+1];
	    			ori[i+1] = temp;
	    		}
	    	}
	    }
		
	    for (int i = 0 ; i<ori.length ; i++) {
	    	System.out.println(ori[i]);
	    }
	}

}
