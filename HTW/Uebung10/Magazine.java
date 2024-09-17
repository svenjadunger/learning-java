package Uebung10;

public class Magazine extends Medium{
    private int issue;
    private String month;


    public Magazine(String title, int year, int issue, String month){
        super(title,year);
        this.issue = issue;
        this.month = month;
    }
        @Override
public void printInfo(){
   super.printInfo();
    System.out.println("Issue: " + this.issue);
    System.out.println("Month: " + this.month);


    }
}
