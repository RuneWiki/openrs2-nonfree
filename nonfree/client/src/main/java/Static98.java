import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
	public static int anInt2035;

	@OriginalMember(owner = "client!hd", name = "Q", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray33 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!hd", name = "S", descriptor = "[J")
	public static long[] aLongArray7 = new long[200];

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!pd;ILclient!rd;)Lclient!td;")
	public static Class8_Sub29 method1565(@OriginalArg(0) Class129 arg0, @OriginalArg(2) Class140 arg1) {
		@Pc(34) long local34 = ((long) arg1.anInt4595 << 32) + (((long) arg1.anInt4593 << 56) - (long) (-(arg1.anInt4598 + 1 << 16) - arg1.anInt4591));
		@Pc(40) Class8_Sub29 local40 = (Class8_Sub29) arg0.method3043(local34);
		if (local40 == null) {
			local40 = new Class8_Sub29(arg1.anInt4598, (float) arg1.anInt4591, true, false, arg1.anInt4595);
			arg0.method3039(local40, local34);
		}
		return local40;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)V")
	public static void method1566() {
		@Pc(7) boolean local7 = false;
		while (!local7) {
			local7 = true;
			for (@Pc(13) int local13 = 0; local13 < Static185.anInt3679 - 1; local13++) {
				if (Static204.aShortArray34[local13] < 1000 && Static204.aShortArray34[local13 + 1] > 1000) {
					local7 = false;
					@Pc(39) String local39 = Static161.aStringArray47[local13];
					Static161.aStringArray47[local13] = Static161.aStringArray47[local13 + 1];
					Static161.aStringArray47[local13 + 1] = local39;
					@Pc(57) String local57 = Static57.aStringArray19[local13];
					Static57.aStringArray19[local13] = Static57.aStringArray19[local13 + 1];
					Static57.aStringArray19[local13 + 1] = local57;
					@Pc(75) int local75 = Static243.anIntArray368[local13];
					Static243.anIntArray368[local13] = Static243.anIntArray368[local13 + 1];
					Static243.anIntArray368[local13 + 1] = local75;
					@Pc(93) int local93 = Static190.anIntArray283[local13];
					Static190.anIntArray283[local13] = Static190.anIntArray283[local13 + 1];
					Static190.anIntArray283[local13 + 1] = local93;
					@Pc(111) int local111 = Static65.anIntArray476[local13];
					Static65.anIntArray476[local13] = Static65.anIntArray476[local13 + 1];
					Static65.anIntArray476[local13 + 1] = local111;
					@Pc(129) short local129 = Static204.aShortArray34[local13];
					Static204.aShortArray34[local13] = Static204.aShortArray34[local13 + 1];
					Static204.aShortArray34[local13 + 1] = local129;
					@Pc(147) long local147 = Static95.aLongArray6[local13];
					Static95.aLongArray6[local13] = Static95.aLongArray6[local13 + 1];
					Static95.aLongArray6[local13 + 1] = local147;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(11) int local11 = 0; local11 < Static245.aClass130_2.anInt3917; local11++) {
			if (Static245.aClass130_2.method3052(local11)) {
				@Pc(52) int[] local52 = Static267.aClass8_Sub1_Sub2_2.method423(Static245.aClass130_2.anIntArray297[local11] >> 28 & 0x3, Static245.aClass130_2.anIntArray297[local11] & 0x3FFF, Static245.aClass130_2.anIntArray297[local11] >> 14 & 0x3FFF);
				if (local52 != null) {
					@Pc(61) int local61 = local52[1] - Static220.anInt4522;
					@Pc(72) int local72 = Static221.anInt4539 + Static140.anInt2782 - local52[2] - 1;
					@Pc(87) int local87 = arg7 + (local61 - arg0) * (arg4 - arg7) / (arg1 - arg0);
					@Pc(102) int local102 = arg3 + (arg5 - arg3) * (local72 - arg6) / (arg2 - arg6);
					@Pc(107) int local107 = Static245.aClass130_2.method3049(local11);
					@Pc(109) int local109 = 16777215;
					@Pc(111) Class102 local111 = null;
					if (local107 == 0) {
						if ((double) Static224.aFloat47 == 3.0D) {
							local111 = Static163.aClass102_9;
						}
						if ((double) Static224.aFloat47 == 4.0D) {
							local111 = Static134.aClass102_2;
						}
						if ((double) Static224.aFloat47 == 6.0D) {
							local111 = Static168.aClass102_11;
						}
						if ((double) Static224.aFloat47 >= 8.0D) {
							local111 = Static197.aClass102_8;
						}
					}
					if (local107 == 1) {
						if ((double) Static224.aFloat47 == 3.0D) {
							local111 = Static168.aClass102_11;
						}
						if ((double) Static224.aFloat47 == 4.0D) {
							local111 = Static197.aClass102_8;
						}
						if ((double) Static224.aFloat47 == 6.0D) {
							local111 = Static270.aClass102_10;
						}
						if ((double) Static224.aFloat47 >= 8.0D) {
							local111 = Static2.aClass102_1;
						}
					}
					if (local107 == 2) {
						if ((double) Static224.aFloat47 == 3.0D) {
							local111 = Static270.aClass102_10;
						}
						local109 = 16755200;
						if ((double) Static224.aFloat47 == 4.0D) {
							local111 = Static2.aClass102_1;
						}
						if ((double) Static224.aFloat47 == 6.0D) {
							local111 = Static188.aClass102_6;
						}
						if ((double) Static224.aFloat47 >= 8.0D) {
							local111 = Static193.aClass102_7;
						}
					}
					if (Static245.aClass130_2.anIntArray298[local11] != -1) {
						local109 = Static245.aClass130_2.anIntArray298[local11];
					}
					if (local111 != null) {
						@Pc(243) int local243 = Static276.aClass8_Sub1_Sub5_4.method2036(Static245.aClass130_2.aStringArray61[local11], null, Static167.aStringArray50);
						local102 -= local111.method2403() * (local243 - 1) / 2;
						local102 += local111.method2404() / 2;
						for (@Pc(263) int local263 = 0; local263 < local243; local263++) {
							@Pc(274) String local274 = Static167.aStringArray50[local263];
							if (local243 - 1 > local263) {
								local274 = local274.substring(0, local274.length() - 4);
							}
							local111.method2405(local274, local87, local102, local109);
							local102 += local111.method2403();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([II)[I")
	public static int[] method1570(@OriginalArg(0) int[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(13) int[] local13 = new int[arg0.length];
			Static301.method494(arg0, 0, local13, 0, arg0.length);
			return local13;
		}
	}
}
