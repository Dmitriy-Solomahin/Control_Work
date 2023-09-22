package Classes;

import java.time.LocalDate;

public abstract class Creator {

    protected abstract Pet createNewPet(PetType type);

    public Pet createPet(PetType type, String name, LocalDate date) {

        Pet pet = createNewPet(type);
        pet.setPetType(type);
        pet.setName(name);
        pet.setBirthday(date);
        return pet;
    }

}
