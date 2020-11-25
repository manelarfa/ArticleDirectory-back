package com.articledirectory.krafty.model;

public class Step {

    private String desc;
    private String imagePath;

    public Step(String desc, String imagePath) {
        this.desc = desc;
        this.imagePath = imagePath;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
