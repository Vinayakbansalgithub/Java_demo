package GeneralTopics;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.collections4.map.MultiValueMap;

public class IpAddress {

	static String generateIp() {

		Random r = new Random();
		return r.nextInt(2) + "." + r.nextInt(1) + "." + r.nextInt(2) + "." + r.nextInt(1);

	}

	static Date generateTimeStamp() {
		// return new Date(ThreadLocalRandom.current().nextInt() * 1000L);

		Random random = new Random();
		final int millisInDay = 24 * 60 * 60 * 1000;
		Time time = new Time((long) random.nextInt(millisInDay));
		return time;
	}

	public static void main(String[] args) {

		MultiValueMap<String, Date> map = new MultiValueMap<>();
		Map<String, Integer> bussiest = new HashMap<>();
		Map<String, Set<String>> distinct = new HashMap<String, Set<String>>();

		for (int i = 0; i < 25; i++) {
			map.put(generateIp(), generateTimeStamp());

		}

		Set set = map.entrySet();
		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			Map.Entry<String, Date> e = (Map.Entry) itr.next();

			// System.out.println("key is " + e.getKey() + " value " + e.getValue());

			ArrayList<String> times = new ArrayList<String>();
			SimpleDateFormat sdf = new SimpleDateFormat("hh a");
			Calendar calendar = GregorianCalendar.getInstance();

			List<Date> list = (List<Date>) map.get(e.getKey());

			for (Date date : list) {
				calendar.setTime(date);

				String hour = sdf.format(calendar.getTime());
				// System.out.println("Initial time: " + hour);

				if (bussiest.containsKey(hour)) {
					bussiest.put(hour, bussiest.get(hour) + 1);
				} else {
					bussiest.put(hour, 1);

				}
			}

		}
//		set = bussiest.entrySet();
//		itr = set.iterator();
//		while (itr.hasNext()) {
//			Map.Entry<String, Date> e = (Map.Entry) itr.next();
//			System.out.println("hour is " + e.getKey() + "   value " + e.getValue());
//		}

		System.out.println("busy------");
//		final Map<String, Integer> sortedByCount = bussiest.entrySet()
//				.stream()
//				.sorted(Map.Entry.comparingByValue())
//				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		final Map<String, Integer> sortedByCount = bussiest.entrySet().stream()
				.sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		set = sortedByCount.entrySet();
		itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Date> e = (Map.Entry) itr.next();
			System.out.println("hour is " + e.getKey() + "   value " + e.getValue());

		}

		System.out.println("distinct=======");
		
		
		

		set = map.entrySet();
		itr = set.iterator();

		while (itr.hasNext()) {
			Map.Entry<String, Date> e = (Map.Entry) itr.next();

			// System.out.println("key is " + e.getKey() + " value " + e.getValue());

			SimpleDateFormat sdf = new SimpleDateFormat("hh a");
			Calendar calendar = GregorianCalendar.getInstance();

			List<Date> list = (List<Date>) map.get(e.getKey());

			for (Date date : list) {
				calendar.setTime(date);

				String hour = sdf.format(calendar.getTime());
				// System.out.println("Initial time: " + hour);

				if (distinct.containsKey(hour)) {

					distinct.get(hour).add(e.getKey());
					// System.out.println("isAdded "+isAded);
				} else {
					Set setIp = new HashSet<>();
					setIp.add(e.getKey());
					distinct.put(hour, setIp);

				}
			}

//			
//			calendar.setTime(e.getValue());
//
//			String hour = sdf.format(calendar.getTime());
//			System.out.println("Initial time:  " + hour);
//
//			if (distinct.containsKey(hour)) {
//				boolean isAded=distinct.get(hour).add(e.getKey());
//				System.out.println("isAdded "+isAded);
//			
//			} else {
//				Set setIp=new HashSet<>();
//				setIp.add( e.getKey());
//				distinct.put(hour, setIp);
//
//			}

		}
		set = distinct.entrySet();
		itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Date> e = (Map.Entry) itr.next();

			Set setIps = (Set) e.getValue();

			System.out.println("hour is " + e.getKey() + "   value " + setIps.size());

		}

	}

}
