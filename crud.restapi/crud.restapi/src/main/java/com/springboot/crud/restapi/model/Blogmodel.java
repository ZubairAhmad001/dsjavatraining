package com.springboot.crud.restapi.model;

public class Blogmodel {

    int id ;
    String blogTitle ;

    public String getBlogDesc() {
        return blogDesc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getAuthorname() {
        return Authorname;
    }

    public void setAuthorname(String authorname) {
        Authorname = authorname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setBlogDesc(String blogDesc) {
        this.blogDesc = blogDesc;
    }

    String blogDesc ;
    String Authorname;
    String date ;

}
