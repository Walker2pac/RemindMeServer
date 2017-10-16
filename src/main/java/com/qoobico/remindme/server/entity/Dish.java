package com.qoobico.remindme.server.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "dish")

public class Dish {

    @ManyToOne
    @JoinColumn(name = "category")
    private Categories category;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private long id;

    @Column(name = "title_ru", nullable = false, length = 50)
    private String titleRu;

    @Column(name = "title_eng", nullable = false, length = 50)
    private String titleEng;

    @Column(name = "description_ru", nullable = false, length = 500)
    private String descriptionRu;

    @Column(name = "description_eng", nullable = false, length = 500)
    private String descriptionEng;

    @Column(name = "url", nullable = false, length = 150)
    private String url;

    @Column(name = "img_url", nullable = false, length = 150)
    private String imgUrl;

    @Column(name = "weight", nullable = false, length = 5)
    private int weight;

    @Column(name = "status", nullable = false, length = 2)
    private int status;

    @Column(name = "category_id", nullable = false, length = 4)
    private int categoryId;

    @JsonIgnore
    public Categories getDishCategory() {
        return category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitleRu() {
        return titleRu;
    }

    public void setTitleRu(String titleRu) {
        this.titleRu = titleRu;
    }

    public String getTitleEng() {
        return titleEng;
    }

    public void setTitleEng(String titleEng) {
        this.titleEng = titleEng;
    }

    public String getDescriptionRu() {
        return descriptionRu;
    }

    public void setDescriptionRu(String descriptionRu) {
        this.descriptionRu = descriptionRu;
    }

    public String getDescriptionEng() {
        return descriptionEng;
    }

    public void setDescriptionEng(String descriptionEng) {
        this.descriptionEng = descriptionEng;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public Dish() {

    }

}
