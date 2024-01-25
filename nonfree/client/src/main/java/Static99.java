import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	public static void method1608() {
		Static5.method5254(false);
		Static442.anInt7684 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static435.aByteArrayArray24.length; local14++) {
			if (Static21.anIntArray25[local14] != -1 && Static435.aByteArrayArray24[local14] == null) {
				Static435.aByteArrayArray24[local14] = Static162.aClass109_37.method2349(Static21.anIntArray25[local14], 0);
				if (Static435.aByteArrayArray24[local14] == null) {
					Static442.anInt7684++;
					local12 = false;
				}
			}
			if (Static228.anIntArray311[local14] != -1 && Static242.aByteArrayArray18[local14] == null) {
				Static242.aByteArrayArray18[local14] = Static162.aClass109_37.method2345(0, Static439.anIntArrayArray58[local14], Static228.anIntArray311[local14]);
				if (Static242.aByteArrayArray18[local14] == null) {
					local12 = false;
					Static442.anInt7684++;
				}
			}
			if (Static28.anIntArray30[local14] != -1 && Static306.aByteArrayArray19[local14] == null) {
				Static306.aByteArrayArray19[local14] = Static162.aClass109_37.method2349(Static28.anIntArray30[local14], 0);
				if (Static306.aByteArrayArray19[local14] == null) {
					local12 = false;
					Static442.anInt7684++;
				}
			}
			if (Static235.anIntArray330[local14] != -1 && Static26.aByteArrayArray3[local14] == null) {
				Static26.aByteArrayArray3[local14] = Static162.aClass109_37.method2349(Static235.anIntArray330[local14], 0);
				if (Static26.aByteArrayArray3[local14] == null) {
					local12 = false;
					Static442.anInt7684++;
				}
			}
			if (Static57.anIntArray46 != null && Static81.aByteArrayArray5[local14] == null && Static57.anIntArray46[local14] != -1) {
				Static81.aByteArrayArray5[local14] = Static162.aClass109_37.method2345(0, Static439.anIntArrayArray58[local14], Static57.anIntArray46[local14]);
				if (Static81.aByteArrayArray5[local14] == null) {
					Static442.anInt7684++;
					local12 = false;
				}
			}
		}
		if (Static212.aClass84_1 == null) {
			if (Static415.aClass1_Sub1_Sub6_3 == null || !Static44.aClass109_20.method2334(Static415.aClass1_Sub1_Sub6_3.aString22 + "_staticelements")) {
				Static212.aClass84_1 = new Class84(0);
			} else if (Static44.aClass109_20.method2342(Static415.aClass1_Sub1_Sub6_3.aString22 + "_staticelements")) {
				Static212.aClass84_1 = Static244.method5752(Static175.aBoolean433, Static415.aClass1_Sub1_Sub6_3.aString22 + "_staticelements", Static44.aClass109_20);
			} else {
				Static442.anInt7684++;
				local12 = false;
			}
		}
		if (!local12) {
			Static373.anInt6744 = 1;
			return;
		}
		local12 = true;
		Static43.anInt678 = 0;
		@Pc(269) int local269;
		@Pc(279) int local279;
		for (@Pc(250) int local250 = 0; local250 < Static435.aByteArrayArray24.length; local250++) {
			@Pc(256) byte[] local256 = Static242.aByteArrayArray18[local250];
			if (local256 != null) {
				local269 = (Static68.anIntArray59[local250] >> 8) * 64 - Static190.anInt3507;
				local279 = (Static68.anIntArray59[local250] & 0xFF) * 64 - Static331.anInt6034;
				if (Static188.anInt3479 != 0) {
					local279 = 10;
					local269 = 10;
				}
				local12 &= Static233.method3383(local279, Static104.anInt2048, Static80.anInt6558, local269, local256);
			}
			local256 = Static26.aByteArrayArray3[local250];
			if (local256 != null) {
				local269 = (Static68.anIntArray59[local250] >> 8) * 64 - Static190.anInt3507;
				local279 = (Static68.anIntArray59[local250] & 0xFF) * 64 - Static331.anInt6034;
				if (Static188.anInt3479 != 0) {
					local279 = 10;
					local269 = 10;
				}
				local12 &= Static233.method3383(local279, Static104.anInt2048, Static80.anInt6558, local269, local256);
			}
		}
		if (!local12) {
			Static373.anInt6744 = 2;
			return;
		}
		if (Static373.anInt6744 != 0) {
			Static210.method3170(true, Static293.aClass96_81.method1935(Static389.anInt7061) + "<br>(100%)", Static199.aClass4_4);
		}
		Static442.method5918();
		Static278.method5798();
		@Pc(374) boolean local374 = false;
		if (Static447.aClass121_11.method4607() && Static327.aClass230_Sub1_1.aBoolean616) {
			for (local269 = 0; local269 < Static435.aByteArrayArray24.length; local269++) {
				if (Static26.aByteArrayArray3[local269] != null || Static306.aByteArrayArray19[local269] != null) {
					local374 = true;
					break;
				}
			}
		}
		if (Static327.aClass230_Sub1_1.aBoolean622) {
			local269 = Static319.anIntArray439[Static440.anInt7674];
		} else {
			local269 = Static243.anIntArray333[Static440.anInt7674];
		}
		if (Static447.aClass121_11.method4582()) {
			local269++;
		}
		Static240.method3505(Static80.anInt6558, Static104.anInt2048, local269, local374, Static447.aClass121_11.method4572() > 0);
		for (local279 = 0; local279 < 4; local279++) {
			Static20.aClass181Array2[local279].method3877();
		}
		Static1.method27();
		Static105.method1701(false);
		Static141.method2264();
		Static448.aClass223_1 = null;
		Static442.method5918();
		System.gc();
		Static5.method5254(true);
		Static100.method1620();
		Static197.anInt3553 = Static327.aClass230_Sub1_1.method5636(Static146.anInt2664);
		Static138.aBoolean636 = Static327.aClass230_Sub1_1.aBoolean616;
		Static313.aBoolean427 = Static188.anInt3481 >= 96;
		Static53.aBoolean76 = Static327.aClass230_Sub1_1.method5639(Static146.anInt2664);
		Static410.aBoolean597 = !Static327.aClass230_Sub1_1.aBoolean605;
		Static103.anInt1993 = Static327.aClass230_Sub1_1.method5644(Static146.anInt2664) ? -1 : Static29.anInt483;
		Static80.aBoolean532 = Static146.anInt2664 == 1 || Static327.aClass230_Sub1_1.aBoolean615;
		Static277.aBoolean370 = Static327.aClass230_Sub1_1.aBoolean617;
		Static72.aClass71_Sub1_1 = new Class71_Sub1(4, Static80.anInt6558, Static104.anInt2048, false);
		if (Static188.anInt3479 == 0) {
			Static156.method2487(Static435.aByteArrayArray24, Static72.aClass71_Sub1_1);
		} else {
			Static72.method1097(Static72.aClass71_Sub1_1, Static435.aByteArrayArray24);
		}
		Static249.method3586(Static80.anInt6558 >> 4, Static104.anInt2048 >> 4);
		Static420.method5671();
		if (local374) {
			Static197.method3043(true);
			Static163.aClass71_Sub1_2 = new Class71_Sub1(1, Static80.anInt6558, Static104.anInt2048, true);
			if (Static188.anInt3479 == 0) {
				Static156.method2487(Static306.aByteArrayArray19, Static163.aClass71_Sub1_2);
				Static5.method5254(true);
			} else {
				Static72.method1097(Static163.aClass71_Sub1_2, Static306.aByteArrayArray19);
				Static5.method5254(true);
			}
			Static163.aClass71_Sub1_2.method4800(Static72.aClass71_Sub1_1.anIntArrayArrayArray106[0]);
			Static163.aClass71_Sub1_2.method4795(null, null, Static447.aClass121_11);
			Static197.method3043(false);
		}
		Static72.aClass71_Sub1_1.method4795(local374 ? Static163.aClass71_Sub1_2.anIntArrayArrayArray106 : null, Static20.aClass181Array2, Static447.aClass121_11);
		if (Static188.anInt3479 == 0) {
			Static5.method5254(true);
			Static62.method952(Static72.aClass71_Sub1_1, Static242.aByteArrayArray18);
			if (Static81.aByteArrayArray5 != null) {
				Static138.method5730();
			}
		} else {
			Static5.method5254(true);
			Static9.method178(Static72.aClass71_Sub1_1, Static242.aByteArrayArray18);
		}
		Static278.method5798();
		Static5.method5254(true);
		Static72.aClass71_Sub1_1.method4797(Static447.aClass121_11, null, local374 ? Static315.aClass70Array3[0] : null);
		Static72.aClass71_Sub1_1.method4813(Static447.aClass121_11);
		Static5.method5254(true);
		if (local374) {
			Static197.method3043(true);
			Static5.method5254(true);
			if (Static188.anInt3479 == 0) {
				Static62.method952(Static163.aClass71_Sub1_2, Static26.aByteArrayArray3);
			} else {
				Static9.method178(Static163.aClass71_Sub1_2, Static26.aByteArrayArray3);
			}
			Static278.method5798();
			Static5.method5254(true);
			Static163.aClass71_Sub1_2.method4797(Static447.aClass121_11, Static60.aClass70Array1[0], null);
			Static163.aClass71_Sub1_2.method4813(Static447.aClass121_11);
			Static5.method5254(true);
			Static197.method3043(false);
		}
		Static148.method5607();
		@Pc(701) int local701 = Static72.aClass71_Sub1_1.anInt6080;
		if (local701 > Static1.anInt41) {
			local701 = Static1.anInt41;
		}
		if (local701 < Static1.anInt41 - 1) {
			local701 = Static1.anInt41 - 1;
		}
		if (Static327.aClass230_Sub1_1.method5644(Static146.anInt2664)) {
			Static195.method3035(0);
		} else {
			Static195.method3035(local701);
		}
		@Pc(736) int local736;
		@Pc(740) int local740;
		for (@Pc(732) int local732 = 0; local732 < 4; local732++) {
			for (local736 = 0; local736 < Static80.anInt6558; local736++) {
				for (local740 = 0; local740 < Static104.anInt2048; local740++) {
					Static111.method1739(local736, local732, local740);
				}
			}
		}
		Static2.method35();
		Static442.method5918();
		Static251.method3599();
		Static278.method5798();
		Static78.aBoolean125 = false;
		Static2.method36();
		if (Static303.aFrame1 != null && Static169.aClass114_4 != null && Static40.anInt629 == 25) {
			Static224.method3272(Static183.aClass254_74);
			Static201.aClass1_Sub14_Sub2_2.method4522(1057001181);
		}
		if (Static188.anInt3479 == 0) {
			local736 = (Static254.anInt4366 - (Static80.anInt6558 >> 4)) / 8;
			local740 = ((Static80.anInt6558 >> 4) + Static254.anInt4366) / 8;
			@Pc(824) int local824 = (Static289.anInt4852 - (Static104.anInt2048 >> 4)) / 8;
			@Pc(832) int local832 = (Static289.anInt4852 + (Static104.anInt2048 >> 4)) / 8;
			for (@Pc(836) int local836 = local736 - 1; local836 <= local740 + 1; local836++) {
				for (@Pc(842) int local842 = local824 - 1; local842 <= local832 + 1; local842++) {
					if (local736 > local836 || local836 > local740 || local842 < local824 || local842 > local832) {
						Static162.aClass109_37.method2352("m" + local836 + "_" + local842);
						Static162.aClass109_37.method2352("l" + local836 + "_" + local842);
					}
				}
			}
		}
		if (Static40.anInt629 == 28) {
			Static169.method2637(10);
		} else {
			Static169.method2637(30);
			if (Static169.aClass114_4 != null) {
				Static224.method3272(Static163.aClass254_64);
			}
		}
		Static355.method5094();
		Static442.method5918();
		Static346.method4985();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZIILclient!tn;)V")
	public static void method1609(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class229 arg3) {
		@Pc(13) int local13 = arg3.anInt6905;
		if (arg3.aByte94 == 0) {
			arg3.anInt6905 = arg3.anInt6883;
		} else if (arg3.aByte94 == 1) {
			arg3.anInt6905 = arg2 - arg3.anInt6883;
		} else if (arg3.aByte94 == 2) {
			arg3.anInt6905 = arg2 * arg3.anInt6883 >> 14;
		}
		@Pc(55) int local55 = arg3.anInt6895;
		if (arg3.aByte91 == 0) {
			arg3.anInt6895 = arg3.anInt6912;
		} else if (arg3.aByte91 == 1) {
			arg3.anInt6895 = arg0 - arg3.anInt6912;
		} else if (arg3.aByte91 == 2) {
			arg3.anInt6895 = arg0 * arg3.anInt6912 >> 14;
		}
		if (arg3.aByte94 == 4) {
			arg3.anInt6905 = arg3.anInt6895 * arg3.anInt6861 / arg3.anInt6907;
		}
		if (arg3.aByte91 == 4) {
			arg3.anInt6895 = arg3.anInt6907 * arg3.anInt6905 / arg3.anInt6861;
		}
		if (Static424.aBoolean633 && (Static51.method751(arg3).anInt1143 != 0 || arg3.anInt6863 == 0)) {
			if (arg3.anInt6895 < 5 && arg3.anInt6905 < 5) {
				arg3.anInt6895 = 5;
				arg3.anInt6905 = 5;
			} else {
				if (arg3.anInt6895 <= 0) {
					arg3.anInt6895 = 5;
				}
				if (arg3.anInt6905 <= 0) {
					arg3.anInt6905 = 5;
				}
			}
		}
		if (Static67.anInt1218 == arg3.anInt6893) {
			Static436.aClass229_14 = arg3;
		}
		if (arg1 && arg3.anObjectArray21 != null && (local13 != arg3.anInt6905 || arg3.anInt6895 != local55)) {
			@Pc(205) Class1_Sub16 local205 = new Class1_Sub16();
			local205.aClass229_4 = arg3;
			local205.anObjectArray1 = arg3.anObjectArray21;
			Static38.aClass142_8.method3212(local205);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZZ)Z")
	public static boolean method1610(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIB)Lclient!tn;")
	public static Class229 method1611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class229 local7 = Static203.method1670(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass229Array2 == null || local7.aClass229Array2.length <= arg0) {
			return null;
		} else {
			return local7.aClass229Array2[arg0];
		}
	}
}
