import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!od", name = "l", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3 aClass2_Sub1_Sub9_Sub3_53;

	@OriginalMember(owner = "client!od", name = "n", descriptor = "Lclient!hb;")
	public static Class2_Sub1_Sub9_Sub1 aClass2_Sub1_Sub9_Sub1_7;

	@OriginalMember(owner = "client!od", name = "c", descriptor = "I")
	public static int anInt2061 = 0;

	@OriginalMember(owner = "client!od", name = "e", descriptor = "Lclient!wd;")
	public static Class80 aClass80_825 = Static2.method59(":0");

	@OriginalMember(owner = "client!od", name = "f", descriptor = "I")
	public static int anInt2063 = 0;

	@OriginalMember(owner = "client!od", name = "h", descriptor = "Lclient!i;")
	public static Class32 aClass32_40 = new Class32(128);

	@OriginalMember(owner = "client!od", name = "k", descriptor = "[I")
	public static int[] anIntArray276 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!od", name = "v", descriptor = "Lclient!wd;")
	private static Class80 aClass80_826 = Static2.method59(" seconds)3");

	@OriginalMember(owner = "client!od", name = "w", descriptor = "[I")
	public static int[] anIntArray277 = new int[32768];

	@OriginalMember(owner = "client!od", name = "x", descriptor = "Z")
	public static boolean aBoolean155 = false;

	@OriginalMember(owner = "client!od", name = "y", descriptor = "Lclient!wd;")
	public static Class80 aClass80_827 = aClass80_826;

	@OriginalMember(owner = "client!od", name = "z", descriptor = "[I")
	public static int[] anIntArray278 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
	public static void method1257() {
		if (Static103.anInt2679 < 2 && Static107.anInt2862 == 0 && !Static76.aBoolean141) {
			return;
		}
		@Pc(32) Class80 local32;
		if (Static107.anInt2862 == 1 && Static103.anInt2679 < 2) {
			local32 = Static93.method1444(new Class80[] { Static8.aClass80_109, Static45.aClass80_832, Static67.aClass80_712, Static119.aClass80_594 });
		} else if (Static76.aBoolean141 && Static103.anInt2679 < 2) {
			local32 = Static93.method1444(new Class80[] { Static68.aClass80_721, Static45.aClass80_832, Static59.aClass80_631, Static119.aClass80_594 });
		} else {
			local32 = Static2.aClass80Array1[Static103.anInt2679 - 1];
		}
		if (Static103.anInt2679 > 2) {
			local32 = Static93.method1444(new Class80[] { local32, Static38.aClass80_431, Static28.method1422(Static103.anInt2679 - 2), Static113.aClass80_1111 });
		}
		Static111.aClass2_Sub1_Sub9_Sub4_34.method1907(local32, 4, 16777215, Static10.anInt300 / 1000);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BZZ)I")
	public static int method1258() {
		return Static31.anInt1083 + Static55.anInt1309;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	public static void method1259() {
		@Pc(20) int local20;
		if (Static3.anInt125 == 0) {
			Static93.aClass64_1 = new Class64(4, 104, 104, Static100.anIntArrayArrayArray5);
			for (local20 = 0; local20 < 4; local20++) {
				Static17.aClass49Array1[local20] = new Class49(104, 104);
			}
			aClass2_Sub1_Sub9_Sub1_7 = new Class2_Sub1_Sub9_Sub1(512, 512);
			Static79.aClass80_789 = Static108.aClass80_1079;
			Static42.anInt1250 = 5;
			Static3.anInt125 = 20;
			return;
		}
		@Pc(59) int local59;
		@Pc(70) int local70;
		@Pc(76) int local76;
		@Pc(80) int local80;
		if (Static3.anInt125 == 20) {
			@Pc(57) int[] local57 = new int[9];
			for (local59 = 0; local59 < 9; local59++) {
				local70 = local59 * 32 + 128 + 15;
				local76 = local70 * 3 + 600;
				local80 = Class2_Sub1_Sub9_Sub2.anIntArray202[local70];
				local57[local59] = local76 * local80 >> 16;
			}
			Static101.method1632(local57);
			Static42.anInt1250 = 10;
			Static3.anInt125 = 30;
			Static79.aClass80_789 = Static53.aClass80_578;
		} else if (Static3.anInt125 == 30) {
			Static108.aClass11_Sub1_20 = Static126.method1992(true, 0, true, false);
			Static93.aClass11_Sub1_15 = Static126.method1992(true, 1, true, false);
			Static103.aClass11_Sub1_16 = Static126.method1992(false, 2, true, true);
			Static105.aClass11_Sub1_14 = Static126.method1992(true, 3, true, false);
			Static90.aClass11_Sub1_13 = Static126.method1992(true, 4, true, false);
			Static8.aClass11_Sub1_2 = Static126.method1992(true, 5, true, true);
			Static29.aClass11_Sub1_7 = Static126.method1992(true, 6, false, true);
			Static33.aClass11_Sub1_8 = Static126.method1992(true, 7, true, false);
			Static57.aClass11_Sub1_11 = Static126.method1992(true, 8, true, false);
			Static118.aClass11_Sub1_21 = Static126.method1992(true, 9, true, false);
			Static40.aClass11_Sub1_10 = Static126.method1992(true, 10, true, false);
			Static37.aClass11_Sub1_9 = Static126.method1992(true, 11, true, false);
			Static4.aClass11_Sub1_1 = Static126.method1992(true, 12, true, false);
			Static125.aClass11_Sub1_19 = Static126.method1992(false, 13, true, true);
			Static8.aClass11_Sub1_3 = Static126.method1992(true, 14, false, false);
			Static15.aClass11_Sub1_4 = Static126.method1992(true, 15, true, false);
			Static42.anInt1250 = 20;
			Static3.anInt125 = 40;
			Static79.aClass80_789 = Static105.aClass80_916;
		} else if (Static3.anInt125 == 40) {
			local20 = Static108.aClass11_Sub1_20.method408() * 4 / 100;
			local20 += Static93.aClass11_Sub1_15.method408() * 4 / 100;
			local20 += Static103.aClass11_Sub1_16.method408() * 2 / 100;
			local20 += Static105.aClass11_Sub1_14.method408() * 2 / 100;
			local20 += Static90.aClass11_Sub1_13.method408() * 6 / 100;
			local20 += Static8.aClass11_Sub1_2.method408() * 4 / 100;
			local20 += Static29.aClass11_Sub1_7.method408() * 2 / 100;
			local20 += Static33.aClass11_Sub1_8.method408() * 60 / 100;
			local20 += Static57.aClass11_Sub1_11.method408() * 2 / 100;
			local20 += Static118.aClass11_Sub1_21.method408() * 2 / 100;
			local20 += Static40.aClass11_Sub1_10.method408() * 2 / 100;
			local20 += Static37.aClass11_Sub1_9.method408() * 2 / 100;
			local20 += Static4.aClass11_Sub1_1.method408() * 2 / 100;
			local20 += Static125.aClass11_Sub1_19.method408() * 2 / 100;
			local20 += Static8.aClass11_Sub1_3.method408() * 2 / 100;
			local20 += Static15.aClass11_Sub1_4.method408() * 2 / 100;
			if (local20 == 100) {
				Static42.anInt1250 = 30;
				Static79.aClass80_789 = Static39.aClass80_253;
				Static3.anInt125 = 45;
			} else {
				if (local20 != 0) {
					Static79.aClass80_789 = Static93.method1444(new Class80[] { Static125.aClass80_1057, Static28.method1422(local20), Static89.aClass80_856 });
				}
				Static42.anInt1250 = 30;
			}
		} else if (Static3.anInt125 == 45) {
			Static39.method369(!Static18.aBoolean51);
			@Pc(471) Class2_Sub2_Sub3 local471 = new Class2_Sub2_Sub3();
			local471.method1372();
			Static107.aClass29_2 = Static77.method1198(22050, Static9.aClass74_1, 0, Static119.aCanvas2);
			Static107.aClass29_2.method1266(local471);
			Static63.method1073(local471, Static15.aClass11_Sub1_4, Static8.aClass11_Sub1_3, Static90.aClass11_Sub1_13);
			Static1.aClass29_1 = Static77.method1198(2048, Static9.aClass74_1, 1, Static119.aCanvas2);
			Static123.aClass2_Sub2_Sub2_2 = new Class2_Sub2_Sub2();
			Static1.aClass29_1.method1266(Static123.aClass2_Sub2_Sub2_2);
			Static36.aClass18_1 = new Class18(22050, Static35.anInt1167);
			Static79.aClass80_789 = Static110.aClass80_1097;
			Static3.anInt125 = 50;
			Static42.anInt1250 = 35;
		} else if (Static3.anInt125 == 50) {
			local20 = 0;
			if (Static88.aClass2_Sub1_Sub9_Sub4_25 == null) {
				Static88.aClass2_Sub1_Sub9_Sub4_25 = Static42.method684(Static57.aClass11_Sub1_11, Static40.aClass80_446, Static120.aClass80_1168);
			} else {
				local20++;
			}
			if (Static21.aClass2_Sub1_Sub9_Sub4_12 == null) {
				Static21.aClass2_Sub1_Sub9_Sub4_12 = Static42.method684(Static57.aClass11_Sub1_11, Static40.aClass80_446, Static59.aClass80_630);
			} else {
				local20++;
			}
			if (Static111.aClass2_Sub1_Sub9_Sub4_34 == null) {
				Static111.aClass2_Sub1_Sub9_Sub4_34 = Static42.method684(Static57.aClass11_Sub1_11, Static40.aClass80_446, Static62.aClass80_654);
			} else {
				local20++;
			}
			if (local20 < 3) {
				Static79.aClass80_789 = Static93.method1444(new Class80[] { Static73.aClass80_745, Static28.method1422(local20 * 100 / 3), Static89.aClass80_856 });
				Static42.anInt1250 = 40;
			} else {
				Static79.aClass80_789 = Static97.aClass80_980;
				Static42.anInt1250 = 40;
				Static3.anInt125 = 60;
			}
		} else if (Static3.anInt125 == 60) {
			local20 = Static111.method1938(Static40.aClass11_Sub1_10, Static57.aClass11_Sub1_11);
			local59 = Static94.method1451();
			if (local20 < local59) {
				Static79.aClass80_789 = Static93.method1444(new Class80[] { Static66.aClass80_706, Static28.method1422(local20 * 100 / local59), Static89.aClass80_856 });
				Static42.anInt1250 = 50;
			} else {
				Static42.anInt1250 = 50;
				Static79.aClass80_789 = Static38.aClass80_439;
				Static10.method167(5);
				Static3.anInt125 = 70;
			}
		} else if (Static3.anInt125 == 70) {
			if (Static103.aClass11_Sub1_16.method368()) {
				Static95.method1463(Static103.aClass11_Sub1_16);
				Static67.method1112(Static103.aClass11_Sub1_16);
				Static104.method1680(Static33.aClass11_Sub1_8, Static103.aClass11_Sub1_16);
				Static65.method1098(Static103.aClass11_Sub1_16, Static33.aClass11_Sub1_8, Static18.aBoolean51);
				Static79.method1233(Static33.aClass11_Sub1_8, Static103.aClass11_Sub1_16);
				Static87.method1408(Static88.aClass2_Sub1_Sub9_Sub4_25, Static103.aClass11_Sub1_16, Static43.aBoolean80, Static33.aClass11_Sub1_8);
				Static77.method1196(Static108.aClass11_Sub1_20, Static93.aClass11_Sub1_15, Static103.aClass11_Sub1_16);
				Static87.method1403(Static33.aClass11_Sub1_8, Static103.aClass11_Sub1_16);
				Static98.method1600(Static103.aClass11_Sub1_16);
				Static88.method1318(Static103.aClass11_Sub1_16);
				Static74.method1183(Static105.aClass11_Sub1_14, Static57.aClass11_Sub1_11, Static33.aClass11_Sub1_8);
				Static74.method1180(Static103.aClass11_Sub1_16);
				Static79.aClass80_789 = Static16.aClass80_173;
				Static42.anInt1250 = 60;
				Static3.anInt125 = 80;
			} else {
				Static79.aClass80_789 = Static93.method1444(new Class80[] { Static6.aClass80_93, Static28.method1422(Static103.aClass11_Sub1_16.method399()), Static89.aClass80_856 });
				Static42.anInt1250 = 60;
			}
		} else if (Static3.anInt125 == 80) {
			local20 = 0;
			if (Static119.aClass2_Sub1_Sub9_Sub1_5 == null) {
				Static119.aClass2_Sub1_Sub9_Sub1_5 = Static64.method1082(Static86.aClass80_834, Static57.aClass11_Sub1_11, Static40.aClass80_446);
			} else {
				local20++;
			}
			if (Static83.aClass2_Sub1_Sub9_Sub1_6 == null) {
				Static83.aClass2_Sub1_Sub9_Sub1_6 = Static64.method1082(Static66.aClass80_708, Static57.aClass11_Sub1_11, Static40.aClass80_446);
			} else {
				local20++;
			}
			if (Static119.aClass2_Sub1_Sub9_Sub3Array6 == null) {
				Static119.aClass2_Sub1_Sub9_Sub3Array6 = Static40.method671(Static40.aClass80_446, Static57.aClass11_Sub1_11, Static98.aClass80_998);
			} else {
				local20++;
			}
			if (Static53.aClass2_Sub1_Sub9_Sub1Array7 == null) {
				Static53.aClass2_Sub1_Sub9_Sub1Array7 = Static94.method1452(Static40.aClass80_446, Static57.aClass11_Sub1_11, Static5.aClass80_82);
			} else {
				local20++;
			}
			if (Static103.aClass2_Sub1_Sub9_Sub1Array12 == null) {
				Static103.aClass2_Sub1_Sub9_Sub1Array12 = Static94.method1452(Static40.aClass80_446, Static57.aClass11_Sub1_11, Static126.aClass80_1202);
			} else {
				local20++;
			}
			if (Static36.aClass2_Sub1_Sub9_Sub1Array6 == null) {
				Static36.aClass2_Sub1_Sub9_Sub1Array6 = Static94.method1452(Static40.aClass80_446, Static57.aClass11_Sub1_11, Static112.aClass80_1106);
			} else {
				local20++;
			}
			if (Static23.aClass2_Sub1_Sub9_Sub1Array4 == null) {
				Static23.aClass2_Sub1_Sub9_Sub1Array4 = Static94.method1452(Static40.aClass80_446, Static57.aClass11_Sub1_11, Static123.aClass80_1195);
			} else {
				local20++;
			}
			if (Static57.aClass2_Sub1_Sub9_Sub1Array8 == null) {
				Static57.aClass2_Sub1_Sub9_Sub1Array8 = Static94.method1452(Static40.aClass80_446, Static57.aClass11_Sub1_11, Static40.aClass80_449);
			} else {
				local20++;
			}
			if (Static8.aClass2_Sub1_Sub9_Sub1_1 == null) {
				Static8.aClass2_Sub1_Sub9_Sub1_1 = Static64.method1082(Static106.aClass80_1065, Static57.aClass11_Sub1_11, Static40.aClass80_446);
			} else {
				local20++;
			}
			if (Static21.aClass2_Sub1_Sub9_Sub1Array5 == null) {
				Static21.aClass2_Sub1_Sub9_Sub1Array5 = Static94.method1452(Static40.aClass80_446, Static57.aClass11_Sub1_11, Static53.aClass80_574);
			} else {
				local20++;
			}
			if (Static105.aClass2_Sub1_Sub9_Sub1Array11 == null) {
				Static105.aClass2_Sub1_Sub9_Sub1Array11 = Static94.method1452(Static40.aClass80_446, Static57.aClass11_Sub1_11, Static102.aClass80_1009);
			} else {
				local20++;
			}
			if (Static86.aClass2_Sub1_Sub9_Sub1Array10 == null) {
				Static86.aClass2_Sub1_Sub9_Sub1Array10 = Static94.method1452(Static40.aClass80_446, Static57.aClass11_Sub1_11, Static17.aClass80_223);
			} else {
				local20++;
			}
			if (Static120.aClass2_Sub1_Sub9_Sub3Array9 == null) {
				Static120.aClass2_Sub1_Sub9_Sub3Array9 = Static40.method671(Static40.aClass80_446, Static57.aClass11_Sub1_11, Static95.aClass80_940);
			} else {
				local20++;
			}
			if (Static110.aClass2_Sub1_Sub9_Sub3Array8 == null) {
				Static110.aClass2_Sub1_Sub9_Sub3Array8 = Static40.method671(Static40.aClass80_446, Static57.aClass11_Sub1_11, Static5.aClass80_78);
			} else {
				local20++;
			}
			if (local20 < 14) {
				Static79.aClass80_789 = Static93.method1444(new Class80[] { Static62.aClass80_659, Static28.method1422(local20 * 100 / 14), Static89.aClass80_856 });
				Static42.anInt1250 = 70;
			} else {
				local59 = (int) (Math.random() * 21.0D) - 10;
				Static83.aClass2_Sub1_Sub9_Sub1_6.method822();
				local76 = (int) (Math.random() * 21.0D) - 10;
				local70 = (int) (Math.random() * 21.0D) - 10;
				local80 = (int) (Math.random() * 41.0D) - 20;
				for (@Pc(983) int local983 = 0; local983 < Static53.aClass2_Sub1_Sub9_Sub1Array7.length; local983++) {
					Static53.aClass2_Sub1_Sub9_Sub1Array7[local983].method833(local59 + local80, local70 + local80, local80 + local76);
				}
				Static119.aClass2_Sub1_Sub9_Sub3Array6[0].method1492(local59 + local80, local80 + local70, local80 + local76);
				Static79.aClass80_789 = Static108.aClass80_1083;
				Static42.anInt1250 = 70;
				Static3.anInt125 = 85;
			}
		} else if (Static3.anInt125 == 85) {
			local20 = Static30.method570(Static57.aClass11_Sub1_11);
			local59 = Static20.method480();
			if (local59 > local20) {
				Static79.aClass80_789 = Static93.method1444(new Class80[] { Static2.aClass80_33, Static28.method1422(local20 * 100 / local59), Static89.aClass80_856 });
				Static42.anInt1250 = 80;
			} else {
				Static42.anInt1250 = 80;
				Static79.aClass80_789 = Static33.aClass80_382;
				Static3.anInt125 = 90;
			}
		} else if (Static3.anInt125 == 90) {
			if (Static118.aClass11_Sub1_21.method368()) {
				@Pc(1122) Class24 local1122 = new Class24(Static118.aClass11_Sub1_21, Static57.aClass11_Sub1_11, 20, 0.8D, Static18.aBoolean51 ? 64 : 128);
				Static52.method938(local1122);
				Static52.method931(0.8D);
				Static3.anInt125 = 110;
				Static42.anInt1250 = 90;
				Static79.aClass80_789 = Static9.aClass80_124;
			} else {
				Static79.aClass80_789 = Static93.method1444(new Class80[] { Static21.aClass80_297, Static28.method1422(Static118.aClass11_Sub1_21.method399()), Static89.aClass80_856 });
				Static42.anInt1250 = 90;
			}
		} else if (Static3.anInt125 == 110) {
			Static80.aClass73_1 = new Class73();
			Static9.aClass74_1.method1875(10, Static80.aClass73_1);
			Static79.aClass80_789 = Static78.aClass80_773;
			Static3.anInt125 = 120;
			Static42.anInt1250 = 94;
		} else if (Static3.anInt125 == 120) {
			if (Static40.aClass11_Sub1_10.method385(Static40.aClass80_446, Static19.aClass80_272)) {
				@Pc(1189) Class63 local1189 = new Class63(Static40.aClass11_Sub1_10.method388(Static19.aClass80_272, Static40.aClass80_446));
				Static77.method1197(local1189);
				Static42.anInt1250 = 96;
				Static79.aClass80_789 = Static38.aClass80_443;
				Static3.anInt125 = 130;
			} else {
				Static79.aClass80_789 = Static93.method1444(new Class80[] { Static1.aClass80_2, Static9.aClass80_121 });
				Static42.anInt1250 = 96;
			}
		} else if (Static3.anInt125 == 130) {
			if (!Static105.aClass11_Sub1_14.method368()) {
				Static79.aClass80_789 = Static93.method1444(new Class80[] { Static64.aClass80_680, Static28.method1422(Static105.aClass11_Sub1_14.method399() * 4 / 5), Static89.aClass80_856 });
				Static42.anInt1250 = 100;
			} else if (!Static4.aClass11_Sub1_1.method368()) {
				Static79.aClass80_789 = Static93.method1444(new Class80[] { Static64.aClass80_680, Static28.method1422(Static4.aClass11_Sub1_1.method399() / 6 + 80), Static89.aClass80_856 });
				Static42.anInt1250 = 100;
			} else if (Static125.aClass11_Sub1_19.method368()) {
				Static3.anInt125 = 140;
				Static42.anInt1250 = 100;
				Static79.aClass80_789 = Static21.aClass80_300;
			} else {
				Static79.aClass80_789 = Static93.method1444(new Class80[] { Static64.aClass80_680, Static28.method1422(Static125.aClass11_Sub1_19.method399() / 20 + 96), Static89.aClass80_856 });
				Static42.anInt1250 = 100;
			}
		} else if (Static3.anInt125 == 140) {
			Static10.method167(10);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BI)Z")
	public static boolean method1260(@OriginalArg(1) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
	public static void method1261() {
		anIntArray278 = null;
		anIntArray276 = null;
		aClass32_40 = null;
		aClass80_827 = null;
		aClass2_Sub1_Sub9_Sub1_7 = null;
		aClass2_Sub1_Sub9_Sub3_53 = null;
		anIntArray277 = null;
		aClass80_825 = null;
		aClass80_826 = null;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIB)Z")
	public static boolean method1262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 >> arg1 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!qa;II)V")
	public static void method1263(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub1_Sub4_Sub2 arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12;
		@Pc(16) int local16;
		if ((arg2 & 0x400) != 0) {
			local12 = Static100.aClass2_Sub17_Sub1_1.method1770();
			local16 = Static100.aClass2_Sub17_Sub1_1.method1770();
			arg1.method1430(local16, local12, Static10.anInt300);
			arg1.anInt2378 = Static10.anInt300 + 300;
			arg1.anInt2338 = Static100.aClass2_Sub17_Sub1_1.method1780();
			arg1.anInt2371 = Static100.aClass2_Sub17_Sub1_1.method1780();
		}
		if ((arg2 & 0x2) != 0) {
			arg1.anInt2348 = Static100.aClass2_Sub17_Sub1_1.method1790();
			arg1.anInt2368 = Static100.aClass2_Sub17_Sub1_1.method1779();
		}
		if ((arg2 & 0x80) != 0) {
			arg1.anInt2319 = Static100.aClass2_Sub17_Sub1_1.method1779();
			if (arg1.anInt2319 == 65535) {
				arg1.anInt2319 = -1;
			}
		}
		if ((arg2 & 0x20) != 0) {
			local12 = Static100.aClass2_Sub17_Sub1_1.method1789();
			local16 = Static100.aClass2_Sub17_Sub1_1.method1789();
			arg1.method1430(local16, local12, Static10.anInt300);
			arg1.anInt2378 = Static10.anInt300 + 300;
			arg1.anInt2338 = Static100.aClass2_Sub17_Sub1_1.method1789();
			arg1.anInt2371 = Static100.aClass2_Sub17_Sub1_1.method1770();
		}
		if ((arg2 & 0x4) != 0) {
			local12 = Static100.aClass2_Sub17_Sub1_1.method1779();
			local16 = Static100.aClass2_Sub17_Sub1_1.method1751();
			@Pc(139) int local139 = Static100.aClass2_Sub17_Sub1_1.method1780();
			@Pc(142) int local142 = Static100.aClass2_Sub17_Sub1_1.anInt2799;
			if (arg1.aClass80_924 != null && arg1.aClass79_2 != null) {
				@Pc(153) long local153 = arg1.aClass80_924.method2023();
				@Pc(155) boolean local155 = false;
				if (local16 <= 1) {
					for (@Pc(162) int local162 = 0; local162 < Static64.anInt1824; local162++) {
						if (local153 == Static64.aLongArray5[local162]) {
							local155 = true;
							break;
						}
					}
				}
				if (!local155 && Static59.anInt1768 == 0) {
					Static59.aClass2_Sub17_4.anInt2799 = 0;
					Static100.aClass2_Sub17_Sub1_1.method1746(local139, Static59.aClass2_Sub17_4.aByteArray38);
					Static59.aClass2_Sub17_4.anInt2799 = 0;
					@Pc(204) Class80 local204 = Static124.method1978(Static59.aClass2_Sub17_4).method2010();
					arg1.aClass80_918 = local204.method2026();
					arg1.anInt2337 = local12 >> 8;
					arg1.anInt2359 = local12 & 0xFF;
					arg1.anInt2328 = 150;
					if (local16 == 2 || local16 == 3) {
						Static3.method65(1, local204, Static93.method1444(new Class80[] { Static4.aClass80_49, arg1.aClass80_924 }));
					} else if (local16 == 1) {
						Static3.method65(1, local204, Static93.method1444(new Class80[] { Static92.aClass80_886, arg1.aClass80_924 }));
					} else {
						Static3.method65(2, local204, arg1.aClass80_924);
					}
				}
			}
			Static100.aClass2_Sub17_Sub1_1.anInt2799 = local139 + local142;
		}
		if ((arg2 & 0x8) != 0) {
			local12 = Static100.aClass2_Sub17_Sub1_1.method1783();
			local16 = Static100.aClass2_Sub17_Sub1_1.method1789();
			if (local12 == 65535) {
				local12 = -1;
			}
			Static49.method875(local16, arg1, local12);
		}
		if ((arg2 & 0x40) != 0) {
			local12 = Static100.aClass2_Sub17_Sub1_1.method1751();
			@Pc(324) byte[] local324 = new byte[local12];
			@Pc(329) Class2_Sub17 local329 = new Class2_Sub17(local324);
			Static100.aClass2_Sub17_Sub1_1.method1746(local12, local324);
			Static90.aClass2_Sub17Array1[arg0] = local329;
			arg1.method1445(local329);
		}
		if ((arg2 & 0x100) != 0) {
			arg1.anInt2362 = Static100.aClass2_Sub17_Sub1_1.method1783();
			local12 = Static100.aClass2_Sub17_Sub1_1.method1747();
			arg1.anInt2379 = (local12 & 0xFFFF) + Static10.anInt300;
			arg1.anInt2331 = local12 >> 16;
			if (arg1.anInt2362 == 65535) {
				arg1.anInt2362 = -1;
			}
			arg1.anInt2372 = 0;
			arg1.anInt2343 = 0;
			if (arg1.anInt2379 > Static10.anInt300) {
				arg1.anInt2372 = -1;
			}
		}
		if ((arg2 & 0x10) != 0) {
			arg1.aClass80_918 = Static100.aClass2_Sub17_Sub1_1.method1797();
			if (arg1.aClass80_918.method2031(0) == 126) {
				arg1.aClass80_918 = arg1.aClass80_918.method2021(1);
				Static3.method65(2, arg1.aClass80_918, arg1.aClass80_924);
			} else if (Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1 == arg1) {
				Static3.method65(2, arg1.aClass80_918, arg1.aClass80_924);
			}
			arg1.anInt2328 = 150;
			arg1.anInt2337 = 0;
			arg1.anInt2359 = 0;
		}
		if ((arg2 & 0x200) == 0) {
			return;
		}
		arg1.anInt2325 = Static100.aClass2_Sub17_Sub1_1.method1780();
		arg1.anInt2332 = Static100.aClass2_Sub17_Sub1_1.method1789();
		arg1.anInt2341 = Static100.aClass2_Sub17_Sub1_1.method1789();
		arg1.anInt2320 = Static100.aClass2_Sub17_Sub1_1.method1780();
		arg1.anInt2366 = Static100.aClass2_Sub17_Sub1_1.method1756() + Static10.anInt300;
		arg1.anInt2383 = Static100.aClass2_Sub17_Sub1_1.method1779() + Static10.anInt300;
		arg1.anInt2376 = Static100.aClass2_Sub17_Sub1_1.method1751();
		arg1.anInt2382 = 1;
		arg1.anInt2365 = 0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!wd;ILclient!wd;Lclient!wd;)V")
	public static void method1264(@OriginalArg(0) Class80 arg0, @OriginalArg(2) Class80 arg1, @OriginalArg(3) Class80 arg2) {
		Static79.aClass80_785 = arg0;
		Static79.aClass80_791 = arg2;
		Static79.aClass80_793 = arg1;
	}
}
