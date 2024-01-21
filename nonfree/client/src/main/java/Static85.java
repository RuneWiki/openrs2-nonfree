import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!jf", name = "eb", descriptor = "Lclient!kg;")
	public static Class43 aClass43_22;

	@OriginalMember(owner = "client!jf", name = "fb", descriptor = "I")
	public static int anInt2549;

	@OriginalMember(owner = "client!jf", name = "gb", descriptor = "Lclient!u;")
	public static Class76 aClass76_73;

	@OriginalMember(owner = "client!jf", name = "hb", descriptor = "I")
	public static int anInt2550;

	@OriginalMember(owner = "client!jf", name = "bb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_14 = new Class25(30);

	@OriginalMember(owner = "client!jf", name = "cb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_846 = Static49.method1293("Mitglieder)2Welt");

	@OriginalMember(owner = "client!jf", name = "db", descriptor = "[I")
	public static int[] anIntArray246 = new int[25];

	@OriginalMember(owner = "client!jf", name = "ib", descriptor = "J")
	public static long aLong76 = 0L;

	@OriginalMember(owner = "client!jf", name = "jb", descriptor = "I")
	public static int anInt2551 = -1;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
	public static void method1879() {
		aClass25_14 = null;
		aClass43_22 = null;
		aClass70_846 = null;
		anIntArray246 = null;
		aClass76_73 = null;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!de;B)V")
	public static void method1881(@OriginalArg(0) Class1_Sub1_Sub4_Sub2 arg0) {
		arg0.anInt2020 = arg0.anInt2034;
		if (arg0.anInt2021 == 0) {
			arg0.anInt2015 = 0;
			return;
		}
		if (arg0.anInt2041 != -1 && arg0.anInt2029 == 0) {
			@Pc(31) Class1_Sub1_Sub17 local31 = Static90.method1962(arg0.anInt2041);
			if (arg0.anInt2037 > 0 && local31.anInt3876 == 0) {
				arg0.anInt2015++;
				return;
			}
			if (arg0.anInt2037 <= 0 && local31.anInt3860 == 0) {
				arg0.anInt2015++;
				return;
			}
		}
		@Pc(74) int local74 = arg0.anInt2030;
		@Pc(77) int local77 = arg0.anInt2001;
		@Pc(93) int local93 = arg0.anIntArray197[arg0.anInt2021 - 1] * 128 + arg0.anInt2004 * 64;
		@Pc(108) int local108 = arg0.anInt2004 * 64 + arg0.anIntArray199[arg0.anInt2021 - 1] * 128;
		if (local93 - local74 > 256 || local93 - local74 < -256 || local108 - local77 > 256 || local108 - local77 < -256) {
			arg0.anInt2030 = local93;
			arg0.anInt2001 = local108;
			return;
		}
		if (local74 >= local93) {
			if (local93 >= local74) {
				if (local77 < local108) {
					arg0.anInt2047 = 1024;
				} else if (local108 < local77) {
					arg0.anInt2047 = 0;
				}
			} else if (local77 < local108) {
				arg0.anInt2047 = 768;
			} else if (local108 < local77) {
				arg0.anInt2047 = 256;
			} else {
				arg0.anInt2047 = 512;
			}
		} else if (local77 < local108) {
			arg0.anInt2047 = 1280;
		} else if (local108 < local77) {
			arg0.anInt2047 = 1792;
		} else {
			arg0.anInt2047 = 1536;
		}
		@Pc(231) int local231 = arg0.anInt2038;
		@Pc(233) boolean local233 = true;
		@Pc(235) int local235 = 4;
		@Pc(244) int local244 = arg0.anInt2047 - arg0.anInt2040 & 0x7FF;
		if (local244 > 1024) {
			local244 -= 2048;
		}
		if (local244 >= -256 && local244 <= 256) {
			local231 = arg0.anInt2043;
		} else if (local244 >= 256 && local244 < 768) {
			local231 = arg0.anInt2022;
		} else if (local244 >= -768 && local244 <= -256) {
			local231 = arg0.anInt2032;
		}
		if (local231 == -1) {
			local231 = arg0.anInt2043;
		}
		arg0.anInt2020 = local231;
		if (arg0 instanceof Class1_Sub1_Sub4_Sub2_Sub2) {
			local233 = ((Class1_Sub1_Sub4_Sub2_Sub2) arg0).aClass1_Sub1_Sub13_1.aBoolean130;
		}
		if (local233) {
			if (arg0.anInt2040 != arg0.anInt2047 && arg0.anInt2050 == -1 && arg0.anInt2031 != 0) {
				local235 = 2;
			}
			if (arg0.anInt2021 > 2) {
				local235 = 6;
			}
			if (arg0.anInt2021 > 3) {
				local235 = 8;
			}
			if (arg0.anInt2015 > 0 && arg0.anInt2021 > 1) {
				arg0.anInt2015--;
				local235 = 8;
			}
		} else {
			if (arg0.anInt2021 > 1) {
				local235 = 6;
			}
			if (arg0.anInt2021 > 2) {
				local235 = 8;
			}
			if (arg0.anInt2015 > 0 && arg0.anInt2021 > 1) {
				local235 = 8;
				arg0.anInt2015--;
			}
		}
		if (arg0.aBooleanArray12[arg0.anInt2021 - 1]) {
			local235 <<= 0x1;
		}
		if (local74 < local93) {
			arg0.anInt2030 += local235;
			if (arg0.anInt2030 > local93) {
				arg0.anInt2030 = local93;
			}
		} else if (local74 > local93) {
			arg0.anInt2030 -= local235;
			if (local93 > arg0.anInt2030) {
				arg0.anInt2030 = local93;
			}
		}
		if (local235 >= 8 && arg0.anInt2020 == arg0.anInt2043 && arg0.anInt2042 != -1) {
			arg0.anInt2020 = arg0.anInt2042;
		}
		if (local77 < local108) {
			arg0.anInt2001 += local235;
			if (local108 < arg0.anInt2001) {
				arg0.anInt2001 = local108;
			}
		} else if (local77 > local108) {
			arg0.anInt2001 -= local235;
			if (arg0.anInt2001 < local108) {
				arg0.anInt2001 = local108;
			}
		}
		if (arg0.anInt2030 == local93 && local108 == arg0.anInt2001) {
			if (arg0.anInt2037 > 0) {
				arg0.anInt2037--;
			}
			arg0.anInt2021--;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIBIZLclient!ue;I)V")
	public static void method1885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class76_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) long local10 = (long) ((arg0 << 16) + arg1);
		@Pc(16) Class1_Sub1_Sub5 local16 = (Class1_Sub1_Sub5) Static94.aClass30_9.method1467(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class1_Sub1_Sub5) Static173.aClass30_15.method1467(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class1_Sub1_Sub5) Static139.aClass30_13.method1467(local10);
		if (local16 == null) {
			if (!arg3) {
				local16 = (Class1_Sub1_Sub5) Static121.aClass30_11.method1467(local10);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class1_Sub1_Sub5();
			local16.aByte2 = arg2;
			local16.aClass76_Sub1_2 = arg4;
			local16.anInt1330 = arg5;
			if (arg3) {
				Static94.aClass30_9.method1464(local16, local10);
				Static98.anInt2846++;
			} else {
				Static130.aClass27_2.method1340(local16);
				Static139.aClass30_13.method1464(local16, local10);
				Static147.anInt3874++;
			}
		} else if (arg3) {
			local16.method3503();
			Static94.aClass30_9.method1464(local16, local10);
			Static98.anInt2846++;
			Static147.anInt3874--;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method1886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}
}
