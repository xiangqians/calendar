package org.calendar.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xiangqian
 * @date 15:54 2022/08/14
 */
@Slf4j
@Controller
@Api(value = "route", tags = "路由信息管理")
public class RouteController {

    @GetMapping("/route/editor")
    public String editor() {
        return "editor";
    }

    @GetMapping("/route/calendar")
    public String calendar() {
        return "calendar";
    }

    @GetMapping("/route/event")
    public String event() {
        return "event";
    }

    @GetMapping("/route/note")
    public String note() {
        return "note";
    }

    @GetMapping({"/", "/index"})
    public String index() {
        return "index";
    }

}
