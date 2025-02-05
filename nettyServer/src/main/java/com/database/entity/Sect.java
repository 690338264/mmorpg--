package com.database.entity;

import java.io.Serializable;

public class Sect implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sect.id
     *
     * @mbg.generated Sun Jul 26 21:12:57 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sect.name
     *
     * @mbg.generated Sun Jul 26 21:12:57 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sect.memnum
     *
     * @mbg.generated Sun Jul 26 21:12:57 CST 2020
     */
    private Integer memnum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sect.level
     *
     * @mbg.generated Sun Jul 26 21:12:57 CST 2020
     */
    private Integer level;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sect.fame
     *
     * @mbg.generated Sun Jul 26 21:12:57 CST 2020
     */
    private Long fame;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sect
     *
     * @mbg.generated Sun Jul 26 21:12:57 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sect.id
     *
     * @return the value of sect.id
     *
     * @mbg.generated Sun Jul 26 21:12:57 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sect.id
     *
     * @param id the value for sect.id
     *
     * @mbg.generated Sun Jul 26 21:12:57 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sect.name
     *
     * @return the value of sect.name
     *
     * @mbg.generated Sun Jul 26 21:12:57 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sect.name
     *
     * @param name the value for sect.name
     *
     * @mbg.generated Sun Jul 26 21:12:57 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sect.memnum
     *
     * @return the value of sect.memnum
     *
     * @mbg.generated Sun Jul 26 21:12:57 CST 2020
     */
    public Integer getMemnum() {
        return memnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sect.memnum
     *
     * @param memnum the value for sect.memnum
     *
     * @mbg.generated Sun Jul 26 21:12:57 CST 2020
     */
    public void setMemnum(Integer memnum) {
        this.memnum = memnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sect.level
     *
     * @return the value of sect.level
     *
     * @mbg.generated Sun Jul 26 21:12:57 CST 2020
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sect.level
     *
     * @param level the value for sect.level
     *
     * @mbg.generated Sun Jul 26 21:12:57 CST 2020
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sect.fame
     *
     * @return the value of sect.fame
     *
     * @mbg.generated Sun Jul 26 21:12:57 CST 2020
     */
    public Long getFame() {
        return fame;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sect.fame
     *
     * @param fame the value for sect.fame
     *
     * @mbg.generated Sun Jul 26 21:12:57 CST 2020
     */
    public void setFame(Long fame) {
        this.fame = fame;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sect
     *
     * @mbg.generated Sun Jul 26 21:12:57 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", memnum=").append(memnum);
        sb.append(", level=").append(level);
        sb.append(", fame=").append(fame);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}