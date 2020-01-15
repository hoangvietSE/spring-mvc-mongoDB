package com.soict.hoangviet.controller.admin;

import com.soict.hoangviet.constant.SystemConstant;
import com.soict.hoangviet.model.BrowserHistory;
import com.soict.hoangviet.model.NetworkConnectionModel;
import com.soict.hoangviet.service.BrowserHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BrowserHistoryController {

    @Autowired
    private BrowserHistoryService browserHistoryService;

    @RequestMapping(value = "/admin-browser-history", method = RequestMethod.GET)
    public ModelAndView networkConnectionPage() {
        ModelAndView modelAndView = new ModelAndView("admin/browser-history");
        List<BrowserHistory> model = browserHistoryService.findAll();
        modelAndView.addObject(SystemConstant.MODEL, model);
        return modelAndView;
    }
}
