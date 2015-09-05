package org.argonot.forge.business.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.argonot.forge.business.entity.Tool;
import org.argonot.forge.business.util.AbstractRepositoryTest;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

public class ToolServiceTest extends AbstractRepositoryTest {
    
    private static final String TOOL_URL = "Tool Url";
    private static final String TOOL_URL_IMAGE = "Tool Url Image";
    private static final String TOOL_DESC = "Tool Desc";
    private static final String TOOL_NAME = "Tool Name";
    private static final Tool tool = new Tool();
    
    @BeforeClass
    public static void setUpClass() {
        tool.setName(TOOL_NAME);
        tool.setDesc(TOOL_DESC);
        tool.setUrlImage(TOOL_URL_IMAGE);
        tool.setUrlTool(TOOL_URL);
    }

    @Autowired
    private ToolService toolService;

    @Test
    public void testGetAllToolsNotEmpty() {
        assertFalse(CollectionUtils.isEmpty(toolService.getAllTools()));
    }
    
    @Test
    public void testCreateTool() {
        assertNotNull(toolService.create(tool));
    }

}
