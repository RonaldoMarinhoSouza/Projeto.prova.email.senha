package projeto.prova.email.senha;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UserTest {


	    @Test
	    public void testEmailESenhaValidos() {
	        User user = new User("usuario@example.com", "senha123");
	        assertTrue(user.isValid());
	    }

	    @Test
	    public void testEmailInvalido() {
	        User user = new User("usuario@", "senha123");
	        assertFalse(user.isValid());
	    }

	    @Test
	    public void testSenhaInvalida() {
	        User user = new User("usuario@example.com", "123");
	        assertFalse(user.isValid());
	    }

	    @Test
	    public void testEmailESenhaVazios() {
	        User user = new User("", "");
	        assertFalse(user.isValid());
	    }

	   
	}


