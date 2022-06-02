public class Java_Switch {

    public static void main(String[] args) {
        int day = 2;
        String result = "";
        switch (day) {
            case 1:
                result = "월요일";
                break;
            case 2:
                result = "화요일";
            case 3:
                result = "수요일";
                break;
            case 4:
                result = "목요일";
                break;
            case 5:
                result = "금요일";
                break;
            case 6:
                result = "토요일";
                break;
            case 7:
                result = "일요일";
                break;
            default:
                result = "에러";
                break;
        }

        System.out.println(result);
    }
}
