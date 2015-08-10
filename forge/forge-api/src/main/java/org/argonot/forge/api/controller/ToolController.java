/* This software is the exclusive property of Argonot.
 * © Argonot.fr 2015 - All rights reserved */

package org.argonot.forge.api.controller;

import java.util.List;

import org.argonot.forge.business.entity.Tool;
import org.argonot.forge.business.service.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <b>ToolController</b> expose every RESTFUL methods that can be called relative to a tool from the forge
 * @author Meidi
 *
 */
@Controller
@RequestMapping("/tools")
public class ToolController {

    @Autowired
    private ToolService toolService;

    /**
     * List the current month event by default as a JSON String
     * 
     * @return json string
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET, headers="Accept=application/json")
    @ResponseBody
    public List<Tool> listAllTools() {
        return toolService.getAllTools();
    }

}
