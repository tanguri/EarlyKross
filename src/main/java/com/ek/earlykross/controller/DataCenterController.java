package com.ek.earlykross.controller;

import com.ek.earlykross.repository.ClubRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("datacenter")
@Log4j2
@RequiredArgsConstructor // 자동 주입 어노테이션
public class DataCenterController {

//    private final DataCenterService service;

    @GetMapping("/")
    public String index(){
        System.out.println("리다이렉트");
        return "redirect:/datacenter/league_overview.do";
    }

    @Autowired
    ClubRepository clubRepository;

//    @GetMapping("{step}.do")
//    public String viewPage(@PathVariable String step) {
//        System.out.println("main에서 자신 반환하는 모든 동작 : " + step);
//        return "sample/" + step;
//    }

    // 리그 정보 페이지
    @GetMapping({"/league.do"})
    public void leagueOverview(Model model) {
        log.info("DataCenterController.LeagueOverview 호출");
//        return "redirect:/league/overview.do";
    }

    //
    @GetMapping({"/club.do"})
    public void clubOverview(Model model) {
        log.info("DataCenterController.ClubOverview 호출");
//        return "redirect:/club/overview.do";
    }
}