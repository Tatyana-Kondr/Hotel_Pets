package hotel.tests;

import hotel.dao.Hotel;
import hotel.dao.HotelImpl;
import hotel.model.Cat;
import hotel.model.Dog;
import hotel.model.Pets;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelImplTest {
    Hotel hotel;
    Pets[] p;

    @BeforeEach
    void setUp() {
        hotel = new HotelImpl(6);
        p = new Pets[]{
            new Dog(1,"pit bull", "Boss", 12.0, 2, 13.2, 5),
            new Cat(2, "pers", "Felix",10.0, 5,2, 3),
            new Dog(3,"terrier", "Lucky", 12.0, 7, 5.1, 3),
            new Cat(4,"sfinks", "Lea", 10.0, 3, 8, 3),
            new Cat(5, "pers", "Buts", 10.0, 2, 1, 2)
        };
        for (int i = 0; i < p.length; i++) {
            hotel.addPets(p[i]);
        }
    }
    @Test
    void findPetsTest(){
        assertEquals(p[2], hotel.findPets(3));
        assertNull(hotel.findPets(8));
    }

    @Test
    void addPetsTest(){
        hotel.printPets();
        assertFalse(hotel.addPets(null));
        assertFalse(hotel.addPets(p[1]));
        Pets p1 = new Dog(6, "dog", "Graf", 15.0, 4, 63.2, 6);
        assertTrue(hotel.addPets(p1));
        Pets p2 = new Dog(7, "dog", "Graf", 15.0, 4, 63.2, 6);
        assertFalse(hotel.addPets(p2));
        System.out.println("..............................................");
        hotel.printPets();
    }
    @Test
    void  removePetsTest(){
        assertEquals(p[1], hotel.removePets(2));
        assertEquals(4, hotel.quantity());
        assertNull(hotel.removePets(2));
        assertNull(hotel.findPets(2));
        hotel.printPets();
    }
    @Test
    void quantity(){
        assertEquals(5, hotel.quantity());
    }
    @Test
    void findBreedTest(){
        assertEquals(p[1], hotel.findBreed("pers"));
        assertNull(hotel.findBreed("mops"));
    }
    @Test
    void receiptsTest(){
        assertEquals(225.83, hotel.receipts(), 0.01);
    }
    @Test
    void printPetsTest(){
        hotel.printPets();
    }

}