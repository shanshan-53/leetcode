class OrderedStream {

    private String[] arr;
    private int ptr = 0;
    public OrderedStream(int n) {
        arr = new String[n];
    }
    
    public List<String> insert(int idKey, String value) {
        List<String> result = new ArrayList<>();
        
        arr[idKey-1] = value;
        for(int i = ptr; i < arr.length; i++){
            if(arr[i] == null){
                break;
            }
            else{
                result.add(arr[i]);
                ptr = i+1;
            }
        }
        return result;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
