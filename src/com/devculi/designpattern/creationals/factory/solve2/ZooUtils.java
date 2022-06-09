package com.devculi.designpattern.creationals.factory.solve2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.devculi.designpattern.creationals.factory.bean.Fish;

public class ZooUtils {

	public static Map<String, Fish> collectFishesTypeToMap(List<Fish> fishes) {
		Map<String, Fish> fishesMap = new HashMap<>();
		fishes.forEach(fish -> {
			fishesMap.put(fish.getName(), fish);
		});
		return fishesMap;
	}

}
