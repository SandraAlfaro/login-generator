package geco;


import org.junit.Test;

import static org.junit.Assert.*;


public class LoginServiceTest {

    @Test
    public void testAddLogin() {
        LoginService loginList = new LoginService(new String[]{});
        loginList.addLogin("TestAdd");
        assertFalse("The login list must be not empty ", loginList.findAllLogins().isEmpty());
        assertEquals("The login list should contain 1 item ", 1, loginList.findAllLogins().size());
    }

    @Test
    public void testLoginExists() {
        LoginService loginList = new LoginService(new String[]{"TestExists"});
        assertTrue("The login list should contain a login named 'TestExists ", loginList.loginExists("TestExists"));
    }

    @Test
    public void testFindAllLoginsStartingWith() {
        LoginService loginList = new LoginService(new String[]{"TestFindStartingWith","TestFindAll"});
        assertEquals("The login list should contain 2 logins starting with 'TestFind'",2,loginList.findAllLoginsStartingWith("TestFind").size());
    }

    @Test
    public void testFindAllLogins() {
        LoginService loginList = new LoginService(new String[]{"TestFindStartingWith","TestFindAll"});
        assertEquals("The login list should contain 2 logins",2,loginList.findAllLogins().size());
    }
}