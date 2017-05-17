package ru.abdt.badoo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZombiesUnitTest {

    @Test
    public void emptyCity() throws Exception {
        String[] empty = {};
        int answer = Zombies.zombieCluster(empty);
        assertEquals(0, answer);
    }

    @Test
    public void singleZombie() throws Exception {
        String[] single = {"1"};
        int answer = Zombies.zombieCluster(single);
        assertEquals(1, answer);
    }

    @Test
    public void twoDiscreteZombies() throws Exception {
        String[] single = {"10", "01"};
        int answer = Zombies.zombieCluster(single);
        assertEquals(2, answer);
    }

    @Test
    public void twoFriendZombies() throws Exception {
        String[] single = {"11", "11"};
        int answer = Zombies.zombieCluster(single);
        assertEquals(1, answer);
    }

    @Test
    public void threeFriendZombies() throws Exception {
        String[] single = {"101", "010", "101"};
        int answer = Zombies.zombieCluster(single);
        assertEquals(2, answer);
    }

    @Test
    public void complexFriends() throws Exception {
        String[] single = {"1100", "1110", "0110", "0001"};
        int answer = Zombies.zombieCluster(single);
        assertEquals(2, answer);
    }

    @Test
    public void complex2Friends() throws Exception {
        String[] single = {"1111", "1111", "1111", "1111"};
        int answer = Zombies.zombieCluster(single);
        assertEquals(1, answer);
    }

    // Transitive friends in cluster, found case too late =(
    @Test
    public void transitiveFriends() throws Exception {
        String[] single = {"101", "011", "111"};
        int answer = Zombies.zombieCluster(single);
        assertEquals(1, answer);
    }
}