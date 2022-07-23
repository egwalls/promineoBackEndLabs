import java.util.*;
public class StringBuilderListSetMap {
	

	public static void main(String[] args) {
		//why would we use a string builder instead of a string
		//a stringbuilder is more efficient strings when you are going to make significant
		//changes to a string in the program. Stringbuilder lets us change and manipulate 
		//the string further before outputting it because it is mutable whereas String is
		//immutable
		//some info pulled from: https://www.noveltech.dev/stringbuilder-unity/
		
		//instantiate a new StringBuilder and append the characters 0-9 separated by dashes
		//make sure no dash appears at the end of the stringbuilder
		StringBuilder str = new StringBuilder();
		str.append("0");
		for (int i = 1; i < 10; i++) {
			str.append("-" + i);
		}
		System.out.println(str.toString());
		
		//create a list of String and add 5 Strings to each with a different length
		List<String> strList = new ArrayList<String>();
		strList.add("Lion");
		strList.add("Tiger");
		strList.add("Parrot");
		strList.add("Bat");
		strList.add("Snow leopard");
		strList.add("Pig");
		
		//Arrays.asList("item", "item"); works to add in one line
		
		//write and test a method that takes a list of strings and returns the shortest string
		System.out.println(shortestStringInList(strList));
		
		//write and test a method that takes a list of strings and returns the list with the 
		//first and last element switched
		System.out.println(switchFirstLast(strList));
		
		//write and test a method that takes a list of strings and returns the list with all
		//the list elements concatenated to each other, separated by a comma
		System.out.println(concatList(strList));
		
		//write and test a method that takes a list of string and a string and returns a new
		//list with all the strings from the original list contain the second string parameter
		System.out.println(findStringInList(strList, "l"));
	
		//write and test a method that takes a list of integers and returns  List<List<Integer>>
		//where the first list in the returned value contains any number from the input list
		//that is divisible by 2, the second list contains values from the input list that are 
		//divisible by 3, the third by 5 and the fourth all numbers from the input not divisible
		//by 2, 3 or 5
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(67);
		intList.add(48);
		intList.add(63);
		intList.add(50);
		intList.add(28);
		intList.add(39);
		intList.add(25);
		intList.add(79);
		
		System.out.println(divisorLists(intList));
		
		//write and test a method that takes a list of strings and returns a list of integers
		//that contain the length of each string
		
		System.out.println(listOfLengths(strList));
		
		//create a set of string and add 5 values
		Set<String> strSet = new HashSet<String>();
		strSet.add("Grimmsnarl");
		strSet.add("Monferno");
		strSet.add("Mudkip");
		strSet.add("Snorunt");
		strSet.add("Rayquaza");
		
		//write and test a method that takes a set of strings and a character and returns a set
		//of strings consisting of all the string in the input set that start with the character
		//parameter
		System.out.println(setStartsWith(strSet, 'M'));
		
		//write and test a method that takes a set of strings and returns a list of the same strings
		System.out.println(setToList(strSet));
		
		//write and test a method that takes a set of integers and returns a new set of integers
		//containing only even numbers from the original set
		
		Set<Integer> intSet = new HashSet<Integer>();
		intSet.add(34);
		intSet.add(283);
		intSet.add(58);
		intSet.add(39);
		intSet.add(50);
		intSet.add(28);
		intSet.add(493);
		intSet.add(682);
		
		System.out.println(onlyEvens(intSet));
		
		//create a map of string and string and add 3 items to it where the key of each is a word
		//and the value is the definition of the word
		
		Map<String, String> dict = new HashMap<String, String>();
		dict.put("gibbous", "marked by convexity or swelling");
		dict.put("behemoth", "something of monstrous size, power, or appearance");
		dict.put("cantankerous", "difficult or irritating to deal with");
		
		//write and test a method that takes a Map<String, String> and a string and returns the
		//value for a key in the map that matches the string parameter (like a lang dictionary
		//lookup)
		System.out.println(define(dict, "behemoth"));
		
		//write and test a method that takes a List<String> and returns a Map<Character, Integer>
		//containing a count of all the strings that start with a given character
		System.out.println(howManyStartWith(strList));
	}
	public static String shortestStringInList(List<String> list) {
		String shortest = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).length() < shortest.length()) {
				shortest = list.get(i);
			}	
		} return shortest;
	}
	
	public static List<String> switchFirstLast(List<String> list) {
		String first = list.get(0);
		String last = list.get(list.size()-1);
		list.set(0, last);
		list.set(list.size()-1, first);
		return list;
	}
	
	public static String concatList(List<String> list) {
		StringBuilder str = new StringBuilder(list.get(0));
		for (int i = 1; i < list.size(); i++) {
			str.append(", " + list.get(i));
		} return str.toString();
	}
	
	public static List<String> findStringInList(List<String> list, String str){
		List<String> newList = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains(str)) {
				newList.add(list.get(i));
			}
		}return newList;
	}
	public static List<List<Integer>> divisorLists(List<Integer> list){
		List<Integer> by2 = new ArrayList<Integer>();
		List<Integer> by3 = new ArrayList<Integer>();
		List<Integer> by5 = new ArrayList<Integer>();
		List<Integer> byNoneOfAbove = new ArrayList<Integer>();
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				by2.add(list.get(i));
			}
			if (list.get(i) % 3 == 0) {
				by3.add(list.get(i));
			}
			if (list.get(i) % 5 == 0) {
				by5.add(list.get(i));
			}
			if (list.get(i) % 2 != 0 && list.get(i) % 3 != 0 && list.get(i) % 5 != 0) {
				byNoneOfAbove.add(list.get(i));
			}
		
		}
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result.add(by2);
		result.add(by3);
		result.add(by5);
		result.add(byNoneOfAbove);
		return result;
	}
	
	public static List<Integer> listOfLengths(List<String> list) {
		List<Integer> length = new ArrayList<Integer>();
		for (String word : list) {
			length.add(word.length());
		} return length;
	}
	//write and test a method that takes a set of strings and a character and returns a set
	//of strings consisting of all the string in the input set that start with the character
	//parameter
	public static Set<String> setStartsWith(Set<String> set, char ch){
		Set<String> result = new HashSet<String>();
		for (String word : set) {
			if (word.charAt(0) == ch) {
				result.add(word);
			}
		} return result;
	}	
	//write and test a method that takes a set of strings and returns a list of the same strings
	
	public static List<String> setToList(Set<String> set) {
		List<String> list = new ArrayList<String>();
		for (String word : set) {
			list.add(word);
		} return list;
	}
	
	//write and test a method that takes a set of integers and returns a new set of integers
	//containing only even numbers from the original set
	
	public static Set<Integer> onlyEvens(Set<Integer> set){
		Set<Integer> result = new HashSet<Integer>();
		for(int num : set) {
			if (num % 2 == 0) {
				result.add(num);
			}
		} return result;
	} 
	//write and test a method that takes a Map<String, String> and a string and returns the
	//value for a key in the map that matches the string parameter (like a lang dictionary
	//lookup)
	
	public static String define(Map<String, String> map, String word) {
		String result = "";
		for (String str: map.keySet()) {
			if (map.containsKey(word)) {
				result = map.get(word);
			}
		} return result;
	}
	
	//write and test a method that takes a List<String> and returns a Map<Character, Integer>
	//containing a count of all the strings that start with a given character
	public static Map<Character, Integer> howManyStartWith(List<String> list){
		Map<Character, Integer> result = new HashMap<Character, Integer>();
		for (String str : list) {
			char ch = str.charAt(0);
			if (result.containsKey(ch)) {
				result.put(ch, (result.get(ch) + 1));
			} else {
				result.put(ch, 1);
			}
		
		} return result;
	}
}
