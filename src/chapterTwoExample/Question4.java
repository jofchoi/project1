package chapterTwoExample;

public class Question4 {
	public String name;
	public String grade;
	
	public Question4(String name) {
		this.name = name;
	}
}

public class Engineer extends Question4{
	private String skillset;
	public String getSkillSet() {
		return skillset;
	}
	public void setSkillSet(String skillset) {
		this.skillset = skillset;
	}
}