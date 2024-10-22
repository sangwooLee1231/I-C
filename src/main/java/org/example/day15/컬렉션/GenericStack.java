package org.example.day15.컬렉션;

import java.util.ArrayList;
import java.util.List;

// 제네릭 스택 클래스
class GenericStack<T> {
    private List<T> stack;

    public GenericStack() {
        stack = new ArrayList<>();
    }

    // push 메서드: 스택에 요소를 추가
    public void push(T item) {
        stack.add(item);
    }

    // pop 메서드: 스택에서 요소를 제거하고 반환
    public T pop() {
        if (stack.isEmpty()) {
            return null;  // 스택이 비어 있을 경우 null 반환
        }
        return stack.remove(stack.size() - 1);  // 마지막 요소 제거 및 반환
    }

    // peek 메서드: 스택의 마지막 요소를 반환하되 제거하지 않음
    public T peek() {
        if (stack.isEmpty()) {
            return null;  // 스택이 비어 있을 경우 null 반환
        }
        return stack.get(stack.size() - 1);  // 마지막 요소 반환
    }

    // isEmpty 메서드: 스택이 비었는지 여부 확인
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // 전체 스택 리스트 반환
    public List<T> getList() {
        return stack;
    }
}
