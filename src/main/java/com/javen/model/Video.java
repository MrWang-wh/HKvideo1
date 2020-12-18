package com.javen.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Wanghan
 * @since 2020-12-18
 */
@Data
@Component
@TableName("video")
public class Video extends Model<Video> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "video_id", type = IdType.AUTO)
    private Integer videoId;

    private Integer userId;

    private String faceUrl;

    private String description;

    private LocalDate uploadTime;

    private String url;

    private Integer star;

    private String type;

    private Integer status;


    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(LocalDate uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    protected Serializable pkVal() {
        return this.videoId;
    }

    @Override
    public String toString() {
        return "Video{" +
        "videoId=" + videoId +
        ", userId=" + userId +
        ", faceUrl=" + faceUrl +
        ", description=" + description +
        ", uploadTime=" + uploadTime +
        ", url=" + url +
        ", star=" + star +
        ", type=" + type +
        ", status=" + status +
        "}";
    }
}
