package Lesson5.Ex001Calc;
//1. Поправить View на абстрактный тип
//        2. Сделать в абстрактном View отдельный механизм считывания для каждого числа и печати числа
//        3.в соответствии с полученным View переписать текущий ConsoleView
//        4. Везде в проекте заменить конкретный View на абстрактный

//public class View {
//    Scanner in = new Scanner(System.in);
//
//    public int getValue(String title) {
////        List<Integer> ls = new ArrayList<>();
////        System.out.printf("%s", title);
////        int x = in.nextInt();
////        ls.add(x);
////        System.out.printf("%s", title);
////        int y = in.nextInt();
////        ls.add(y);
//        System.out.printf("%s", title);
//        return in.nextInt();
//
//    }
//
//    // print(f'{title} = {data}')
//    public void print(int data, String title) {
//        System.out.printf("%s %d\n", title, data);
//    }
//}


interface View {
    int getX();
    int getY();

   void print(String title, int data);
}