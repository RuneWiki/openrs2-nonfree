import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
	public static int anInt1983;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
	public static int anInt1984;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "[I")
	public static int[] anIntArray204;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "Lclient!dg;")
	public static Class28_Sub1 aClass28_Sub1_54;

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "[I")
	public static int[] anIntArray205 = new int[32];

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
	public static int anInt1986 = 0;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "Lclient!sc;")
	public static Class107 aClass107_564 = Static231.method3737("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
	public static int anInt1989 = 0;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BIIIII)V")
	public static void method1548(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg0 + 1;
		Static162.method2605(Static231.anIntArrayArray44[arg0], arg1, arg3, arg2);
		@Pc(17) int local17 = arg4 - 1;
		Static162.method2605(Static231.anIntArrayArray44[arg4], arg1, arg3, arg2);
		for (@Pc(29) int local29 = local8; local29 <= local17; local29++) {
			@Pc(35) int[] local35 = Static231.anIntArrayArray44[local29];
			local35[arg1] = local35[arg2] = arg3;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)I")
	public static int method1549() {
		return 6;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB[Lclient!o;)V")
	public static void method1550(@OriginalArg(0) int arg0, @OriginalArg(2) Class86[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(14) Class86 local14 = arg1[local3];
			if (local14 != null && local14.anInt3225 == arg0 && (!local14.aBoolean280 || !Static34.method677(local14))) {
				if (local14.anInt3286 == 0) {
					if (!local14.aBoolean280 && Static34.method677(local14) && Static215.aClass86_16 != local14) {
						continue;
					}
					method1550(local14.anInt3239, arg1);
					if (local14.aClass86Array1 != null) {
						method1550(local14.anInt3239, local14.aClass86Array1);
					}
					@Pc(60) Class1_Sub11 local60 = (Class1_Sub11) Static154.aClass50_18.method1364((long) local14.anInt3239);
					if (local60 != null) {
						Static39.method747(local60.anInt1575);
					}
				}
				if (local14.anInt3286 == 6) {
					@Pc(90) int local90;
					if (local14.anInt3283 != -1 || local14.anInt3276 != -1) {
						@Pc(85) boolean local85 = Static128.method2148(local14);
						if (local85) {
							local90 = local14.anInt3276;
						} else {
							local90 = local14.anInt3283;
						}
						if (local90 != -1) {
							@Pc(103) Class96 local103 = Static2.method88(local90);
							if (local103 != null) {
								local14.anInt3246 += Static204.anInt2498;
								while (local103.anIntArray327[local14.anInt3269] < local14.anInt3246) {
									local14.anInt3246 -= local103.anIntArray327[local14.anInt3269];
									local14.anInt3269++;
									if (local103.anIntArray323.length <= local14.anInt3269) {
										local14.anInt3269 -= local103.anInt3645;
										if (local14.anInt3269 < 0 || local14.anInt3269 >= local103.anIntArray323.length) {
											local14.anInt3269 = 0;
										}
									}
									Static16.method354(local14);
								}
							}
						}
					}
					if (local14.anInt3248 != 0 && !local14.aBoolean280) {
						local90 = local14.anInt3248 << 16 >> 16;
						@Pc(194) int local194 = local14.anInt3248 >> 16;
						@Pc(198) int local198 = local194 * Static204.anInt2498;
						local14.anInt3229 = local198 + local14.anInt3229 & 0x7FF;
						local90 *= Static204.anInt2498;
						local14.anInt3275 = local14.anInt3275 + local90 & 0x7FF;
						Static16.method354(local14);
					}
				}
			}
		}
	}
}
