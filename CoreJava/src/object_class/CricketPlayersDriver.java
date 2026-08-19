package object_class;
import java.util.Objects;
class CricketPlayers{
	String firstName="Hujaifa";
	String lastName = "Majeed";
	
	
	String name=firstName+" "+lastName;
	int jerseyNo;
	int highestScore;
	int totalRuns;
	CricketPlayers(String name,int jerseyNo,int highestScore, int totalRuns){
		this.name=name;
		this.jerseyNo=jerseyNo;
		this.highestScore=highestScore;
		this.totalRuns=totalRuns;
	}
	@Override
	public String toString(){
		return "Player Name :- "+name+"\nJersey No.:- "+jerseyNo+"\nHighest Score :- "+highestScore+"\nTotal Runs :- "+totalRuns;
	}
	@Override
	public boolean equals(Object o) {
		CricketPlayers cp = (CricketPlayers)o;
		return this.name == cp.name && this.jerseyNo == cp.jerseyNo && this.highestScore==cp.highestScore && this.totalRuns == cp.totalRuns;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,jerseyNo,highestScore,totalRuns);
	}
}
public class CricketPlayersDriver {
	public static void main(String[] args) {
		CricketPlayers cp1 = new CricketPlayers("Virat Kohli", 18 , 183 , 28215);
		CricketPlayers cp2 = new CricketPlayers("Virat Kohli", 18 , 254 , 28215);
		CricketPlayers cp3 = new CricketPlayers("Rohit Sharma", 45 , 264 , 20252);
		System.out.println(cp1);
		System.out.println(cp3);
		System.out.println(cp2);
		System.out.println(cp1.equals(cp2));
		System.out.println(cp2.equals(cp3));
		System.out.println(cp1.hashCode());
		System.out.println(cp2.hashCode());
		System.out.println(cp3.hashCode());
	}
}
