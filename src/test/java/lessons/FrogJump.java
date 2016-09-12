package lessons;

public class FrogJump {

	public static void main(String[] args) {
		int startPos = 10;
		int endPos = 85;
		int dist = 30;
		System.out.println(solution(startPos,endPos,dist));

	}
	
	public static int solution(int X, int Y, int D) {
        int totDist = Y - X;
        //if the frog can reach the destination with the perfect jump, then return that perfect no of jumps else add 1
        if (totDist % D == 0 ) {
			return totDist/D;
		} else {
			return totDist/D + 1;
		}
        
        
    }

}
