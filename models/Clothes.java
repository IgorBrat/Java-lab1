package ua.iot.java.labs.second.models;

public class Clothes extends Good{
	private String type;
	private String size;
	private String material;
	private Season season;
	private String pattern;
	public Clothes(String name, float priceInUAH, Gender forGender, boolean isDiscounted, long id, String origin,
			String type, String size, String material, Season season, String pattern) {
		super(name, priceInUAH, forGender, isDiscounted, id, origin);
		this.type = type;
		this.size = size;
		this.material = material;
		this.season = season;
		this.pattern = pattern;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public Season getSeason() {
		return season;
	}
	public void setSeason(Season season) {
		this.season = season;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
}
