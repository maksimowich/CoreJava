package corejava.chapter2.lab3;

public class Lab3 {
    //1. Можно, реализация Builder;
    //2. Можно, но есть ли в этом смысл? Вернуть переменную на прямую не получится, только вывести, например. Или же вернуть ее через динамически созданный объект;

    public static void main(String[] args) {
        Foo1 foo1 = new Foo1(0);
        //1
        Foo foo = new Foo()
                .setNumber1(1)
                .setNumber2(2)
                .setNumber3(3);

        foo.getGreeting();
        foo.getNumber1InInteger(foo1);
        System.out.println(foo1.getNumber1());
    }
}
