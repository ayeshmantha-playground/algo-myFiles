void main(){
    String str = "hello";
    stringReverse(str);
    System.out.println(str);
    // System.out.println(stringReverse("racecar"));

    System.out.println(isPalindrome("racecar"));
}

boolean isPalindrome(String input){
    return input.equals(stringReverse(input));
}

String stringReverse(String input){
    if (input.isEmpty()) { // base case
        return "";
    }

    return stringReverse(input.substring(1)) + input.charAt(0);
}