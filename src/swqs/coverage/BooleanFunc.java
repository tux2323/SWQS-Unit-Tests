package swqs.coverage;

public final class BooleanFunc {
	
	public static boolean aAndbOrC(boolean A, boolean B, boolean C) {
		if(A && B){
			return true;
		}
		else if(C) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
