/**
 * 
 */
package com.json.iterator;

import java.util.Iterator;
import java.util.Stack;

import com.json.dto.JsonComponent;
import com.json.dto.JsonLeaf;

/**
 * @author ignore1992
 *
 *         2018��9��15��
 */
public class JsonComponentIterator implements Iterator<JsonComponent>
{
	/** ��ջ�ṹ���洢������Ԫ��. */
	private Stack<Iterator<JsonComponent>> stack = new Stack<Iterator<JsonComponent>>();

	public JsonComponentIterator(Iterator<JsonComponent> iterator)
	{
		stack.push(iterator);
	}

	@Override
	public boolean hasNext()
	{
		if (!stack.isEmpty())
		{
			Iterator<JsonComponent> iterator = stack.peek();
			if (!iterator.hasNext())
			{
				// û��Ԫ�أ�˵���޷��ٴӸõ�����ȡԪ���ˣ�ֱ�ӳ�ջ
				stack.pop();
				return hasNext();
			}

			return true;
		} else
		{
			return false;
		}
	}

	@Override
	public JsonComponent next()
	{
		Iterator<JsonComponent> iterator = stack.peek();
		JsonComponent item = iterator.next();
		// �жϵ�ǰpeek���ĵ�����Ԫ���Ƿ���Ҷ��Ԫ��
		if (item instanceof JsonLeaf)
		{
			// ����ǣ���ѹջ
			// ����д�����ģʽ��item.createIterator()�����Ǵ���һЩ���⣬�ᵼ��Ҷ�ӽڵ��ظ�������
			stack.push(item.getComponentList().iterator());
		}
		
		return item;
	}
}
