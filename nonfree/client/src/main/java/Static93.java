import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
	public static int anInt2136;

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_28 = new Class267("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!ek", name = "i", descriptor = "[I")
	public static final int[] anIntArray121 = new int[1];

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
	public static void method1654() {
		Static400.aFont1 = null;
		Static333.anImage2 = null;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZIIII)V")
	public static void method1656(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static88.method4151(arg3)) {
			Static399.method5884(arg1, arg0, arg2, Static35.aClass239ArrayArray1[arg3], -1);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIBI)V")
	public static void method1659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class219 local9 = Static418.aClass219ArrayArray1[arg0][arg2];
		Static34.method5940(arg1, local9 == null ? Static253.aClass219_4 : local9);
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
	public static void method1660() {
		Static232.aClass6_Sub1_Sub1_4.method3791();
		@Pc(15) int local15 = Static232.aClass6_Sub1_Sub1_4.method3803(8);
		@Pc(20) int local20;
		if (Static136.anInt2887 > local15) {
			for (local20 = local15; local20 < Static136.anInt2887; local20++) {
				Static385.anIntArray470[Static329.anInt5679++] = Static66.anIntArray102[local20];
			}
		}
		if (Static136.anInt2887 < local15) {
			throw new RuntimeException("gnpov1");
		}
		Static136.anInt2887 = 0;
		for (local20 = 0; local20 < local15; local20++) {
			@Pc(67) int local67 = Static66.anIntArray102[local20];
			@Pc(71) Class3_Sub2_Sub1_Sub1 local71 = Static308.aClass3_Sub2_Sub1_Sub1Array1[local67];
			@Pc(76) int local76 = Static232.aClass6_Sub1_Sub1_4.method3803(1);
			if (local76 == 0) {
				Static66.anIntArray102[Static136.anInt2887++] = local67;
				local71.anInt6586 = Static66.anInt1741;
			} else {
				@Pc(99) int local99 = Static232.aClass6_Sub1_Sub1_4.method3803(2);
				if (local99 == 0) {
					Static66.anIntArray102[Static136.anInt2887++] = local67;
					local71.anInt6586 = Static66.anInt1741;
					Static58.anIntArray193[Static263.anInt4750++] = local67;
				} else {
					@Pc(143) int local143;
					@Pc(153) int local153;
					if (local99 == 1) {
						Static66.anIntArray102[Static136.anInt2887++] = local67;
						local71.anInt6586 = Static66.anInt1741;
						local143 = Static232.aClass6_Sub1_Sub1_4.method3803(3);
						local71.method1323(1, local143);
						local153 = Static232.aClass6_Sub1_Sub1_4.method3803(1);
						if (local153 == 1) {
							Static58.anIntArray193[Static263.anInt4750++] = local67;
						}
					} else if (local99 == 2) {
						Static66.anIntArray102[Static136.anInt2887++] = local67;
						local71.anInt6586 = Static66.anInt1741;
						if (Static232.aClass6_Sub1_Sub1_4.method3803(1) == 1) {
							local143 = Static232.aClass6_Sub1_Sub1_4.method3803(3);
							local71.method1323(2, local143);
							local153 = Static232.aClass6_Sub1_Sub1_4.method3803(3);
							local71.method1323(2, local153);
						} else {
							local143 = Static232.aClass6_Sub1_Sub1_4.method3803(3);
							local71.method1323(0, local143);
						}
						local143 = Static232.aClass6_Sub1_Sub1_4.method3803(1);
						if (local143 == 1) {
							Static58.anIntArray193[Static263.anInt4750++] = local67;
						}
					} else if (local99 == 3) {
						Static385.anIntArray470[Static329.anInt5679++] = local67;
					}
				}
			}
		}
	}
}
