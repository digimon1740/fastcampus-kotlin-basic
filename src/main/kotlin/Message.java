class Message {

	public void greeting(String message) {
		if (message == null || message.length() == 0) {
			System.out.println("안녕하세요!!");
			return;
		}
		System.out.println(message);
	}

	public static void main(String[] args) {
		new Message().greeting(null);

		new Message().greeting("Hello, World");
	}
}