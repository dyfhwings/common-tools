/**
 * 
 */
package com.json.service.impl;

import com.json.dto.JsonComponent;
import com.json.service.JsonService;

/**
 * @author ignore1992
 *
 * 2018��9��15��
 */
public class JsonServiceImpl implements JsonService<JsonComponent>
{
	@Override
	public String transfer2Json(JsonComponent item)
	{
		return item.toJsonString();
	}
	
	@Override
	public JsonComponent transfer2Object(String json)
	{
		return null;
	}

}
