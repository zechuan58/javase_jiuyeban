package com.itheima.d1_dom4j;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 目标：完成dom4j的快速入门：解析XML文件。
 */
public class Dom4jDemo1 {
    @Test
    public void parseXML() throws Exception {
        //1、创建一个SAXReader解析器对象：代表了Dom4j框架
        SAXReader saxReader = new SAXReader();

        //2、加载xml文件成为Document文档对象
        //Document document = saxReader.read(new File("day14_xml\\src\\books.xml"));

        //推荐方案：读取字节输入流(默认认为/是直接去src下寻找的)
        InputStream in = Dom4jDemo1.class.getResourceAsStream("/Contacts.xml");
        Document document = saxReader.read(in);

        //3、文档对象的方法：可以获取根元素
        Element rootElement = document.getRootElement();
        System.out.println(rootElement);
    }

    //获取所有的子节点内容
    @Test
    public void parseXMLAllNode() throws Exception {
        // 1、创建一个SAXReader解析器对象：代表了Dom4j框架
        SAXReader saxReader = new SAXReader();

        // 2、加载xml文件成为Document文档对象
        Document document = saxReader.read(Dom4jDemo1.class.getResourceAsStream("/Contacts.xml"));

        // 3、获取根元素
        Element rootElement = document.getRootElement();

        // 4、提取根元素下的全部一级子元素
        List<Element> list1 = rootElement.elements();
        for (Element element : list1) {
            System.out.println(element.getName());
        }

        System.out.println("-------------------");

        //5.获取根标签下的所有的一级contact标签
        List<Element> list2 = rootElement.elements("contact");
        for (Element element : list2) {
            System.out.println(element.getName());
        }

        System.out.println("-------------------");

        // 6、获取根标签下面的第一个contact标签
        Element element = rootElement.element("contact");

        //获取第一个contact标签的文本内容(不去掉左右空格)
        //System.out.println(element.elementText("name"));

        // 获取第一个contact标签的文本内容(去掉左右空格)
        System.out.println("姓名:" + element.elementTextTrim("name"));
        System.out.println("性别:" + element.elementTextTrim("gender"));
        System.out.println("邮箱:" + element.elementTextTrim("email"));

        //6.2获取标签的属性对象
        String idValue = element.attributeValue("id");
        System.out.println("id值:" + idValue);

        String vipValue = element.attributeValue("vip");
        System.out.println("vip值:" + vipValue);

        System.out.println("--------------------");

        //获取name标签对象,再通过name标签对象获取标签的文本
        String name = element.element("name").getTextTrim();
        System.out.println("姓名:" + name);

        //获取gender标签对象,再通过gender标签对象获取标签的文本
        String gender = element.element("gender").getTextTrim();
        System.out.println("性别:" + gender);

        //获取email标签对象,再通过email标签对象获取标签的文本
        String email = element.element("email").getTextTrim();
        System.out.println("邮箱:" + email);

    }

    /**
     * 将xml文件中的标签解析成Java对象
     *
     * @throws Exception
     */
    @Test
    public void parseXMLToList() throws Exception {
        // 1、创建一个SAXReader解析器对象：代表了Dom4j框架
        SAXReader saxReader = new SAXReader();

        // 2、推荐方案：读取字节输入流(默认认为/是直接去src下寻找的)
        Document document = saxReader.read(Dom4jDemo1.class.getResourceAsStream("/Contacts.xml"));

        // 3、提取根元素对象。
        Element rootElement = document.getRootElement();
        // 4、提取全部一级子元素
        List<Element> elements = rootElement.elements("contact");
        // 5、定义一个ArrayList集合准备存储3个联系人对象信息
        ArrayList<Contact> list=new ArrayList<>();
        // 6、开始遍历每个子元素
        for (Element element : elements) {
            // 7、获取标签的属性值,和文本内容
            String id = element.attributeValue("id");
            String vip = element.attributeValue("vip");
            String name = element.elementTextTrim("name");
            String gender = element.elementTextTrim("gender");
            String email = element.elementTextTrim("email");

            // 8、解析数据：注入到对象中去
            Contact contact = new Contact(id, name, gender, email, Boolean.parseBoolean(vip));

            // 9、把联系人对象存入到集合中去
            list.add(contact);

        }
        // 10、遍历集合即可
        for (Contact contact : list) {
            System.out.println(contact);
        }
    }
}
















