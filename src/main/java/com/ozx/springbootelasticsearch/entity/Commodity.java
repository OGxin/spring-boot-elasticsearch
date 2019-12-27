package com.ozx.springbootelasticsearch.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * @ClassName: Commodity
 * @Description:TODO
 * @Author ou.zhenxing
 * @Date 2019/12/25 11:06
 * @Version： 1.0
 **/
@Data
@Document(indexName = "commodity")
public class Commodity implements Serializable {
    @Id
    private String skuId;
    private String name;
    private String category;
    private Integer price;
    private String brand;
    private Integer stock;
}
