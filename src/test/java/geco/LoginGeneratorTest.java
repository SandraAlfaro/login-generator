package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoginGeneratorTest {

    private LoginService loginService;

    @Before
    public void setUp(){
        loginService = new LoginService (new String[]{"JROL","BPER","CGUR","JDU","JRAL","JRAL1"});
    }

    @Test
    public void testGenerateLoginForNomAndPrenom_CT1() {
        LoginGenerator loginGenerator = new LoginGenerator(loginService);
        assertEquals("The login 'PDUR' was generated and added correctly ","PDUR",loginGenerator.generateLoginForNomAndPrenom("Durand","Paul"));
    }

    @Test
    public void testGenerateLoginForNomAndPrenom_CT2() {
        LoginGenerator loginGenerator = new LoginGenerator(loginService);
        assertEquals("The login 'JRAL2' was generated and added correctly ","JRAL2",loginGenerator.generateLoginForNomAndPrenom("Ralling","John"));
    }

    @Test
    public void testGenerateLoginForNomAndPrenom_CT3() {
        LoginGenerator loginGenerator = new LoginGenerator(loginService);
        assertEquals("The login 'JROL1' was generated and added correctly ","JROL1",loginGenerator.generateLoginForNomAndPrenom("Rolling","Jeanne"));
    }

    @Test
    public void testGenerateLoginForNomAndPrenom_CT4() {
        LoginGenerator loginGenerator = new LoginGenerator(loginService);
        assertEquals("The login 'TDUR' was generated and added correctly ","TDUR",loginGenerator.generateLoginForNomAndPrenom("Dùrand","Tom"));
    }

    @Test
    public void testGenerateLoginForNomAndPrenom_CT5() {
        LoginGenerator loginGenerator = new LoginGenerator(loginService);
        assertEquals("The login 'PDU' was generated and added correctly ","PDU",loginGenerator.generateLoginForNomAndPrenom("Du","Paul"));
    }


}