package org.argonot.forge.api.controller;

import static org.junit.Assert.assertFalse;

import org.argonot.forge.api.util.AbstractControllerTest;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.junit.Test;

public class ToolControllerTest extends AbstractControllerTest {

    private static final String HTTP_GET_METHOD = "GET";
    private static final String GET_ALL_TOOLS_ROUTE = "/tools/list";

    @Test
    public void testListToolsRoute() throws Exception {
        request.setRequestURI(GET_ALL_TOOLS_ROUTE);
        request.setMethod(HTTP_GET_METHOD);
        Object handler = handlerMapping.getHandler(request).getHandler();
        handlerAdapter.handle(request, response, handler);
        JSONArray jsonArray = (JSONArray) new JSONParser().parse(response.getContentAsString());
        assertFalse(jsonArray.isEmpty());
    }

}
