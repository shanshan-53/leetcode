public class Solution {
    public string GenerateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        sb.Append('a', n-1);
        /*
        for(int i = 0; i < n-1; i++){
            sb.Append('a');
        }
        */
        sb.Append((n%2 == 0) ? 'b' : 'a');
        return sb.ToString();
    }
}
