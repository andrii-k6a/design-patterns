package org.kook.design.patterns.proxy.dynamic;

public class DefaultPerson implements Person {

    private String name;
    private int rating;
    private int ratingCount;

    public DefaultPerson(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getRating() {
        return rating == 0 ? 0 : rating / ratingCount;
    }

    @Override
    public void updateRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }

}
