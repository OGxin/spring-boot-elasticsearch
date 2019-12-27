package com.ozx.springbootelasticsearch;

import com.ozx.springbootelasticsearch.entity.Commodity;
import com.ozx.springbootelasticsearch.service.CommodityService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@SpringBootTest
class SpringBootElasticsearchApplicationTests {

	@Autowired
	private CommodityService commodityService;

	@Test
	void contextLoads() {
		System.out.println(commodityService.count());
	}

	@Test
	public void testInsert(){
		Commodity commodity = new Commodity();
		commodity.setSkuId("1245783571");
		commodity.setName("原味切片面包");
		commodity.setCategory("101");
		commodity.setPrice(8);
		commodity.setBrand("良品铺子");
		commodityService.save(commodity);

		commodity = new Commodity();
		commodity.setSkuId("1245783573");
		commodity.setName("原味切片面包（6片装）");
		commodity.setCategory("101");
		commodity.setPrice(680);
		commodity.setBrand("良品铺子");
		commodityService.save(commodity);

		commodity = new Commodity();
		commodity.setSkuId("1245783572");
		commodity.setName("元气吐司850g");
		commodity.setCategory("101");
		commodity.setPrice(120);
		commodity.setBrand("百草味");
		commodityService.save(commodity);
	}

	@Test
	public void testDelete(){
		Commodity commodity = new Commodity();
		commodity.setSkuId("1245783572");
		commodityService.delete(commodity);
	}

	@Test
	public void testGetAll(){
		Iterable<Commodity> iterable = commodityService.getAll();
		iterable.forEach(e-> System.out.println(e.toString()));
	}

	@Test
	public void testGetByName(){
		List<Commodity> commodityList = commodityService.getByName("面包");
		System.out.println(commodityList);
	}

	@Test
	public void testPage(){
		Page<Commodity> page = commodityService.pageQuery(0, 10, "面包");
		System.out.println(page.getTotalElements());
		System.out.println(page.getNumber());
		System.out.println(page.getContent());
	}
}
