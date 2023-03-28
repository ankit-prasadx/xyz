import java.util.LinkedList;

class Program492
{
    public static void main(String arg[])
    {
        LinkedList <Integer> obj = new LinkedList();

        obj.add(11);
        obj.addLast(897);
        obj.add(21);
        obj.add(51);

        obj.remove();
        obj.removeFirst();

        System.out.println("Data is : "+obj);

        for(int no : obj)
        {
            System.out.println(no);
        }

    }
}
