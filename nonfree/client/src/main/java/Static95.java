import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
	public static int anInt2242;

	@OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
	public static int anInt2249;

	@OriginalMember(owner = "client!pb", name = "A", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1053 = Static56.method816("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1043 = aClass34_1053;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1046 = Static56.method816("wave:");

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1044 = aClass34_1046;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray18 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
	public static int anInt2240 = 0;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1045 = Static56.method816("Connecting to update server");

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1047 = aClass34_1046;

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1048 = aClass34_1045;

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1049 = Static56.method816("Welt");

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1050 = Static56.method816("mod_icons");

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1051 = Static56.method816("");

	@OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
	public static int anInt2247 = 0;

	@OriginalMember(owner = "client!pb", name = "v", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1052 = Static56.method816("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!pb", name = "C", descriptor = "I")
	public static int anInt2253 = 500;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
	public static void method1346() {
		try {
			if (Static106.anInt2456 == 1) {
				@Pc(17) int local17 = Static47.aClass8_Sub11_Sub1_1.method882();
				if (local17 > 0 && Static47.aClass8_Sub11_Sub1_1.method869()) {
					local17 -= Static39.anInt956;
					if (local17 < 0) {
						local17 = 0;
					}
					Static47.aClass8_Sub11_Sub1_1.method867(local17);
				} else {
					Static47.aClass8_Sub11_Sub1_1.method898();
					Static47.aClass8_Sub11_Sub1_1.method878();
					Static9.aClass8_Sub12_1 = null;
					if (Static69.aClass14_18 == null) {
						Static106.anInt2456 = 0;
					} else {
						Static106.anInt2456 = 2;
					}
					Static112.aClass19_1 = null;
				}
			}
		} catch (@Pc(59) Exception local59) {
			local59.printStackTrace();
			Static47.aClass8_Sub11_Sub1_1.method898();
			Static112.aClass19_1 = null;
			Static106.anInt2456 = 0;
			Static69.aClass14_18 = null;
			Static9.aClass8_Sub12_1 = null;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!ic;B)V")
	public static void method1347(@OriginalArg(0) Class34 arg0) {
		if (Static9.anInt194 >= 2) {
			if (arg0.method806(Static34.aClass34_487)) {
				System.gc();
			}
			if (arg0.method806(Static22.aClass34_1202)) {
				Static100.method1457();
			}
			if (arg0.method806(Static70.aClass34_796)) {
				Static1.aBoolean1 = true;
			}
			if (arg0.method806(Static64.aClass34_920)) {
				Static1.aBoolean1 = false;
			}
			if (arg0.method806(Static118.aClass34_1242)) {
				for (@Pc(45) int local45 = 0; local45 < 4; local45++) {
					for (@Pc(48) int local48 = 1; local48 < 103; local48++) {
						for (@Pc(51) int local51 = 1; local51 < 103; local51++) {
							Static97.aClass42Array1[local45].anIntArrayArray12[local48][local51] = 0;
						}
					}
				}
			}
			if (arg0.method806(Static3.aClass34_21) && Static88.anInt2341 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method826(Static103.aClass34_1115)) {
				Static82.anInt1973 = arg0.method835(12).method812().method823();
				Static108.method1530(Static44.method669(new Class34[] { Static14.aClass34_205, Static44.method672(Static82.anInt1973) }), null, 0);
			}
			if (arg0.method806(Static66.aClass34_1359)) {
				Static33.aBoolean42 = true;
			}
		}
		Static106.aClass8_Sub20_Sub1_3.method1907(217);
		Static106.aClass8_Sub20_Sub1_3.method1883(arg0.method820() - 1);
		Static106.aClass8_Sub20_Sub1_3.method1865(arg0.method835(2));
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZIBI)Lclient!ic;")
	public static Class34 method1348(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = 1;
		for (@Pc(19) int local19 = arg1 / 10; local19 != 0; local19 /= 10) {
			local15++;
		}
		@Pc(29) int local29 = local15;
		if (arg1 < 0 || arg0) {
			local29 = local15 + 1;
		}
		@Pc(40) byte[] local40 = new byte[local29];
		if (arg1 < 0) {
			local40[0] = 45;
		} else if (arg0) {
			local40[0] = 43;
		}
		for (@Pc(55) int local55 = 0; local55 < local15; local55++) {
			@Pc(60) int local60 = arg1 % 10;
			arg1 /= 10;
			if (local60 < 0) {
				local60 = -local60;
			}
			if (local60 > 9) {
				local60 += 39;
			}
			local40[local29 - local55 - 1] = (byte) (local60 + 48);
		}
		@Pc(94) Class34 local94 = new Class34();
		local94.anInt1418 = local29;
		local94.aByteArray20 = local40;
		return local94;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public static void method1349() {
		aClass34_1048 = null;
		aClass34_1047 = null;
		aBooleanArray18 = null;
		aClass34_1052 = null;
		aClass34_1050 = null;
		aClass34_1053 = null;
		aClass34_1051 = null;
		aClass34_1043 = null;
		aClass34_1044 = null;
		aClass34_1045 = null;
		aClass34_1049 = null;
		aClass34_1046 = null;
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(Z)V")
	public static void method1352() {
		Static126.aClass48_46.method1101();
		Static86.aClass48_39.method1101();
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
	public static void method1353() {
		for (@Pc(3) int local3 = 0; local3 < Static94.anInt2223; local3++) {
			@Pc(9) int local9 = Static50.anIntArray164[local3];
			@Pc(13) Class8_Sub1_Sub1_Sub4_Sub2 local13 = Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[local9];
			if (local13 != null) {
				Static18.method307(local13, local13.aClass8_Sub1_Sub16_1.anInt2439);
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)Z")
	public static boolean method1354(@OriginalArg(0) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIII)V")
	public static void method1357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = 2048 - arg0 & 0x7FF;
		@Pc(17) int local17 = 2048 - arg1 & 0x7FF;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = arg4;
		@Pc(41) int local41;
		@Pc(37) int local37;
		@Pc(52) int local52;
		if (local10 != 0) {
			local37 = Class8_Sub1_Sub3_Sub1.anIntArray40[local10];
			local41 = Class8_Sub1_Sub3_Sub1.anIntArray38[local10];
			local52 = local37 * 0 - local41 * arg4 >> 16;
			local28 = arg4 * local37 + local41 * 0 >> 16;
			local26 = local52;
		}
		if (local17 != 0) {
			local41 = Class8_Sub1_Sub3_Sub1.anIntArray38[local17];
			local37 = Class8_Sub1_Sub3_Sub1.anIntArray40[local17];
			local52 = local37 * 0 + local41 * local28 >> 16;
			local28 = local37 * local28 - local41 * 0 >> 16;
			local24 = local52;
		}
		Static24.anInt1900 = arg0;
		Static19.anInt593 = arg1;
		Static13.anInt345 = arg5 - local28;
		Static48.anInt2951 = arg2 - local24;
		Static113.anInt2579 = arg3 - local26;
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V")
	public static void method1358() {
		Static113.aClass48_52.method1101();
		Static49.aClass48_26.method1101();
	}
}
