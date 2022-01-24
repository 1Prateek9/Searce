import java.util.*;

public class LinkedL{
    public static void main(String[] args)
    {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        iterateUsingForLoop(linkedList);
    }

    public static void
    iterateUsingForLoop(LinkedList<Integer> linkedList)
    {


        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i) + " ");
        }
    }
}
