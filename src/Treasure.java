public class Treasure {

    protected String name;  //name of the items
    protected  String description; // description of the treasure

    protected int value; //value of the treasure

    public Treasure(String name, String description, int value){ // constructor method to initialize an object, that takes in 3 arguments
        this.name = name;
        this.description = description;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getValue() {
        return value;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString() {
        return String.format("%s \n=====\n %s \nValue: %d \n", this.name, this.description, this.value);
    }


}
