/* This software is the exclusive property of Argonot.
 * © Argonot.fr 2015 - All rights reserved */

package org.argonot.forge.business.service;

import java.util.List;

import org.argonot.forge.business.entity.Tool;

/**
 * <b>ToolService</b> provides common actions around the Tools
 * @author Meidi
 *
 */
public interface ToolService {

    /**
     * Get all the tools ordered by id
     * @return a list of tools
     */
    List<Tool> getAllTools();

    /**
     * Create a new tool
     * @param tool
     */
    Tool create(Tool tool);

}
