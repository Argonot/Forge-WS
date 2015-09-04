package org.argonot.forge.commons.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class CipherUtilsTest {
    
    private static final String STR_CLEAR = "Test";
    private static final String STR_ENCRYPTED = "HLJJH595hpEstTp/+Tep6Q==";

    @Test
    public void testEncrypt() {
        assertTrue(CipherUtils.encrypt(STR_CLEAR).equals(STR_ENCRYPTED));
    }
    
    @Test
    public void testDecrypt() {
        assertTrue(CipherUtils.decrypt(STR_ENCRYPTED).equals(STR_CLEAR));
    }

}
