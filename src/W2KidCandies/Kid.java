package W2KidCandies;

import java.util.ArrayList;
import java.util.List;

public class Kid {

    private String name;
    private Integer numberOfCandies;
    private List<String> namesOfCandies ;
    private List<Integer> numbersOfCandies = new ArrayList<>();
    private String address;
    private Boolean stamped = false;

    public Kid(String name, Integer numberOfCandies, List<String> namesOfCandies,List<Integer>numbersOfCandies) {
        this.name = name;
        this.numberOfCandies = numberOfCandies;
        this.namesOfCandies = namesOfCandies;
        this.numbersOfCandies = numbersOfCandies;
        this.address=address;
    }
    public void stamp() {
        stamped = true;

    }

    public String getName(){
        return name;
    }
    public Integer getNumberOfCandies() {
        return numberOfCandies;
    }
    public List<String> getNamesOfCandies() { return namesOfCandies; }
    public List<Integer> getNumbersOfCandies() { return numbersOfCandies; }
    public String getAddress() { return address;}
    public Boolean isStamped() { return stamped; }


    }



