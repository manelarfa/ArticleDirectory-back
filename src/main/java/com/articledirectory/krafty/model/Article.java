package com.articledirectory.krafty.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Article {

    @Id
    private String Id;
    private String name;
    private String description;
    private String category;
    private String imagePath;
    private String author;
    private String aboutauthor;
    private String date;
    private String tip;
    private Thing[] things;
    private Step[] steps;

    public Article(String name, String description, String category, String imagePath, String author, String aboutauthor,
                   String date, String tip, Thing[] things, Step[] steps) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.imagePath = imagePath;
        this.author = author;
        this.aboutauthor = aboutauthor;
        this.date = date;
        this.tip = tip;
        this.things = things;
        this.steps = steps;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAboutauthor() {
        return aboutauthor;
    }

    public void setAboutauthor(String aboutauthor) {
        this.aboutauthor = aboutauthor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public Thing[] getThings() {
        return things;
    }

    public void setThings(Thing[] things) {
        this.things = things;
    }

    public Step[] getSteps() {
        return steps;
    }

    public void setSteps(Step[] steps) {
        this.steps = steps;
    }
}
