package me.spring.mvc.interfaces;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created on 2017/8/7
 */
@Service
public class SpittleRepositoryImpl implements SpittleRepository {
    @Override
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(new Spittle("Spittle" + i, new Date()));
        }
        return list.subList(0,count);
    }
}
