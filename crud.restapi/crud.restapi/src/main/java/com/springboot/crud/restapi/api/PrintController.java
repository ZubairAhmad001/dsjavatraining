package com.springboot.crud.restapi.api;

import com.springboot.crud.restapi.model.Blogmodel;
import com.springboot.crud.restapi.newservices.Blogservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PrintController {

    //create api using endpoint
//    @GetMapping(value = "/print")
//    public String print() {
//        StringBuilder html = new StringBuilder();
//        html.append("<html>");
//        html.append("<head><title>Example</title></head>");
//        html.append("<body>");
//        html.append("<h1>SpringBoot</h1><br>");
//        html.append("<p>Worker</p>");
//        html.append("</body>");
//        html.append("</html>");
//        return html.toString();
//    }
//
//    // create blog api using endpoint
//    @GetMapping("/blog")
//    public String blog() {
//        int id = 1;
//        String blogTitle = "Spring Boot";
//        String blogDesc = "Spring Boot";
//        String Authorname = "Zubair";
//        String date = " 22 aug 2024";

//        return id + "<br>" + blogTitle + "<br>" + blogDesc + "<br>" + Authorname + "<br>";

        @Autowired
        private Blogservice blogService;

        @PostMapping(value = "/addblog")
        public Blogmodel addBlog(@RequestBody Blogmodel blogmodel){
            return blogService.addblog(blogmodel);

        }

        @GetMapping(value = "/getAllblog")
        //to get particular blog
        public Blogmodel getBlog(@PathVariable("blogId") int blogId) {
                return blogService.getBlogModelById(blogId);

        }

        //to delete the particular blog
        @DeleteMapping(value = "/{blogId}")
        public void deleteTickets(@PathVariable("blogId") int blogId)
        {
                blogService.deleteBlog(blogId);
        }
}


