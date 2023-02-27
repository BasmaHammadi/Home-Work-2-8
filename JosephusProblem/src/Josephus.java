
public class Josephus {

    public static <E> E JosephusWinner(CircularQueue<E> queue, int k)
     {
        if (queue.isEmpty())
         return null;

        while (queue.size() > 1) {
//            System.out.println(queue.toString());
            for (int i=0; i<k-1; i++)
            {
                queue.rotate();
//                System.out.println(queue.toString());
            }
            E e  = queue.dequeue();
            System.out.println(" " + e + " is out"); // the winner
        }
        return queue.dequeue();
    }



    public static <E> CircularQueue<E> buildQueue(E a[]) {
        CircularQueue<E> queue = new LinkedCircularQueue<>();
        for (int i = 0; i < a.length; i++)
            queue.enqueue(a[i]);

        return queue;
    }




    public static void main(String[] args) {
//        String[] a1 = {"Alice", "Bob", "Cindy", "Doug", "Ed", "Fred","kumar","shravan","selva"};
//        String[] a2 = {"Gene", "Hope", "Irene", "Jack", "Kim", "Lance"};
//        String[] a3 = {"Mike", "Roberto"};

        String[] a1 = {"A", "B", "C", "D", "E", "F","G","H","I"};
        String[] a2 = {"G", "H", "I", "J", "K", "L"};
        String[] a3 = {"M", "R"};


        System.out.println("First winner is " + JosephusWinner(buildQueue(a1), 3));
//        System.out.println("Second winner is " + JosephusWinner(buildQueue(a2), 10));
//        System.out.println("Third winner is " + JosephusWinner(buildQueue(a3), 7));
    }
}