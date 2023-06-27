package ravin;

import ravin.interfaces.ICrudUsuario;

public class Usuario {
    private int id;
    private String codigo;
    private String login;
    private String senha;
    private boolean ativo;
    private TipoUsuario tipoUsuario;

    public Usuario() {
        // Construtor padrão
    }

	@Override
	public Usuario create(Usuario obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario read(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario update(Usuario obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

}
