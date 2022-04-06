public class Codec {

    Dictionary<string, string> dic = new Dictionary<string, string>();
    // Encodes a URL to a shortened URL
    public string encode(string longUrl) {
        string shortUrl = longUrl.GetHashCode() + "";
        if(!dic.ContainsKey(shortUrl)){
            dic.Add(shortUrl, longUrl);
        }
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public string decode(string shortUrl) {
        string longUrl = dic[shortUrl];
        return longUrl;
    }
}
