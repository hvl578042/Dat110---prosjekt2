package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {

	private String topic;

	public DeleteTopicMsg(String topic, String user) {
		super(MessageType.DELETETOPIC, user);
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
		return "DeleteTopicMsg [topic=" + topic + "]";
	}

}
