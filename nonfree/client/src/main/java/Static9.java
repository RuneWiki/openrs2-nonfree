import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "Lclient!oa;")
	public static Class9 aClass9_2;

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "Lclient!fe;")
	public static Class17 aClass17_13 = new Class17(64);

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "Lclient!lc;")
	public static Class31 aClass31_119 = Static56.method1206("mapscene");

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
	public static int anInt319 = 0;

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
	public static final int anInt321 = 7759444;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	public static void method204() {
		aClass17_13 = null;
		aClass31_119 = null;
		aClass9_2 = null;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)V")
	public static void method205(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = Static39.method1006(arg0).anInt1943;
		if (local10 == 0) {
			return;
		}
		@Pc(21) int local21 = Static8.anIntArray46[arg0];
		if (local10 == 1) {
			if (local21 == 1) {
				Static97.method1651(0.9D);
				((Class45) Static97.anInterface1_1).method1425(0.9D);
			}
			if (local21 == 2) {
				Static97.method1651(0.8D);
				((Class45) Static97.anInterface1_1).method1425(0.8D);
			}
			if (local21 == 3) {
				Static97.method1651(0.7D);
				((Class45) Static97.anInterface1_1).method1425(0.7D);
			}
			if (local21 == 4) {
				Static97.method1651(0.6D);
				((Class45) Static97.anInterface1_1).method1425(0.6D);
			}
			Static48.method1115();
			Static49.aBoolean143 = true;
		}
		if (local10 == 3) {
			@Pc(83) short local83 = 0;
			if (local21 == 0) {
				local83 = 255;
			}
			if (local21 == 1) {
				local83 = 192;
			}
			if (local21 == 2) {
				local83 = 128;
			}
			if (local21 == 3) {
				local83 = 64;
			}
			if (local21 == 4) {
				local83 = 0;
			}
			if (local83 != Static88.anInt2370) {
				if (Static88.anInt2370 == 0 && Static74.anInt2232 != -1) {
					Static79.method1438(0, Static74.anInt2232, Static21.aClass11_Sub1_7, local83);
					Static20.anInt1975 = 0;
				} else if (local83 == 0) {
					Static79.method1434();
					Static20.anInt1975 = 0;
				} else {
					Static82.method1448(local83);
				}
				Static88.anInt2370 = local83;
			}
		}
		if (local10 == 9) {
			Static57.anInt2685 = local21;
		}
		if (local10 == 4) {
			if (local21 == 0) {
				Static86.anInt2325 = 127;
			}
			if (local21 == 1) {
				Static86.anInt2325 = 96;
			}
			if (local21 == 2) {
				Static86.anInt2325 = 64;
			}
			if (local21 == 3) {
				Static86.anInt2325 = 32;
			}
			if (local21 == 4) {
				Static86.anInt2325 = 0;
			}
		}
		if (local10 == 6) {
			Static12.anInt537 = local21;
		}
		if (local10 == 5) {
			Static14.anInt637 = local21;
		}
		if (local10 == 8) {
			Static100.anInt2732 = local21;
			Static27.aBoolean65 = true;
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
	public static void method206() {
		while (true) {
			if (Static3.aClass2_Sub6_Sub1_1.method680(Static87.anInt2339) >= 11) {
				@Pc(19) int local19 = Static3.aClass2_Sub6_Sub1_1.method687(11);
				if (local19 != 2047) {
					if (Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[local19] == null) {
						Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[local19] = new Class2_Sub1_Sub4_Sub6_Sub1();
						if (Static4.aClass2_Sub6Array1[local19] != null) {
							Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[local19].method1106(Static4.aClass2_Sub6Array1[local19]);
						}
					}
					Static78.anIntArray322[Static21.anInt1007++] = local19;
					@Pc(58) Class2_Sub1_Sub4_Sub6_Sub1 local58 = Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[local19];
					local58.anInt2030 = Static49.anInt2694;
					@Pc(66) int local66 = Static3.aClass2_Sub6_Sub1_1.method687(5);
					if (local66 > 15) {
						local66 -= 32;
					}
					@Pc(77) int local77 = Static3.aClass2_Sub6_Sub1_1.method687(5);
					@Pc(82) int local82 = Static3.aClass2_Sub6_Sub1_1.method687(1);
					if (local82 == 1) {
						Static91.anIntArray352[Static64.anInt624++] = local19;
					}
					@Pc(98) int local98 = Static3.aClass2_Sub6_Sub1_1.method687(1);
					if (local77 > 15) {
						local77 -= 32;
					}
					local58.method1278(local98 == 1, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0] + local66, local77 + Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0]);
					continue;
				}
			}
			Static3.aClass2_Sub6_Sub1_1.method682();
			return;
		}
	}
}
