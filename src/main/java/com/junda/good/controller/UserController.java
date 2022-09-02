package com.junda.good.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author libai
 */
@RestController
@RequestMapping("/UserController")
public class UserController {

    @GetMapping("/findAll")
    fun findAll(@RequestParam("id") id: String): UnionResult {
        return tagService.findById(id)
    }

    @GetMapping("/findById")
    fun findById(@RequestParam("id") id: String): UnionResult {
        return tagService.findById(id)
    }

    @GetMapping("/deleteById")
    fun deleteById(@RequestParam("id") id: String): UnionResult {
        return tagService.findById(id)
    }

    @GetMapping("/addUser")
    fun addUser(@RequestParam("id") id: String): UnionResult {
        return tagService.findById(id)
    }

    @GetMapping("/updateUser")
    private
    fun updateUser(@RequestParam("id")id: String): UnionResult {
        return tagService.findById(id)
    }
}
