package BinaryHeap;

import java.util.List;

import static java.util.Collections.swap;

//public class Binaryheap {
//    static List<Integer> heap;
//    private static void insert(int data){
//        heap.add(data);
//        int i=heap.size()-1;
//        while(i>1){
//            int parentI=i/2;
//            if(heap.get(parentI)<heap.get(i)){
//                swap(heap,parentI,i);
//            }
//            i=parentI;
//        }
//    }
//    private static Integer delete(){
//        if(heap.size()==1) return null;
//        int data=heap.get(i);
//        heap.set(1,heap.get(heap.size()-1));
//        heap.remove(heap.size()-1);
//        int i=1;
//        while(i<heap.size()-1){
//            int left=2*i;
//            int right= 2*i+1;
//            if(right<heap.size()) {
//                if (heap.get(left) > heap.get(right) && heap.get(left) > heap.get(i)) {
//                    swap(heap, i, left);
//                    i = left;
//                } else if (heap.get(right) > heap.get(left) && heap.get(right) > heap.get(i)) {
//                    swap(heap, i, right);
//                    i = right;
//                }
//            }
//            else if(left<heap.size() && heap.get(left)>heap.get(i)){
//                swap(heap,i,left);
//                i=left;
//            }
//                else {
//                    return data;
//                }
//            }return data;
//
//        }
//    }
//
//}
