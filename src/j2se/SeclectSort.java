package j2se;

public class SeclectSort {
	public static void main(String[] args) {
		int[] ori = new int[] {(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100)};
	    for (int i = 0 ; i<ori.length ; i++) {
	    	System.out.println(ori[i]);
	    }
	    
	    System.out.println("  ");
	    
	    for (int j = 0 ; j < ori.length-1 ; j++) {
	    	for (int i = j+1; i < ori.length ; i++) {
	    		if (ori[i]<ori[j]) {
	    			int temp = ori[i];
	    			ori[i] = ori[j];
	    			ori[j] = temp;
	    		}
	    	}
	    }
	    
	    for (int i = 0 ; i<ori.length ; i++) {
	    	System.out.println(ori[i]);
	    }
	}

}
