package com.model2.mvc.service.product;

import java.util.Map;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.Product;


//==> 회원관리에서 서비스할 내용 추상화/캡슐화한 Service  Interface Definition  
public interface ProductService {
	
	// 회원가입
	public void addProduct(Product product) throws Exception;
	
	// 내정보확인 / 로그인
	public Product getProduct(int prodNo) throws Exception;
	
	// 회원정보리스트 
	public Map<String , Object> getProductList(Search search) throws Exception;
	
	// 회원정보수정
	public void updateProduct(Product product) throws Exception;
	
	// 회원 ID 중복 확인
	public boolean checkDuplication(int prodNo) throws Exception;
	
}