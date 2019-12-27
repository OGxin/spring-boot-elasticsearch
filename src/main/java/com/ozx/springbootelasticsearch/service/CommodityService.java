package com.ozx.springbootelasticsearch.service;

import com.ozx.springbootelasticsearch.entity.Commodity;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @ClassName: CommodityService
 * @Description:TODO
 * @Author ou.zhenxing
 * @Date 2019/12/25 11:15
 * @Version： 1.0
 **/
public interface CommodityService {
    long count();
    Commodity save(Commodity commodity);
    void delete(Commodity commodity);
    Iterable<Commodity> getAll();
    List<Commodity> getByName(String name);
    Page<Commodity> pageQuery(Integer pageNo,Integer pageSize,String kw);
}
