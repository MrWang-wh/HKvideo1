package com.javen.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("danmu")
public class Danmu extends Model<Danmu> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "danmu_id", type = IdType.AUTO)
    private Integer danmuId;

    private Integer videoId;

    private String time;

    private String content;

    private String size;

    private String color;

    private String border;


    public Integer getDanmuId() {
        return danmuId;
    }

    public void setDanmuId(Integer danmuId) {
        this.danmuId = danmuId;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    @Override
    protected Serializable pkVal() {
        return this.danmuId;
    }

    @Override
    public String toString() {
        return "Danmu{" +
        "danmuId=" + danmuId +
        ", videoId=" + videoId +
        ", time=" + time +
        ", content=" + content +
        ", size=" + size +
        ", color=" + color +
        ", border=" + border +
        "}";
    }
}
