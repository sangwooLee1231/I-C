package org.example.day15.컬렉션;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q3 {
    public static void main(String[] args) {
        // HashMap 초기화
        HashMap<Integer, String> map = new HashMap<>();
        map.put(100, "김데이");
        map.put(200, "김사전");
        map.put(300, "김구조");
        map.put(400, "김자료");

        // 요소 수정 및 제거
        map.remove(200);  // 200 키에 해당하는 항목 제거
        map.replace(300, "김충성");  // 300 키에 해당하는 값 변경

        // map의 key 값들을 Set에 저장
        Set<Integer> keys = map.keySet();  // keySet() 메서드를 통해 모든 키를 가져옴

        // keySet을 이용해 각 키와 그에 해당하는 값을 출력
        for (Integer key : keys) {
            System.out.println("고객 번호: " + key + ", 이름: " + map.get(key));
        }
    }
}
