class Solution{

	boolean isStrobogrammatic(String num) {
    	
        	//dictionary
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put('6', '9');
		map.put('9', '6');
		map.put('8', '8');
		map.put('1', '1');
		map.put('0', '0');
		
		//start and end points of the string
		int left = 0;
		int right = num.length()-1;
		
		while(left<=right) {
            
			if(!map.containsKey(num.charAt(left)) || map.get(num.charAt(left))!=num.charAt(right)) {
				return false;
			}
            
			left++;
			right--;
		}	
		return true;
	}
}
