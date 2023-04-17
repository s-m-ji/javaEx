package april0417;

public class Chatting {
	void startChat(String chatId) {
		String nickName = chatId;
		// final 특성을 갖기 때문에 값을 변경할 수 없으니,
		// 선언과 동시에 값을 넣어 생성한다.
		/*
		 * String nickName = null; nickName = chatId;
		 */	
	
		class Chat{
			public void start() {
				while(true) {
					String inputData = "안녕하모니카";
					String message = "["+ nickName +"]"+inputData;
					sendMessage(message);
				}
			}
		
		void sendMessage(String message) {
			
			}
		}
		
		Chat chat = new Chat();
		chat.start();
			
	}
}
