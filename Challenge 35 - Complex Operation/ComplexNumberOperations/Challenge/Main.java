package ComplexNumberOperations.Challenge;

public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getBrewMaster().setHasWorkToDo(true);
//        kitchen.getDishWasher().doDishes();
//        kitchen.getBrewMaster().brewCoffee();
//        kitchen.getIceBox().orderFood();

        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();
    }
}
