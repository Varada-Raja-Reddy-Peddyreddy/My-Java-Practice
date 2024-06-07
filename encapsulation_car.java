public class encapsulation_car{
    private String name;
    private String company;
    private int year;

    encapsulation_car(String name,String company, int year){
        this.name = name;
        this.company= company;
        this.year = year;

    }
    public String getname(){
        return name;
    }
    public String getcompany(){
        return company;
    }

    public int getyear(){
        return year;
    }


}