class Main {
    public static void main(String[] args)
    {
        int a= 10;
        int b= 5;
        int sum= a+b;
        int diff= a-b;
        System.out.println("Addition:"+sum);
        System.out.println("Difference:"+diff);
        System.out.println("Multiplication:"+(a*b));
        System.out.println("Division:"+(a/b));
        System.out.println("Modulo:"+(a%b));
        System.out.println("Hi");
        System.out.print("Hello");
        System.out.println("Hello world");
        System.out.println("a<b"+(a<b));
        System.out.println("a>b"+(a>b));
        System.out.println("a==b"+(a==b));
        System.out.println("a!=b"+(a!=b)); 
        //Types of operators
        System.out.println("Unary operators"+a++);
        System.out.println("Unary operators"+a--);
        //tenary operators    
        int result=(a<b)?a:b; 
        System.out.println("a<b"+ result); 
}
}