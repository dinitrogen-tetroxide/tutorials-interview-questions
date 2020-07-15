package com.programmers.heap;

import lombok.extern.slf4j.Slf4j;

import java.util.PriorityQueue;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42626
 * todo : 이거 문제 잘 이해가 안됨
 * http://blog.naver.com/PostView.nhn?blogId=h0609zxc&logNo=221492095742
 * https://www.geeksforgeeks.org/priority-queue-class-in-java-2/
 */
@Slf4j
public class MoreSpicy {
    public int mySolution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int aScoville : scoville) {
            heap.add(aScoville);
        }

//        log.info("heap : {}", heap);

        while (heap.size() > 0) {
            Integer poll = heap.poll();
            log.info("poll : {}", poll);
        }
//
//        while (heap.peek() < K) {
//            if (heap.size() == 1) return -1;
//
//            //섞는다.
//            int val1 = heap.poll();
//            int val2 = heap.poll();
//
//            int result = val1 + (val2 * 2);
//
//
//            heap.add(result);
//            answer++;
//        }
        return answer;
    }

    public int bestSolution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int aScoville : scoville) {
            heap.add(aScoville);
        }
        while (heap.peek() < K) {
            if (heap.size() == 1) return -1;

            //섞는다.
            int val1 = heap.poll();
            int val2 = heap.poll();

            int result = val1 + (val2 * 2);

            heap.add(result);
            answer++;
        }
        return answer;
    }
}
