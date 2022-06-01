
public class Perm { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perm permTest = new Perm();
		permTest.permute("abcd", 0, 3);
	}
	public void permute(String str, int start, int end) {
		if(start == end) {
			System.out.println(str);
		}else {
			for(int i = start; i <= end; i++) {
				str = swap(str, start, i);
				permute(str, start+1, end);
				str =swap(str, start, i);
			}
		}
	}
	
	public String swap(String str, int i, int j) {
		char[] charArr = str.toCharArray();
		char temp;
		temp = charArr[i];
		charArr[i] = charArr[j];
		charArr[j] = temp;
		return String.valueOf(charArr);
	}
}
