class Node{
    String url;
    Node prev;
    Node next;
    Node(String url){
        this.url = url;
        this.prev = null;
        this.next = null;
    }
}

class BrowserHistory {
    Node lastPage;
    int page = 0;
    public BrowserHistory(String homepage) {
        lastPage = new Node(homepage);
    }
    
    public void visit(String url) {
        Node temp = new Node(url);
        lastPage.next = temp;
        temp.prev = lastPage;
        lastPage = lastPage.next;
        
        page++;
    }
    
    public String back(int steps) {
        for(int i = 0; i < steps && lastPage.prev != null; i++){
            page--;
            lastPage = lastPage.prev;
        }
        return lastPage.url;
    }
    
    public String forward(int steps) {
        for(int i = 0; i < steps && lastPage.next != null; i++){
            lastPage = lastPage.next;
        }
        return lastPage.url;
    }
}
/*
class BrowserHistory {

    List<String> vList = new ArrayList<>();
    int index = 0;
    public BrowserHistory(String homepage) {
        vList.add(homepage);
    }
    
    public void visit(String url) {
        index++;
        if(index <= vList.size()-1){
            vList.subList(index, vList.size()).clear();
        }
        
        vList.add(url);
    }
    
    public String back(int steps) {
        index = (index - steps >= 0) ? index - steps : 0;
        return vList.get(index);
    }
    
    public String forward(int steps) {
        index = (index + steps <= vList.size()-1) ? index + steps : vList.size()-1;
        return vList.get(index);
    }
}
/*
index = 1
"esgriv.com"
*/

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
