package Uebung10;

public class Medium {
    private String title;
    private int year;
    private static int totalMedia = 0;



public Medium(String title, int year){
this.title = title;
this.year = year;
totalMedia++;
}

public void printInfo(){
    System.out.println("Title: " + this.title);
    System.out.println("Year: " + this.year);
}

public String getTitle(){
    return this.title;
}
public int getYear(){
return this.year;
}

public static int getTotalMedia(){
    return totalMedia;
}

}
