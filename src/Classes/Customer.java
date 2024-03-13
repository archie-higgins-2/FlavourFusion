package Classes;

public class Customer {

    private String name;

    public Customer(String name){
        this.setName(name);
    }

    public String LeaveFeedback(){
        return "it was good";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
