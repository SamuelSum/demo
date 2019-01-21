package com.example.demo.controller;

import com.example.demo.ArticleService;
import com.example.demo.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
       public String goHome(){
        // Mi logica de negocio
        //ModelAndView mav = new ModelAndView("home2");

        return "home";
    }

    @RequestMapping("/articles")
    public List<Article> getAllArticles(){

        return articleService.getAllArticles();
    }

    @RequestMapping("/articles/{id}")
    public Article getArticle(@PathVariable String id){


        return articleService.getArticle(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/articles")
    public void addArticle(@RequestBody Article article) {

        articleService.addArticle(article);
    }

    @RequestMapping(method = RequestMethod.PUT, value ="/articles/{id}")
    public void updateArticle(@RequestBody Article article, @PathVariable String id) {

        articleService.updateArticle(article,id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value ="/articles/{id}")
    public void deleteArticle(@PathVariable String id) {

        articleService.deleteArticle(id);

    }


}
