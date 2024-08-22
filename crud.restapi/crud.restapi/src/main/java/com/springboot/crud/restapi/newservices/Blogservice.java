package com.springboot.crud.restapi.newservices;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.springboot.crud.restapi.model.Blogmodel;
import org.springframework.stereotype.Component;

@Component
public class Blogservice {
    //add blog
    //get blog
    //delete blog
    //update blog
    //get all blog

    // to string the multiple blog using list
    List<Blogmodel> blogModelList = new CopyOnWriteArrayList<Blogmodel>();

    //take the first blog id
    int blogID = 1;

    //add the blog using model
    public Blogmodel addblog(Blogmodel blogmodel) {
        blogmodel.setId(blogID);
        blogModelList.add(blogmodel);
        blogID++;
        return blogmodel;
    }

//    public Blogmodel blogModel = new Blogmodel();
//        blogModel.setId(blogID);
//        blogModel.setlogTitle("Wasif's Blog");
//        blogModel.setAuthorname("Wasif");
//        blogModel.setBlogDesc("This is my first lbog using SpringBoot CRUD API");
//        blogModel.setDate("22 Aug 2024");

    // to fetch the all blogs


    public List<Blogmodel> getBlogModelList() {
        return blogModelList;
    }

    //to fetch the perticular blog
    public Blogmodel getBlogModelById(int id) {
        return blogModelList.stream().filter(bm -> bm.getId() == id).findFirst().get();

    }


        public void deleteBlog(int blogId)
        {
            blogModelList.stream()
                    .forEach(t -> {
                        if (t.getId() == blogId) {
                            blogModelList.remove(t);
                        }

                    });
        }


        //to update the blog
        public Blogmodel updateBlog(int blogId, Blogmodel blogModel)
        {
            getBlogModelList().stream().forEach(t -> {
                if (t.getId() == blogId){
                    t.setBlogTitle(blogModel.getBlogTitle());
                    t.setBlogDesc(blogModel.getBlogDesc());
                    t.setAuthorname(blogModel.getAuthorname());
                    t.setDate(blogModel.getDate());
                }
            });

            return blogModelList.stream()
                    .filter(t -> t.getId() == blogId)
                    .findFirst().get();
}
}





