package com.unab.Quizz.DAO;

import org.springframework.data.repository.CrudRepository;

import com.unab.Quizz.Entidad.Quizz;

public interface QuizzDAO extends CrudRepository<Quizz, Long>{

}
