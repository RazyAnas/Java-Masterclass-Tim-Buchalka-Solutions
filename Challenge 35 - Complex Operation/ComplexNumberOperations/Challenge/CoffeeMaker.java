package ComplexNumberOperations.Challenge;

public class CoffeeMaker {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if (hasWorkToDo){
            System.out.println("Coffee brewing started...");
            hasWorkToDo = false;
        }

    }
}
