package hotel.dao;

import hotel.model.Pets;

public interface Hotel {
    // объявляем методы
    Pets findPets(int id);
    boolean addPets(Pets pet);
    Pets removePets(int id);
    int quantity();
    Pets findBreed(String breed);
    double receipts();
    void printPets();

}
