1.마지막 두 원소
제출 내역
문제 설명
정수 리스트 num_list가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.

import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
    
        
        
        int[] num_list1 = {2, 1, 6};
        int[] num_list2 = {5, 2, 1, 7, 5};
        System.out.println(solution(num_list1)); // [2, 1, 6, 5]
        System.out.println(solution(num_list2)); // [5, 2, 1, 7, 5, 10]
        
        List result = new ArrayList();
        for (int num : num_list) {
            result.add(num);
        }
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            result.add(num_list[num_list.length - 1] - num_list[num_list.length - 2]);
        } else {
            result.adda(num_list[num_list.length - 1] * 2);
        }
        int[] array = new int[(int)result.size()];
        for(int i=0;i<result.size();i++){
            array[i]=result.get(i);
        }
        return array;
    }
    }


2. 수 조작하기 1
제출 내역
문제 설명
정수 n과 문자열 control이 주어집니다. control은 "w", "a", "s", "d"의 4개의 문자로 이루어져 있으며, control의 앞에서부터 순서대로 문자에 따라 n의 값을 바꿉니다.

"w" : n이 1 커집니다.
"s" : n이 1 작아집니다.
"d" : n이 10 커집니다.
"a" : n이 10 작아집니다.
위 규칙에 따라 n을 바꿨을 때 가장 마지막에 나오는 n의 값을 return 하는 solution 함수를 완성해 주세요.

  public class Main {
    public static void main(String[] args) {
        System.out.println(solution(10, "wadswd")); // 출력: 20
        System.out.println(solution(10, "awdaw")); // 출력: 0
    }

    public static int solution(int n, String control) {
        for (char c : control.toCharArray()) {
            switch (c) {
                case 'w':
                    n++;
                    break;
                case 's':
                    n--;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
            }
        }
        return n;
    }
}


3. 수 조작하기 2
제출 내역
문제 설명
정수 배열 numLog가 주어집니다. 처음에 numLog[0]에서 부터 시작해 "w", "a", "s", "d"로 이루어진 문자열을 입력으로 받아 순서대로 다음과 같은 조작을 했다고 합시다.

"w" : 수에 1을 더한다.
"s" : 수에 1을 뺀다.
"d" : 수에 10을 더한다.
"a" : 수에 10을 뺀다.
그리고 매번 조작을 할 때마다 결괏값을 기록한 정수 배열이 numLog입니다. 즉, numLog[i]는 numLog[0]로부터 총 i번의 조작을 가한 결과가 저장되어 있습니다.

주어진 정수 배열 numLog에 대해 조작을 위해 입력받은 문자열을 return 하는 solution 함수를 완성해 주세요.


public class Main {
    public static void main(String[] args) {
        int[] numLog = {10, 11, 21, 20, 30, 31};
        System.out.println(solution(numLog, 3)); // 출력: "was"
        System.out.println(solution(numLog, 5)); // 출력: "ds"
    }

    public static String solution(int[] numLog, int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            int diff = numLog[i] - numLog[i - 1];
            if (diff == 1) {
                sb.append('w');
            } else if (diff == -1) {
                sb.append('s');
            } else if (diff == 10) {
                sb.append('d');
            } else if (diff == -10) {
                sb.append('a');
            }
        }
        return sb.toString();
    }
}


4. 수열과 구간 쿼리 3
제출 내역
문제 설명
정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴입니다.

각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.

위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] queries = {{0, 1}, {1, 3}, {2, 4}};
        System.out.println(Arrays.toString(solution(arr, queries))); // 출력: [2, 4, 3, 5, 1]
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int temp = arr[query[0]];
            arr[query[0]] = arr[query[1]];
            arr[query[1]] = temp;
        }
        return arr;
    }
}


5. 수열과 구간 쿼리 2
제출 내역
문제 설명
정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.

각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.

각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.

  #include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// arr_len은 배열 arr의 길이입니다.
// queries_rows는 2차원 배열 queries의 행 길이, queries_cols는 2차원 배열 queries의 열 길이입니다.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] queries = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(solution(arr, queries))); // 출력: [5, 6, 3]
    }

    public static int[] solution(int[] arr, int[][] queries) {
        List<Integer> answerList = new ArrayList<>();
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            int minGreater = -1;
            for (int i = s - 1; i < e; i++) {
                if (arr[i] > k && (minGreater == -1 || arr[i] < minGreater)) {
                    minGreater = arr[i];
                }
            }
            answerList.add(minGreater);
        }
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}


  


  
