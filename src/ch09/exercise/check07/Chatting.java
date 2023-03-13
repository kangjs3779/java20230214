package ch09.exercise.check07;

public class Chatting {
	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}
	
	void startChat(String chatId) {
		String nickName = null;
		nickName = chatId;
		
		//익명개체 생성
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					//값을 한번밖에 할당 받지 못하는 final인데 null이었던 것을 파라미터 값으로 다시 받았기 때문에
					sendMessage(message);
				}
			}
		};
		
		chat.start();
	}
}


//컴파일 에러가 발생하는 이유