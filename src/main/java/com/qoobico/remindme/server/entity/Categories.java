package com.qoobico.remindme.server.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")

public class Categories {

    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
    private List<Dish> dish;

    @ManyToOne
    @JoinColumn(name = "menu")
    private Menu menu;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "title_ru", nullable = false, length = 50)
    private String titleRu;

    @Column(name = "title_eng", nullable = false, length = 50)
    private String titleEng;

    @Column(name = "url", nullable = false, length = 150)
    private String url;

    @Column(name = "img_url", nullable = false, length = 150)
    private String imageUrl;

    @Column(name = "weight", nullable = false, length = 5)
    private int weight;

    @Column(name = "menu_id", nullable = false, length = 6)
    private int menuId;

    public List<Dish> getDishes() {
        return dish;
    }

    @JsonIgnore
    public Menu getMenu() {
        return menu;
    }

    public void setDish(List<Dish> dish) {
        this.dish = dish;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public Categories() {

    }

/*    @Override
    public String toString() {
        return "Menu{" +"id="+ id + ", name= " + name + '/' + "}";
    }*/
}
