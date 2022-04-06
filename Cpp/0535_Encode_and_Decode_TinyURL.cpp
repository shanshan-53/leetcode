class Solution {
public:
    map<string, string> m;
    int i = 0;
    // Encodes a URL to a shortened URL.
    string encode(string longUrl) {
        if(m.count(longUrl) == 0){
            m[longUrl] = i+"";
            i++;
        }
        return m[longUrl];
    }

    // Decodes a shortened URL to its original URL.
    string decode(string shortUrl) {
        string result = "";
        for(map<string, string>::iterator iter = m.begin(); iter != m.end(); iter++){
            if(iter->second == shortUrl){
                result = iter->first;
                break;
            }
        }
        return result;
    }
};

// Your Solution object will be instantiated and called as such:
// Solution solution;
// solution.decode(solution.encode(url));
