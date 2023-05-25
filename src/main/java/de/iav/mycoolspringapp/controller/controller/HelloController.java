/*
package de.iav.mycoolspringapp.controller.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class HelloController {

    @GetMapping

    public String helloController(@RequestBody String name){
        return "Hello Spring Controller!" + name;
    }

    @GetMapping ("/student")
    public  String studentController(){
        return "Hello Student";
    }

    @GetMapping(path = "{id}")
    public String getStudentID(@PathVariable String id){
        return "Student mit ID " + id;
    }

    @GetMapping("/search")
    public String getSearchResult(@RequestParam (required = false)String query, @RequestParam (required = false) String query2){
        return "Du hast nach " + query + " und "+query2+ " gesucht!";
    }

    @PostMapping
    public String saveStudent(@RequestBody String studentName){
        return  "the student with name "+ studentName + " was saved!";
    }
}
*/
