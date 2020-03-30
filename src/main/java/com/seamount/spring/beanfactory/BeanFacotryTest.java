package com.seamount.spring.beanfactory;


import com.seamount.spring.dao.model.CityModel;
import org.omg.PortableServer.THREAD_POLICY_ID;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * 使用BeanFacotry的默认实现类，
 * XmlBeanDefinitionReader和DefaultListableBeanFactory
 * 启动IOC容器
 */
public class BeanFacotryTest {
    public static void main(String[] args) {
        getBean();
    }

    public static void getBean(){
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource resource = resolver.getResource("classpath:configs/beans.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);

        CityModel cityModel = factory.getBean("cityModel", CityModel.class);
        cityModel.setId(1);
        System.out.println(cityModel.getId());
    }
}
