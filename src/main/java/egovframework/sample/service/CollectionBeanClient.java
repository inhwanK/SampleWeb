package egovframework.sample.service;

import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import egovframework.sample.service.impl.CollectionBean;

public class CollectionBeanClient {
	public static void main(String[] args) {
		GenericXmlApplicationContext container = new GenericXmlApplicationContext("egovframework/spring/context-common.xml");
		System.out.println(container);
		CollectionBean bean = (CollectionBean) container.getBean("collectionBean");
		
		
//		map 사용.
//		Map<String, String> map = bean.getAddressList();
//		Set<String> keys=map.keySet();
//		for(String key : keys) {
//			System.out.println(key + "의 주소" + map.get(key));
//		}
		
		
//		properties 사용.
		Properties li = bean.getAddressList();
		Set<Object> keys = li.keySet();
		
		for(Object key: keys) {
			System.out.println(key + "의 주소" + li.get(key));
		}
		
		
		container.close();
	}
}
