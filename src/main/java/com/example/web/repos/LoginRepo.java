package com.example.web.repos;
import com.example.web.model.tokens.UserDO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

// 确定好数据库内容之后再完成
@Repository
@Transactional
public interface LoginRepo extends CrudRepository<UserDO,Long>{

    List<UserDO> findAllByUserNameAndPassword(String userName,String password);
    List<UserDO> findAllByUserName(String userName);

}
