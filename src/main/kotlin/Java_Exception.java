public class Java_Exception {

    public static void main(String[] args) {

        // Checked Exception은 try-catch 또는 throws가 필수
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            // 예외 처리
        }

    }
}
