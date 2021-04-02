package com.anni.shareimage;

public class Data {

    public Data(String name, String title, String decription) {
        this.name = name;
        this.title = title;
        this.decription = decription;
        this.expandable=false;
    }

    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }

    String name;

    public Data() {
    }

    String title;
    String decription;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    private boolean expandable;

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }
    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", decription='" + decription + '\'' +
                '}';
    }

}
