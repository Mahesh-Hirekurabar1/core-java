public class Building {
    public static void main(String[] args) {
        Rooms rooms = new Rooms();

        int staticVar1 = rooms.getStaticVariable1();
        String staticVar2 = rooms.getStaticVariable2();
        int nonStaticVar1 = rooms.getNonStaticVariable1();
        String nonStaticVar2 = rooms.getNonStaticVariable2();
        nameOfBuilding enumVar = rooms.getEnumVariable();

        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);
        System.out.println("Non-Static Variable 1: " + nonStaticVar1);
        System.out.println("Non-Static Variable 2: " + nonStaticVar2);
        System.out.println("Enum Variable: " + enumVar);
		
		System.out.println("....................................................");
		System.out.println("Printing enum value");
      
        System.out.println("Enum Values:");
        for (nameOfBuilding building : nameOfBuilding.values()) {
            System.out.println(building.name() + ": " + building.getDescription());
        }
    }
}

class Rooms {
    static int staticVariable1;
    static String staticVariable2;
    int nonStaticVariable1;
    String nonStaticVariable2;
    nameOfBuilding enumVariable;

    public static int getStaticVariable1() {
        return staticVariable1;
    }

    public static String getStaticVariable2() {
        return staticVariable2;
    }

    public int getNonStaticVariable1() {
        return nonStaticVariable1;
    }

    public String getNonStaticVariable2() {
        return nonStaticVariable2;
    }

    public nameOfBuilding getEnumVariable() {
        return enumVariable;
    }
}

enum nameOfBuilding {
    VENKATESH("PG for boys"),
    SREE("Nivas"),
    MAHESH("Sweet Home");

		String description;

     nameOfBuilding(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
