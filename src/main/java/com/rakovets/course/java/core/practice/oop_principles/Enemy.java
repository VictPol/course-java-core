package com.rakovets.course.java.core.practice.oop_principles;

public class Enemy implements Mortal {
    private int health;

    Enemy(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public void setHealth (int health) {
        this.health = health;
    }

    public int getHealth () {
        return health;
    }

    public boolean isAlive() {
        return (health > 0);
    }

    public void attackHeroes(Hero hero) {
        hero.takeDamage(10);
    }
}
