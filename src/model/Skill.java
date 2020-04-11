package model;
public class Skill
{
	private Long SkillId;
	private String SkillName;
	public Skill(Long skillId, String skillName) {
		super();
		SkillId = skillId;
		SkillName = skillName;
	}
	public Skill() {
		// TODO Auto-generated constructor stub
	}
	public Long getSkillId() {
		return SkillId;
	}
	public void setSkillId(Long skillId) {
		SkillId = skillId;
	}
	public String getSkillName() {
		return SkillName;
	}
	public void setSkillName(String skillName) {
		SkillName = skillName;
	}
	
}
