package cn.zyz.dao2;

import cn.zyz.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao2 extends JpaRepository<User,Integer> {
}
