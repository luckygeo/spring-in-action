package me.spring.mvc.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

/**
 * Created on 2017/8/11
 */
@Repository("spitterRepsitory")
public class SpitterRepsitoryImpl implements SpitterRepsitory {

    @Autowired
    private JdbcOperations jdbcOperations;


    @Override
    public int addSpitter(Spittle spittle) {
        Spittle d = new Spittle();
        return jdbcOperations.update("INSERT INTO `repair_app_scan` ( `ID`, `APP_TYPE`, `DOWNLOAD_TYPE` ) VALUES ( ?,?,?)",
                "ddddddddddddd5e7bf670f9ba42647fb", "2","1");
    }
}
