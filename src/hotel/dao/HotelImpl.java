package hotel.dao;

import hotel.model.Pets;

public class HotelImpl implements Hotel{
    private Pets[] pets;
    private int size;
    public HotelImpl(int capacity){
        pets = new Pets[capacity];
    }

    @Override
    public Pets findPets(int id) {
        for (int i = 0; i < size; i++) {
            if(pets[i].getId() == id){
                return pets[i];
            }
        }
        return null;
    }

    @Override
    public boolean addPets(Pets pet) {
        // не добавляем null, не превышаем capacity, не добавляем уже существующего
        if(pet == null || size == pets.length || findPets(pet.getId()) != null){
            return false;
        }
        pets[size++] = pet;
        return true;
    }

    @Override
    public Pets removePets(int id) {
        for (int i = 0; i < size; i++) {
            if(pets[i].getId() == id){
                Pets victim = pets[i];
                pets[i] = pets[--size];
                pets[size] = null;
                return victim;
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public Pets findBreed(String breed) {
        for (int i = 0; i < size; i++) {
            if(pets[i].getBreed().equals(breed)){
               return pets[i];
            }
        }
        return null;
    }

    @Override
    public double receipts() {
        double res = 0;
        for (int i = 0; i < size; i++) {
            res += pets[i].costOfService();
        }
        return res;
    }

    @Override
    public void printPets() {
        for (int i = 0; i < size; i++) {
            System.out.println(pets[i]);
        }
    }
}
