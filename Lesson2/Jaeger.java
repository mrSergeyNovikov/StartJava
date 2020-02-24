public class Jaeger {

	private String modelName;
	private String mark;
	private String status;
	private String os;
	private float height;
	private float weight;
	private int speed;
	private int strange;
	private int armor;

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getStrange() {
		return strange;
	}

	public void setStrange(int strange) {
		this.strange = strange;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public void move() {
		System.out.println("Егерь двигается...");
	}

	public boolean drift() {
		System.out.println("Дрифт...");
		return true;
	}

	public String scanKaiju() {
		int typeKiaju =2;
		String result = "";
		if(typeKiaju == 1) {
			result = "Kaiju 1 уровня";
		}
		else if (typeKiaju == 2) {
			result = "Kaiju 2 уровня";
		}
		System.out.println(result);
		return result;
	}

	public void dodge() {
		System.out.println("Егерь уколняется...");
	}

}