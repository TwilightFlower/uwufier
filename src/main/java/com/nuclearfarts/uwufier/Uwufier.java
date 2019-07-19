package com.nuclearfarts.uwufier;

public class Uwufier {
	
	public static String uwu(String str) {
		return str.replace('r', 'w').replace('R', 'W').replace('l', 'w').replace('L', 'W').replace("th", "d").replace("Th", "D").replace("tH", "d").replace("TH", "D");
	}
}
