package vn.daotq.interviewapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.daotq.interviewapp.model.Category;

public interface ICategoryRepository  extends JpaRepository<Category, Integer> {}
