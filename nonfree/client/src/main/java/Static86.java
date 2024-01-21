import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!oc", name = "P", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!oc", name = "ab", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!oc", name = "L", descriptor = "Lclient!he;")
	public static Class26 aClass26_1189 = Static6.method100(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!oc", name = "M", descriptor = "Lclient!ee;")
	public static Class19 aClass19_1 = new Class19();

	@OriginalMember(owner = "client!oc", name = "O", descriptor = "Lclient!he;")
	public static Class26 aClass26_1190 = Static6.method100("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!oc", name = "U", descriptor = "Lclient!he;")
	public static Class26 aClass26_1192 = Static6.method100("Lade)3)3)3");

	@OriginalMember(owner = "client!oc", name = "bb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1193 = Static6.method100("<br>(X100(U(Y");

	@OriginalMember(owner = "client!oc", name = "cb", descriptor = "Lclient!sf;")
	public static Class66 aClass66_19 = new Class66(128);

	@OriginalMember(owner = "client!oc", name = "db", descriptor = "Lclient!he;")
	public static Class26 aClass26_1194 = Static6.method100("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!oc", name = "eb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1195 = Static6.method100("null");

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(Z)V")
	public static void method1498() {
		@Pc(24) int local24;
		if (Static76.anInt2100 == 0) {
			Static62.aClass69_1 = new Class69(4, 104, 104, Static117.anIntArrayArrayArray6);
			for (local24 = 0; local24 < 4; local24++) {
				Static93.aClass4Array1[local24] = new Class4(104, 104);
			}
			Static6.aClass3_Sub1_Sub4_Sub3_1 = new Class3_Sub1_Sub4_Sub3(512, 512);
			Static4.anInt137 = 5;
			Static76.anInt2100 = 20;
			Static55.aClass26_828 = Static44.aClass26_710;
			return;
		}
		@Pc(63) int local63;
		@Pc(74) int local74;
		@Pc(80) int local80;
		@Pc(84) int local84;
		if (Static76.anInt2100 == 20) {
			@Pc(61) int[] local61 = new int[9];
			for (local63 = 0; local63 < 9; local63++) {
				local74 = local63 * 32 + 128 + 15;
				local80 = local74 * 3 + 600;
				local84 = Class3_Sub1_Sub4_Sub4.anIntArray391[local74];
				local61[local63] = local84 * local80 >> 16;
			}
			Static112.method2036(local61);
			Static76.anInt2100 = 30;
			Static55.aClass26_828 = Static122.aClass26_1730;
			Static4.anInt137 = 10;
		} else if (Static76.anInt2100 == 30) {
			Static121.aClass16_Sub1_18 = Static100.method2207(true, true, 0, false);
			Static7.aClass16_Sub1_1 = Static100.method2207(true, true, 1, false);
			Static7.aClass16_Sub1_2 = Static100.method2207(false, true, 2, true);
			Static95.aClass16_Sub1_14 = Static100.method2207(true, true, 3, false);
			Static107.aClass16_Sub1_16 = Static100.method2207(true, true, 4, false);
			Static42.aClass16_Sub1_6 = Static100.method2207(true, true, 5, true);
			Static89.aClass16_Sub1_12 = Static100.method2207(true, false, 6, true);
			Static119.aClass16_Sub1_17 = Static100.method2207(true, true, 7, false);
			Static20.aClass16_Sub1_3 = Static100.method2207(true, true, 8, false);
			Static29.aClass16_Sub1_4 = Static100.method2207(true, true, 9, false);
			Static125.aClass16_Sub1_19 = Static100.method2207(true, true, 10, false);
			Static39.aClass16_Sub1_5 = Static100.method2207(true, true, 11, false);
			Static90.aClass16_Sub1_13 = Static100.method2207(true, true, 12, false);
			Static42.aClass16_Sub1_7 = Static100.method2207(false, true, 13, true);
			Static95.aClass16_Sub1_15 = Static100.method2207(true, false, 14, false);
			Static66.aClass16_Sub1_11 = Static100.method2207(true, true, 15, false);
			Static55.aClass26_828 = Static99.aClass26_1491;
			Static4.anInt137 = 20;
			Static76.anInt2100 = 40;
		} else if (Static76.anInt2100 == 40) {
			local24 = Static121.aClass16_Sub1_18.method587() * 4 / 100;
			local24 += Static7.aClass16_Sub1_1.method587() * 4 / 100;
			local24 += Static7.aClass16_Sub1_2.method587() * 2 / 100;
			local24 += Static95.aClass16_Sub1_14.method587() * 2 / 100;
			local24 += Static107.aClass16_Sub1_16.method587() * 6 / 100;
			local24 += Static42.aClass16_Sub1_6.method587() * 4 / 100;
			local24 += Static89.aClass16_Sub1_12.method587() * 2 / 100;
			local24 += Static119.aClass16_Sub1_17.method587() * 60 / 100;
			local24 += Static20.aClass16_Sub1_3.method587() * 2 / 100;
			local24 += Static29.aClass16_Sub1_4.method587() * 2 / 100;
			local24 += Static125.aClass16_Sub1_19.method587() * 2 / 100;
			local24 += Static39.aClass16_Sub1_5.method587() * 2 / 100;
			local24 += Static90.aClass16_Sub1_13.method587() * 2 / 100;
			local24 += Static42.aClass16_Sub1_7.method587() * 2 / 100;
			local24 += Static95.aClass16_Sub1_15.method587() * 2 / 100;
			local24 += Static66.aClass16_Sub1_11.method587() * 2 / 100;
			if (local24 == 100) {
				Static4.anInt137 = 30;
				Static55.aClass26_828 = Static117.aClass26_1653;
				Static76.anInt2100 = 45;
			} else {
				if (local24 != 0) {
					Static55.aClass26_828 = Static119.method2136(new Class26[] { Static31.aClass26_1476, Static122.method2170(local24), Static99.aClass26_1488 });
				}
				Static4.anInt137 = 30;
			}
		} else if (Static76.anInt2100 == 45) {
			Static39.method775(!Static98.aBoolean151);
			@Pc(455) Class3_Sub3_Sub1 local455 = new Class3_Sub3_Sub1();
			local455.method205();
			Static19.aClass43_1 = Static64.method1260(22050, Static67.aClass75_4, Static58.aCanvas1, 0);
			Static19.aClass43_1.method1912(local455);
			Static70.method971(Static66.aClass16_Sub1_11, Static107.aClass16_Sub1_16, local455, Static95.aClass16_Sub1_15);
			Static42.aClass43_2 = Static64.method1260(2048, Static67.aClass75_4, Static58.aCanvas1, 1);
			Static5.aClass3_Sub3_Sub2_63 = new Class3_Sub3_Sub2();
			Static42.aClass43_2.method1912(Static5.aClass3_Sub3_Sub2_63);
			Static12.aClass9_1 = new Class9(22050, Static110.anInt2948);
			Static4.anInt137 = 35;
			Static55.aClass26_828 = Static6.aClass26_85;
			Static76.anInt2100 = 50;
		} else if (Static76.anInt2100 == 50) {
			local24 = 0;
			if (Static54.aClass3_Sub1_Sub4_Sub2_Sub1_2 == null) {
				Static54.aClass3_Sub1_Sub4_Sub2_Sub1_2 = Static93.method1691(Static42.aClass26_696, Static20.aClass16_Sub1_3, Static22.aClass26_415, Static42.aClass16_Sub1_7);
			} else {
				local24++;
			}
			if (Static91.aClass3_Sub1_Sub4_Sub2_Sub1_3 == null) {
				Static91.aClass3_Sub1_Sub4_Sub2_Sub1_3 = Static93.method1691(Static126.aClass26_1742, Static20.aClass16_Sub1_3, Static22.aClass26_415, Static42.aClass16_Sub1_7);
			} else {
				local24++;
			}
			if (Static111.aClass3_Sub1_Sub4_Sub2_Sub1_4 == null) {
				Static111.aClass3_Sub1_Sub4_Sub2_Sub1_4 = Static93.method1691(Static35.aClass26_585, Static20.aClass16_Sub1_3, Static22.aClass26_415, Static42.aClass16_Sub1_7);
			} else {
				local24++;
			}
			if (local24 < 3) {
				Static55.aClass26_828 = Static119.method2136(new Class26[] { Static33.aClass26_543, Static122.method2170(local24 * 100 / 3), Static99.aClass26_1488 });
				Static4.anInt137 = 40;
			} else {
				Static4.anInt137 = 40;
				Static55.aClass26_828 = Static22.aClass26_418;
				Static76.anInt2100 = 60;
			}
		} else if (Static76.anInt2100 == 60) {
			local24 = Static49.method1041(Static125.aClass16_Sub1_19, Static20.aClass16_Sub1_3);
			local63 = Static109.method1998();
			if (local63 > local24) {
				Static55.aClass26_828 = Static119.method2136(new Class26[] { Static51.aClass26_809, Static122.method2170(local24 * 100 / local63), Static99.aClass26_1488 });
				Static4.anInt137 = 50;
			} else {
				Static55.aClass26_828 = Static9.aClass26_143;
				Static4.anInt137 = 50;
				Static4.method62(5);
				Static76.anInt2100 = 70;
			}
		} else if (Static76.anInt2100 == 70) {
			if (Static7.aClass16_Sub1_2.method572()) {
				Static10.method169(Static7.aClass16_Sub1_2);
				Static52.method1085(Static7.aClass16_Sub1_2);
				Static52.method1082(Static7.aClass16_Sub1_2, Static119.aClass16_Sub1_17);
				Static47.method901(Static119.aClass16_Sub1_17, Static7.aClass16_Sub1_2, Static98.aBoolean151);
				Static56.method1134(Static7.aClass16_Sub1_2, Static119.aClass16_Sub1_17);
				Static52.method1083(Static54.aClass3_Sub1_Sub4_Sub2_Sub1_2, Static119.aClass16_Sub1_17, Static7.aClass16_Sub1_2, Static125.aBoolean179);
				Static85.method1489(Static121.aClass16_Sub1_18, Static7.aClass16_Sub1_2, Static7.aClass16_Sub1_1);
				Static8.method118(Static7.aClass16_Sub1_2, Static119.aClass16_Sub1_17);
				Static20.method383(Static7.aClass16_Sub1_2);
				Static55.method1105(Static7.aClass16_Sub1_2);
				Static48.method1032(Static20.aClass16_Sub1_3, Static42.aClass16_Sub1_7, Static95.aClass16_Sub1_14, Static119.aClass16_Sub1_17);
				Static56.method1131(Static7.aClass16_Sub1_2);
				Static90.method1660(Static7.aClass16_Sub1_2);
				Static4.anInt137 = 60;
				Static55.aClass26_828 = Static80.aClass26_1119;
				Static76.anInt2100 = 80;
			} else {
				Static55.aClass26_828 = Static119.method2136(new Class26[] { Static10.aClass26_162, Static122.method2170(Static7.aClass16_Sub1_2.method581()), Static99.aClass26_1488 });
				Static4.anInt137 = 60;
			}
		} else if (Static76.anInt2100 == 80) {
			local24 = 0;
			if (Static59.aClass3_Sub1_Sub4_Sub3_3 == null) {
				Static59.aClass3_Sub1_Sub4_Sub3_3 = Static93.method1689(Static20.aClass16_Sub1_3, Static101.aClass26_1497, Static22.aClass26_415);
			} else {
				local24++;
			}
			if (Static108.aClass3_Sub1_Sub4_Sub3_4 == null) {
				Static108.aClass3_Sub1_Sub4_Sub3_4 = Static93.method1689(Static20.aClass16_Sub1_3, Static71.aClass26_1004, Static22.aClass26_415);
			} else {
				local24++;
			}
			if (Static1.aClass3_Sub1_Sub4_Sub1Array1 == null) {
				Static1.aClass3_Sub1_Sub4_Sub1Array1 = Static103.method1905(Static22.aClass26_415, Static20.aClass16_Sub1_3, Static27.aClass26_469);
			} else {
				local24++;
			}
			if (Static30.aClass3_Sub1_Sub4_Sub3Array7 == null) {
				Static30.aClass3_Sub1_Sub4_Sub3Array7 = Static108.method1981(Static31.aClass26_1480, Static20.aClass16_Sub1_3, Static22.aClass26_415);
			} else {
				local24++;
			}
			if (Static106.aClass3_Sub1_Sub4_Sub3Array11 == null) {
				Static106.aClass3_Sub1_Sub4_Sub3Array11 = Static108.method1981(Static59.aClass26_890, Static20.aClass16_Sub1_3, Static22.aClass26_415);
			} else {
				local24++;
			}
			if (Static89.aClass3_Sub1_Sub4_Sub3Array10 == null) {
				Static89.aClass3_Sub1_Sub4_Sub3Array10 = Static108.method1981(Static87.aClass26_1263, Static20.aClass16_Sub1_3, Static22.aClass26_415);
			} else {
				local24++;
			}
			if (Static108.aClass3_Sub1_Sub4_Sub3Array12 == null) {
				Static108.aClass3_Sub1_Sub4_Sub3Array12 = Static108.method1981(Static33.aClass26_539, Static20.aClass16_Sub1_3, Static22.aClass26_415);
			} else {
				local24++;
			}
			if (Static25.aClass3_Sub1_Sub4_Sub3Array13 == null) {
				Static25.aClass3_Sub1_Sub4_Sub3Array13 = Static108.method1981(Static133.aClass26_311, Static20.aClass16_Sub1_3, Static22.aClass26_415);
			} else {
				local24++;
			}
			if (Static60.aClass3_Sub1_Sub4_Sub3Array9 == null) {
				Static60.aClass3_Sub1_Sub4_Sub3Array9 = Static108.method1981(Static5.aClass26_1749, Static20.aClass16_Sub1_3, Static22.aClass26_415);
			} else {
				local24++;
			}
			if (Static12.aClass3_Sub1_Sub4_Sub3Array1 == null) {
				Static12.aClass3_Sub1_Sub4_Sub3Array1 = Static108.method1981(Static56.aClass26_860, Static20.aClass16_Sub1_3, Static22.aClass26_415);
			} else {
				local24++;
			}
			if (Static57.aClass3_Sub1_Sub4_Sub3Array8 == null) {
				Static57.aClass3_Sub1_Sub4_Sub3Array8 = Static108.method1981(Static101.aClass26_1494, Static20.aClass16_Sub1_3, Static22.aClass26_415);
			} else {
				local24++;
			}
			if (Static12.aClass3_Sub1_Sub4_Sub1Array2 == null) {
				Static12.aClass3_Sub1_Sub4_Sub1Array2 = Static103.method1905(Static22.aClass26_415, Static20.aClass16_Sub1_3, Static61.aClass26_915);
			} else {
				local24++;
			}
			if (Static93.aClass3_Sub1_Sub4_Sub1Array9 == null) {
				Static93.aClass3_Sub1_Sub4_Sub1Array9 = Static103.method1905(Static22.aClass26_415, Static20.aClass16_Sub1_3, Static131.aClass26_1796);
			} else {
				local24++;
			}
			if (Static4.aClass3_Sub1_Sub4_Sub1_1 == null) {
				Static4.aClass3_Sub1_Sub4_Sub1_1 = Static2.method9(Static22.aClass26_415, Static5.aClass26_1747, Static20.aClass16_Sub1_3);
			} else {
				local24++;
			}
			if (local24 < 14) {
				Static55.aClass26_828 = Static119.method2136(new Class26[] { Static56.aClass26_854, Static122.method2170(local24 * 100 / 14), Static99.aClass26_1488 });
				Static4.anInt137 = 70;
			} else {
				Static129.aClass3_Sub1_Sub4_Sub1Array8 = Static93.aClass3_Sub1_Sub4_Sub1Array9;
				local63 = (int) (Math.random() * 21.0D) - 10;
				Static108.aClass3_Sub1_Sub4_Sub3_4.method1744();
				local74 = (int) (Math.random() * 21.0D) - 10;
				local84 = (int) (Math.random() * 41.0D) - 20;
				local80 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(961) int local961 = 0; local961 < Static30.aClass3_Sub1_Sub4_Sub3Array7.length; local961++) {
					Static30.aClass3_Sub1_Sub4_Sub3Array7[local961].method1754(local63 + local84, local74 - -local84, local80 + local84);
				}
				Static1.aClass3_Sub1_Sub4_Sub1Array1[0].method346(local63 + local84, local74 - -local84, local84 + local80);
				Static27.method588();
				Static76.anInt2100 = 90;
				Static55.aClass26_828 = Static87.aClass26_1265;
				Static4.anInt137 = 70;
			}
		} else if (Static76.anInt2100 == 90) {
			if (Static29.aClass16_Sub1_4.method572()) {
				@Pc(1055) Class34 local1055 = new Class34(Static29.aClass16_Sub1_4, Static20.aClass16_Sub1_3, 20, 0.8D, Static98.aBoolean151 ? 64 : 128);
				Static127.method2234(local1055);
				Static127.method2248(0.8D);
				Static55.aClass26_828 = Static67.aClass26_1509;
				Static76.anInt2100 = 110;
				Static4.anInt137 = 90;
			} else {
				Static55.aClass26_828 = Static119.method2136(new Class26[] { Static28.aClass26_471, Static122.method2170(Static29.aClass16_Sub1_4.method581()), Static99.aClass26_1488 });
				Static4.anInt137 = 90;
			}
		} else if (Static76.anInt2100 == 110) {
			Static52.aClass53_1 = new Class53();
			Static67.aClass75_4.method2174(Static52.aClass53_1, 10);
			Static4.anInt137 = 94;
			Static76.anInt2100 = 120;
			Static55.aClass26_828 = Static42.aClass26_699;
		} else if (Static76.anInt2100 == 120) {
			if (Static125.aClass16_Sub1_19.method564(Static66.aClass26_1279, Static22.aClass26_415)) {
				@Pc(1120) Class47 local1120 = new Class47(Static125.aClass16_Sub1_19.method573(Static66.aClass26_1279, Static22.aClass26_415));
				Static28.method600(local1120);
				Static4.anInt137 = 96;
				Static76.anInt2100 = 130;
				Static55.aClass26_828 = Static27.aClass26_466;
			} else {
				Static55.aClass26_828 = Static119.method2136(new Class26[] { Static56.aClass26_856, Static39.aClass26_639 });
				Static4.anInt137 = 96;
			}
		} else if (Static76.anInt2100 == 130) {
			if (!Static95.aClass16_Sub1_14.method572()) {
				Static55.aClass26_828 = Static119.method2136(new Class26[] { Static21.aClass26_398, Static122.method2170(Static95.aClass16_Sub1_14.method581() * 4 / 5), Static99.aClass26_1488 });
				Static4.anInt137 = 100;
			} else if (!Static90.aClass16_Sub1_13.method572()) {
				Static55.aClass26_828 = Static119.method2136(new Class26[] { Static21.aClass26_398, Static122.method2170(Static90.aClass16_Sub1_13.method581() / 6 + 80), Static99.aClass26_1488 });
				Static4.anInt137 = 100;
			} else if (Static42.aClass16_Sub1_7.method572()) {
				Static76.anInt2100 = 140;
				Static55.aClass26_828 = Static10.aClass26_154;
				Static4.anInt137 = 100;
			} else {
				Static55.aClass26_828 = Static119.method2136(new Class26[] { Static21.aClass26_398, Static122.method2170(Static42.aClass16_Sub1_7.method581() / 20 + 96), Static99.aClass26_1488 });
				Static4.anInt137 = 100;
			}
		} else if (Static76.anInt2100 == 140) {
			Static4.method62(10);
		}
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(Z)V")
	public static void method1499() {
		aClass66_19 = null;
		aClass26_1195 = null;
		aShortArrayArray5 = null;
		aClass26_1190 = null;
		aClass26_1193 = null;
		aClass26_1194 = null;
		aClass26_1192 = null;
		aClass19_1 = null;
		aClass26_1189 = null;
		aByteArrayArrayArray6 = null;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
	public static void method1500() {
		if (Static63.aClass76_3 != null) {
			Static63.aClass76_3.method2183();
		}
	}
}
