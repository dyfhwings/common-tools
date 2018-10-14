/**
 * 
 */
package com.json.iterator;

import java.util.Iterator;

import com.json.dto.JsonComponent;

/**
 * @author ignore1992
 *
 * 2018��9��15��
 */
public class NullIterator implements Iterator<JsonComponent>
{
	@Override
	public boolean hasNext()
	{
		return false;
	}

	@Override
	public JsonComponent next()
	{
		return null;
	}
}
