import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!qa", name = "M", descriptor = "I")
	public static int anInt2560;

	@OriginalMember(owner = "client!qa", name = "kb", descriptor = "Lclient!af;")
	public static Class7_Sub1 aClass7_Sub1_17;

	@OriginalMember(owner = "client!qa", name = "pb", descriptor = "I")
	public static int anInt2575;

	@OriginalMember(owner = "client!qa", name = "G", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1348 = Static80.method1463("Offline");

	@OriginalMember(owner = "client!qa", name = "H", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1349 = Static80.method1463("redstone1");

	@OriginalMember(owner = "client!qa", name = "I", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1350 = Static80.method1463("New User");

	@OriginalMember(owner = "client!qa", name = "J", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1351 = aClass63_1350;

	@OriginalMember(owner = "client!qa", name = "X", descriptor = "I")
	public static int anInt2565 = 2;

	@OriginalMember(owner = "client!qa", name = "bb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1352 = Static80.method1463("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)Lclient!h;")
	public static Class6_Sub3_Sub8 method1664(@OriginalArg(1) int arg0) {
		@Pc(10) Class6_Sub3_Sub8 local10 = (Class6_Sub3_Sub8) Static36.aClass49_9.method1397((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static24.aClass7_15.method110(10, arg0);
		local10 = new Class6_Sub3_Sub8();
		local10.anInt1400 = arg0;
		if (local20 != null) {
			local10.method964(new Class6_Sub4(local20));
		}
		local10.method969();
		if (local10.anInt1386 != -1) {
			local10.method954(method1664(local10.anInt1377), method1664(local10.anInt1386));
		}
		if (!Static124.aBoolean186 && local10.aBoolean65) {
			local10.anInt1385 = 0;
			local10.aClass63Array12 = null;
			local10.aClass63Array11 = null;
			local10.aClass63_742 = Static29.aClass63_542;
		}
		Static36.aClass49_9.method1396((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBI)I")
	public static int method1665(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 2) {
			@Pc(15) int local15 = method1665(arg0 * arg0, arg1 >> 1);
			if ((arg1 & 0x1) != 0) {
				local15 *= arg0;
			}
			return local15;
		} else if (arg1 == 1) {
			return arg0;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(JI)V")
	public static void method1666(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static5.anInt52 >= 100 && Static14.anInt463 != 1 || Static5.anInt52 >= 200) {
			Static46.method996(Static111.aClass63_1661, 0, Static10.aClass63_261);
			return;
		}
		@Pc(33) Class63 local33 = Static24.method578(arg0).method1814();
		for (@Pc(35) int local35 = 0; local35 < Static5.anInt52; local35++) {
			if (Static49.aLongArray2[local35] == arg0) {
				Static46.method996(Static111.aClass63_1661, 0, Static15.method374(new Class63[] { local33, Static43.aClass63_75 }));
				return;
			}
		}
		for (@Pc(74) int local74 = 0; local74 < Static92.anInt2592; local74++) {
			if (Static92.aLongArray5[local74] == arg0) {
				Static46.method996(Static111.aClass63_1661, 0, Static15.method374(new Class63[] { Static39.aClass63_680, local33, Static98.aClass63_1499 }));
				return;
			}
		}
		if (local33.method1819(Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.aClass63_1237)) {
			return;
		}
		Static65.aClass63Array16[Static5.anInt52] = local33;
		Static49.aLongArray2[Static5.anInt52] = arg0;
		Static31.anIntArray127[Static5.anInt52] = 0;
		Static12.anIntArray50[Static5.anInt52] = 0;
		Static5.anInt52++;
		Static72.anInt2047 = Static73.anInt2064 + 1;
		Static10.aBoolean20 = true;
		Static23.aClass6_Sub4_Sub1_4.method1347(44);
		Static23.aClass6_Sub4_Sub1_4.method1331(arg0);
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(III)I")
	public static int method1667(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = (arg1 & 0x7F) * arg0 / 128;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
	public static void method1668() {
		@Pc(11) int local11;
		if (Static106.anInt2957 > 0) {
			for (local11 = 0; local11 < 256; local11++) {
				if (Static106.anInt2957 > 768) {
					Static46.anIntArray164[local11] = Static119.method2118(1024 - Static106.anInt2957, Static37.anIntArray140[local11], Static2.anIntArray2[local11]);
				} else if (Static106.anInt2957 > 256) {
					Static46.anIntArray164[local11] = Static37.anIntArray140[local11];
				} else {
					Static46.anIntArray164[local11] = Static119.method2118(256 - Static106.anInt2957, Static2.anIntArray2[local11], Static37.anIntArray140[local11]);
				}
			}
		} else if (Static15.anInt489 > 0) {
			for (local11 = 0; local11 < 256; local11++) {
				if (Static15.anInt489 > 768) {
					Static46.anIntArray164[local11] = Static119.method2118(1024 - Static15.anInt489, Static103.anIntArray360[local11], Static2.anIntArray2[local11]);
				} else if (Static15.anInt489 <= 256) {
					Static46.anIntArray164[local11] = Static119.method2118(256 - Static15.anInt489, Static2.anIntArray2[local11], Static103.anIntArray360[local11]);
				} else {
					Static46.anIntArray164[local11] = Static103.anIntArray360[local11];
				}
			}
		} else {
			for (local11 = 0; local11 < 256; local11++) {
				Static46.anIntArray164[local11] = Static2.anIntArray2[local11];
			}
		}
		for (local11 = 0; local11 < 33920; local11++) {
			Static90.aClass29_19.anIntArray239[local11] = Static54.aClass6_Sub3_Sub3_Sub2_1.anIntArray221[local11];
		}
		@Pc(168) int local168 = 0;
		@Pc(170) int local170 = 1152;
		@Pc(185) int local185;
		@Pc(189) int local189;
		@Pc(199) int local199;
		@Pc(206) int local206;
		@Pc(215) int local215;
		@Pc(213) int local213;
		@Pc(224) int local224;
		for (@Pc(172) int local172 = 1; local172 < 255; local172++) {
			local185 = (256 - local172) * Static65.anIntArray218[local172] / 256;
			local189 = local185 + 22;
			if (local189 < 0) {
				local189 = 0;
			}
			local168 += local189;
			for (local199 = local189; local199 < 128; local199++) {
				local206 = Static86.anIntArray277[local168++];
				if (local206 == 0) {
					local170++;
				} else {
					local213 = 256 - local206;
					local215 = local206;
					local206 = Static46.anIntArray164[local206];
					local224 = Static90.aClass29_19.anIntArray239[local170];
					Static90.aClass29_19.anIntArray239[local170++] = ((local224 & 0xFF00) * local213 + local215 * (local206 & 0xFF00) & 0xFF0000) + (local213 * (local224 & 0xFF00FF) + local215 * (local206 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local170 += local189;
		}
		local168 = 0;
		for (local185 = 0; local185 < 33920; local185++) {
			Static74.aClass29_11.anIntArray239[local185] = Static106.aClass6_Sub3_Sub3_Sub2_5.anIntArray221[local185];
		}
		local170 = 1176;
		for (local189 = 1; local189 < 255; local189++) {
			local199 = Static65.anIntArray218[local189] * (256 - local189) / 256;
			local206 = 103 - local199;
			local170 += local199;
			for (local215 = 0; local215 < local206; local215++) {
				local213 = Static86.anIntArray277[local168++];
				if (local213 == 0) {
					local170++;
				} else {
					@Pc(356) int local356 = 256 - local213;
					@Pc(361) int local361 = Static74.aClass29_11.anIntArray239[local170];
					local224 = local213;
					local213 = Static46.anIntArray164[local213];
					Static74.aClass29_11.anIntArray239[local170++] = (local356 * (local361 & 0xFF00FF) + local224 * (local213 & 0xFF00FF) & 0xFF00FF00) + (local224 * (local213 & 0xFF00) + local356 * (local361 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local168 += 128 - local206;
			local170 += 128 - local206 - local199;
		}
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
	public static void method1669() {
		aClass63_1348 = null;
		aClass63_1352 = null;
		aClass63_1350 = null;
		aClass63_1351 = null;
		aClass7_Sub1_17 = null;
		aClass63_1349 = null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLclient!wa;)Z")
	public static boolean method1670(@OriginalArg(1) Class6_Sub3_Sub17 arg0) {
		if (arg0.anIntArray367 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray367.length; local17++) {
			@Pc(24) int local24 = Static67.method1210(arg0, local17);
			@Pc(29) int local29 = arg0.anIntArray366[local17];
			if (arg0.anIntArray367[local17] == 2) {
				if (local29 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray367[local17] == 3) {
				if (local24 <= local29) {
					return false;
				}
			} else if (arg0.anIntArray367[local17] == 4) {
				if (local24 == local29) {
					return false;
				}
			} else if (local24 != local29) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZIIZZ)Lclient!af;")
	public static Class7_Sub1 method1671(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) Class53 local10 = null;
		if (Static111.aClass78_4 != null) {
			local10 = new Class53(arg1, Static111.aClass78_4, Static53.aClass78Array10[arg1], 1000000);
		}
		return new Class7_Sub1(local10, Static31.aClass53_4, arg1, arg3, arg0, arg2);
	}
}
