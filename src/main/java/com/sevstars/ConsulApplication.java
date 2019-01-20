/**  
 * 
 * @Title: ConsulApplication.java  
 * @Package com.sevstars  
 * @Description:  TODO  (用一句话描述该文件做什么)   
 * @author: 蛤蟆
 * @date:   2019年1月13日 下午3:05:41
 * @version V1.0 
 * @Copyright: 2019
 * 注意：公司内部传阅，禁止外泄以及用于其他的商业目
 */
package com.sevstars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulApplication {

//	@RequestMapping("/")
//	public String home() {
//		return "Hello world";
//	}

	public static void main(String[] args) {
		SpringApplication.run(ConsulApplication.class, args);
	}
}