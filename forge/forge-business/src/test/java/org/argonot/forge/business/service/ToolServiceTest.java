package org.argonot.forge.business.service;

import static org.junit.Assert.assertFalse;

import org.argonot.forge.business.util.AbstractRepositoryTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

public class ToolServiceTest extends AbstractRepositoryTest {

    @Autowired
    private ToolService toolService;

    @Test
    public void testGetAllToolsNotEmpty() {
        System.out.println(toolService.getAllTools().get(0).getName());
        assertFalse(CollectionUtils.isEmpty(toolService.getAllTools()));
    }

}
