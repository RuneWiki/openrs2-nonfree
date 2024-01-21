import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!q", name = "jb", descriptor = "Lclient!lc;")
	public static Class40 aClass40_65;

	@OriginalMember(owner = "client!q", name = "Vb", descriptor = "Lclient!lc;")
	public static Class40 aClass40_66;

	@OriginalMember(owner = "client!q", name = "Dc", descriptor = "Lclient!qc;")
	private static Class60 aClass60_898 = Static121.method2047("Your ignore list is full)3 Max of 100 hit");

	@OriginalMember(owner = "client!q", name = "A", descriptor = "Lclient!qc;")
	public static Class60 aClass60_890 = aClass60_898;

	@OriginalMember(owner = "client!q", name = "C", descriptor = "Lclient!qc;")
	public static Class60 aClass60_891 = null;

	@OriginalMember(owner = "client!q", name = "Q", descriptor = "I")
	public static int anInt2194 = 0;

	@OriginalMember(owner = "client!q", name = "ub", descriptor = "Lclient!qc;")
	private static Class60 aClass60_894 = Static121.method2047("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!q", name = "Ec", descriptor = "Lclient!mf;")
	public static Class48 aClass48_51 = new Class48(50);

	@OriginalMember(owner = "client!q", name = "Zc", descriptor = "Lclient!qc;")
	public static Class60 aClass60_900 = aClass60_894;

	@OriginalMember(owner = "client!q", name = "cd", descriptor = "Lclient!qc;")
	public static Class60 aClass60_901 = Static121.method2047("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!q", name = "ed", descriptor = "I")
	public static int anInt2256 = 0;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILclient!lc;)V")
	public static void method1609(@OriginalArg(1) Class40 arg0) {
		Static24.aClass40_21 = arg0;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II)Lclient!hf;")
	public static Class4_Sub4_Sub7 method1610(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub4_Sub7 local10 = (Class4_Sub4_Sub7) Static45.aClass48_25.method1390((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static18.aClass40_13.method1110(arg0, 13);
		local10 = new Class4_Sub4_Sub7();
		local10.anInt1228 = arg0;
		if (local20 != null) {
			local10.method850(new Class4_Sub13(local20));
		}
		Static45.aClass48_25.method1392(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method1615(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
	public static void method1616() {
		aClass60_891 = null;
		aClass40_65 = null;
		aClass60_898 = null;
		aClass40_66 = null;
		aClass60_901 = null;
		aClass60_890 = null;
		aClass60_894 = null;
		aClass60_900 = null;
		aClass48_51 = null;
	}

	@OriginalMember(owner = "client!q", name = "d", descriptor = "(B)V")
	public static void method1619() {
		for (@Pc(14) int local14 = 0; local14 < Static85.anInt2030; local14++) {
			@Pc(20) int local20 = Static35.anIntArray68[local14];
			@Pc(24) Class4_Sub4_Sub1_Sub2_Sub1 local24 = Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[local20];
			@Pc(28) int local28 = Static105.aClass4_Sub13_Sub1_3.method1223();
			@Pc(36) int local36;
			@Pc(40) int local40;
			if ((local28 & 0x8) != 0) {
				local36 = Static105.aClass4_Sub13_Sub1_3.method1223();
				local40 = Static105.aClass4_Sub13_Sub1_3.method1255();
				local24.method1881(Static81.anInt1944, local36, local40);
				local24.anInt2623 = Static81.anInt1944 + 300;
				local24.anInt2598 = Static105.aClass4_Sub13_Sub1_3.method1223();
				local24.anInt2619 = Static105.aClass4_Sub13_Sub1_3.method1255();
			}
			if ((local28 & 0x20) != 0) {
				local36 = Static105.aClass4_Sub13_Sub1_3.method1244();
				if (local36 == 65535) {
					local36 = -1;
				}
				local40 = Static105.aClass4_Sub13_Sub1_3.method1255();
				if (local24.anInt2633 == local36 && local36 != -1) {
					@Pc(97) int local97 = Static127.method2102(local36).anInt2715;
					if (local97 == 1) {
						local24.anInt2645 = local40;
						local24.anInt2595 = 0;
						local24.anInt2626 = 0;
						local24.anInt2639 = 0;
					}
					if (local97 == 2) {
						local24.anInt2626 = 0;
					}
				} else if (local36 == -1 || local24.anInt2633 == -1 || Static127.method2102(local36).anInt2724 >= Static127.method2102(local24.anInt2633).anInt2724) {
					local24.anInt2645 = local40;
					local24.anInt2595 = 0;
					local24.anInt2599 = local24.anInt2600;
					local24.anInt2626 = 0;
					local24.anInt2633 = local36;
					local24.anInt2639 = 0;
				}
			}
			if ((local28 & 0x10) != 0) {
				local36 = Static105.aClass4_Sub13_Sub1_3.method1229();
				local40 = Static105.aClass4_Sub13_Sub1_3.method1229();
				local24.method1881(Static81.anInt1944, local36, local40);
				local24.anInt2623 = Static81.anInt1944 + 300;
				local24.anInt2598 = Static105.aClass4_Sub13_Sub1_3.method1223();
				local24.anInt2619 = Static105.aClass4_Sub13_Sub1_3.method1229();
			}
			if ((local28 & 0x1) != 0) {
				local24.anInt2641 = Static105.aClass4_Sub13_Sub1_3.method1210();
				local24.anInt2607 = Static105.aClass4_Sub13_Sub1_3.method1244();
			}
			if ((local28 & 0x40) != 0) {
				local24.aClass4_Sub4_Sub11_1 = Static122.method2060(Static105.aClass4_Sub13_Sub1_3.method1210());
				local24.anInt2594 = local24.aClass4_Sub4_Sub11_1.anInt2009;
				local24.anInt2637 = local24.aClass4_Sub4_Sub11_1.anInt2014;
				local24.anInt2613 = local24.aClass4_Sub4_Sub11_1.anInt2006;
				local24.anInt2603 = local24.aClass4_Sub4_Sub11_1.anInt2011;
				local24.anInt2590 = local24.aClass4_Sub4_Sub11_1.anInt2007;
				local24.anInt2628 = local24.aClass4_Sub4_Sub11_1.anInt2024;
				local24.anInt2612 = local24.aClass4_Sub4_Sub11_1.anInt2008;
				local24.anInt2647 = local24.aClass4_Sub4_Sub11_1.anInt2012;
				local24.anInt2606 = local24.aClass4_Sub4_Sub11_1.anInt1998;
			}
			if ((local28 & 0x2) != 0) {
				local24.anInt2625 = Static105.aClass4_Sub13_Sub1_3.method1210();
				if (local24.anInt2625 == 65535) {
					local24.anInt2625 = -1;
				}
			}
			if ((local28 & 0x80) != 0) {
				local24.anInt2630 = Static105.aClass4_Sub13_Sub1_3.method1236();
				local36 = Static105.aClass4_Sub13_Sub1_3.method1230();
				if (local24.anInt2630 == 65535) {
					local24.anInt2630 = -1;
				}
				local24.anInt2608 = 0;
				local24.anInt2642 = local36 >> 16;
				local24.anInt2617 = 0;
				local24.anInt2610 = Static81.anInt1944 + (local36 & 0xFFFF);
				if (Static81.anInt1944 < local24.anInt2610) {
					local24.anInt2617 = -1;
				}
			}
			if ((local28 & 0x4) != 0) {
				local24.aClass60_1059 = Static105.aClass4_Sub13_Sub1_3.method1249();
				local24.anInt2596 = 100;
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "e", descriptor = "(B)V")
	public static void method1621() {
		Static70.aClass48_41.method1393();
		Static73.aClass48_43.method1393();
		Static56.aClass48_36.method1393();
		Static5.aClass48_3.method1393();
	}
}
