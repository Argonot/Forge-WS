package org.argonot.forge.api.controller;

import org.argonot.forge.api.commons.AbstractControllerTest;
import org.junit.Test;

public class HomeControllerTest extends AbstractControllerTest {
    
    private static final String GET_HTTP_METHOD = "GET";
    private static final String HOME_VIEW_NAME = "Index";
    private static final String ROOT_ROUTE = "/";

    @Test
    public void testHomeRoute() throws Exception {
        testRoute(ROOT_ROUTE, HOME_VIEW_NAME, GET_HTTP_METHOD);
    }

}
