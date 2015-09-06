package org.argonot.forge.api.filter;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import javax.servlet.ServletException;

import org.argonot.forge.api.util.AbstractControllerTest;
import org.junit.Test;
import org.springframework.mock.web.MockFilterChain;

public class CORSFilterTest extends AbstractControllerTest {

    @Test
    public void testDoFilterInternal() throws ServletException, IOException {
        CORSFilter corsFilter = new CORSFilter();
        MockFilterChain mockChain = new MockFilterChain();
        corsFilter.doFilter(request, response, mockChain);

        assertEquals(200,response.getStatus());
    }
}
