import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
	public static int anInt1875;

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "Lclient!eh;")
	public static Interface1 anInterface1_1;

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
	public static int anInt1879;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
	public static int anInt1876 = 0;

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "Lclient!si;")
	public static Class157 aClass157_9 = null;

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
	public static int anInt1877 = 0;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
	public static void method1720() {
		Static115.aClass175_18.method4287();
		Static97.aClass175_15.method4287();
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIILclient!gd;B)V")
	public static void method1721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class60 arg5) {
		@Pc(7) long local7 = 0L;
		if (arg4 == 0) {
			local7 = Static234.method3768(arg2, arg3, arg1);
		} else if (arg4 == 1) {
			local7 = Static295.method4410(arg2, arg3, arg1);
		} else if (arg4 == 2) {
			local7 = Static209.method3471(arg2, arg3, arg1);
		} else if (arg4 == 3) {
			local7 = Static277.method4241(arg2, arg3, arg1);
		}
		@Pc(60) int local60 = (int) (local7 >>> 32) & Integer.MAX_VALUE;
		@Pc(67) int local67 = (int) local7 >> 14 & 0x1F;
		@Pc(78) int local78 = (int) local7 >> 20 & 0x3;
		@Pc(82) Class150 local82 = Static160.method2744(local60);
		if (local82.method3878()) {
			Static142.method2502(arg2, arg1, local82, arg3);
		}
		if (local7 == 0L) {
			return;
		}
		@Pc(102) Class11 local102 = null;
		@Pc(104) Class11 local104 = null;
		if (arg4 == 0) {
			@Pc(231) Class39 local231 = Static98.method1902(arg2, arg3, arg1);
			if (local231 != null) {
				local102 = local231.aClass11_3;
				local104 = local231.aClass11_4;
			}
			if (local82.anInt4560 != 0) {
				arg5.method1693(local82.aBoolean417, arg1, local67, !local82.aBoolean412, local78, arg3);
			}
		} else if (arg4 == 1) {
			@Pc(215) Class18 local215 = Static230.method3683(arg2, arg3, arg1);
			if (local215 != null) {
				local104 = local215.aClass11_1;
				local102 = local215.aClass11_2;
			}
		} else if (arg4 == 2) {
			@Pc(148) Class45 local148 = Static10.method4570(arg2, arg3, arg1);
			if (local148 != null) {
				local104 = local148.aClass11_5;
			}
			if (local82.anInt4560 != 0 && arg3 + local82.anInt4532 < 104 && local82.anInt4532 + arg1 < 104 && local82.anInt4562 + arg3 < 104 && local82.anInt4562 + arg1 < 104) {
				arg5.method1697(!local82.aBoolean412, arg3, arg1, local82.anInt4562, local78, local82.anInt4532, local82.aBoolean417);
			}
		} else if (arg4 == 3) {
			@Pc(126) Class124 local126 = Static193.method3325(arg2, arg3, arg1);
			if (local126 != null) {
				local104 = local126.aClass11_10;
			}
			if (local82.anInt4560 == 1) {
				arg5.method1699(arg1, arg3);
			}
		}
		if (local82.anIntArray507 != null) {
			local82 = local82.method3884();
		}
		if (!Static71.aBoolean165 || local82 == null || !local82.aBoolean421) {
			return;
		}
		if (local67 == 2) {
			if (local104 instanceof Class11_Sub6) {
				((Class11_Sub6) local104).method3560();
			} else {
				Static254.method3972(arg1, 0, local67, arg0, arg3, 0, local78 + 4, local82);
			}
			if (local102 instanceof Class11_Sub6) {
				((Class11_Sub6) local102).method3560();
			} else {
				Static254.method3972(arg1, 0, local67, arg0, arg3, 0, local78 + 1 & 0x3, local82);
			}
		} else if (local67 == 5) {
			if (local104 instanceof Class11_Sub6) {
				((Class11_Sub6) local104).method3560();
			} else {
				Static254.method3972(arg1, Static236.anIntArray494[local78] * 8, 4, arg0, arg3, Static140.anIntArray239[local78] * 8, local78, local82);
			}
		} else if (local67 == 6) {
			if (local104 instanceof Class11_Sub6) {
				((Class11_Sub6) local104).method3560();
			} else {
				Static254.method3972(arg1, Static73.anIntArray128[local78] * 8, 4, arg0, arg3, Static57.anIntArray95[local78] * 8, local78 + 4, local82);
			}
		} else if (local67 == 7) {
			if (local104 instanceof Class11_Sub6) {
				((Class11_Sub6) local104).method3560();
			} else {
				Static254.method3972(arg1, 0, 4, arg0, arg3, 0, (local78 + 2 & 0x3) + 4, local82);
			}
		} else if (local67 == 8) {
			if (local104 instanceof Class11_Sub6) {
				((Class11_Sub6) local104).method3560();
			} else {
				Static254.method3972(arg1, Static73.anIntArray128[local78] * 8, 4, arg0, arg3, Static57.anIntArray95[local78] * 8, local78 + 4, local82);
			}
			if (local102 instanceof Class11_Sub6) {
				((Class11_Sub6) local102).method3560();
			} else {
				Static254.method3972(arg1, Static73.anIntArray128[local78] * 8, 4, arg0, arg3, Static57.anIntArray95[local78] * 8, (local78 + 2 & 0x3) + 4, local82);
			}
		} else if (local67 == 11) {
			if (local104 instanceof Class11_Sub6) {
				((Class11_Sub6) local104).method3560();
			} else {
				Static254.method3972(arg1, 0, 10, arg0, arg3, 0, local78 + 4, local82);
			}
		} else if (local104 instanceof Class11_Sub6) {
			((Class11_Sub6) local104).method3560();
		} else {
			Static254.method3972(arg1, 0, local67, arg0, arg3, 0, local78, local82);
		}
	}
}
