public class OrderedStream {

    private String[] array;
    private int ptr = 0;
    public OrderedStream(int n) {
        array = new String[n];
    }
    
    public IList<string> Insert(int idKey, string value) {
        array[idKey - 1] = value;
        IList<string> result = new List<string>();
        for(int i = ptr; i < array.Length; i++){
            if(array[i] == null){
                ptr = i;
                break;
            }
            else{
                result.Add(array[i]);
            }
        }
        return result;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * IList<string> param_1 = obj.Insert(idKey,value);
 */
