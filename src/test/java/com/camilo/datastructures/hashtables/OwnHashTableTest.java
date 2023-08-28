package com.camilo.datastructures.hashtables;

import com.camilo.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OwnHashTableTest {

    private OwnHashTable<String, User> hashTable;

    @BeforeEach
    public void setup() {
        hashTable = new OwnHashTable<>();
    }

    private void setupMultipleUsers() {
        User user1 = User.builder()
                .id("1").username("goku777").password("1234")
                .age(13).build();

        User user2 = User.builder()
                .id("2").username("kiraGOD").password("1234")
                .age(90).build();

        User user3 = User.builder()
                .id("3").username("xxXKillerPro79Xxx").password("1234")
                .age(1).build();

        User user4 = User.builder()
                .id("4").username("hOly_Sa74n").password("1234")
                .age(666).build();

        User user5 = User.builder()
                .id("5").username("Master_Gamer999").password("1234")
                .age(0).build();

        hashTable.put(user1.getId(), user1);
        hashTable.put(user2.getId(), user2);
        hashTable.put(user3.getId(), user3);
        hashTable.put(user4.getId(), user4);
        hashTable.put(user5.getId(), user5);
    }

    @Test
    public void givenUserIDAndUser_whenPut_thenItStoresTheKeyValuePair() {
        User user = User.builder()
                .id("1").username("goku777").password("1234")
                .age(13).build();

        assertNotNull(hashTable.put(user.getId(), user));
    }

    @Test
    public void givenUserIDAndUserStored_whenGet_thenItReturnsTheUser() {
        User user = User.builder()
                .id("2").username("kiraGOD").password("1234")
                .age(90).build();

        hashTable.put(user.getId(), user);

        User retrievedUser = hashTable.get(user.getId());
        assertNotNull(hashTable.get(retrievedUser.getId()));
        assertEquals("2", retrievedUser.getId());
        assertEquals("kiraGOD", retrievedUser.getUsername());
        assertEquals("1234", retrievedUser.getPassword());
    }

    @Test
    public void givenMultipleUsers_whenPut_thenItTheyAreStored() {
        setupMultipleUsers();

        User retrievedUser = hashTable.get("1");
        assertNotNull(retrievedUser);
        assertNotNull(hashTable.get(retrievedUser.getId()));
        assertEquals("1", retrievedUser.getId());
        assertEquals("goku777", retrievedUser.getUsername());
        assertEquals("1234", retrievedUser.getPassword());

        retrievedUser = hashTable.get("2");
        assertNotNull(retrievedUser);
        assertNotNull(hashTable.get(retrievedUser.getId()));
        assertEquals("2", retrievedUser.getId());
        assertEquals("kiraGOD", retrievedUser.getUsername());
        assertEquals("1234", retrievedUser.getPassword());

        retrievedUser = hashTable.get("3");
        assertNotNull(retrievedUser);
        assertNotNull(hashTable.get(retrievedUser.getId()));
        assertEquals("3", retrievedUser.getId());
        assertEquals("xxXKillerPro79Xxx", retrievedUser.getUsername());
        assertEquals("1234", retrievedUser.getPassword());

        retrievedUser = hashTable.get("4");
        assertNotNull(retrievedUser);
        assertNotNull(hashTable.get(retrievedUser.getId()));
        assertEquals("4", retrievedUser.getId());
        assertEquals("hOly_Sa74n", retrievedUser.getUsername());
        assertEquals("1234", retrievedUser.getPassword());

        retrievedUser = hashTable.get("5");
        assertNotNull(retrievedUser);
        assertNotNull(hashTable.get(retrievedUser.getId()));
        assertEquals("5", retrievedUser.getId());
        assertEquals("Master_Gamer999", retrievedUser.getUsername());
        assertEquals("1234", retrievedUser.getPassword());
    }

    @Test
    public void givenMultipleUSer_whenGiveKeys_thenItReturnsListWithKeys() {
        setupMultipleUsers();

        List<String> keys = hashTable.getKeys();

        assertFalse(keys.isEmpty());
        assertEquals(5, keys.size());
    }

}
