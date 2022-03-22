class Solution {
    public String interpret(String command) {
        String result = new String(command);
        result = result.replaceAll("\\(\\)", "o");
        result = result.replaceAll("\\(al\\)", "al");
        return result;
    }
}
