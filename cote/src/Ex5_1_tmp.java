import java.util.Arrays;
import java.util.Vector;

public class Ex5_1_tmp {
	public int[] solution(int[] arr, int divisor) {
		
		Vector<Integer> v = new Vector<>();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % divisor == 0) {
				v.add(arr[i]);
			}
		}
		if(v.size() == 0) {
			v.add(-1);
		}
		int[] answer = new int[v.size()];
		for(int i=0; i< v.size(); i++) {
			answer[i] = v.get(i);
		}
		Arrays.sort(answer);
		return answer;
	}

}
