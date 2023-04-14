package projeto.prova.email.senha;


	public class User {
	    private String email;
	    private String senha;

	    public User(String email, String senha) {
	        this.email = email;
	        this.senha = senha;
	    }

	    public boolean isValid() {
	        return isValidEmail(email) && isValidSenha(senha);
	    }

	    private boolean isValidEmail(String email) {
	        // Verifica se o email é válido usando uma expressão regular
	        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	        return email.matches(regex);
	    }

	    private boolean isValidSenha(String senha) {
	        // Verifica se a senha tem pelo menos 6 caracteres
	        return senha.length() >= 6;
	    }
	}


