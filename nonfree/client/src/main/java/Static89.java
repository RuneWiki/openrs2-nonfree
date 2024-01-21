import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "Lclient!ob;")
	public static Class3_Sub2_Sub3_Sub3 aClass3_Sub2_Sub3_Sub3_23;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "Lclient!hh;")
	public static Class34 aClass34_1;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "Lclient!vc;")
	public static Class84 aClass84_1;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "Z")
	public static boolean aBoolean92;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "Lclient!nb;")
	public static Class57 aClass57_17 = new Class57(64);

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
	public static int anInt2175 = -1;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "Lclient!kb;")
	private static Class46 aClass46_740 = Static65.method1172("yellow:");

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "Lclient!kb;")
	public static Class46 aClass46_741 = aClass46_740;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "Lclient!kb;")
	public static Class46 aClass46_742 = aClass46_740;

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
	public static int anInt2176 = 1;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
	public static void method1476() {
		aClass46_742 = null;
		aClass34_1 = null;
		aClass3_Sub2_Sub3_Sub3_23 = null;
		aClass46_740 = null;
		aClass84_1 = null;
		aClass46_741 = null;
		aClass57_17 = null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!hf;")
	public static RuntimeException_Sub1 method1478(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString2 = local9.aString2 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([Lclient!h;II)V")
	public static void method1479(@OriginalArg(0) Class33[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class33 local9 = arg0[local3];
			if (local9 != null && local9.anInt1479 == arg1 && (!local9.aBoolean50 || !Static114.method1917(local9))) {
				if (local9.anInt1441 == 0) {
					if (!local9.aBoolean50 && Static114.method1917(local9) && Static69.aClass33_6 != local9) {
						continue;
					}
					method1479(arg0, local9.anInt1434);
					if (local9.aClass33Array2 != null) {
						method1479(local9.aClass33Array2, local9.anInt1434);
					}
					@Pc(57) Class3_Sub12 local57 = (Class3_Sub12) Static129.aClass54_10.method1602((long) local9.anInt1434);
					if (local57 != null) {
						Static168.method2688(local57.anInt1766);
					}
				}
				if (local9.anInt1441 == 6) {
					@Pc(85) int local85;
					if (local9.anInt1493 != -1 || local9.anInt1491 != -1) {
						@Pc(80) boolean local80 = Static120.method2039(local9);
						if (local80) {
							local85 = local9.anInt1491;
						} else {
							local85 = local9.anInt1493;
						}
						if (local85 != -1) {
							@Pc(97) Class3_Sub2_Sub2 local97 = Static35.method628(local85);
							local9.anInt1483 += Static22.anInt526;
							while (local97.anIntArray73[local9.anInt1423] < local9.anInt1483) {
								local9.anInt1483 -= local97.anIntArray73[local9.anInt1423];
								local9.anInt1423++;
								if (local9.anInt1423 >= local97.anIntArray74.length) {
									local9.anInt1423 -= local97.anInt945;
									if (local9.anInt1423 < 0 || local9.anInt1423 >= local97.anIntArray74.length) {
										local9.anInt1423 = 0;
									}
								}
								Static142.method2373(local9);
							}
						}
					}
					if (local9.anInt1443 != 0 && !local9.aBoolean50) {
						@Pc(178) int local178 = local9.anInt1443 >> 16;
						local85 = local9.anInt1443 << 16 >> 16;
						@Pc(189) int local189 = local178 * Static22.anInt526;
						local9.anInt1460 = local189 + local9.anInt1460 & 0x7FF;
						local85 *= Static22.anInt526;
						local9.anInt1485 = local9.anInt1485 + local85 & 0x7FF;
						Static142.method2373(local9);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)V")
	public static void method1481(@OriginalArg(0) boolean arg0) {
		if (Static52.aClass1_1 == null) {
			return;
		}
		try {
			@Pc(15) Class3_Sub4 local15 = new Class3_Sub4(4);
			local15.method206(arg0 ? 2 : 3);
			local15.method187(0);
			Static52.aClass1_1.method6(local15.aByteArray5, 4);
		} catch (@Pc(36) IOException local36) {
			try {
				Static52.aClass1_1.method10();
			} catch (@Pc(41) Exception local41) {
			}
			Static2.anInt22++;
			Static52.aClass1_1 = null;
		}
	}
}
