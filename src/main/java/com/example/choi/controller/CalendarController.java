package com.example.choi.controller;


import com.example.choi.dto.CalendarDto;
import com.example.choi.service.CalendarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CalendarController {
    private CalendarService calendarService;

    public CalendarController(CalendarService calendarService) {
        this.calendarService = calendarService;
    }

    @GetMapping("/MyPage")
    public String list( Model model) {
        //List<CalendarDto> calendarDtoList = calendarService.getCalendarList();
        //model.addAttribute("postList", calendarDtoList);
        return "MyPage";
    }

    @ResponseBody
    @RequestMapping(value = "/MyPage-list")
    //@GetMapping("/MyPage-list")
    public List<CalendarDto> sublist(String creator ) {
        List<CalendarDto> calendarDtoList = calendarService.getCalendarSubList(creator);
       // model.addAttribute("getList", calendarDtoList);
        //return "MyPage";
        return calendarDtoList;
    }

    @ResponseBody
    @PostMapping("/MyPage")
    public void write( CalendarDto calendarDto) {
        try {
            calendarService.savePost(calendarDto);
        } catch(Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }

    @ResponseBody
    @RequestMapping(value = "/MyPage-del")
    public void delete( Long idx) {
        calendarService.deletePost(idx);
    }

}
