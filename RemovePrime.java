import java.utill. *;


public class RemovePrime {

    public static void solution(ArrayList<Integer> al) {
    
    for(int i = al.size() -1; i >= 0; 1--) {

    if (is prime(al.get(1)) == true) {
        
    al.remove(i);
    }
    }
    }


    public static boolem