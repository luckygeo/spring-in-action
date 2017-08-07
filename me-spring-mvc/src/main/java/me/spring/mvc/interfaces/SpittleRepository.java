package me.spring.mvc.interfaces;


import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created on 2017/8/7
 */

public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
}
