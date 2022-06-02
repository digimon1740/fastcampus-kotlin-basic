public class Java_If {

    public static void main(String[] args) {
        int age = 18;

        //자바의 if...else는 구문이므로 값을 반환할 수 없다
        String str = "";
        if (age > 18) {
            str = "성인";
        } else {
            str = "아이";
        }

        System.out.println(str);

    }
}
