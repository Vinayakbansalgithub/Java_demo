package StringPackage;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class StringConstantPool<T> {
	private ConcurrentMap<T, T> map = new ConcurrentHashMap<>();

	public T get(T object) {
		T old = map.putIfAbsent(object, object);

		System.out.println(old);
		System.out.println(map.size() + "------");

		return old == null ? object : old;
	}

	public static void main(String[] args) {
		final StringConstantPool<String> stringPool = new StringConstantPool<>();

		stringPool.get("vinayak");
		stringPool.get("vinayak");
		stringPool.get("vinayak");
		stringPool.get("vinayakbansal");

		Iterator itr = stringPool.map.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry e = (Map.Entry) itr.next();

			System.out.println(e.getValue() + "================" + e.getKey());
		}

	}
}
