package com.itheima.d2_xpath;

/**
    目标：XPath检索XML中的信息啊。(了解)

    引入：
        Dom4J可以用于解析整个XML的数据。
        但是如果要检索XML中的某些信息，建议使用XPath.（Xpath依赖Dom4j技术）
        Dom4J用于解析数据，Xpath用于检索数据。
    XPath使用步骤：
        1.导入dom4j框架。（XPath依赖于Dom4j技术,必须先导入dom4j框架！）
        2.导入XPath独有的框架包。jaxen-1.1.2.jar
    XPath常用API:
        List<Node> selectNodes(String var1):检索出一批节点集合。
        Node selectSingleNode(String var1)：检索出一个节点返回。
    XPath提供的四种检索数据的写法：
        1.绝对路径。
        2.相对路径。
        3.全文搜索。
        4.属性查找。
    小结：
         1.绝对路径： /根元素/子元素/子元素。
         2.相对路径： ./子元素/子元素。 (.代表了当前元素)
         3.全文搜索：
                //元素  在全文找这个元素
                //元素1/元素2  在全文找元素1下面的一级元素2
                //元素1//元素2  在全文找元素1下面的全部元素2
         4.属性查找。
                //@属性名称  在全文检索属性对象。
                //元素[@属性名称]  在全文检索包含该属性的元素对象。
                //元素[@属性名称=值]  在全文检索包含该属性的元素且属性值为该值的元素对象。
 */
public class XPathDemo {
    public void parse04() throws Exception {
        // a、创建解析器对象

        // b、把XML加载成Document文档对象

        // c、检索属性信息


        // 检索带有指定属性名称的元素

        // 检索带有指定属性=属性值的元素
    }
}
