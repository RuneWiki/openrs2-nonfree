import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "Lclient!ma;")
	public static Class6 aClass6_1;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "Lclient!pd;")
	public static Class20 aClass20_45;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1115 = Static28.method504("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1116 = Static28.method504("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "[Lclient!ic;")
	public static Class4_Sub2_Sub3_Sub1[] aClass4_Sub2_Sub3_Sub1Array8 = new Class4_Sub2_Sub3_Sub1[1000];

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1117 = Static28.method504("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1118 = Static28.method504("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!pb", name = "y", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1119 = Static28.method504("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!pb", name = "z", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1120 = Static28.method504(")4lang)4de");

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public static void method1630() {
		for (@Pc(6) Class4_Sub2_Sub1_Sub5 local6 = (Class4_Sub2_Sub1_Sub5) Static85.aClass61_11.method1628(); local6 != null; local6 = (Class4_Sub2_Sub1_Sub5) Static85.aClass61_11.method1629()) {
			if (Static131.anInt3202 != local6.anInt3002 || local6.aBoolean148) {
				local6.method2189();
			} else if (Static71.anInt1738 >= local6.anInt2992) {
				local6.method2077(Static39.anInt952);
				if (local6.aBoolean148) {
					local6.method2189();
				} else {
					Static101.aClass43_1.method1105(local6.anInt3002, local6.anInt2989, local6.anInt3005, local6.anInt3000, 60, local6, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)Lclient!ua;")
	public static Class4_Sub2_Sub16 method1636(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub2_Sub16 local10 = (Class4_Sub2_Sub16) Static49.aClass12_33.method235((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static14.aClass20_9.method474(9, arg0);
		local10 = new Class4_Sub2_Sub16();
		local10.anInt2936 = arg0;
		if (local20 != null) {
			local10.method2037(new Class4_Sub16(local20));
		}
		local10.method2044();
		Static49.aClass12_33.method234(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
	public static void method1638() {
		aClass20_45 = null;
		aClass4_Sub2_Sub3_Sub1Array8 = null;
		aClass39_1119 = null;
		aClass39_1120 = null;
		aClass39_1117 = null;
		aClass6_1 = null;
		aClass39_1118 = null;
		aClass39_1115 = null;
		aClass39_1116 = null;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)Lclient!ia;")
	public static Class4_Sub2_Sub9 method1639(@OriginalArg(1) int arg0) {
		@Pc(15) Class4_Sub2_Sub9 local15 = (Class4_Sub2_Sub9) Static5.aClass12_72.method235((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static29.aClass20_18.method474(16, arg0);
		local15 = new Class4_Sub2_Sub9();
		if (local25 != null) {
			local15.method816(new Class4_Sub16(local25));
		}
		Static5.aClass12_72.method234(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B[B)V")
	public static void method1640(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class4_Sub16 local8 = new Class4_Sub16(arg0);
		local8.anInt2019 = arg0.length - 2;
		Static50.anInt1308 = local8.method1490();
		Static21.anIntArray61 = new int[Static50.anInt1308];
		Static121.anIntArray320 = new int[Static50.anInt1308];
		Static70.aByteArrayArray6 = new byte[Static50.anInt1308][];
		Static51.anIntArray277 = new int[Static50.anInt1308];
		Static16.anIntArray49 = new int[Static50.anInt1308];
		local8.anInt2019 = arg0.length - Static50.anInt1308 * 8 - 7;
		Static15.anInt375 = local8.method1490();
		Static9.anInt291 = local8.method1490();
		@Pc(60) int local60 = (local8.method1474() & 0xFF) + 1;
		for (@Pc(62) int local62 = 0; local62 < Static50.anInt1308; local62++) {
			Static51.anIntArray277[local62] = local8.method1490();
		}
		for (@Pc(79) int local79 = 0; local79 < Static50.anInt1308; local79++) {
			Static121.anIntArray320[local79] = local8.method1490();
		}
		for (@Pc(96) int local96 = 0; local96 < Static50.anInt1308; local96++) {
			Static21.anIntArray61[local96] = local8.method1490();
		}
		for (@Pc(114) int local114 = 0; local114 < Static50.anInt1308; local114++) {
			Static16.anIntArray49[local114] = local8.method1490();
		}
		local8.anInt2019 = arg0.length + 3 - Static50.anInt1308 * 8 - local60 * 3 - 7;
		Static114.anIntArray308 = new int[local60];
		for (@Pc(152) int local152 = 1; local152 < local60; local152++) {
			Static114.anIntArray308[local152] = local8.method1475();
			if (Static114.anIntArray308[local152] == 0) {
				Static114.anIntArray308[local152] = 1;
			}
		}
		local8.anInt2019 = 0;
		for (@Pc(176) int local176 = 0; local176 < Static50.anInt1308; local176++) {
			@Pc(181) int local181 = Static16.anIntArray49[local176];
			@Pc(185) int local185 = Static21.anIntArray61[local176];
			@Pc(189) int local189 = local185 * local181;
			@Pc(192) byte[] local192 = new byte[local189];
			Static70.aByteArrayArray6[local176] = local192;
			@Pc(200) int local200 = local8.method1474();
			@Pc(210) int local210;
			if (local200 == 0) {
				for (local210 = 0; local210 < local189; local210++) {
					local192[local210] = local8.method1477();
				}
			} else if (local200 == 1) {
				for (local210 = 0; local210 < local185; local210++) {
					for (@Pc(213) int local213 = 0; local213 < local181; local213++) {
						local192[local210 + local185 * local213] = local8.method1477();
					}
				}
			}
		}
	}
}
