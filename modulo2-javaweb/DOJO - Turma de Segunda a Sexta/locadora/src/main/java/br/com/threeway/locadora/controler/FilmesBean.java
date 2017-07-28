package br.com.threeway.locadora.controler;

import br.com.threeway.locadora.dao.FilmeDao;
import br.com.threeway.locadora.domain.Filme;
import br.com.threeway.locadora.domain.TipoFilme;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ViewScoped
@ManagedBean (name = "filmesBean")
public class FilmesBean  {

	private FilmeDao dao = new FilmeDao();
	private Filme filme = new Filme();
	private String busca = "";

	public String getBusca() {
		return busca;
	}

	public void setBusca(String busca) {
		this.busca = busca;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public List<Filme> getFilmes(){
		return dao.busqueFilmes(busca);
	}

	public TipoFilme[] getTipos() {
		return TipoFilme.values();
	}

	public void salvar() {
		if (filme.getId() == null) {
			dao.insira(filme);
		} else {
			dao.atualize(filme);
		}
		filme = new Filme();
	}

	public void deletar(Filme filme) {
		dao.delete(filme);
		filme = new Filme();
	}


}
