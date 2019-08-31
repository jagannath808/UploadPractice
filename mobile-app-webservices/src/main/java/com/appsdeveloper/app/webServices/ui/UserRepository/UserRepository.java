package com.appsdeveloper.app.webServices.ui.UserRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.appsdeveloper.app.webServices.ui.io.Entity.UserEntity;
@Repository
public interface UserRepository extends CrudRepository<UserEntity,Long > {

}
