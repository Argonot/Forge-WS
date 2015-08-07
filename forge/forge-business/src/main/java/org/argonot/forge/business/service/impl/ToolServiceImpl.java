/* This software is the exclusive property of Argonot.
 * © Argonot.fr 2015 - All rights reserved */

package org.argonot.forge.business.service.impl;

import java.util.List;

import org.argonot.forge.business.entity.Tool;
import org.argonot.forge.business.repository.ToolRepository;
import org.argonot.forge.business.service.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ToolService")
public class ToolServiceImpl implements ToolService {

    @Autowired
    private ToolRepository toolRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Tool> getAllTools() {
        return (List<Tool>) toolRepository.findAll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tool create(Tool tool) {
        return toolRepository.save(tool);
    }

}
