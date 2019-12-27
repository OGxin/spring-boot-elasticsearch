package com.ozx.springbootelasticsearch.dao;

import com.ozx.springbootelasticsearch.entity.Commodity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @ClassName: CommodityRepository
 * @Description:TODO
 * @Author ou.zhenxing
 * @Date 2019/12/25 11:11
 * @Version： 1.0
 **/
@Repository
public interface CommodityRepository extends ElasticsearchRepository<Commodity, String>{

}
