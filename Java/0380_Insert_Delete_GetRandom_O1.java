class RandomizedSet {
    HashMap<Integer, Integer> map;
    List<Integer> list;
    Random r;
    public RandomizedSet() {
        map = new HashMap<Integer, Integer>();
        list = new ArrayList<>();
        r = new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        map.put(val, list.size());
        list.add(val);
        //System.out.println(list);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        int targetIndex = map.get(val);
        int lastValue = list.get(list.size()-1);
        
        map.put(lastValue, targetIndex);
        list.set(targetIndex, lastValue);
        map.remove(val);
        list.remove(list.size()-1);
        //System.out.println(list);
        return true;
    }
    
    public int getRandom() {
        return list.get(r.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
/*
class RandomizedSet {
    HashSet<Integer> set;
    public RandomizedSet() {
        set = new HashSet<Integer>();
    }
    
    public boolean insert(int val) {
        return set.add(val);
    }
    
    public boolean remove(int val) {
        return set.remove(val);
    }
    
    public int getRandom() {
        Random r = new Random();
        int t = r.nextInt(set.size());
        Iterator<Integer> it = set.iterator();
        int result = it.next();
        while(it.hasNext() && t > 0){
            result = it.next();
            t--;
        }
        return result;
    }
}
*/
/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
