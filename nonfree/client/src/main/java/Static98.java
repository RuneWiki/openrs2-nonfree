import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!hh", name = "Y", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray29;

	@OriginalMember(owner = "client!hh", name = "J", descriptor = "I")
	public static int anInt2312 = 0;

	@OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
	public static int anInt2315 = 0;

	@OriginalMember(owner = "client!hh", name = "V", descriptor = "[Lclient!fj;")
	public static Class14_Sub2_Sub1[] aClass14_Sub2_Sub1Array1 = new Class14_Sub2_Sub1[2048];

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIILclient!la;III)V")
	public static void method1829(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class92 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(16) long local16 = 0L;
		if (arg0 == 0) {
			local16 = Static108.method1986(arg3, arg1, arg5);
		} else if (arg0 == 1) {
			local16 = Static298.method4460(arg3, arg1, arg5);
		} else if (arg0 == 2) {
			local16 = Static47.method929(arg3, arg1, arg5);
		} else if (arg0 == 3) {
			local16 = Static151.method4444(arg3, arg1, arg5);
		}
		@Pc(69) int local69 = (int) local16 >> 20 & 0x3;
		@Pc(76) int local76 = (int) (local16 >>> 32) & Integer.MAX_VALUE;
		@Pc(83) int local83 = (int) local16 >> 14 & 0x1F;
		@Pc(87) Class181 local87 = Static183.method3511(local76);
		if (local87.method4425()) {
			method1834(arg1, local87, arg5, arg3);
		}
		if (local16 == 0L) {
			return;
		}
		@Pc(104) Class14 local104 = null;
		@Pc(106) Class14 local106 = null;
		if (arg0 == 0) {
			@Pc(114) Class72 local114 = Static174.method2982(arg3, arg1, arg5);
			if (local114 != null) {
				local106 = local114.aClass14_9;
				local104 = local114.aClass14_10;
			}
			if (local87.anInt5568 != 0) {
				arg2.method2580(local83, local69, arg1, arg5, !local87.aBoolean446, local87.aBoolean439);
			}
		} else if (arg0 == 1) {
			@Pc(156) Class67 local156 = Static75.method1312(arg3, arg1, arg5);
			if (local156 != null) {
				local106 = local156.aClass14_8;
				local104 = local156.aClass14_7;
			}
		} else if (arg0 == 2) {
			@Pc(173) Class25 local173 = Static5.method197(arg3, arg1, arg5);
			if (local173 != null) {
				local104 = local173.aClass14_1;
			}
			if (local87.anInt5568 != 0 && arg1 + local87.anInt5559 < 104 && arg5 + local87.anInt5559 < 104 && arg1 + local87.anInt5534 < 104 && local87.anInt5534 + arg5 < 104) {
				arg2.method2573(arg1, local87.anInt5534, local69, arg5, local87.aBoolean439, local87.anInt5559, !local87.aBoolean446);
			}
		} else if (arg0 == 3) {
			@Pc(246) Class44 local246 = Static187.method3137(arg3, arg1, arg5);
			if (local246 != null) {
				local104 = local246.aClass14_6;
			}
			if (local87.anInt5568 == 1) {
				arg2.method2578(arg5, arg1);
			}
		}
		if (local87.anIntArray552 != null) {
			local87 = local87.method4427();
		}
		if (!Static277.aBoolean412 || local87 == null || !local87.aBoolean440) {
			return;
		}
		if (local83 == 2) {
			if (local104 instanceof Class14_Sub1) {
				((Class14_Sub1) local104).method410();
			} else {
				Static233.method3604(local69 + 4, arg4, local87, arg5, 0, 0, local83, arg1);
			}
			if (local106 instanceof Class14_Sub1) {
				((Class14_Sub1) local106).method410();
			} else {
				Static233.method3604(local69 + 1 & 0x3, arg4, local87, arg5, 0, 0, local83, arg1);
			}
		} else if (local83 == 5) {
			if (local104 instanceof Class14_Sub1) {
				((Class14_Sub1) local104).method410();
			} else {
				Static233.method3604(local69, arg4, local87, arg5, Static23.anIntArray56[local69] * 8, Static247.anIntArray428[local69] * 8, 4, arg1);
			}
		} else if (local83 == 6) {
			if (local104 instanceof Class14_Sub1) {
				((Class14_Sub1) local104).method410();
			} else {
				Static233.method3604(local69 + 4, arg4, local87, arg5, Static15.anIntArray36[local69] * 8, Static256.anIntArray441[local69] * 8, 4, arg1);
			}
		} else if (local83 == 7) {
			if (local104 instanceof Class14_Sub1) {
				((Class14_Sub1) local104).method410();
			} else {
				Static233.method3604((local69 + 2 & 0x3) + 4, arg4, local87, arg5, 0, 0, 4, arg1);
			}
		} else if (local83 == 8) {
			if (local104 instanceof Class14_Sub1) {
				((Class14_Sub1) local104).method410();
			} else {
				Static233.method3604(local69 + 4, arg4, local87, arg5, Static15.anIntArray36[local69] * 8, Static256.anIntArray441[local69] * 8, 4, arg1);
			}
			if (local106 instanceof Class14_Sub1) {
				((Class14_Sub1) local106).method410();
			} else {
				Static233.method3604((local69 + 2 & 0x3) + 4, arg4, local87, arg5, Static15.anIntArray36[local69] * 8, Static256.anIntArray441[local69] * 8, 4, arg1);
			}
		} else if (local83 == 11) {
			if (local104 instanceof Class14_Sub1) {
				((Class14_Sub1) local104).method410();
			} else {
				Static233.method3604(local69 + 4, arg4, local87, arg5, 0, 0, 10, arg1);
			}
		} else if (local104 instanceof Class14_Sub1) {
			((Class14_Sub1) local104).method410();
		} else {
			Static233.method3604(local69, arg4, local87, arg5, 0, 0, local83, arg1);
		}
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(III)V")
	public static void method1832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static128.anIntArray259[arg1] = arg0;
		@Pc(10) Class1_Sub18 local10 = (Class1_Sub18) Static118.aClass70_8.method2075((long) arg1);
		if (local10 == null) {
			local10 = new Class1_Sub18(Static294.method4413() + 500L);
			Static118.aClass70_8.method2084((long) arg1, local10);
		} else {
			local10.aLong103 = Static294.method4413() + 500L;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIB)V")
	public static void method1833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class1_Sub2_Sub18 local13 = Static130.method2227(arg0, 7);
		local13.method3905();
		local13.anInt5005 = arg1;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!wj;III)V")
	private static void method1834(@OriginalArg(0) int arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(15) Class1_Sub8 local15 = (Class1_Sub8) Static185.aClass61_20.method1835(); local15 != null; local15 = (Class1_Sub8) Static185.aClass61_20.method1836()) {
			if (local15.anInt361 == arg3 && arg0 * 128 == local15.anInt359 && local15.anInt358 == arg2 * 128 && arg1.anInt5578 == local15.aClass181_1.anInt5578) {
				if (local15.aClass1_Sub5_Sub1_1 != null) {
					Static141.aClass1_Sub5_Sub4_1.method4380(local15.aClass1_Sub5_Sub1_1);
					local15.aClass1_Sub5_Sub1_1 = null;
				}
				if (local15.aClass1_Sub5_Sub1_2 != null) {
					Static141.aClass1_Sub5_Sub4_1.method4380(local15.aClass1_Sub5_Sub1_2);
					local15.aClass1_Sub5_Sub1_2 = null;
				}
				local15.method4441();
				return;
			}
		}
	}
}
