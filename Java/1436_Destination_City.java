class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> toSet = new HashSet<String>();
        HashSet<String> fromSet = new HashSet<String>();
        for(List<String> path : paths){
            String from = path.get(0);
            String to = path.get(1);
            if(toSet.contains(from)){
                toSet.remove(from);
            }
            else{
                fromSet.add(from);
            }
            toSet.add(to);
        }
        for(String s : fromSet){
            if(toSet.contains(s)){
                toSet.remove(s);
            }
        }
        return toSet.iterator().next();
    }
}
