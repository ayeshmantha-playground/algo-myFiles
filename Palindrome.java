void main(){
    String str = "121";
    System.out.println(isPalindrome(str));
}

boolean isPalindrome(String input){

    if (input.isEmpty() || input.length() == 1) { //base case / stopping case
        return true;
    }

    if (input.charAt(0) == input.charAt(input.length() - 1)) {
        return isPalindrome(input.substring(1, input.length() - 1)); // divisions
    }

    return false;
}