package ravin.modelo;

import java.time.LocalDate;

public class Cliente extends Pessoa{
	
	private String alergias;
	private boolean vip;
	
	public Cliente(int id, String nome, String telefone, String email, String cpf, String endereco, String observacao,
			LocalDate dataNascimento, LocalDate criadoEm, LocalDate alteradoEm, String alergias, boolean vip) {
		super(id, nome, telefone, email, cpf, endereco, observacao, dataNascimento, criadoEm, alteradoEm);
		this.alergias = alergias;
		this.vip = vip;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}
	
	
	
}
