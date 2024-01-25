import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "Lclient!lm;")
	public static Class134 aClass134_40;

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray13 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "S")
	public static short aShort35 = 32767;

	@OriginalMember(owner = "client!fo", name = "i", descriptor = "[[S")
	public static final short[][] aShortArrayArray3 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(BII)V")
	public static void method1439(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17;
		if (Static75.anInt1566 != arg0) {
			Static49.anIntArray492 = new int[arg0];
			for (local17 = 0; local17 < arg0; local17++) {
				Static49.anIntArray492[local17] = (local17 << 12) / arg0;
			}
			Static239.anInt2816 = arg0 - 1;
			Static192.anInt3988 = arg0 * 32;
			Static75.anInt1566 = arg0;
		}
		if (Static129.anInt2574 == arg1) {
			return;
		}
		if (arg1 == Static75.anInt1566) {
			Static191.anIntArray379 = Static49.anIntArray492;
		} else {
			Static191.anIntArray379 = new int[arg1];
			for (local17 = 0; local17 < arg1; local17++) {
				Static191.anIntArray379[local17] = (local17 << 12) / arg1;
			}
		}
		Static129.anInt2574 = arg1;
		Static42.anInt1137 = arg1 - 1;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(BIII)I")
	public static int method1440(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = arg0 & 0x3;
		if (local18 == 0) {
			return arg1;
		} else if (local18 == 1) {
			return 1023 - arg2;
		} else if (local18 == 2) {
			return 1023 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IILclient!ps;)Ljava/lang/String;")
	public static String method1441(@OriginalArg(1) int arg0, @OriginalArg(2) Class163 arg1) {
		if (!Static40.method857(arg1).method1093(arg0) && arg1.anObjectArray22 == null) {
			return null;
		} else if (arg1.aStringArray33 == null || arg0 >= arg1.aStringArray33.length || arg1.aStringArray33[arg0] == null || arg1.aStringArray33[arg0].trim().length() == 0) {
			return Static173.aBoolean279 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray33[arg0];
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "([Lclient!ba;II[BLclient!ii;IZ)V")
	public static void method1442(@OriginalArg(0) Class17[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) Class105 arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) Class1_Sub21 local10 = new Class1_Sub21(arg3);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method5695();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(27) int local27 = 0;
			while (true) {
				@Pc(31) int local31 = local10.method5699();
				if (local31 == 0) {
					break;
				}
				local27 += local31 - 1;
				@Pc(43) int local43 = local27 & 0x3F;
				@Pc(49) int local49 = local27 >> 6 & 0x3F;
				@Pc(53) int local53 = local27 >> 12;
				@Pc(57) int local57 = local10.method5720();
				@Pc(61) int local61 = local57 >> 2;
				@Pc(65) int local65 = local57 & 0x3;
				@Pc(69) int local69 = arg2 + local49;
				@Pc(73) int local73 = arg1 + local43;
				if (local69 > 0 && local73 > 0 && local69 < Static43.anInt1151 - 1 && local73 < Static260.anInt5348 - 1) {
					@Pc(99) Class17 local99 = null;
					if (!arg5) {
						@Pc(103) int local103 = local53;
						if ((Static291.aByteArrayArrayArray11[1][local69][local73] & 0x2) == 2) {
							local103 = local53 - 1;
						}
						if (local103 >= 0) {
							local99 = arg0[local103];
						}
					}
					Static34.method595(local12, local65, arg5, local73, true, local69, local53, local61, -1, local99, local53, arg4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IZZ)V")
	public static void method1443(@OriginalArg(2) boolean arg0) {
		Static41.anInt1132++;
		Static281.method4984();
		if (arg0) {
			Static182.anInt3806++;
			Static215.method3988();
		}
	}
}
