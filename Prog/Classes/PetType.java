package Classes;

public enum PetType {
    
    Cat,
    Dog,
    Hamster;

    public static PetType getType (int typeId){
        switch (typeId){
            case 1:
                return PetType.Cat;
            case 2:
                return PetType.Dog;
            case 3:
                return PetType.Hamster;
            default:
                return null;
        }
    }

    public static int getTypeId(PetType type){
        switch (type){
            case Cat:
                return 1;
            case Dog:
                return 2;
            case Hamster:
                return 3;
            default:
                return -1;
        }
    }
}
