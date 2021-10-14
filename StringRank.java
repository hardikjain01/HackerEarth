package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringRank {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String X = scan.next();
		System.out.println(find_rank(X));

	}
	
	static int find_rank(String X) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < X.length(); i++) {
			for (int j = i+1; j <= X.length(); j++) {
				if(!list.contains(X.substring(i, j)))
					list.add(X.substring(i, j));
			}
		}
		list.sort((a, b) -> a.compareTo(b));
	    for(int i=0;i<list.size();i++) {
	    	if(list.get(i).equals(X)) {
	    		return i+1;
	    	}
	    }
	    return -1;
	}

}
