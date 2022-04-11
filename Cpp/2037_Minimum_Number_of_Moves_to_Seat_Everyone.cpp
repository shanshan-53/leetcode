class Solution {
public:
    int minMovesToSeat(vector<int>& seats, vector<int>& students) {
        /*
        sort(seats);
        sort(students);
        */
        sort(seats.begin(), seats.end());
        sort(students.begin(), students.end());
        int result = 0;
        for(int i = 0; i < seats.size(); i++){
            result += abs(seats[i] - students[i]);
        }
        return result;
    }
    /*
private:
    //bubble sort
    void sort(vector<int>& v){
        for(int i = 0; i < v.size(); i++){
            for(int j = i; j < v.size() - 1; j++){
                if(v[j] > v[j+1]){
                    int temp = v[j];
                    v[j] = v[j+1];
                    v[j+1] = temp;
                }
            }
        }
    }
    */
};
