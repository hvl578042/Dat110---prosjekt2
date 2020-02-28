package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

	private String topic;

	public UnsubscribeMsg(String topic, String user) {
		super(MessageType.UNSUBSCRIBE, user);
		this.topic = topic;

	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "UnsubscribeMsg [topic=" + topic + "]";
	}

}
