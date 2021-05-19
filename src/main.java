public class main {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(0, 5);
        myList.add(1, 6);
        myList.add(2, 2);
        myList.remove(1);
        myList.size();
        myList.print();
        myList.clone();
        Object[] element2 = (Object[]) myList.clone();
        for (int i = 0; i < element2.length; i++) {
            System.out.println(element2[i]);
        }
    }
}
