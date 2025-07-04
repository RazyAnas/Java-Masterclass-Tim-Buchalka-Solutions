public class Person {
    // three instance variables required in question are firstName, lastName and age
    private String firstName;
    private String lastName;
    private int age;

    // getter and setter for each instance variables
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100){
            this.age = 0;
        } else{
            this.age = age;
        }
    }

    // other instance methods required in question
    public boolean isTeen(){
        if (getAge() > 12 && getAge() < 20){
            return true;
        } else {
            return false;
        }
    }
    public String getFullName(){
        if (getFirstName().isEmpty() && getLastName().isEmpty()){
            return "";
        } else if (getFirstName().isEmpty()){
            return getLastName();
        } else if (getLastName().isEmpty()){
            return getFirstName();
        } else {
            return getFirstName() + " " + getLastName();
        }
    }


}
