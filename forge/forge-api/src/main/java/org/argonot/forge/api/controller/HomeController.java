package org.argonot.forge.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * <b>HomeController</b> concern general Forge routes
 * @author Meidi
 *
 */
@Controller
@RequestMapping("/")
public class HomeController {

    /**
     * The home page
     */
    private static final String INDEX_PAGE = "Index";

    /**
     * Route to the home page which is the API documentation
     * @return Index.jsp
     */
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView showDocumentationAPI() {
        return new ModelAndView(INDEX_PAGE);
    }

}
