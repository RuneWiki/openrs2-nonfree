import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
	public static int anInt2754;

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "[I")
	public static int[] anIntArray257;

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "[Lclient!rh;")
	public static Class1_Sub1_Sub1_Sub4[] aClass1_Sub1_Sub1_Sub4Array5;

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "Lclient!uf;")
	public static Class16 aClass16_1;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!dg;IIII)V")
	public static void method2044(@OriginalArg(0) Class1_Sub1_Sub4_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 == Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1 || Static162.anInt4331 >= 400) {
			return;
		}
		@Pc(57) Class70 local57;
		if (arg0.anInt1298 == 0) {
			local57 = Static160.method3210(new Class70[] { arg0.aClass70_408, Static172.method3412(arg0.anInt1293, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt1293), Static139.aClass70_1241, Static21.aClass70_207, Static34.method873(arg0.anInt1293), Static20.aClass70_191 });
		} else {
			local57 = Static160.method3210(new Class70[] { arg0.aClass70_408, Static139.aClass70_1241, Static25.aClass70_238, Static34.method873(arg0.anInt1298), Static20.aClass70_191 });
		}
		@Pc(136) int local136;
		if (Static58.anInt1876 == 1) {
			Static58.method1422((short) 43, (long) arg1, arg2, arg3, Static170.aClass70_1480, Static160.method3210(new Class70[] { Static111.aClass70_1012, Static21.aClass70_206, local57 }));
		} else if (!Static167.aBoolean170) {
			for (local136 = 7; local136 >= 0; local136--) {
				if (Static8.aClass70Array4[local136] != null) {
					@Pc(144) short local144 = 0;
					if (Static8.aClass70Array4[local136].method2905(Static104.aClass70_952)) {
						if (arg0.anInt1293 > Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt1293) {
							local144 = 2000;
						}
						if (Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt1304 != 0 && arg0.anInt1304 != 0) {
							if (Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt1304 == arg0.anInt1304) {
								local144 = 2000;
							} else {
								local144 = 0;
							}
						}
					} else if (Static140.aBooleanArray16[local136]) {
						local144 = 2000;
					}
					@Pc(200) short local200 = Static10.aShortArray5[local136];
					@Pc(205) short local205 = (short) (local200 + local144);
					Static58.method1422(local205, (long) arg1, arg2, arg3, Static8.aClass70Array4[local136], Static160.method3210(new Class70[] { Static151.aClass70_1361, local57 }));
				}
			}
		} else if ((Static104.anInt2954 & 0x8) == 8) {
			Static58.method1422((short) 45, (long) arg1, arg2, arg3, Static161.aClass70_1436, Static160.method3210(new Class70[] { Static5.aClass70_59, Static21.aClass70_206, local57 }));
		}
		for (local136 = 0; local136 < Static162.anInt4331; local136++) {
			if (Static20.aShortArray7[local136] == 5) {
				Static174.aClass70Array23[local136] = Static160.method3210(new Class70[] { Static151.aClass70_1361, local57 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)Z")
	public static boolean method2046(@OriginalArg(1) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!u;BI)Z")
	public static boolean method2048(@OriginalArg(0) int arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) byte[] local9 = arg1.method3316(arg2, arg0);
		if (local9 == null) {
			return false;
		} else {
			Static92.method1989(local9);
			return true;
		}
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)V")
	public static void method2049() {
		aClass1_Sub1_Sub1_Sub4Array5 = null;
		aClass16_1 = null;
		anIntArray257 = null;
		aByteArrayArrayArray6 = null;
	}
}
