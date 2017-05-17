package ru.abdt.badoo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.12.2016.
 */
public class Zombies {

    static int zombieCluster(String[] zombies) {
        SiattleZombies siattleZombies = new SiattleZombies();
        for (int i = 0; i < zombies.length; i++) {
            Cluster currentZombiesCluster = siattleZombies.findZombiesCluster(i);
            if (currentZombiesCluster == null) {
                currentZombiesCluster = new Cluster();
                siattleZombies.addCluster(currentZombiesCluster);
            }

            List<Integer> zombiesFriends = findZombiesFriends(i, zombies[i]);
            currentZombiesCluster.addAll(zombiesFriends);
        }

        // I made a logical mistake previously, so here will be a hack

        return siattleZombies.totalClustersNumber();
    }

    private static List<Integer> findZombiesFriends(int zombie, String zombieFriendshipLine) {
        List<Integer> friends = new ArrayList<>();
        for (int i = 0; i < zombieFriendshipLine.length(); i++) {
            if (zombieFriendshipLine.charAt(i) == '1') {
                friends.add(i);
            }
        }
        return friends;
    }

    static class SiattleZombies {

        private List<Cluster> clusters = new ArrayList<>();

        Cluster findZombiesCluster(int zombie) {
            for (Cluster cluster : clusters) {
                if (cluster.contains(zombie)) {
                    return cluster;
                }
            }
            return null;
        }

        public int totalClustersNumber() {
            return clusters.size();
        }

        public void addCluster(Cluster currentZombiesCluster) {
            clusters.add(currentZombiesCluster);
        }

        public List<Cluster> getClusters() {
            return clusters;
        }
    }

    static class Cluster {

        private Set<Integer> zombies = new HashSet<>();

        void addAll(int zombie) {
            zombies.add(zombie);
        }

        void addAll(Collection<Integer> newZombies) {
            zombies.addAll(newZombies);
        }

        boolean contains(int zombie) {
            return zombies.contains(zombie);
        }
    }
}
