package http://192.168.2.99:8008/albums.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class albums {
    @SerializedName("userId")
    private Integer userId;
    @SerializedName("id")
    private Integer id;
    @SerializedName("title")
    private String title;

    public PhotoData(Integer albumId, Integer id, String title, String url, String thumbnailUrl) {
        this.userId = userId;
        this.id = id;
        this.title = title;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }
}