/**
 * 
 */
package com.json.service;

/**
 * @author ignore1992
 *
 * 2018��9��15��
 */
public interface JsonService<T>
{
	/**
	 * ����תjson
	 * @param item ����
	 * @return json��
	 */
	public String transfer2Json(T item);
	
	/**
	 * jsonת����
	 * @param json json��
	 * @return ����
	 */
	public T transfer2Object(String json);
}
