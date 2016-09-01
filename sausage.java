public class sausage{
	private String Name;
	private int length;
	private String Color;
	public sausage(){
		Name = "Sausage";
		length = 10;
		Color = "Red";
	}
	public String getName(){
		return this.Name;
	}
	public int getLength(){
		return this.length;
	}
	public String getColor(){
		return this.Color;
	}
	public void setName(String Name){
		this.Name = Name;
	}
	public void setLength(int x){
		this.length = x;
	}
	public void setColor(String Color){
		this.Color = Color;
	}

}
