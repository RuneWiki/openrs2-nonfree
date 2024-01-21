import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!jf", name = "Q", descriptor = "I")
	public static int anInt1933;

	@OriginalMember(owner = "client!jf", name = "jb", descriptor = "[I")
	public static int[] anIntArray190;

	@OriginalMember(owner = "client!jf", name = "L", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_714 = Static161.method2452("Connection lost)3");

	@OriginalMember(owner = "client!jf", name = "M", descriptor = "Lclient!dc;")
	public static Class20 aClass20_715 = aClass20_714;

	@OriginalMember(owner = "client!jf", name = "eb", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_716 = Static161.method2452("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!jf", name = "fb", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_717 = Static161.method2452("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIZILclient!wa;I)V")
	public static void method1499(@OriginalArg(0) int arg0, @OriginalArg(5) Class23 arg1, @OriginalArg(6) int arg2) {
		Static113.anInt2383 = 0;
		Static45.anInt1025 = arg2;
		Static15.anInt312 = 2;
		Static183.anInt3678 = arg0;
		Static92.anInt1963 = 1;
		Static172.aClass23_68 = arg1;
		Static38.aBoolean50 = false;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIII)V")
	public static void method1500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == Static132.anInt3723 && Static119.anInt2546 == arg3 && (Static38.anInt829 == arg0 || !Static14.aBoolean14)) {
			return;
		}
		Static119.anInt2546 = arg3;
		Static132.anInt3723 = arg4;
		Static38.anInt829 = arg0;
		if (!Static14.aBoolean14) {
			Static38.anInt829 = 0;
		}
		Static208.method3109(25);
		Static167.method2533(Static119.aClass20_924, true);
		@Pc(45) int local45 = Static86.anInt1895;
		@Pc(47) int local47 = Static110.anInt2295;
		Static110.anInt2295 = arg3 * 8 - 48;
		@Pc(58) int local58 = Static110.anInt2295 - local47;
		Static86.anInt1895 = arg4 * 8 - 48;
		@Pc(71) int local71 = Static86.anInt1895 - local45;
		for (@Pc(75) int local75 = 0; local75 < 32768; local75++) {
			@Pc(81) Class1_Sub2_Sub1 local81 = Static61.aClass1_Sub2_Sub1Array1[local75];
			if (local81 != null) {
				for (@Pc(85) int local85 = 0; local85 < 10; local85++) {
					local81.anIntArray250[local85] -= local71;
					local81.anIntArray253[local85] -= local58;
				}
				local81.anInt2234 -= local58 * 128;
				local81.anInt2241 -= local71 * 128;
			}
		}
		for (@Pc(131) int local131 = 0; local131 < 2048; local131++) {
			@Pc(137) Class1_Sub2_Sub2 local137 = Static6.aClass1_Sub2_Sub2Array1[local131];
			if (local137 != null) {
				for (@Pc(141) int local141 = 0; local141 < 10; local141++) {
					local137.anIntArray250[local141] -= local71;
					local137.anIntArray253[local141] -= local58;
				}
				local137.anInt2241 -= local71 * 128;
				local137.anInt2234 -= local58 * 128;
			}
		}
		Static111.anInt2327 = arg0;
		@Pc(191) byte local191 = 0;
		@Pc(193) byte local193 = 104;
		Static210.aClass1_Sub2_Sub2_2.method1744(arg1, false, arg2);
		@Pc(201) byte local201 = 1;
		if (local71 < 0) {
			local193 = -1;
			local191 = 103;
			local201 = -1;
		}
		@Pc(211) byte local211 = 104;
		@Pc(213) byte local213 = 1;
		@Pc(215) byte local215 = 0;
		if (local58 < 0) {
			local213 = -1;
			local215 = 103;
			local211 = -1;
		}
		for (@Pc(228) int local228 = local191; local228 != local193; local228 += local201) {
			for (@Pc(232) int local232 = local215; local232 != local211; local232 += local213) {
				@Pc(238) int local238 = local228 + local71;
				@Pc(242) int local242 = local58 + local232;
				for (@Pc(244) int local244 = 0; local244 < 4; local244++) {
					if (local238 >= 0 && local242 >= 0 && local238 < 104 && local242 < 104) {
						Static159.aClass91ArrayArrayArray1[local244][local228][local232] = Static159.aClass91ArrayArrayArray1[local244][local238][local242];
					} else {
						Static159.aClass91ArrayArrayArray1[local244][local228][local232] = null;
					}
				}
			}
		}
		for (@Pc(307) Class5_Sub23 local307 = (Class5_Sub23) Static18.aClass91_3.method2684(); local307 != null; local307 = (Class5_Sub23) Static18.aClass91_3.method2678()) {
			local307.anInt3033 -= local58;
			local307.anInt3031 -= local71;
			if (local307.anInt3031 < 0 || local307.anInt3033 < 0 || local307.anInt3031 >= 104 || local307.anInt3033 >= 104) {
				local307.method3207();
			}
		}
		Static26.aBoolean182 = false;
		Static198.anInt3860 = 0;
		if (Static166.anInt3320 != 0) {
			Static169.anInt3386 -= local58;
			Static166.anInt3320 -= local71;
		}
		Static118.anInt3279 = -1;
		Static166.aClass91_15.method2682();
		Static75.aClass91_9.method2682();
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(B)Z")
	public static boolean method1501() {
		return Static92.anInt1963 == 0 ? Static154.aClass5_Sub11_Sub2_2.method1651() : true;
	}
}
