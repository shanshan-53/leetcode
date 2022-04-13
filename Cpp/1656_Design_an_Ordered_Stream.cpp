class OrderedStream {
public:
    vector<string> v;
    int ptr = 0;
    OrderedStream(int n) {
        v = vector<string>(n, "");
        /*
        for(int i = 0; i < n; i++){
            v.push_back("");
        }
        */
    }
    
    vector<string> insert(int idKey, string value) {
        v[idKey-1] = value;
        vector<string> r;
        for(int i = ptr; i < v.size(); i++){
            if(v[i] == ""){
                ptr = i;
                break;
            }
            r.push_back(v[i]);
        }
        return r;
    }
};

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream* obj = new OrderedStream(n);
 * vector<string> param_1 = obj->insert(idKey,value);
 */
