import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "Lclient!nm;")
	public static Class119 aClass119_38;

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
	public static int anInt1899 = 0;

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
	public static int anInt1900 = 0;

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "Lclient!ui;")
	public static Class175 aClass175_13 = new Class175(128);

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString68 = "Members object";

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString69 = "Loading sprites - ";

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
	public static int anInt1902 = 0;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)Z")
	public static boolean method1730(@OriginalArg(0) int arg0) {
		return arg0 == 4 || arg0 == 8;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)V")
	public static void method1731() {
		if (Static189.anInt3669 == 0) {
			return;
		}
		try {
			if (++Static231.anInt4320 > 1500) {
				if (Static97.aClass49_2 != null) {
					Static97.aClass49_2.method1307();
					Static97.aClass49_2 = null;
				}
				if (Static100.anInt5570 >= 1) {
					Static189.anInt3669 = 0;
					Static13.anInt282 = -5;
					return;
				}
				Static100.anInt5570++;
				if (Static245.anInt4509 == Static203.anInt3367) {
					Static203.anInt3367 = Static103.anInt2200;
				} else {
					Static203.anInt3367 = Static245.anInt4509;
				}
				Static189.anInt3669 = 1;
				Static231.anInt4320 = 0;
			}
			if (Static189.anInt3669 == 1) {
				Static224.aClass153_5 = Static222.aClass176_3.method4371(Static292.aString210, Static203.anInt3367);
				Static189.anInt3669 = 2;
			}
			@Pc(132) int local132;
			if (Static189.anInt3669 == 2) {
				if (Static224.aClass153_5.anInt4614 == 2) {
					throw new IOException();
				}
				if (Static224.aClass153_5.anInt4614 != 1) {
					return;
				}
				Static97.aClass49_2 = new Class49((Socket) Static224.aClass153_5.anObject6, Static222.aClass176_3);
				Static224.aClass153_5 = null;
				Static97.aClass49_2.method1302(Static116.aClass1_Sub13_Sub1_48.aByteArray63, Static116.aClass1_Sub13_Sub1_48.anInt2018);
				if (Static129.aClass121_2 != null) {
					Static129.aClass121_2.method3583();
				}
				if (Static13.aClass121_1 != null) {
					Static13.aClass121_1.method3583();
				}
				local132 = Static97.aClass49_2.method1301();
				if (Static129.aClass121_2 != null) {
					Static129.aClass121_2.method3583();
				}
				if (Static13.aClass121_1 != null) {
					Static13.aClass121_1.method3583();
				}
				if (local132 != 101) {
					Static13.anInt282 = local132;
					Static189.anInt3669 = 0;
					Static97.aClass49_2.method1307();
					Static97.aClass49_2 = null;
					return;
				}
				Static189.anInt3669 = 3;
			}
			if (Static189.anInt3669 == 3) {
				if (Static97.aClass49_2.method1300() < 2) {
					return;
				}
				local132 = Static97.aClass49_2.method1301() << 8 | Static97.aClass49_2.method1301();
				Static312.method4646(local132);
				if (Static124.anInt596 != -1) {
					Static189.anInt3669 = 0;
					Static97.aClass49_2.method1307();
					Static97.aClass49_2 = null;
					Static19.method319();
					return;
				}
				Static189.anInt3669 = 0;
				Static13.anInt282 = 6;
				Static97.aClass49_2.method1307();
				Static97.aClass49_2 = null;
				return;
			}
		} catch (@Pc(213) IOException local213) {
			if (Static97.aClass49_2 != null) {
				Static97.aClass49_2.method1307();
				Static97.aClass49_2 = null;
			}
			if (Static100.anInt5570 >= 1) {
				Static189.anInt3669 = 0;
				Static13.anInt282 = -4;
			} else {
				Static189.anInt3669 = 1;
				Static231.anInt4320 = 0;
				if (Static245.anInt4509 == Static203.anInt3367) {
					Static203.anInt3367 = Static103.anInt2200;
				} else {
					Static203.anInt3367 = Static245.anInt4509;
				}
				Static100.anInt5570++;
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)[Lclient!fo;")
	public static Class57_Sub1[] method1732() {
		@Pc(8) Class57_Sub1[] local8 = new Class57_Sub1[Static48.anInt1075];
		for (@Pc(10) int local10 = 0; local10 < Static48.anInt1075; local10++) {
			local8[local10] = new Class57_Sub1(Static94.anInt1976, Static222.anInt4184, Static192.anIntArray398[local10], Static173.anIntArray353[local10], Static69.anIntArray119[local10], Static206.anIntArray419[local10], Static25.aByteArrayArray19[local10], Static5.anIntArray17);
		}
		Static176.method3009();
		return local8;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!bb;ILclient!pl;BI)V")
	public static void method1734(@OriginalArg(0) Class1_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class136 arg2, @OriginalArg(4) int arg3) {
		@Pc(22) int local22;
		if (arg2.anIntArray459 != null) {
			@Pc(15) boolean local15 = false;
			@Pc(20) int[] local20 = new int[arg2.anIntArray459.length];
			for (local22 = 0; local22 < local20.length / 2; local22++) {
				@Pc(45) int local45 = arg0.anInt361 - arg2.anIntArray459[local22 * 2 + 1];
				@Pc(55) int local55 = arg0.anInt369 + arg2.anIntArray459[local22 * 2];
				@Pc(79) int local79 = local20[local22 * 2] = Static249.anInt5584 + (Static249.anInt5579 - Static249.anInt5584) * (local55 + -Static249.anInt5577) / (Static249.anInt5582 - Static249.anInt5577);
				@Pc(103) int local103 = local20[local22 * 2 + 1] = (local45 - Static249.anInt5578) * (Static249.anInt5583 - Static249.anInt5580) / (Static249.anInt5581 - Static249.anInt5578) + Static249.anInt5580;
				if (Static249.anInt5584 < local79 && local79 < Static249.anInt5579 && Static249.anInt5580 < local103 && Static249.anInt5583 > local103) {
					local15 = true;
				}
			}
			if (!local15) {
				return;
			}
			Static12.method184(local20, arg2.anInt4075, arg2.anInt4075 >>> 24);
			for (local22 = 0; local22 < local20.length / 2 - 1; local22++) {
				Static77.method1602(local20[local22 * 2], local20[local22 * 2 + 1], local20[(local22 + 1) * 2], local20[local22 * 2 + 2 + 1], arg2.anInt4057, arg2.anInt4057 >>> 24);
			}
			Static77.method1602(local20[local20.length - 2], local20[local20.length - 1], local20[0], local20[1], arg2.anInt4057, arg2.anInt4057 >>> 24);
		} else if (arg0.aBoolean35) {
			return;
		}
		@Pc(223) Class57_Sub1 local223 = null;
		@Pc(228) Class1_Sub33 local228 = new Class1_Sub33(arg0);
		if (arg2.anInt4062 != -1) {
			if (arg0.aBoolean34 && arg2.anInt4060 != -1) {
				local223 = (Class57_Sub1) arg2.method3519(true, true);
			} else {
				local223 = (Class57_Sub1) arg2.method3519(true, false);
			}
			if (local223 != null) {
				if (Static145.anInt2809 > 0 && (Static225.anInt4217 != -1 && arg0.anInt359 == Static225.anInt4217 || Static48.anInt1079 != -1 && arg2.anInt4073 == Static48.anInt1079)) {
					if (Static73.anInt1575 > 50) {
						local22 = (100 - Static73.anInt1575) * 3;
					} else {
						local22 = Static73.anInt1575 * 3;
					}
					Static77.method1585(arg0.anInt368, arg0.anInt360, local223.anInt3768 / 2 + 7, 16776960, local22);
					Static77.method1585(arg0.anInt368, arg0.anInt360, local223.anInt3768 / 2 + 5, 16776960, local22);
					Static77.method1585(arg0.anInt368, arg0.anInt360, local223.anInt3768 / 2 + 3, 16776960, local22);
					Static77.method1585(arg0.anInt368, arg0.anInt360, local223.anInt3768 / 2 + 1, 16776960, local22);
					Static77.method1585(arg0.anInt368, arg0.anInt360, local223.anInt3768 / 2, 16776960, local22);
				}
				local223.method3330(arg0.anInt368 - (local223.anInt3768 >> 1), arg0.anInt360 - (local223.anInt3766 >> 1));
				local228.anInt5504 = arg1 + arg0.anInt360 - (local223.anInt3766 >> 1);
				local228.anInt5500 = arg0.anInt368 + arg3 - (local223.anInt3768 >> 1);
				local228.anInt5505 = arg3 + arg0.anInt368 + (local223.anInt3768 >> 1);
				local228.anInt5501 = arg0.anInt360 + arg1 + (local223.anInt3766 >> 1);
			}
		}
		if (arg2.aString142 != null) {
			if (local223 == null) {
				Static197.method3408(arg2, 0, local228, arg1, true, arg0, arg3);
			} else {
				Static197.method3408(arg2, (local223.anInt3766 >> 1) + 5, local228, arg1, false, arg0, arg3);
			}
		}
		if (local228.method4567(anInt1899, Static14.anInt309) && arg2.aStringArray24 != null) {
			if (arg2.aStringArray24[4] != null) {
				Static69.method1328(arg2.aString141, arg2.anInt4073, (short) 1001, -1, arg2.aStringArray24[4], 0, (long) arg0.anInt359);
			}
			if (arg2.aStringArray24[3] != null) {
				Static69.method1328(arg2.aString141, arg2.anInt4073, (short) 1008, -1, arg2.aStringArray24[3], 0, (long) arg0.anInt359);
			}
			if (arg2.aStringArray24[2] != null) {
				Static69.method1328(arg2.aString141, arg2.anInt4073, (short) 1005, -1, arg2.aStringArray24[2], 0, (long) arg0.anInt359);
			}
			if (arg2.aStringArray24[1] != null) {
				Static69.method1328(arg2.aString141, arg2.anInt4073, (short) 1012, -1, arg2.aStringArray24[1], 0, (long) arg0.anInt359);
			}
			if (arg2.aStringArray24[0] != null) {
				Static69.method1328(arg2.aString141, arg2.anInt4073, (short) 1009, -1, arg2.aStringArray24[0], 0, (long) arg0.anInt359);
			}
		}
		Static215.aClass96_18.method2336(local228);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)V")
	public static void method1735(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub5_Sub21 local13 = Static278.method4266(7, arg1);
		local13.method4062();
		local13.anInt4863 = arg0;
	}
}
