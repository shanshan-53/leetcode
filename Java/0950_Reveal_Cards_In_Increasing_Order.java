class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck);
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            q.offer(i);
        }
        int[] result = new int[n];
        for(int i = 0;i < n; i++){
            result[q.poll()] = deck[i];
            q.offer(q.poll());
        }
        return result;
        /*
        2 3 5 7 11 13 17
                4  5  6 7 1 3
        2   3   5
        List<Integer> result = new ArrayList<>();
        for(int i = n-1; i>=0; i--){
            if(result.size() != 0){
                int temp = result.get(result.size()-1);
                result.add(0, temp);
                result.remove(result.size()-1);
            }
            result.add(0, deck[i]);
        }
        return result.stream().mapToInt(i->i).toArray();
        */
    }
}
