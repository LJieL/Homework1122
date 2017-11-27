package StreamAndLambda;

public class Student {
	private int cardId;
	private String name;
	private int score;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int cardId, String name, int score) {
		super();
		this.cardId = cardId;
		this.name = name;
		this.score = score;
	}
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}
