package etc.api.collection.list;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // 추가
        list.add("홍길동");
        list.add("김철수");
        list.add("박영희");

        list.addFirst("맨앞");
        list.addLast("맨뒤");
        System.out.println(list);

        System.out.println(list.get(3));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.remove("맨앞");
        System.out.println(list);

        // LIFO -> last in, first out -> stack
        // push, pop, peek
        list.push("김춘식");
        System.out.println(list);

        System.out.println(list.pop());
        System.out.println(list);

        System.out.println(list.peek());
        System.out.println(list);


        // FIFO -> first in, first out -> Queue
        // offer, poll, peek
        list.offer("a");
        list.offer("b");
        list.offer("c");
        System.out.println(list);

        System.out.println(list.poll());
        System.out.println(list);

        System.out.println(list.peek());
        System.out.println(list);



    }

}
