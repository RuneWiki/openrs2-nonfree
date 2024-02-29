package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aki")
public class Class136_Sub1 extends Class136 {

	@OriginalMember(owner = "client!aki", name = "bm", descriptor = "I")
	static int anInt1706 = 0;

	@OriginalMember(owner = "client!aki", name = "bo", descriptor = "I")
	static int anInt1698 = 752461685;

	@OriginalMember(owner = "client!aki", name = "bk", descriptor = "I")
	static int anInt1709 = -401515070;

	@OriginalMember(owner = "client!aki", name = "br", descriptor = "I")
	static int anInt1707 = -1577514632;

	@OriginalMember(owner = "client!aki", name = "bq", descriptor = "I")
	public static int anInt1700 = 1887617585;

	@OriginalMember(owner = "client!aki", name = "bh", descriptor = "I")
	public static int anInt1701 = 1557660430;

	@OriginalMember(owner = "client!aki", name = "be", descriptor = "I")
	public static int anInt1702 = 0;

	@OriginalMember(owner = "client!aki", name = "cl", descriptor = "I")
	static int anInt1703 = 1421361991;

	@OriginalMember(owner = "client!aki", name = "cp", descriptor = "I")
	static int anInt1704 = -2017528667;

	@OriginalMember(owner = "client!aki", name = "cz", descriptor = "Z")
	static boolean aBoolean341 = false;

	@OriginalMember(owner = "client!aki", name = "cr", descriptor = "I")
	static int anInt1699 = -2119321151;

	@OriginalMember(owner = "client!aki", name = "cx", descriptor = "I")
	static int anInt1705 = -177934039;

	@OriginalMember(owner = "client!aki", name = "ct", descriptor = "Z")
	static boolean aBoolean344 = false;

	@OriginalMember(owner = "client!aki", name = "cv", descriptor = "[[Lclient!dj;")
	static Class94[][] aClass94ArrayArray1 = new Class94[3][5];

	@OriginalMember(owner = "client!aki", name = "cu", descriptor = "[[Lclient!aar;")
	static Class17[][] aClass17ArrayArray1 = new Class17[3][5];

	@OriginalMember(owner = "client!aki", name = "co", descriptor = "Ljava/util/HashMap;")
	static HashMap aHashMap5 = new HashMap();

	@OriginalMember(owner = "client!aki", name = "cn", descriptor = "Ljava/util/HashMap;")
	static HashMap aHashMap4 = new HashMap();

	@OriginalMember(owner = "client!aki", name = "cq", descriptor = "I")
	static int anInt1697 = anInt1700 * -1926359745;

	@OriginalMember(owner = "client!aki", name = "cy", descriptor = "I")
	static int anInt1708 = anInt1701 * -1435674875;

	@OriginalMember(owner = "client!aki", name = "cs", descriptor = "Z")
	static boolean aBoolean349 = false;

	@OriginalMember(owner = "client!aki", name = "cj", descriptor = "Z")
	public static boolean aBoolean345 = false;

	@OriginalMember(owner = "client!aki", name = "ce", descriptor = "Lclient!aak;")
	public static Class12 aClass12_15 = new Class12(8);

	@OriginalMember(owner = "client!aki", name = "do", descriptor = "Lclient!aak;")
	public static Class12 aClass12_16 = new Class12(8);

	@OriginalMember(owner = "client!aki", name = "dt", descriptor = "Lclient!zw;")
	static Class704 aClass704_1 = new Class704(new Class695());

	@OriginalMember(owner = "client!aki", name = "dh", descriptor = "Z")
	public static boolean aBoolean346 = false;

	@OriginalMember(owner = "client!aki", name = "dq", descriptor = "Z")
	public static boolean aBoolean347 = false;

	@OriginalMember(owner = "client!aki", name = "dn", descriptor = "Z")
	public static boolean aBoolean348 = false;

	@OriginalMember(owner = "client!aki", name = "dv", descriptor = "Z")
	static boolean aBoolean340 = false;

	@OriginalMember(owner = "client!aki", name = "da", descriptor = "Z")
	static boolean aBoolean343 = false;

	@OriginalMember(owner = "client!aki", name = "dy", descriptor = "Z")
	static boolean aBoolean342 = false;

	@OriginalMember(owner = "client!aki", name = "<init>", descriptor = "()V", line = 84)
	Class136_Sub1() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!aki", name = "ea", descriptor = "(Lclient!dx;Lclient!dp;)V", line = 89)
	static final void method14005(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class209 arg1) {
		if (anInt1702 * -1857977261 == 100 || aClass77_Sub1_Sub8_2 == null) {
			return;
		}
		Class280.method26667();
		Class280.method26667();
		@Pc(20) int local20;
		@Pc(26) int local26;
		if (anInt1702 * -1857977261 < 10) {
			for (local20 = 0; local20 < aClass94ArrayArray1.length; local20++) {
				for (local26 = 0; local26 < aClass94ArrayArray1[local20].length; local26++) {
					Class470.aClass478_125.method29730(aClass619_2.anIntArrayArray63[local20][local26]);
					Class145.aClass478_46.method29730(aClass619_2.anIntArrayArray63[local20][local26]);
				}
			}
			if (!aClass478_38.method29787(aClass77_Sub1_Sub8_2.aString105)) {
				anInt1702 = Class52.aClass478_9.method29789(aClass77_Sub1_Sub8_2.aString105) / 10 * -1532796965;
				return;
			}
			anInt1702 = 1851899534;
		}
		if (anInt1702 * -1857977261 == 10) {
			anInt1674 = aClass77_Sub1_Sub8_2.anInt3003 * -192382841 >> 6 << 6;
			anInt1675 = aClass77_Sub1_Sub8_2.anInt3009 * -1004159431 >> 6 << 6;
			anInt1676 = (aClass77_Sub1_Sub8_2.anInt3008 * 36458189 >> 6 << 6) - anInt1674 + 64;
			anInt1677 = (aClass77_Sub1_Sub8_2.anInt3010 * 189160645 >> 6 << 6) - anInt1675 + 64;
			@Pc(127) int[] local127 = new int[3];
			local26 = -1;
			@Pc(131) int local131 = -1;
			@Pc(135) Class447 local135 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61;
			@Pc(139) Class595 local139 = client.aClass517_1.method30409();
			if (aClass77_Sub1_Sub8_2.method21866(Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100, local139.anInt5504 * -424199969 + ((int) local135.aFloat277 >> 9), ((int) local135.aFloat278 >> 9) + local139.anInt5506 * -1166289421, local127)) {
				local26 = local127[1] - anInt1674;
				local131 = local127[2] - anInt1675;
			}
			if (!aBoolean344 && local26 >= 0 && local26 < anInt1676 && local131 >= 0 && local131 < anInt1677) {
				local26 += (int) (Math.random() * 10.0D) - 5;
				local131 += (int) (Math.random() * 10.0D) - 5;
				Class88.anInt610 = local26 * 704227181;
				Class349.anInt4496 = local131 * 980626489;
			} else if (anInt1699 * -1404917313 == -1 || -2064661273 * anInt1705 == -1) {
				aClass77_Sub1_Sub8_2.method21864(aClass77_Sub1_Sub8_2.anInt3007 * -1320299993 >> 14 & 0x3FFF, aClass77_Sub1_Sub8_2.anInt3007 * -1320299993 & 0x3FFF, local127);
				Class88.anInt610 = (local127[1] - anInt1674) * 704227181;
				Class349.anInt4496 = (local127[2] - anInt1675) * 980626489;
			} else {
				aClass77_Sub1_Sub8_2.method21864(anInt1699 * -1404917313, anInt1705 * -2064661273, local127);
				if (local127 != null) {
					Class88.anInt610 = (local127[1] - anInt1674) * 704227181;
					Class349.anInt4496 = (local127[2] - anInt1675) * 980626489;
				}
				anInt1705 = -177934039;
				anInt1699 = -2119321151;
				aBoolean344 = false;
			}
			if (aClass77_Sub1_Sub8_2.anInt3006 * 646871815 == 25) {
				aFloat151 = 2.0F;
				aFloat152 = 2.0F;
			} else if (aClass77_Sub1_Sub8_2.anInt3006 * 646871815 == 37) {
				aFloat151 = 3.0F;
				aFloat152 = 3.0F;
			} else if (aClass77_Sub1_Sub8_2.anInt3006 * 646871815 == 50) {
				aFloat151 = 4.0F;
				aFloat152 = 4.0F;
			} else if (aClass77_Sub1_Sub8_2.anInt3006 * 646871815 == 75) {
				aFloat151 = 6.0F;
				aFloat152 = 6.0F;
			} else if (aClass77_Sub1_Sub8_2.anInt3006 * 646871815 == 100) {
				aFloat151 = 8.0F;
				aFloat152 = 8.0F;
			} else if (aClass77_Sub1_Sub8_2.anInt3006 * 646871815 == 200) {
				aFloat151 = 16.0F;
				aFloat152 = 16.0F;
			} else {
				aFloat151 = 8.0F;
				aFloat152 = 8.0F;
			}
			anInt1685 = (int) aFloat152 >> 1;
			aByteArrayArrayArray11 = Class96_Sub19.method7726(anInt1685);
			Class608.method32139();
			method13898();
			Class612.aClass695_52 = new Class695();
			anInt1669 += (int) (Math.random() * 5.0D) - 2;
			if (anInt1669 < -8) {
				anInt1669 = -8;
			}
			if (anInt1669 > 8) {
				anInt1669 = 8;
			}
			anInt1670 += (int) (Math.random() * 5.0D) - 2;
			if (anInt1670 < -16) {
				anInt1670 = -16;
			}
			if (anInt1670 > 16) {
				anInt1670 = 16;
			}
			method13915(arg1, anInt1669 >> 2 << 10, anInt1670 >> 1);
			aClass35_Sub10_2.method17150(1024, 256);
			aClass35_Sub18_3.method17668(256, 256);
			aClass35_Sub12_8.method18326(4096);
			Class61.aClass35_Sub11_1.method18326(256);
			anInt1702 = -591168228;
		} else if (anInt1702 * -1857977261 == 20) {
			if (!aBoolean338) {
				Class214.method25634(true);
				method13929(arg0, anInt1669, anInt1670, aBoolean338);
				anInt1702 = -1773504684;
				Class214.method25634(true);
				Class138.method14216();
			} else if (method13929(arg0, anInt1669, anInt1670, aBoolean338)) {
				anInt1702 = -1773504684;
			}
		} else if (anInt1702 * -1857977261 == 60) {
			if (aClass478_38.method29770(aClass77_Sub1_Sub8_2.aString105)) {
				if (!aClass478_38.method29787(aClass77_Sub1_Sub8_2.aString105)) {
					return;
				}
				aClass529_2 = Class379.method28303(aClass478_38, aClass77_Sub1_Sub8_2.aString105, client.aBoolean613);
			} else {
				aClass529_2 = new Class529(0);
			}
			method13937();
			anInt1702 = 78394850;
			Class214.method25634(true);
			Class138.method14216();
		} else if (anInt1702 * -1857977261 >= 70) {
			local20 = 0;
			while (true) {
				if (local20 >= 3) {
					anInt1702 = 1339126156;
					System.gc();
					break;
				}
				for (local26 = 0; local26 < 5; local26++) {
					if (aClass94ArrayArray1[local20][local26] == null || aClass17ArrayArray1[local20][local26] == null) {
						aClass94ArrayArray1[local20][local26] = (Class94) Class367.aClass415_1.method28640(client.anInterface51_1, aClass619_2.anIntArrayArray63[local20][local26], true, true);
						aClass17ArrayArray1[local20][local26] = Class367.aClass415_1.method28644(client.anInterface51_1, aClass619_2.anIntArrayArray63[local20][local26]);
						if (aClass94ArrayArray1[local20][local26] == null || aClass17ArrayArray1[local20][local26] == null) {
							return;
						}
						anInt1702 += -303423599;
					}
				}
				local20++;
			}
		}
	}

	@OriginalMember(owner = "client!aki", name = "el", descriptor = "()V", line = 232)
	static void method14006() {
		if (Class88.anInt610 * 204700261 < 0) {
			Class88.anInt610 = 0;
			anInt1703 = 1421361991;
			anInt1704 = -2017528667;
		}
		if (Class88.anInt610 * 204700261 > anInt1676) {
			Class88.anInt610 = anInt1676 * 704227181;
			anInt1703 = 1421361991;
			anInt1704 = -2017528667;
		}
		if (Class349.anInt4496 * -1636630007 < 0) {
			Class349.anInt4496 = 0;
			anInt1703 = 1421361991;
			anInt1704 = -2017528667;
		}
		if (Class349.anInt4496 * -1636630007 > anInt1677) {
			Class349.anInt4496 = anInt1677 * 980626489;
			anInt1703 = 1421361991;
			anInt1704 = -2017528667;
		}
	}

	@OriginalMember(owner = "client!aki", name = "ec", descriptor = "()V", line = 232)
	static void method14007() {
		if (Class88.anInt610 * 204700261 < 0) {
			Class88.anInt610 = 0;
			anInt1703 = 1421361991;
			anInt1704 = -2017528667;
		}
		if (Class88.anInt610 * 204700261 > anInt1676) {
			Class88.anInt610 = anInt1676 * 704227181;
			anInt1703 = 1421361991;
			anInt1704 = -2017528667;
		}
		if (Class349.anInt4496 * -1636630007 < 0) {
			Class349.anInt4496 = 0;
			anInt1703 = 1421361991;
			anInt1704 = -2017528667;
		}
		if (Class349.anInt4496 * -1636630007 > anInt1677) {
			Class349.anInt4496 = anInt1677 * 980626489;
			anInt1703 = 1421361991;
			anInt1704 = -2017528667;
		}
	}

	@OriginalMember(owner = "client!aki", name = "eg", descriptor = "()V", line = 255)
	static void method14008() {
		Class612.aClass695_52 = null;
		anInt1702 = 0;
		anInt1687 = 0;
		Class267.aClass277_10 = null;
		method13901();
		aClass695_23.method36380();
		aClass529_2 = null;
		aClass232_25.method25850();
		aClass232_26.method25850();
		Class233.aClass83_24 = null;
		anInt1703 = 1421361991;
		anInt1704 = -2017528667;
		if (aClass35_Sub10_2 != null) {
			aClass35_Sub10_2.method18331();
			aClass35_Sub10_2.method17150(128, 64);
		}
		if (aClass35_Sub18_3 != null) {
			aClass35_Sub18_3.method17668(64, 64);
		}
		if (aClass35_Sub12_8 != null) {
			aClass35_Sub12_8.method18326(256);
		}
		Class61.aClass35_Sub11_1.method18326(64);
	}

	@OriginalMember(owner = "client!aki", name = "ey", descriptor = "()V", line = 255)
	static void method14009() {
		Class612.aClass695_52 = null;
		anInt1702 = 0;
		anInt1687 = 0;
		Class267.aClass277_10 = null;
		method13901();
		aClass695_23.method36380();
		aClass529_2 = null;
		aClass232_25.method25850();
		aClass232_26.method25850();
		Class233.aClass83_24 = null;
		anInt1703 = 1421361991;
		anInt1704 = -2017528667;
		if (aClass35_Sub10_2 != null) {
			aClass35_Sub10_2.method18331();
			aClass35_Sub10_2.method17150(128, 64);
		}
		if (aClass35_Sub18_3 != null) {
			aClass35_Sub18_3.method17668(64, 64);
		}
		if (aClass35_Sub12_8 != null) {
			aClass35_Sub12_8.method18326(256);
		}
		Class61.aClass35_Sub11_1.method18326(64);
	}

	@OriginalMember(owner = "client!aki", name = "eb", descriptor = "()V", line = 255)
	static void method14010() {
		Class612.aClass695_52 = null;
		anInt1702 = 0;
		anInt1687 = 0;
		Class267.aClass277_10 = null;
		method13901();
		aClass695_23.method36380();
		aClass529_2 = null;
		aClass232_25.method25850();
		aClass232_26.method25850();
		Class233.aClass83_24 = null;
		anInt1703 = 1421361991;
		anInt1704 = -2017528667;
		if (aClass35_Sub10_2 != null) {
			aClass35_Sub10_2.method18331();
			aClass35_Sub10_2.method17150(128, 64);
		}
		if (aClass35_Sub18_3 != null) {
			aClass35_Sub18_3.method17668(64, 64);
		}
		if (aClass35_Sub12_8 != null) {
			aClass35_Sub12_8.method18326(256);
		}
		Class61.aClass35_Sub11_1.method18326(64);
	}

	@OriginalMember(owner = "client!aki", name = "ev", descriptor = "()V", line = 293)
	static void method14011() {
		Class208.method25580();
		aClass77_Sub1_Sub8_2 = null;
		Class524.aClass77_Sub1_Sub8_4 = null;
		aClass12_15.method188();
		aClass12_16.method188();
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
				aClass94ArrayArray1[local13][local18] = null;
				aClass17ArrayArray1[local13][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!aki", name = "fq", descriptor = "()V", line = 293)
	static void method14012() {
		Class208.method25580();
		aClass77_Sub1_Sub8_2 = null;
		Class524.aClass77_Sub1_Sub8_4 = null;
		aClass12_15.method188();
		aClass12_16.method188();
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
				aClass94ArrayArray1[local13][local18] = null;
				aClass17ArrayArray1[local13][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!aki", name = "fv", descriptor = "()V", line = 293)
	static void method14013() {
		Class208.method25580();
		aClass77_Sub1_Sub8_2 = null;
		Class524.aClass77_Sub1_Sub8_4 = null;
		aClass12_15.method188();
		aClass12_16.method188();
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
				aClass94ArrayArray1[local13][local18] = null;
				aClass17ArrayArray1[local13][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!aki", name = "ez", descriptor = "()V", line = 293)
	static void method14014() {
		Class208.method25580();
		aClass77_Sub1_Sub8_2 = null;
		Class524.aClass77_Sub1_Sub8_4 = null;
		aClass12_15.method188();
		aClass12_16.method188();
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
				aClass94ArrayArray1[local13][local18] = null;
				aClass17ArrayArray1[local13][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!aki", name = "ek", descriptor = "()V", line = 293)
	static void method14015() {
		Class208.method25580();
		aClass77_Sub1_Sub8_2 = null;
		Class524.aClass77_Sub1_Sub8_4 = null;
		aClass12_15.method188();
		aClass12_16.method188();
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
				aClass94ArrayArray1[local13][local18] = null;
				aClass17ArrayArray1[local13][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!aki", name = "fl", descriptor = "(Lclient!dx;IIII)V", line = 307)
	static void method14016(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg0.method20151(arg1, arg2, arg1 + arg3, arg2 + arg4);
		@Pc(22) int local22;
		@Pc(32) int local32;
		if (anInt1702 * -1857977261 < 100) {
			@Pc(16) byte local16 = 20;
			local22 = arg1 + arg3 / 2;
			local32 = arg2 + arg4 / 2 - 18 - local16;
			arg0.method20088(arg1, arg2, arg3, arg4, -16777216, 0);
			arg0.method20087(local22 - 152, local32, 304, 34, client.aColorArray2[client.anInt3379 * -859311063].getRGB(), 0);
			arg0.method20088(local22 - 150, local32 + 2, anInt1702 * -1278964487, 30, client.aColorArray1[client.anInt3379 * -859311063].getRGB(), 0);
			Class260.aClass94_8.method7612(Class44.aClass44_160.method713(Class128.aClass667_3), local22, local32 + local16, client.aColorArray3[client.anInt3379 * -859311063].getRGB(), -1);
			return;
		}
		@Pc(103) int local103 = Class88.anInt610 * 204700261 - (int) ((float) arg3 / aFloat151);
		local22 = Class349.anInt4496 * -1636630007 + (int) ((float) arg4 / aFloat151);
		local32 = Class88.anInt610 * 204700261 + (int) ((float) arg3 / aFloat151);
		@Pc(133) int local133 = Class349.anInt4496 * -1636630007 - (int) ((float) arg4 / aFloat151);
		Class657.anInt5768 = (Class88.anInt610 * 204700261 - (int) ((float) arg3 / aFloat151)) * 1062791895;
		Class115.anInt2917 = (Class349.anInt4496 * -1636630007 - (int) ((float) arg4 / aFloat151)) * -304732319;
		Class551.anInt5221 = (int) ((float) (arg3 * 2) / aFloat151) * 2055893919;
		Class566.anInt5341 = (int) ((float) (arg4 * 2) / aFloat151) * -1977075073;
		aClass232_24 = aClass232_25;
		method13941(local103 + anInt1674, anInt1675 + local22, local32 + anInt1674, anInt1675 + local133, arg1, arg2, arg3 + arg1, arg4 + 1 + arg2);
		method13944(arg0, !aBoolean340, !aBoolean343, client.aBoolean613, false);
		@Pc(219) Class695 local219 = method13965(arg0);
		Class115_Sub3.method21238(arg0, local219, 0, 0);
		if (client.aBoolean626) {
			@Pc(233) int local233 = arg1 + arg3 - 5;
			@Pc(239) int local239 = arg2 + arg4 - 8;
			Class128_Sub1.aClass94_5.method7607("Fps: " + Class504.anInt3362 * 1720947399 + " (" + Class504.anInt3363 * -482787859 + " ms)", local233, local239, 16776960, -1);
			@Pc(265) int local265 = local239 - 15;
			@Pc(267) Runtime local267 = Runtime.getRuntime();
			@Pc(276) int local276 = (int) ((local267.totalMemory() - local267.freeMemory()) / 1024L);
			@Pc(278) int local278 = 16776960;
			if (local276 > 65536) {
				local278 = 16711680;
			}
			Class128_Sub1.aClass94_5.method7607("Mem:" + local276 + "k", local233, local265, local278, -1);
			local239 = local265 - 15;
		}
		aClass232_25.method25847(5);
	}

	@OriginalMember(owner = "client!aki", name = "fm", descriptor = "(Lclient!dx;IIII)V", line = 307)
	static void method14017(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg0.method20151(arg1, arg2, arg1 + arg3, arg2 + arg4);
		@Pc(22) int local22;
		@Pc(32) int local32;
		if (anInt1702 * -1857977261 < 100) {
			@Pc(16) byte local16 = 20;
			local22 = arg1 + arg3 / 2;
			local32 = arg2 + arg4 / 2 - 18 - local16;
			arg0.method20088(arg1, arg2, arg3, arg4, -16777216, 0);
			arg0.method20087(local22 - 152, local32, 304, 34, client.aColorArray2[client.anInt3379 * -859311063].getRGB(), 0);
			arg0.method20088(local22 - 150, local32 + 2, anInt1702 * -1278964487, 30, client.aColorArray1[client.anInt3379 * -859311063].getRGB(), 0);
			Class260.aClass94_8.method7612(Class44.aClass44_160.method713(Class128.aClass667_3), local22, local32 + local16, client.aColorArray3[client.anInt3379 * -859311063].getRGB(), -1);
			return;
		}
		@Pc(103) int local103 = Class88.anInt610 * 204700261 - (int) ((float) arg3 / aFloat151);
		local22 = Class349.anInt4496 * -1636630007 + (int) ((float) arg4 / aFloat151);
		local32 = Class88.anInt610 * 204700261 + (int) ((float) arg3 / aFloat151);
		@Pc(133) int local133 = Class349.anInt4496 * -1636630007 - (int) ((float) arg4 / aFloat151);
		Class657.anInt5768 = (Class88.anInt610 * 204700261 - (int) ((float) arg3 / aFloat151)) * 1062791895;
		Class115.anInt2917 = (Class349.anInt4496 * -1636630007 - (int) ((float) arg4 / aFloat151)) * -304732319;
		Class551.anInt5221 = (int) ((float) (arg3 * 2) / aFloat151) * 2055893919;
		Class566.anInt5341 = (int) ((float) (arg4 * 2) / aFloat151) * -1977075073;
		aClass232_24 = aClass232_25;
		method13941(local103 + anInt1674, anInt1675 + local22, local32 + anInt1674, anInt1675 + local133, arg1, arg2, arg3 + arg1, arg4 + 1 + arg2);
		method13944(arg0, !aBoolean340, !aBoolean343, client.aBoolean613, false);
		@Pc(219) Class695 local219 = method13965(arg0);
		Class115_Sub3.method21238(arg0, local219, 0, 0);
		if (client.aBoolean626) {
			@Pc(233) int local233 = arg1 + arg3 - 5;
			@Pc(239) int local239 = arg2 + arg4 - 8;
			Class128_Sub1.aClass94_5.method7607("Fps: " + Class504.anInt3362 * 1720947399 + " (" + Class504.anInt3363 * -482787859 + " ms)", local233, local239, 16776960, -1);
			@Pc(265) int local265 = local239 - 15;
			@Pc(267) Runtime local267 = Runtime.getRuntime();
			@Pc(276) int local276 = (int) ((local267.totalMemory() - local267.freeMemory()) / 1024L);
			@Pc(278) int local278 = 16776960;
			if (local276 > 65536) {
				local278 = 16711680;
			}
			Class128_Sub1.aClass94_5.method7607("Mem:" + local276 + "k", local233, local265, local278, -1);
			local239 = local265 - 15;
		}
		aClass232_25.method25847(5);
	}

	@OriginalMember(owner = "client!aki", name = "ft", descriptor = "(Lclient!dx;Lclient!zm;II)V", line = 347)
	static void method14018(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class695 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class612.aClass695_52.method36380();
		if (aBoolean345) {
			return;
		}
		for (@Pc(10) Class77_Sub30 local10 = (Class77_Sub30) arg1.method36395(); local10 != null; local10 = (Class77_Sub30) arg1.method36406()) {
			@Pc(21) Class302 local21 = (Class302) aClass35_Sub10_2.method18319(local10.anInt1635 * 1592054281);
			if (Class260.method26251(local21)) {
				@Pc(34) boolean local34 = Class319.method27445(arg0, local10, local21, arg2, arg3);
				if (local34) {
					Class593.method31848(arg0, local10, local21);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aki", name = "fe", descriptor = "(Lclient!hl;)Z", line = 358)
	static boolean method14019(@OriginalArg(0) Class302 arg0) {
		if (arg0 == null) {
			return false;
		}
		if (arg0.anIntArray420 != null) {
			arg0 = arg0.method27153(anInterface17_2, anInterface19_2);
			if (arg0 == null) {
				return false;
			}
		}
		if (!arg0.aBoolean693) {
			return false;
		} else if (!arg0.method27136(anInterface17_2, anInterface19_2)) {
			return false;
		} else if (aClass12_15.method173((long) (arg0.anInt4018 * 1390042623)) != null) {
			return false;
		} else if (aClass12_16.method173((long) (arg0.anInt4027 * -15128681)) == null) {
			if (arg0.aString189 != null) {
				if (arg0.anInt4031 * 638004337 == 0 && aBoolean346) {
					return false;
				}
				if (arg0.anInt4031 * 638004337 == 1 && aBoolean347) {
					return false;
				}
				if (arg0.anInt4031 * 638004337 == 2 && aBoolean348) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aki", name = "fk", descriptor = "(Lclient!hl;)Z", line = 358)
	static boolean method14020(@OriginalArg(0) Class302 arg0) {
		if (arg0 == null) {
			return false;
		}
		if (arg0.anIntArray420 != null) {
			arg0 = arg0.method27153(anInterface17_2, anInterface19_2);
			if (arg0 == null) {
				return false;
			}
		}
		if (!arg0.aBoolean693) {
			return false;
		} else if (!arg0.method27136(anInterface17_2, anInterface19_2)) {
			return false;
		} else if (aClass12_15.method173((long) (arg0.anInt4018 * 1390042623)) != null) {
			return false;
		} else if (aClass12_16.method173((long) (arg0.anInt4027 * -15128681)) == null) {
			if (arg0.aString189 != null) {
				if (arg0.anInt4031 * 638004337 == 0 && aBoolean346) {
					return false;
				}
				if (arg0.anInt4031 * 638004337 == 1 && aBoolean347) {
					return false;
				}
				if (arg0.anInt4031 * 638004337 == 2 && aBoolean348) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aki", name = "fw", descriptor = "(Lclient!dx;Lclient!akg;Lclient!hl;)V", line = 572)
	static void method14021(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class77_Sub30 arg1, @OriginalArg(2) Class302 arg2) {
		@Pc(4) Class83 local4 = arg2.method27143(arg0);
		if (local4 == null) {
			return;
		}
		@Pc(10) int local10 = local4.method18169();
		if (local4.method18171() > local10) {
			local10 = local4.method18171();
		}
		@Pc(19) byte local19 = 10;
		@Pc(24) int local24 = arg1.anInt1637 * 2139882933;
		@Pc(29) int local29 = arg1.anInt1634 * 917865515;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		if (arg2.aString189 != null) {
			local33 = Class266.aClass17_10.method312(arg2.aString189, Class149_Sub4.anInt2368 * 1771907305, 0, null);
			local31 = Class266.aClass17_10.method308(arg2.aString189, Class149_Sub4.anInt2368 * 1771907305, null);
		}
		@Pc(67) int local67 = arg1.anInt1637 * 2139882933 + local10 / 2;
		@Pc(72) int local72 = arg1.anInt1634 * 917865515;
		if (local24 < anInt1693 + local10) {
			local24 = anInt1693;
			local67 = local19 + 5 + anInt1693 + local10 / 2 + local31 / 2;
		} else if (local24 > anInt1695 - local10) {
			local24 = anInt1695 - local10;
			local67 = anInt1695 - local10 / 2 - local19 - local31 / 2 - 5;
		}
		if (local29 < anInt1694 + local10) {
			local29 = anInt1694;
			local72 = local10 / 2 + anInt1694 + local19;
		} else if (local29 > anInt1678 - local10) {
			local29 = anInt1678 - local10;
			local72 = anInt1678 - local10 / 2 - local19 - local33;
		}
		@Pc(175) int local175 = (int) (Math.atan2((double) (local24 - arg1.anInt1637 * 2139882933), (double) (local29 - arg1.anInt1634 * 917865515)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local4.method18142((float) local10 / 2.0F + (float) local24, (float) local10 / 2.0F + (float) local29, 4096, local175);
		@Pc(195) int local195 = -2;
		@Pc(197) int local197 = -2;
		@Pc(199) int local199 = -2;
		@Pc(201) int local201 = -2;
		if (arg2.aString189 != null) {
			local195 = local67 - local31 / 2 - 5;
			local197 = local72;
			local199 = local31 + local195 + 10;
			local201 = local72 + local33 + 3;
			if (arg2.anInt4026 * 1313711519 != 0) {
				arg0.method19986(local195, local72, local199 - local195, local201 - local72, arg2.anInt4026 * 1313711519);
			}
			if (arg2.anInt4049 * -2045123201 != 0) {
				arg0.method19982(local195, local72, local199 - local195, local201 - local72, arg2.anInt4049 * -2045123201);
			}
			Class581.aClass94_12.method7614(arg2.aString189, local67, local72, local31, local33, arg2.anInt4021 * -1512587879 | 0xFF000000, aClass619_2.anInt5627 * 335392643, 1, 0, 0, null, null, null, 0, 0);
		}
		if (arg2.anInt4019 * 1747122653 == -1 && arg2.aString189 == null) {
			return;
		}
		@Pc(309) Class77_Sub19 local309 = new Class77_Sub19(arg1);
		local309.anInt1520 = (local24 - local10 / 2) * -773567207;
		local309.anInt1522 = (local24 + local10 / 2) * -1946346005;
		local309.anInt1519 = (local29 - local10) * -1190860309;
		local309.anInt1518 = local29 * -1010377381;
		local309.anInt1521 = local195 * 869904827;
		local309.anInt1517 = local199 * -536426739;
		local309.anInt1523 = local197 * -2069055837;
		local309.anInt1524 = local201 * -1973105707;
		Class612.aClass695_52.method36383(local309);
	}

	@OriginalMember(owner = "client!aki", name = "fi", descriptor = "(Lclient!dx;Lclient!akg;Lclient!hl;)V", line = 572)
	static void method14022(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class77_Sub30 arg1, @OriginalArg(2) Class302 arg2) {
		@Pc(4) Class83 local4 = arg2.method27143(arg0);
		if (local4 == null) {
			return;
		}
		@Pc(10) int local10 = local4.method18169();
		if (local4.method18171() > local10) {
			local10 = local4.method18171();
		}
		@Pc(19) byte local19 = 10;
		@Pc(24) int local24 = arg1.anInt1637 * 2139882933;
		@Pc(29) int local29 = arg1.anInt1634 * 917865515;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		if (arg2.aString189 != null) {
			local33 = Class266.aClass17_10.method312(arg2.aString189, Class149_Sub4.anInt2368 * 1771907305, 0, null);
			local31 = Class266.aClass17_10.method308(arg2.aString189, Class149_Sub4.anInt2368 * 1771907305, null);
		}
		@Pc(67) int local67 = arg1.anInt1637 * 2139882933 + local10 / 2;
		@Pc(72) int local72 = arg1.anInt1634 * 917865515;
		if (local24 < anInt1693 + local10) {
			local24 = anInt1693;
			local67 = local19 + 5 + anInt1693 + local10 / 2 + local31 / 2;
		} else if (local24 > anInt1695 - local10) {
			local24 = anInt1695 - local10;
			local67 = anInt1695 - local10 / 2 - local19 - local31 / 2 - 5;
		}
		if (local29 < anInt1694 + local10) {
			local29 = anInt1694;
			local72 = local10 / 2 + anInt1694 + local19;
		} else if (local29 > anInt1678 - local10) {
			local29 = anInt1678 - local10;
			local72 = anInt1678 - local10 / 2 - local19 - local33;
		}
		@Pc(175) int local175 = (int) (Math.atan2((double) (local24 - arg1.anInt1637 * 2139882933), (double) (local29 - arg1.anInt1634 * 917865515)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local4.method18142((float) local10 / 2.0F + (float) local24, (float) local10 / 2.0F + (float) local29, 4096, local175);
		@Pc(195) int local195 = -2;
		@Pc(197) int local197 = -2;
		@Pc(199) int local199 = -2;
		@Pc(201) int local201 = -2;
		if (arg2.aString189 != null) {
			local195 = local67 - local31 / 2 - 5;
			local197 = local72;
			local199 = local31 + local195 + 10;
			local201 = local72 + local33 + 3;
			if (arg2.anInt4026 * 1313711519 != 0) {
				arg0.method19986(local195, local72, local199 - local195, local201 - local72, arg2.anInt4026 * 1313711519);
			}
			if (arg2.anInt4049 * -2045123201 != 0) {
				arg0.method19982(local195, local72, local199 - local195, local201 - local72, arg2.anInt4049 * -2045123201);
			}
			Class581.aClass94_12.method7614(arg2.aString189, local67, local72, local31, local33, arg2.anInt4021 * -1512587879 | 0xFF000000, aClass619_2.anInt5627 * 335392643, 1, 0, 0, null, null, null, 0, 0);
		}
		if (arg2.anInt4019 * 1747122653 == -1 && arg2.aString189 == null) {
			return;
		}
		@Pc(309) Class77_Sub19 local309 = new Class77_Sub19(arg1);
		local309.anInt1520 = (local24 - local10 / 2) * -773567207;
		local309.anInt1522 = (local24 + local10 / 2) * -1946346005;
		local309.anInt1519 = (local29 - local10) * -1190860309;
		local309.anInt1518 = local29 * -1010377381;
		local309.anInt1521 = local195 * 869904827;
		local309.anInt1517 = local199 * -536426739;
		local309.anInt1523 = local197 * -2069055837;
		local309.anInt1524 = local201 * -1973105707;
		Class612.aClass695_52.method36383(local309);
	}

	@OriginalMember(owner = "client!aki", name = "fz", descriptor = "(I)V", line = 635)
	static void method14023(@OriginalArg(0) int arg0) {
		@Pc(3) byte local3;
		if (arg0 == 0) {
			local3 = 0;
		} else if (arg0 == 1) {
			local3 = 1;
		} else if (arg0 == 2) {
			local3 = 2;
		} else {
			return;
		}
		@Pc(24) byte local24;
		if ((double) aFloat152 == 2.0D) {
			local24 = 0;
		} else if ((double) aFloat152 == 3.0D) {
			local24 = 1;
		} else if ((double) aFloat152 == 4.0D) {
			local24 = 2;
		} else if ((double) aFloat152 == 6.0D) {
			local24 = 3;
		} else if ((double) aFloat152 >= 8.0D) {
			local24 = 4;
		} else {
			return;
		}
		Class581.aClass94_12 = aClass94ArrayArray1[local3][local24];
		Class266.aClass17_10 = aClass17ArrayArray1[local3][local24];
	}

	@OriginalMember(owner = "client!aki", name = "ff", descriptor = "(Lclient!dx;Lclient!akg;Lclient!hl;IIII)V", line = 654)
	static void method14024(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class77_Sub30 arg1, @OriginalArg(2) Class302 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg3 - 5;
		@Pc(7) int local7 = arg4 + 2;
		if (arg2.anInt4026 * 1313711519 != 0) {
			arg0.method19986(local3, local7, arg6 + 10, arg4 + arg5 - local7 + 1, arg2.anInt4026 * 1313711519);
		}
		if (arg2.anInt4049 * -2045123201 != 0) {
			arg0.method19982(local3, local7, arg6 + 10, arg5 + arg4 - local7 + 1, arg2.anInt4049 * -2045123201);
		}
		@Pc(60) int local60 = arg2.anInt4021 * -1512587879;
		if (arg1.aBoolean335 && arg2.anInt4038 * 261637687 != -1) {
			local60 = arg2.anInt4038 * 261637687;
		}
		Class581.aClass94_12.method7614(arg2.aString189, arg3, arg4, arg6, arg5, local60 | 0xFF000000, aClass619_2.anInt5627 * 335392643, 1, 0, 0, null, null, null, 0, 0);
	}

	@OriginalMember(owner = "client!aki", name = "fs", descriptor = "(Lclient!dx;Lclient!akg;Lclient!hl;IIII)V", line = 654)
	static void method14025(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class77_Sub30 arg1, @OriginalArg(2) Class302 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg3 - 5;
		@Pc(7) int local7 = arg4 + 2;
		if (arg2.anInt4026 * 1313711519 != 0) {
			arg0.method19986(local3, local7, arg6 + 10, arg4 + arg5 - local7 + 1, arg2.anInt4026 * 1313711519);
		}
		if (arg2.anInt4049 * -2045123201 != 0) {
			arg0.method19982(local3, local7, arg6 + 10, arg5 + arg4 - local7 + 1, arg2.anInt4049 * -2045123201);
		}
		@Pc(60) int local60 = arg2.anInt4021 * -1512587879;
		if (arg1.aBoolean335 && arg2.anInt4038 * 261637687 != -1) {
			local60 = arg2.anInt4038 * 261637687;
		}
		Class581.aClass94_12.method7614(arg2.aString189, arg3, arg4, arg6, arg5, local60 | 0xFF000000, aClass619_2.anInt5627 * 335392643, 1, 0, 0, null, null, null, 0, 0);
	}

	@OriginalMember(owner = "client!aki", name = "fu", descriptor = "(Lclient!dx;IIII)V", line = 664)
	static final void method14026(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg0.method20151(arg1, arg2, arg3 + arg1, arg4 + arg2);
		arg0.method19986(arg1, arg2, arg3, arg4, -16777216);
		if (anInt1702 * -1857977261 < 100) {
			return;
		}
		@Pc(29) float local29 = (float) anInt1677 / (float) anInt1676;
		@Pc(31) int local31 = arg3;
		@Pc(33) int local33 = arg4;
		if (local29 < 1.0F) {
			local33 = (int) (local29 * (float) arg3);
		} else {
			local31 = (int) ((float) arg4 / local29);
		}
		@Pc(58) int local58 = arg1 + (arg3 - local31) / 2;
		@Pc(66) int local66 = arg2 + (arg4 - local33) / 2;
		if (Class233.aClass83_24 == null || Class233.aClass83_24.method18169() != local31 || Class233.aClass83_24.method18171() != local33) {
			aClass232_24 = aClass232_26;
			method13941(anInt1674, anInt1675 + anInt1677, anInt1676 + anInt1674, anInt1675, local58, local66, local31 + local58, local33 + local66);
			method13944(arg0, false, false, client.aBoolean613, true);
			arg0.method20012();
			Class233.aClass83_24 = arg0.method20105(local58, local66, local31, local33, true);
		}
		Class233.aClass83_24.method18123(local58, local66);
		@Pc(123) int local123 = Class551.anInt5221 * -87431073 * local31 / anInt1676;
		@Pc(131) int local131 = Class566.anInt5341 * 114918783 * local33 / anInt1677;
		@Pc(141) int local141 = local58 + local31 * Class657.anInt5768 * 313632999 / anInt1676;
		@Pc(155) int local155 = local33 + local66 - local33 * -1356415839 * Class115.anInt2917 / anInt1677 - local131;
		@Pc(157) int local157 = -1996554240;
		if (client.aClass670_4 == Class670.aClass670_6) {
			local157 = -1996488705;
		}
		arg0.method20088(local141, local155, local123, local131, local157, 1);
		arg0.method20087(local141, local155, local123, local131, local157, 0);
		for (@Pc(183) Class77_Sub30 local183 = (Class77_Sub30) aClass695_23.method36395(); local183 != null; local183 = (Class77_Sub30) aClass695_23.method36406()) {
			@Pc(194) Class302 local194 = (Class302) aClass35_Sub10_2.method18319(local183.anInt1635 * 1592054281);
			if (Class260.method26251(local194)) {
				@Pc(208) Class1 local208 = (Class1) aHashMap5.get(local183.anInt1635 * 1592054281);
				if (local208 == null) {
					local208 = (Class1) aHashMap4.get(local194.anInt4027 * -15128681);
				}
				if (local208 != null) {
					@Pc(245) int local245;
					if (local208.anInt1 * -959968621 > anInt1708 * 2135626771 / 2) {
						local245 = (anInt1708 * -876019987 - local208.anInt1 * 21137517) / (anInt1708 * 2135626771);
					} else {
						local245 = local208.anInt1 * 21137517 / (anInt1708 * 2135626771);
					}
					@Pc(266) int local266 = local58 + local31 * local183.anInt1638 * 1412374331 / anInt1676;
					@Pc(279) int local279 = local33 * (anInt1677 - local183.anInt1636 * -958626707) / anInt1677 + local66;
					arg0.method19986(local266 - 2, local279 - 2, 4, 4, local245 << 24 | 0xFFFF00);
				}
			}
		}
		aClass232_26.method25847(5);
	}

	@OriginalMember(owner = "client!aki", name = "fb", descriptor = "(Lclient!dx;IIII)V", line = 664)
	static final void method14027(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg0.method20151(arg1, arg2, arg3 + arg1, arg4 + arg2);
		arg0.method19986(arg1, arg2, arg3, arg4, -16777216);
		if (anInt1702 * -1857977261 < 100) {
			return;
		}
		@Pc(29) float local29 = (float) anInt1677 / (float) anInt1676;
		@Pc(31) int local31 = arg3;
		@Pc(33) int local33 = arg4;
		if (local29 < 1.0F) {
			local33 = (int) (local29 * (float) arg3);
		} else {
			local31 = (int) ((float) arg4 / local29);
		}
		@Pc(58) int local58 = arg1 + (arg3 - local31) / 2;
		@Pc(66) int local66 = arg2 + (arg4 - local33) / 2;
		if (Class233.aClass83_24 == null || Class233.aClass83_24.method18169() != local31 || Class233.aClass83_24.method18171() != local33) {
			aClass232_24 = aClass232_26;
			method13941(anInt1674, anInt1675 + anInt1677, anInt1676 + anInt1674, anInt1675, local58, local66, local31 + local58, local33 + local66);
			method13944(arg0, false, false, client.aBoolean613, true);
			arg0.method20012();
			Class233.aClass83_24 = arg0.method20105(local58, local66, local31, local33, true);
		}
		Class233.aClass83_24.method18123(local58, local66);
		@Pc(123) int local123 = Class551.anInt5221 * -87431073 * local31 / anInt1676;
		@Pc(131) int local131 = Class566.anInt5341 * 114918783 * local33 / anInt1677;
		@Pc(141) int local141 = local58 + local31 * Class657.anInt5768 * 313632999 / anInt1676;
		@Pc(155) int local155 = local33 + local66 - local33 * -1356415839 * Class115.anInt2917 / anInt1677 - local131;
		@Pc(157) int local157 = -1996554240;
		if (client.aClass670_4 == Class670.aClass670_6) {
			local157 = -1996488705;
		}
		arg0.method20088(local141, local155, local123, local131, local157, 1);
		arg0.method20087(local141, local155, local123, local131, local157, 0);
		for (@Pc(183) Class77_Sub30 local183 = (Class77_Sub30) aClass695_23.method36395(); local183 != null; local183 = (Class77_Sub30) aClass695_23.method36406()) {
			@Pc(194) Class302 local194 = (Class302) aClass35_Sub10_2.method18319(local183.anInt1635 * 1592054281);
			if (Class260.method26251(local194)) {
				@Pc(208) Class1 local208 = (Class1) aHashMap5.get(local183.anInt1635 * 1592054281);
				if (local208 == null) {
					local208 = (Class1) aHashMap4.get(local194.anInt4027 * -15128681);
				}
				if (local208 != null) {
					@Pc(245) int local245;
					if (local208.anInt1 * -959968621 > anInt1708 * 2135626771 / 2) {
						local245 = (anInt1708 * -876019987 - local208.anInt1 * 21137517) / (anInt1708 * 2135626771);
					} else {
						local245 = local208.anInt1 * 21137517 / (anInt1708 * 2135626771);
					}
					@Pc(266) int local266 = local58 + local31 * local183.anInt1638 * 1412374331 / anInt1676;
					@Pc(279) int local279 = local33 * (anInt1677 - local183.anInt1636 * -958626707) / anInt1677 + local66;
					arg0.method19986(local266 - 2, local279 - 2, 4, 4, local245 << 24 | 0xFFFF00);
				}
			}
		}
		aClass232_26.method25847(5);
	}

	@OriginalMember(owner = "client!aki", name = "fo", descriptor = "(II)V", line = 708)
	static final void method14028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (aFloat151 < aFloat152) {
			aFloat151 = (float) ((double) aFloat151 + (double) aFloat151 / 30.0D);
			if (aFloat151 > aFloat152) {
				aFloat151 = aFloat152;
			}
			Class608.method32139();
			anInt1685 = (int) aFloat152 >> 1;
			aByteArrayArrayArray11 = Class96_Sub19.method7726(anInt1685);
		} else if (aFloat151 > aFloat152) {
			aFloat151 = (float) ((double) aFloat151 - (double) aFloat151 / 30.0D);
			if (aFloat151 < aFloat152) {
				aFloat151 = aFloat152;
			}
			Class608.method32139();
			anInt1685 = (int) aFloat152 >> 1;
			aByteArrayArrayArray11 = Class96_Sub19.method7726(anInt1685);
		}
		if (-620394103 * anInt1703 != -1 && anInt1704 * -128963373 != -1) {
			@Pc(78) int local78 = anInt1703 * -620394103 - Class88.anInt610 * 204700261;
			if (local78 != 0) {
				local78 /= Math.min(anInt1707 * -1048197681, Math.abs(local78));
			}
			@Pc(97) int local97 = anInt1704 * -128963373 - Class349.anInt4496 * -1636630007;
			if (local97 != 0) {
				local97 /= Math.min(anInt1707 * -1048197681, Math.abs(local97));
			}
			Class88.anInt610 = (local78 + Class88.anInt610 * 204700261) * 704227181;
			Class349.anInt4496 = (Class349.anInt4496 * -1636630007 + local97) * 980626489;
			if (local78 == 0 && local97 == 0) {
				anInt1703 = 1421361991;
				anInt1704 = -2017528667;
			}
			Class608.method32139();
		}
		@Pc(139) Iterator local139 = aHashMap5.entrySet().iterator();
		while (true) {
			while (true) {
				@Pc(148) Class1 local148;
				do {
					if (!local139.hasNext()) {
						local139 = aHashMap4.entrySet().iterator();
						while (true) {
							while (true) {
								do {
									if (!local139.hasNext()) {
										if (aBoolean341 && Class612.aClass695_52 != null) {
											for (@Pc(239) Class77_Sub19 local239 = (Class77_Sub19) Class612.aClass695_52.method36395(); local239 != null; local239 = (Class77_Sub19) Class612.aClass695_52.method36406()) {
												@Pc(252) Class302 local252 = (Class302) aClass35_Sub10_2.method18319(local239.aClass77_Sub30_1.anInt1635 * 1592054281);
												if (local239.method13487(arg0, arg1)) {
													if (local252.aStringArray26 != null) {
														if (local252.aStringArray26[4] != null) {
															Class155.method23634(local252.aStringArray26[4], local252.aString188, -1, 1012, -1, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), local252.anInt4027 * -15128681, 0, true, false, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), false);
														}
														if (local252.aStringArray26[3] != null) {
															Class155.method23634(local252.aStringArray26[3], local252.aString188, -1, 1011, -1, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), local252.anInt4027 * -15128681, 0, true, false, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), false);
														}
														if (local252.aStringArray26[2] != null) {
															Class155.method23634(local252.aStringArray26[2], local252.aString188, -1, 1010, -1, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), local252.anInt4027 * -15128681, 0, true, false, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), false);
														}
														if (local252.aStringArray26[1] != null) {
															Class155.method23634(local252.aStringArray26[1], local252.aString188, -1, 1009, -1, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), local252.anInt4027 * -15128681, 0, true, false, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), false);
														}
														if (local252.aStringArray26[0] != null) {
															Class155.method23634(local252.aStringArray26[0], local252.aString188, -1, 1008, -1, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), local252.anInt4027 * -15128681, 0, true, false, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), false);
														}
													}
													if (!local239.aClass77_Sub30_1.aBoolean335) {
														local239.aClass77_Sub30_1.aBoolean335 = true;
														Class675.method35962(Class135.aClass135_38, local239.aClass77_Sub30_1.anInt1635 * 1592054281, local252.anInt4027 * -15128681);
													}
													if (local239.aClass77_Sub30_1.aBoolean335) {
														Class675.method35962(Class135.aClass135_30, local239.aClass77_Sub30_1.anInt1635 * 1592054281, local252.anInt4027 * -15128681);
													}
												} else if (local239.aClass77_Sub30_1.aBoolean335) {
													local239.aClass77_Sub30_1.aBoolean335 = false;
													Class675.method35962(Class135.aClass135_29, local239.aClass77_Sub30_1.anInt1635 * 1592054281, local252.anInt4027 * -15128681);
												}
											}
										}
										return;
									}
									local148 = (Class1) ((Entry) local139.next()).getValue();
									local148.anInt1 -= -1425890405;
								} while (local148.anInt1 * -959968621 != 0);
								if (local148.anInt2 * -132330391 > 1 || aBoolean349) {
									local148.anInt2 -= 1869972441;
									local148.anInt1 = anInt1708 * -1184677759;
								} else {
									local139.remove();
								}
							}
						}
					}
					local148 = (Class1) ((Entry) local139.next()).getValue();
					local148.anInt1 -= -1425890405;
				} while (local148.anInt1 * -959968621 != 0);
				if (local148.anInt2 * -132330391 > 1 || aBoolean349) {
					local148.anInt2 -= 1869972441;
					local148.anInt1 = anInt1708 * -1184677759;
				} else {
					local139.remove();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aki", name = "fd", descriptor = "(II)V", line = 708)
	static final void method14029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (aFloat151 < aFloat152) {
			aFloat151 = (float) ((double) aFloat151 + (double) aFloat151 / 30.0D);
			if (aFloat151 > aFloat152) {
				aFloat151 = aFloat152;
			}
			Class608.method32139();
			anInt1685 = (int) aFloat152 >> 1;
			aByteArrayArrayArray11 = Class96_Sub19.method7726(anInt1685);
		} else if (aFloat151 > aFloat152) {
			aFloat151 = (float) ((double) aFloat151 - (double) aFloat151 / 30.0D);
			if (aFloat151 < aFloat152) {
				aFloat151 = aFloat152;
			}
			Class608.method32139();
			anInt1685 = (int) aFloat152 >> 1;
			aByteArrayArrayArray11 = Class96_Sub19.method7726(anInt1685);
		}
		if (-620394103 * anInt1703 != -1 && anInt1704 * -128963373 != -1) {
			@Pc(78) int local78 = anInt1703 * -620394103 - Class88.anInt610 * 204700261;
			if (local78 != 0) {
				local78 /= Math.min(anInt1707 * -1048197681, Math.abs(local78));
			}
			@Pc(97) int local97 = anInt1704 * -128963373 - Class349.anInt4496 * -1636630007;
			if (local97 != 0) {
				local97 /= Math.min(anInt1707 * -1048197681, Math.abs(local97));
			}
			Class88.anInt610 = (local78 + Class88.anInt610 * 204700261) * 704227181;
			Class349.anInt4496 = (Class349.anInt4496 * -1636630007 + local97) * 980626489;
			if (local78 == 0 && local97 == 0) {
				anInt1703 = 1421361991;
				anInt1704 = -2017528667;
			}
			Class608.method32139();
		}
		@Pc(139) Iterator local139 = aHashMap5.entrySet().iterator();
		while (true) {
			while (true) {
				@Pc(148) Class1 local148;
				do {
					if (!local139.hasNext()) {
						local139 = aHashMap4.entrySet().iterator();
						while (true) {
							while (true) {
								do {
									if (!local139.hasNext()) {
										if (aBoolean341 && Class612.aClass695_52 != null) {
											for (@Pc(239) Class77_Sub19 local239 = (Class77_Sub19) Class612.aClass695_52.method36395(); local239 != null; local239 = (Class77_Sub19) Class612.aClass695_52.method36406()) {
												@Pc(252) Class302 local252 = (Class302) aClass35_Sub10_2.method18319(local239.aClass77_Sub30_1.anInt1635 * 1592054281);
												if (local239.method13487(arg0, arg1)) {
													if (local252.aStringArray26 != null) {
														if (local252.aStringArray26[4] != null) {
															Class155.method23634(local252.aStringArray26[4], local252.aString188, -1, 1012, -1, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), local252.anInt4027 * -15128681, 0, true, false, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), false);
														}
														if (local252.aStringArray26[3] != null) {
															Class155.method23634(local252.aStringArray26[3], local252.aString188, -1, 1011, -1, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), local252.anInt4027 * -15128681, 0, true, false, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), false);
														}
														if (local252.aStringArray26[2] != null) {
															Class155.method23634(local252.aStringArray26[2], local252.aString188, -1, 1010, -1, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), local252.anInt4027 * -15128681, 0, true, false, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), false);
														}
														if (local252.aStringArray26[1] != null) {
															Class155.method23634(local252.aStringArray26[1], local252.aString188, -1, 1009, -1, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), local252.anInt4027 * -15128681, 0, true, false, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), false);
														}
														if (local252.aStringArray26[0] != null) {
															Class155.method23634(local252.aStringArray26[0], local252.aString188, -1, 1008, -1, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), local252.anInt4027 * -15128681, 0, true, false, (long) (local239.aClass77_Sub30_1.anInt1635 * 1592054281), false);
														}
													}
													if (!local239.aClass77_Sub30_1.aBoolean335) {
														local239.aClass77_Sub30_1.aBoolean335 = true;
														Class675.method35962(Class135.aClass135_38, local239.aClass77_Sub30_1.anInt1635 * 1592054281, local252.anInt4027 * -15128681);
													}
													if (local239.aClass77_Sub30_1.aBoolean335) {
														Class675.method35962(Class135.aClass135_30, local239.aClass77_Sub30_1.anInt1635 * 1592054281, local252.anInt4027 * -15128681);
													}
												} else if (local239.aClass77_Sub30_1.aBoolean335) {
													local239.aClass77_Sub30_1.aBoolean335 = false;
													Class675.method35962(Class135.aClass135_29, local239.aClass77_Sub30_1.anInt1635 * 1592054281, local252.anInt4027 * -15128681);
												}
											}
										}
										return;
									}
									local148 = (Class1) ((Entry) local139.next()).getValue();
									local148.anInt1 -= -1425890405;
								} while (local148.anInt1 * -959968621 != 0);
								if (local148.anInt2 * -132330391 > 1 || aBoolean349) {
									local148.anInt2 -= 1869972441;
									local148.anInt1 = anInt1708 * -1184677759;
								} else {
									local139.remove();
								}
							}
						}
					}
					local148 = (Class1) ((Entry) local139.next()).getValue();
					local148.anInt1 -= -1425890405;
				} while (local148.anInt1 * -959968621 != 0);
				if (local148.anInt2 * -132330391 > 1 || aBoolean349) {
					local148.anInt2 -= 1869972441;
					local148.anInt1 = anInt1708 * -1184677759;
				} else {
					local139.remove();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aki", name = "fj", descriptor = "(III)V", line = 791)
	static void method14030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1008) {
			Class675.method35962(Class135.aClass135_24, arg1, arg2);
		} else if (arg0 == 1009) {
			Class675.method35962(Class135.aClass135_34, arg1, arg2);
		} else if (arg0 == 1010) {
			Class675.method35962(Class135.aClass135_25, arg1, arg2);
		} else if (arg0 == 1011) {
			Class675.method35962(Class135.aClass135_23, arg1, arg2);
		} else if (arg0 == 1012) {
			Class675.method35962(Class135.aClass135_43, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!aki", name = "fh", descriptor = "(III)V", line = 791)
	static void method14031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1008) {
			Class675.method35962(Class135.aClass135_24, arg1, arg2);
		} else if (arg0 == 1009) {
			Class675.method35962(Class135.aClass135_34, arg1, arg2);
		} else if (arg0 == 1010) {
			Class675.method35962(Class135.aClass135_25, arg1, arg2);
		} else if (arg0 == 1011) {
			Class675.method35962(Class135.aClass135_23, arg1, arg2);
		} else if (arg0 == 1012) {
			Class675.method35962(Class135.aClass135_43, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!aki", name = "fn", descriptor = "(III)V", line = 791)
	static void method14032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1008) {
			Class675.method35962(Class135.aClass135_24, arg1, arg2);
		} else if (arg0 == 1009) {
			Class675.method35962(Class135.aClass135_34, arg1, arg2);
		} else if (arg0 == 1010) {
			Class675.method35962(Class135.aClass135_25, arg1, arg2);
		} else if (arg0 == 1011) {
			Class675.method35962(Class135.aClass135_23, arg1, arg2);
		} else if (arg0 == 1012) {
			Class675.method35962(Class135.aClass135_43, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!aki", name = "fa", descriptor = "(IIIZ)V", line = 799)
	public static void method14033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(1) Class77_Sub1_Sub8 local1 = aClass77_Sub1_Sub8_2;
		method13902(arg0);
		aBoolean338 = false;
		if (aClass77_Sub1_Sub8_2 != local1) {
			Class208.method25580();
		}
		anInt1699 = arg1 * 2119321151;
		anInt1705 = arg2 * 177934039;
		aBoolean344 = arg3;
	}

	@OriginalMember(owner = "client!aki", name = "fp", descriptor = "(IIIZ)V", line = 799)
	public static void method14034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(1) Class77_Sub1_Sub8 local1 = aClass77_Sub1_Sub8_2;
		method13902(arg0);
		aBoolean338 = false;
		if (aClass77_Sub1_Sub8_2 != local1) {
			Class208.method25580();
		}
		anInt1699 = arg1 * 2119321151;
		anInt1705 = arg2 * 177934039;
		aBoolean344 = arg3;
	}

	@OriginalMember(owner = "client!aki", name = "fg", descriptor = "(IIIZ)V", line = 799)
	public static void method14035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(1) Class77_Sub1_Sub8 local1 = aClass77_Sub1_Sub8_2;
		method13902(arg0);
		aBoolean338 = false;
		if (aClass77_Sub1_Sub8_2 != local1) {
			Class208.method25580();
		}
		anInt1699 = arg1 * 2119321151;
		anInt1705 = arg2 * 177934039;
		aBoolean344 = arg3;
	}

	@OriginalMember(owner = "client!aki", name = "fy", descriptor = "()V", line = 811)
	public static void method14036() {
		Class50.method755(true);
	}

	@OriginalMember(owner = "client!aki", name = "fx", descriptor = "()Lclient!ara;", line = 815)
	public static Class77_Sub1_Sub8 method14037() {
		return aClass77_Sub1_Sub8_2;
	}

	@OriginalMember(owner = "client!aki", name = "fr", descriptor = "(I)V", line = 833)
	static void method14038(@OriginalArg(0) int arg0) {
		Class88.anInt610 = arg0 * 704227181;
		anInt1703 = 1421361991;
		anInt1704 = -2017528667;
		Class608.method32139();
	}

	@OriginalMember(owner = "client!aki", name = "gr", descriptor = "(I)V", line = 833)
	static void method14039(@OriginalArg(0) int arg0) {
		Class88.anInt610 = arg0 * 704227181;
		anInt1703 = 1421361991;
		anInt1704 = -2017528667;
		Class608.method32139();
	}

	@OriginalMember(owner = "client!aki", name = "fc", descriptor = "(I)V", line = 833)
	static void method14040(@OriginalArg(0) int arg0) {
		Class88.anInt610 = arg0 * 704227181;
		anInt1703 = 1421361991;
		anInt1704 = -2017528667;
		Class608.method32139();
	}

	@OriginalMember(owner = "client!aki", name = "gj", descriptor = "(I)V", line = 840)
	static void method14041(@OriginalArg(0) int arg0) {
		Class349.anInt4496 = arg0 * 980626489;
		anInt1704 = -2017528667;
		anInt1704 = -2017528667;
		Class608.method32139();
	}

	@OriginalMember(owner = "client!aki", name = "gi", descriptor = "(I)V", line = 847)
	public static void method14042(@OriginalArg(0) int arg0) {
		if (arg0 == 25) {
			aFloat152 = 2.0F;
		} else if (arg0 == 37) {
			aFloat152 = 3.0F;
		} else if (arg0 == 50) {
			aFloat152 = 4.0F;
		} else if (arg0 == 75) {
			aFloat152 = 6.0F;
		} else if (arg0 == 100) {
			aFloat152 = 8.0F;
		} else if (arg0 == 200) {
			aFloat152 = 16.0F;
		}
		anInt1704 = -2017528667;
		anInt1704 = -2017528667;
	}

	@OriginalMember(owner = "client!aki", name = "gt", descriptor = "(I)V", line = 847)
	public static void method14043(@OriginalArg(0) int arg0) {
		if (arg0 == 25) {
			aFloat152 = 2.0F;
		} else if (arg0 == 37) {
			aFloat152 = 3.0F;
		} else if (arg0 == 50) {
			aFloat152 = 4.0F;
		} else if (arg0 == 75) {
			aFloat152 = 6.0F;
		} else if (arg0 == 100) {
			aFloat152 = 8.0F;
		} else if (arg0 == 200) {
			aFloat152 = 16.0F;
		}
		anInt1704 = -2017528667;
		anInt1704 = -2017528667;
	}

	@OriginalMember(owner = "client!aki", name = "ga", descriptor = "(IIII)V", line = 858)
	static void method14044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) float local5 = (float) anInt1677 / (float) anInt1676;
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg3;
		if (local5 < 1.0F) {
			local9 = (int) ((float) arg2 * local5);
		} else {
			local7 = (int) ((float) arg3 / local5);
		}
		@Pc(34) int local34 = arg0 - (arg2 - local7) / 2;
		@Pc(42) int local42 = arg1 - (arg3 - local9) / 2;
		Class88.anInt610 = local34 * anInt1676 / local7 * 704227181;
		Class349.anInt4496 = (anInt1677 - anInt1677 * local42 / local9) * 980626489;
		anInt1703 = 1421361991;
		anInt1704 = -2017528667;
		Class608.method32139();
	}

	@OriginalMember(owner = "client!aki", name = "gc", descriptor = "(IIII)V", line = 858)
	static void method14045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) float local5 = (float) anInt1677 / (float) anInt1676;
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg3;
		if (local5 < 1.0F) {
			local9 = (int) ((float) arg2 * local5);
		} else {
			local7 = (int) ((float) arg3 / local5);
		}
		@Pc(34) int local34 = arg0 - (arg2 - local7) / 2;
		@Pc(42) int local42 = arg1 - (arg3 - local9) / 2;
		Class88.anInt610 = local34 * anInt1676 / local7 * 704227181;
		Class349.anInt4496 = (anInt1677 - anInt1677 * local42 / local9) * 980626489;
		anInt1703 = 1421361991;
		anInt1704 = -2017528667;
		Class608.method32139();
	}

	@OriginalMember(owner = "client!aki", name = "gb", descriptor = "()I", line = 873)
	public static int method14046() {
		if ((double) aFloat152 == 2.0D) {
			return 25;
		} else if ((double) aFloat152 == 3.0D) {
			return 37;
		} else if ((double) aFloat152 == 4.0D) {
			return 50;
		} else if ((double) aFloat152 == 6.0D) {
			return 75;
		} else if ((double) aFloat152 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!aki", name = "gy", descriptor = "()I", line = 873)
	public static int method14047() {
		if ((double) aFloat152 == 2.0D) {
			return 25;
		} else if ((double) aFloat152 == 3.0D) {
			return 37;
		} else if ((double) aFloat152 == 4.0D) {
			return 50;
		} else if ((double) aFloat152 == 6.0D) {
			return 75;
		} else if ((double) aFloat152 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!aki", name = "gz", descriptor = "()I", line = 873)
	public static int method14048() {
		if ((double) aFloat152 == 2.0D) {
			return 25;
		} else if ((double) aFloat152 == 3.0D) {
			return 37;
		} else if ((double) aFloat152 == 4.0D) {
			return 50;
		} else if ((double) aFloat152 == 6.0D) {
			return 75;
		} else if ((double) aFloat152 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!aki", name = "gu", descriptor = "(I)V", line = 890)
	public static void method14049(@OriginalArg(0) int arg0) {
		@Pc(5) Class1 local5 = (Class1) aHashMap4.get(arg0);
		if (local5 == null) {
			local5 = new Class1();
		}
		local5.anInt2 = anInt1697 * -1551336507;
		local5.anInt1 = anInt1708 * -1184677759;
		aHashMap4.put(arg0, local5);
	}

	@OriginalMember(owner = "client!aki", name = "gk", descriptor = "(I)V", line = 898)
	public static void method14050(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			anInt1697 = anInt1700 * -1926359745;
		} else {
			anInt1697 = arg0 * 1856193797;
		}
	}

	@OriginalMember(owner = "client!aki", name = "ge", descriptor = "(I)V", line = 903)
	public static void method14051(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			anInt1708 = anInt1701 * -1435674875;
		} else {
			anInt1708 = arg0 * 1444927003;
		}
	}

	@OriginalMember(owner = "client!aki", name = "gp", descriptor = "(I)V", line = 903)
	public static void method14052(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			anInt1708 = anInt1701 * -1435674875;
		} else {
			anInt1708 = arg0 * 1444927003;
		}
	}

	@OriginalMember(owner = "client!aki", name = "gf", descriptor = "(I)V", line = 903)
	public static void method14053(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			anInt1708 = anInt1701 * -1435674875;
		} else {
			anInt1708 = arg0 * 1444927003;
		}
	}

	@OriginalMember(owner = "client!aki", name = "gq", descriptor = "(I)V", line = 903)
	public static void method14054(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			anInt1708 = anInt1701 * -1435674875;
		} else {
			anInt1708 = arg0 * 1444927003;
		}
	}

	@OriginalMember(owner = "client!aki", name = "go", descriptor = "(Z)V", line = 908)
	public static void method14055(@OriginalArg(0) boolean arg0) {
		aBoolean349 = arg0;
	}

	@OriginalMember(owner = "client!aki", name = "gv", descriptor = "()V", line = 912)
	public static void method14056() {
		aHashMap5.clear();
		aHashMap4.clear();
	}

	@OriginalMember(owner = "client!aki", name = "gx", descriptor = "()V", line = 912)
	public static void method14057() {
		aHashMap5.clear();
		aHashMap4.clear();
	}

	@OriginalMember(owner = "client!aki", name = "gd", descriptor = "(III)I", line = 917)
	public static int method14058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (anInt1702 * -1857977261 < 100) {
			return -2;
		}
		@Pc(8) int local8 = -2;
		@Pc(10) int local10 = Integer.MAX_VALUE;
		@Pc(14) int local14 = arg1 - anInt1674;
		@Pc(18) int local18 = arg2 - anInt1675;
		for (@Pc(23) Class77_Sub30 local23 = (Class77_Sub30) aClass695_23.method36395(); local23 != null; local23 = (Class77_Sub30) aClass695_23.method36406()) {
			if (local23.anInt1635 * 1592054281 == arg0) {
				@Pc(38) int local38 = local23.anInt1638 * 1412374331;
				@Pc(43) int local43 = local23.anInt1636 * -958626707;
				@Pc(53) int local53 = anInt1674 + local38 << 14 | local43 + anInt1675;
				@Pc(69) int local69 = (local18 - local43) * (local18 - local43) + (local14 - local38) * (local14 - local38);
				if (local8 < 0 || local69 < local10) {
					local8 = local53;
					local10 = local69;
				}
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!aki", name = "gn", descriptor = "()Lclient!akg;", line = 937)
	public static Class77_Sub30 method14059() {
		if (aClass695_23 == null || aClass704_1 == null) {
			return null;
		}
		aClass704_1.method36545(aClass695_23);
		@Pc(16) Class77_Sub30 local16 = (Class77_Sub30) aClass704_1.method36551();
		if (local16 == null) {
			return null;
		} else {
			@Pc(30) Class302 local30 = (Class302) aClass35_Sub10_2.method18319(local16.anInt1635 * 1592054281);
			return local30 != null && local30.aBoolean692 && local30.method27136(anInterface17_2, anInterface19_2) ? local16 : Class109_Sub1.method9096();
		}
	}

	@OriginalMember(owner = "client!aki", name = "gg", descriptor = "()Lclient!akg;", line = 947)
	public static Class77_Sub30 method14060() {
		if (aClass695_23 == null || aClass704_1 == null) {
			return null;
		}
		for (@Pc(10) Class77_Sub30 local10 = (Class77_Sub30) aClass704_1.next(); local10 != null; local10 = (Class77_Sub30) aClass704_1.next()) {
			@Pc(21) Class302 local21 = (Class302) aClass35_Sub10_2.method18319(local10.anInt1635 * 1592054281);
			if (local21 != null && local21.aBoolean692 && local21.method27136(anInterface17_2, anInterface19_2)) {
				return local10;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aki", name = "gs", descriptor = "()Lclient!akg;", line = 947)
	public static Class77_Sub30 method14061() {
		if (aClass695_23 == null || aClass704_1 == null) {
			return null;
		}
		for (@Pc(10) Class77_Sub30 local10 = (Class77_Sub30) aClass704_1.next(); local10 != null; local10 = (Class77_Sub30) aClass704_1.next()) {
			@Pc(21) Class302 local21 = (Class302) aClass35_Sub10_2.method18319(local10.anInt1635 * 1592054281);
			if (local21 != null && local21.aBoolean692 && local21.method27136(anInterface17_2, anInterface19_2)) {
				return local10;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aki", name = "gl", descriptor = "(II)V", line = 958)
	public static void method14062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt1703 = (arg0 - anInt1674) * -1421361991;
		anInt1704 = (arg1 - anInt1675) * 2017528667;
	}

	@OriginalMember(owner = "client!aki", name = "gh", descriptor = "(II)V", line = 958)
	public static void method14063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt1703 = (arg0 - anInt1674) * -1421361991;
		anInt1704 = (arg1 - anInt1675) * 2017528667;
	}

	@OriginalMember(owner = "client!aki", name = "gw", descriptor = "(II)V", line = 963)
	public static void method14064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class88.anInt610 = (arg0 - anInt1674) * 704227181;
		Class349.anInt4496 = (arg1 - anInt1675) * 980626489;
		anInt1703 = 1421361991;
		anInt1704 = -2017528667;
		Class608.method32139();
	}

	@OriginalMember(owner = "client!aki", name = "gm", descriptor = "(II)V", line = 963)
	public static void method14065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class88.anInt610 = (arg0 - anInt1674) * 704227181;
		Class349.anInt4496 = (arg1 - anInt1675) * 980626489;
		anInt1703 = 1421361991;
		anInt1704 = -2017528667;
		Class608.method32139();
	}

	@OriginalMember(owner = "client!aki", name = "hl", descriptor = "(IZ)Z", line = 971)
	public static boolean method14066(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == anInt1706 * -363511917) {
			aBoolean342 = arg1;
		} else if (arg0 == anInt1698 * 1272099037) {
			aBoolean340 = arg1;
		} else if (anInt1709 * -1565977311 == arg0) {
			aBoolean343 = arg1;
		} else {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!aki", name = "hu", descriptor = "(IZ)Z", line = 971)
	public static boolean method14067(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == anInt1706 * -363511917) {
			aBoolean342 = arg1;
		} else if (arg0 == anInt1698 * 1272099037) {
			aBoolean340 = arg1;
		} else if (anInt1709 * -1565977311 == arg0) {
			aBoolean343 = arg1;
		} else {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!aki", name = "hw", descriptor = "(IZ)Z", line = 971)
	public static boolean method14068(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == anInt1706 * -363511917) {
			aBoolean342 = arg1;
		} else if (arg0 == anInt1698 * 1272099037) {
			aBoolean340 = arg1;
		} else if (anInt1709 * -1565977311 == arg0) {
			aBoolean343 = arg1;
		} else {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!aki", name = "ht", descriptor = "(IZ)Z", line = 971)
	public static boolean method14069(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == anInt1706 * -363511917) {
			aBoolean342 = arg1;
		} else if (arg0 == anInt1698 * 1272099037) {
			aBoolean340 = arg1;
		} else if (anInt1709 * -1565977311 == arg0) {
			aBoolean343 = arg1;
		} else {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!aki", name = "hz", descriptor = "(IZ)Z", line = 971)
	public static boolean method14070(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == anInt1706 * -363511917) {
			aBoolean342 = arg1;
		} else if (arg0 == anInt1698 * 1272099037) {
			aBoolean340 = arg1;
		} else if (anInt1709 * -1565977311 == arg0) {
			aBoolean343 = arg1;
		} else {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!aki", name = "hq", descriptor = "(I)I", line = 979)
	public static int method14071(@OriginalArg(0) int arg0) {
		if (anInt1706 * -363511917 == arg0) {
			return aBoolean342 ? 1 : 0;
		} else if (arg0 == anInt1698 * 1272099037) {
			return aBoolean340 ? 1 : 0;
		} else if (arg0 == anInt1709 * -1565977311) {
			return aBoolean343 ? 1 : 0;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!aki", name = "hr", descriptor = "(I)I", line = 979)
	public static int method14072(@OriginalArg(0) int arg0) {
		if (anInt1706 * -363511917 == arg0) {
			return aBoolean342 ? 1 : 0;
		} else if (arg0 == anInt1698 * 1272099037) {
			return aBoolean340 ? 1 : 0;
		} else if (arg0 == anInt1709 * -1565977311) {
			return aBoolean343 ? 1 : 0;
		} else {
			return -1;
		}
	}
}
