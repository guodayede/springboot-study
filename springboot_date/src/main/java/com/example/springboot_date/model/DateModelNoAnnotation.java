package com.example.springboot_date.model;

import java.util.Date;

/**
 * @author gyc
 * @title: DateModel
 * @projectName test
 * @date 2019/8/2811:08
 * @description: TODO
 */
public class DateModelNoAnnotation {
    private Integer id;

//    @JsonFormat(timezone = "GMT+8",pattern = "yyyy/MM/dd HH:mm:ss")
    private Date receiveDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    @Override
    public String toString() {
        return "DateModel{" +
                "id=" + id +
                ", receiveDate=" + receiveDate +
                '}';
    }
}