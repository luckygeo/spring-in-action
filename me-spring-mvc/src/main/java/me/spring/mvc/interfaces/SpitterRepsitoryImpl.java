package me.spring.mvc.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created on 2017/8/11
 */
@Repository("spitterRepsitory")
public class SpitterRepsitoryImpl implements SpitterRepsitory {

    @Autowired
    private JdbcOperations jdbcOperations;


    @Transactional()
    @Override
    public int addSpitter(Spittle spittle) {
        Spittle d = new Spittle();
        return jdbcOperations.update("INSERT INTO  `evl` (`id`, `score`, `p_score`, `org_id`) VALUES ( ?,?,?,?)",
                "dd", "2","1","0");
    }
}
