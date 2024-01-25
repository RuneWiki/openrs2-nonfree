import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "J")
	public static long aLong66;

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "Z")
	public static volatile boolean aBoolean150 = false;

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_53 = new Class77(21, 8);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
	public static void method1766() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static392.anInt6751; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static307.anInt5484; local13++) {
				if (Static149.method2529(true, local7, Static297.aClass227ArrayArrayArray7, local9, local13)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)V")
	public static void method1768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static306.anInt5449 = arg1;
		Static50.anInt1033 = arg0;
		if (Static184.anInt6290 == 1) {
			Static294.method4660(Static298.aClass2_Sub7_1);
		} else if (Static184.anInt6290 == 2) {
			Static317.method4925(Static345.aClass2_Sub10_1.method1116(), Static345.aClass2_Sub10_1.method1124());
		}
		Static298.aClass2_Sub7_1 = null;
		Static184.anInt6290 = 0;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIB)V")
	public static void method1769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static332.anInt5823 <= arg4 && Static202.anInt3722 >= arg1 && Static313.anInt5542 <= arg2 && arg0 <= Static345.anInt6084) {
			Static340.method5220(arg2, arg1, arg0, arg4, arg3);
		} else {
			Static347.method5291(arg3, arg1, arg4, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
	public static void method1770() {
		Static85.aClass2_Sub13_Sub2_11.method4252();
		@Pc(13) int local13 = Static85.aClass2_Sub13_Sub2_11.method4257(8);
		@Pc(22) int local22;
		if (Static199.anInt3672 > local13) {
			for (local22 = local13; local22 < Static199.anInt3672; local22++) {
				Static178.anIntArray356[Static124.anInt6526++] = Static346.anIntArray730[local22];
			}
		}
		if (local13 > Static199.anInt3672) {
			throw new RuntimeException("gnpov1");
		}
		Static199.anInt3672 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(56) int local56 = Static346.anIntArray730[local22];
			@Pc(60) Class12_Sub1_Sub2_Sub1 local60 = Static107.aClass12_Sub1_Sub2_Sub1Array1[local56];
			@Pc(65) int local65 = Static85.aClass2_Sub13_Sub2_11.method4257(1);
			if (local65 == 0) {
				Static346.anIntArray730[Static199.anInt3672++] = local56;
				local60.anInt5340 = Static295.anInt5281;
			} else {
				@Pc(85) int local85 = Static85.aClass2_Sub13_Sub2_11.method4257(2);
				if (local85 == 0) {
					Static346.anIntArray730[Static199.anInt3672++] = local56;
					local60.anInt5340 = Static295.anInt5281;
					Static330.anIntArray704[Static56.anInt1149++] = local56;
				} else {
					@Pc(129) int local129;
					@Pc(139) int local139;
					if (local85 == 1) {
						Static346.anIntArray730[Static199.anInt3672++] = local56;
						local60.anInt5340 = Static295.anInt5281;
						local129 = Static85.aClass2_Sub13_Sub2_11.method4257(3);
						local60.method3265(1, local129);
						local139 = Static85.aClass2_Sub13_Sub2_11.method4257(1);
						if (local139 == 1) {
							Static330.anIntArray704[Static56.anInt1149++] = local56;
						}
					} else if (local85 == 2) {
						Static346.anIntArray730[Static199.anInt3672++] = local56;
						local60.anInt5340 = Static295.anInt5281;
						if (Static85.aClass2_Sub13_Sub2_11.method4257(1) == 1) {
							local129 = Static85.aClass2_Sub13_Sub2_11.method4257(3);
							local60.method3265(2, local129);
							local139 = Static85.aClass2_Sub13_Sub2_11.method4257(3);
							local60.method3265(2, local139);
						} else {
							local129 = Static85.aClass2_Sub13_Sub2_11.method4257(3);
							local60.method3265(0, local129);
						}
						local129 = Static85.aClass2_Sub13_Sub2_11.method4257(1);
						if (local129 == 1) {
							Static330.anIntArray704[Static56.anInt1149++] = local56;
						}
					} else if (local85 == 3) {
						Static178.anIntArray356[Static124.anInt6526++] = local56;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V")
	public static void method1774() {
		Static279.anInt4939 = 0;
		Static204.anInt3770 = -1;
		Static292.anInt5161 = -1;
		Static345.anInt6062 = -1;
	}
}
