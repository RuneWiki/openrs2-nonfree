import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!gl", name = "R", descriptor = "Lclient!kb;")
	public static Class83 aClass83_58;

	@OriginalMember(owner = "client!gl", name = "S", descriptor = "[S")
	public static short[] aShortArray43;

	@OriginalMember(owner = "client!gl", name = "W", descriptor = "Lclient!kb;")
	public static Class83 aClass83_59;

	@OriginalMember(owner = "client!gl", name = "X", descriptor = "I")
	public static int anInt2137;

	@OriginalMember(owner = "client!gl", name = "bb", descriptor = "Lclient!ag;")
	public static Class7_Sub1 aClass7_Sub1_1 = null;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI)Z")
	public static boolean method1593(@OriginalArg(1) int arg0) {
		if (Static15.aBooleanArray1[arg0]) {
			return true;
		} else if (Static110.aClass83_70.method2319(arg0)) {
			@Pc(29) int local29 = Static110.aClass83_70.method2317(arg0);
			if (local29 == 0) {
				Static15.aBooleanArray1[arg0] = true;
				return true;
			}
			if (Static81.aClass116ArrayArray1[arg0] == null) {
				Static81.aClass116ArrayArray1[arg0] = new Class116[local29];
			}
			for (@Pc(48) int local48 = 0; local48 < local29; local48++) {
				if (Static81.aClass116ArrayArray1[arg0][local48] == null) {
					@Pc(68) byte[] local68 = Static110.aClass83_70.method2306(arg0, local48);
					if (local68 != null) {
						@Pc(82) Class116 local82 = Static81.aClass116ArrayArray1[arg0][local48] = new Class116();
						local82.anInt4290 = (arg0 << 16) + local48;
						if (local68[0] == -1) {
							local82.method3425(new Class1_Sub16(local68));
						} else {
							local82.method3420(new Class1_Sub16(local68));
						}
					}
				}
			}
			Static15.aBooleanArray1[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(JI)V")
	public static void method1594(@OriginalArg(0) long arg0) {
		Static81.aClass1_Sub16_Sub1_1.anInt3328 = 0;
		Static81.aClass1_Sub16_Sub1_1.method2621(21);
		Static81.aClass1_Sub16_Sub1_1.method2631(arg0);
		Static25.anInt507 = 1;
		Static110.anInt2378 = 0;
		Static57.anInt1510 = 0;
		Static174.anInt3970 = -3;
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(II)Lclient!cc;")
	public static Class1_Sub2_Sub2 method1595(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub2 local10 = (Class1_Sub2_Sub2) Static217.aClass125_4.method3669((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static272.aClass83_192.method2306(5, arg0);
		local10 = new Class1_Sub2_Sub2();
		if (local22 != null) {
			local10.method538(new Class1_Sub16(local22));
		}
		Static217.aClass125_4.method3671(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "(I)V")
	public static void method1596() {
		Static61.method1191();
		Static38.method876();
		Static241.method4160();
		Static148.method2782();
		Static169.method3138();
		Static206.method3663();
		Static271.method4540();
		Static156.method2881();
		Static173.method3183();
		Static139.method4759();
		Static132.method2268();
		Static23.method399();
		Static68.method1303();
		Static204.method3639();
		Static26.method500();
		Static92.method1601();
		Static50.method1054();
		Static236.method4088();
		if (Static277.anInt5947 != 0) {
			for (@Pc(55) int local55 = 0; local55 < Static87.aByteArrayArray42.length; local55++) {
				Static87.aByteArrayArray42[local55] = null;
			}
			Static271.anInt5848 = 0;
		}
		Static273.method4575();
		Static74.method1370();
		Static37.aClass155_7.method4362();
		if (!Static296.aBoolean335) {
			((Class2_Sub1) Static151.anInterface2_1).method4428();
		}
		Static265.aClass125_10.method3666();
		Static68.aClass83_44.method2324();
		Static13.aClass83_15.method2324();
		Static114.aClass83_75.method2324();
		Static80.aClass83_49.method2324();
		Static78.aClass83_47.method2324();
		Static210.aClass83_139.method2324();
		Static285.aClass83_199.method2324();
		Static33.aClass83_20.method2324();
		Static129.aClass83_88.method2324();
		Static231.aClass83_172.method2324();
		Static167.aClass83_119.method2324();
		Static231.aClass155_41.method4362();
	}

	@OriginalMember(owner = "client!gl", name = "h", descriptor = "(I)V")
	public static void method1598() {
		Static207.anInterface1Array1 = null;
		Static69.method1306();
	}
}
