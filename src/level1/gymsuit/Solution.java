package level1.gymsuit;

import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        // 다른 수(여기선 -2)로 변환해, 겹치는 것들은 애초에 제외시키기
        
        int answer = n - lost.length;
      
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]){
                    lost[i] = -2;
                    reserve[j] = -2;
                    answer++;
                    break;
                }
            }
        }
        
        // 순서 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j] -1){
                    lost[i] = -2;
                    reserve[j] = -2;
                    answer++;
                    break;
                }else if (lost[i] == reserve[j] +1){
                    lost[i] = -2;
                    reserve[j] = -2;
                    answer++;
                    break;
                }
            }

        }
        return answer;
    }
}