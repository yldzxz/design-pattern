/**
 * Created by hkz on  2018/6/11 0011 .
 */
public class App {
    public static void main(String[] args) {
        System.out.println("学生1");
        TestPaper a = new TestPaperA();
        a.TestQuetion1();
        a.TestQuetion2();
        a.TestQuetion3();

        System.out.println("学生2");
        TestPaper b = new TestPaperB();
        b.TestQuetion1();
        b.TestQuetion2();
        b.TestQuetion3();

    }
}
