package vn.daotq.interviewapp.repository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.daotq.interviewapp.model.Category;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoriesRepository  {

    @Autowired
    ICategoryRepository iCategoryRepository;

    public List<Category> getAll (){
        return iCategoryRepository.findAll().stream().filter(x -> x.getStatus() == 1).collect(Collectors.toList());
    }

    public Category getDetailByID(int id){
        return iCategoryRepository.getById(id);
    }

}
