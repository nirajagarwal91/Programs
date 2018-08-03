package other;

public class Atoi {
	public int myAtoi(String s) {
		int index=0, spacePos=0;
		int sign = 1;
		int tempValue=0;
		String str = s.trim();
		if(str.length()==0) {
			return 0;
		}
		char temp = str.charAt(0);
		for(int i=0; i < str.length() && str.charAt(i)!=' ';i++) {
			spacePos = i;
		}
		if(temp != '-' && temp != '+' && (temp < 48 || temp > 57)) {
			return 0;
		}
		else {
			if(temp=='-') {
				sign = -1;
				index=1;
			}
			if(temp == '+') {
				index = 1;
			}
			for(int i=index; i<=spacePos; i++) {
				if(str.charAt(i)>= 48 && str.charAt(i) <= 57) {
					if(tempValue > Integer.MAX_VALUE/10 || (tempValue == Integer.MAX_VALUE/10 && str.charAt(i) - '0' > 7)) {
						if (sign > 0) {
		                    return Integer.MAX_VALUE;
		                } else {
		                    return Integer.MIN_VALUE;
		                }
					}
					tempValue = tempValue * 10 + str.charAt(i)-'0';	
				}
				else
					break;
			}
		}
		return sign==-1? tempValue*sign : tempValue ;
	} 
	
		
	public static void main(String[] args) {
		Atoi ob1 = new Atoi();
		System.out.println(ob1.myAtoi("2147483648"));
		
	}
}
