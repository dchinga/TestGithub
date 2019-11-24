/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Demo;
import model.controllers.DemoJpaController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
    private EntityManager em;
    private EntityManagerFactory emf;
    private DemoJpaController repo;

    public DemoController() {
        em = getEntityManager();
        repo = new DemoJpaController(emf);
    }

    private EntityManager getEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("TestGithubPU");
        }
        return emf.createEntityManager();
    }
    
    @RequestMapping("formulario.htm")
    public ModelAndView MostrarFormulario() {
        List<Demo> demos =  repo.findDemoEntities();

        ModelAndView mv = new ModelAndView("formulario");
        mv.addObject("lista", demos);
        return mv;
    }
}