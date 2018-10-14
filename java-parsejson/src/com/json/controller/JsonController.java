/**
 * 
 */
package com.json.controller;

import com.json.dto.JsonComponent;
import com.json.dto.JsonLeaf;
import com.json.dto.JsonNode;
import com.json.service.JsonService;
import com.json.service.impl.JsonServiceImpl;

/**
 * @author ignore1992
 *
 * 2018��9��15��
 */
public class JsonController
{
	public static JsonService<JsonComponent> jsonService = new JsonServiceImpl();
	
	public static void main(String[] args)
	{
		testTrans2Json();
	}
	
	public static void testTrans2Json()
	{
		JsonComponent mainItem = new JsonLeaf("���ڵ�");
		JsonComponent leafItem1 = new JsonLeaf("�νڵ�1");
		JsonComponent leafItem2 = new JsonLeaf("�νڵ�2");
		JsonComponent nodeItem1 = new JsonNode("Ҷ�ӽڵ�1", "Ҷ�ӽڵ�1value");
		JsonComponent nodeItem2 = new JsonNode("Ҷ�ӽڵ�2", "Ҷ�ӽڵ�2value");
		leafItem1.add(nodeItem1);
		leafItem2.add(nodeItem2);
		mainItem.add(leafItem1);
		mainItem.add(leafItem2);
		//�����ڲ�������ʽ
		System.out.println(jsonService.transfer2Json(mainItem));
	}
}
