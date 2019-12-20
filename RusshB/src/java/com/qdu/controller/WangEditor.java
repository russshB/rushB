/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qdu.controller;

/**
 *
 * @author Administrator
 */
public class WangEditor {
    private Integer errno; //错误代码, 0标识没有错误
    private String[] data; //已上传到图片路径

    public Integer getErrno() {
        return errno;
    }

    public void setErrno(Integer errno) {
        this.errno = errno;
    }

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }
    
}
