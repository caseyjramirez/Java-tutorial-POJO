public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            RecordStudent s = new RecordStudent(
                    "0000" + i,
                    "casey",
                    "05/02/1998",
                    new String[]{"Java", "C#"}
            );
//            s.printClassList();
            System.out.println(s);
            System.out.println(s.id());
//            System.out.println(s.toString());
        }

    }
}