package com.pinyougou.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "tb_brand")
public class TbBrand implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 品牌名称
     */
    private String name;

    /**
     * 品牌首字母
     */
    @Column(name = "first_char")
    private String firstChar;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取品牌名称
     *
     * @return name - 品牌名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置品牌名称
     *
     * @param name 品牌名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取品牌首字母
     *
     * @return first_char - 品牌首字母
     */
    public String getFirstChar() {
        return firstChar;
    }

    /**
     * 设置品牌首字母
     *
     * @param firstChar 品牌首字母
     */
    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", firstChar=").append(firstChar);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}