package com.java1;

import java.util.ArrayList;
public class PriorityQueue {

    void heapify(ArrayList<Integer> hT, int i){ // calling out heap with arraylist and i as position
    int size = hT.size();
    int largest = i;
    int l = 2 * i + 1;
    int r = 2 * i + 2;
    if (l < size && hT.get(l) > hT.get(largest))
        largest = l;
    if (r < size && hT.get(r) > hT.get(largest))
        largest = r;

    // Swap and continue heapifying if root is not largest

        if (largest != i){
        int temp = hT.get(largest);
        hT.set(largest, hT.get(i));
        hT.set(i, temp);

        heapify(hT, largest);
    }
    }

    void insert(ArrayList<Integer> hT, int newNum){
        int size = hT.size();
        if (size == 0){
            hT.add(newNum);
        }
        else{
            hT.add(newNum);
            for(int i = size / 2 -1; i >=0 ; i--)
            {
                heapify(hT,i);
            }
        }
    }

    public static void main(String args[])
    {

    }
}
