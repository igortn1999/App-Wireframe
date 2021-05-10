package br.com.fiap.movie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FilmeDAO {

	public void cadastrar(Filme filme) {
		//JPA
		//classe EntityManager
		//esse conjunto de dados geralmente é trazido atraves de um .jar
		//é uma forma de empacotar todas as classes para enviar para outra pessoa
		//maven é um gerenciador de dependencias que busca tudo oq é preciso para usar tal .jar
		//além disso, quando for mandar para outra pessoa, o maven cria um xml para que a pessoa não precise
		//baixar tudo no git por exemplo, o maven irá baixar para essa outra pessoa
		//maven permite empacotar para mandar pra outra pessoa tb
		
		EntityManagerFactory factory =
				Persistence.createEntityManagerFactory("filme"); //o JPA ira procurar as persistencias em /META-INF/persistence.xml
		EntityManager manager = factory.createEntityManager();
				
		//transações
		manager.getTransaction().begin();
		//persistencia
		manager.persist(filme);
		//commitar
		manager.getTransaction().commit();
		
		//fecha o recurso para que possa ser disponiblizado para outro processo
		manager.close();
	}
	
}
