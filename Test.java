// What is the correct output of the following program? 
class Test {
    static int x = 2;

    public static void main(String[] args) {
        Test objl = new Test();
        Test obj2 = new Test();
        obj1.x = 5;
        obj2.x = 10;
        System.out.println(obj1.x + obj2.x + Test.x);
    }
}

// A. 17
// B. 0
// C. 30
// D. 6

// Answer: C