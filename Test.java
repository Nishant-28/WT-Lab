// wap to use final keyword with variable and method and class and try to change the value of final variable and method and class

class Test1
{
    final int a = 10;
    final void show()
    {
        System.out.println("Hello 1");
    }
    
}

class Test2 extends Test
{
    void show()
    {
        System.out.println("Hello 2");
    }
}

class Test
{ 
    public static void main(String[] args)
    {
        Test2 t = new Test2();
        // call base class method
        t.show();
    }
}