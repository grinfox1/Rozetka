package api.model.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResultItem {

    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("section")
    private String section;
    @SerializedName("description")
    private String description;
    @SerializedName("color")
    private String color;
    @SerializedName("size")
    private String size;
    @SerializedName("price")
    private Integer price;
    @SerializedName("params")
    private String params;
    @SerializedName("photo")
    private String photo;
    @SerializedName("photos")
    private List<String> photos = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

}
