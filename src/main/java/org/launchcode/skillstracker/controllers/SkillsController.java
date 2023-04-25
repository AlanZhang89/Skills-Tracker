package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        String html = "<h1>Skills Tracker</h1>" +
                "<h2>List of programming languages:</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "<li>JavaScript</li>" +
                "</ol>";
        return html;
    }

    @GetMapping("/form")
    @ResponseBody
    public String form() {
        String html = "<form method='post' action='/form'>" +
                "<label for='name'>Name:</label><br>" +
                "<input type='text' name='name'><br>" +
                "<label for='lang1'>Favorite Language:</label><br>" +
                "<select name='lang1'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "</select><br>" +
                "<label for='lang2'>Second Favorite Language:</label><br>" +
                "<select name='lang2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "</select><br>" +
                "<label for='lang3'>Third Favorite Language:</label><br>" +
                "<select name='lang3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "</select><br><br>" +
                "<input type='submit' value='Submit'>" +
                "</form>";
        return html;
    }

    @PostMapping("/form")
    @ResponseBody
    public String formSubmit(@RequestParam String name,
                             @RequestParam String lang1,
                             @RequestParam String lang2,
                             @RequestParam String lang3) {
        String html = "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + lang1 + "</li>" +
                "<li>" + lang2 + "</li>" +
                "<li>" + lang3 + "</li>" +
                "</ol>";
        return html;
    }
}
