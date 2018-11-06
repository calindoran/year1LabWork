package workworkwork;

public class DVD {

	String Title;
	String Actor;
	String Genre;
	String Director;
	double Length;
	
public DVD(String Title,String Actor,String Genre,String Director,double Length){
	
	this.Title=Title;
	this.Actor=Actor;
	this.Genre=Genre;
	this.Director=Director;
	this.Length=Length;
}

@Override
public String toString(){
	
	return Title + Actor + Genre + Director + Length;
}

}