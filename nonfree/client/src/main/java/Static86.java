import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!fo", name = "t", descriptor = "Lclient!po;")
	public static Class165 aClass165_1;

	@OriginalMember(owner = "client!fo", name = "H", descriptor = "I")
	public static int anInt2149;

	@OriginalMember(owner = "client!fo", name = "I", descriptor = "I")
	public static int anInt2150;

	@OriginalMember(owner = "client!fo", name = "J", descriptor = "Lclient!ph;")
	public static Class162 aClass162_3;

	@OriginalMember(owner = "client!fo", name = "K", descriptor = "[Lclient!c;")
	public static Class5[] aClass5Array10;

	@OriginalMember(owner = "client!fo", name = "B", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_66 = new Class34("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!fo", name = "C", descriptor = "Lclient!vh;")
	public static Class1_Sub39 aClass1_Sub39_1 = null;

	@OriginalMember(owner = "client!fo", name = "L", descriptor = "[I")
	public static final int[] anIntArray209 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "(B)V")
	public static void method1863() {
		if (Static137.anInt3038 != -1) {
			Static194.method3746(Static137.anInt3038, -1, -1, false);
			Static137.anInt3038 = -1;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "([Lclient!g;II[BZIIIZILclient!uo;I)V")
	public static void method1866(@OriginalArg(0) Class71[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class32 arg9, @OriginalArg(11) int arg10) {
		@Pc(15) Class1_Sub8 local15 = new Class1_Sub8(arg3);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method4530();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local15.method4528();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(51) int local51 = local32 & 0x3F;
				@Pc(57) int local57 = local32 >> 6 & 0x3F;
				@Pc(61) int local61 = local32 >> 12;
				@Pc(65) int local65 = local15.method4532();
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				if (arg1 == local61 && arg4 <= local57 && arg4 + 8 > local57 && arg8 <= local51 && arg8 + 8 > local51) {
					@Pc(108) Class141 local108 = Static119.method2548(local17);
					@Pc(126) int local126 = arg2 + Static329.method5342(local57 & 0x7, local73, local108.anInt4256, arg6, local51 & 0x7, local108.anInt4297);
					@Pc(144) int local144 = arg10 + Static345.method5540(local108.anInt4297, local73, local108.anInt4256, local57 & 0x7, local51 & 0x7, arg6);
					if (local126 > 0 && local144 > 0 && Static233.anInt5573 - 1 > local126 && Static134.anInt2971 - 1 > local144) {
						@Pc(167) Class71 local167 = null;
						if (!arg7) {
							@Pc(171) int local171 = arg5;
							if ((Static200.aByteArrayArrayArray8[1][local126][local144] & 0x2) == 2) {
								local171 = arg5 - 1;
							}
							if (local171 >= 0) {
								local167 = arg0[local171];
							}
						}
						Static71.method3160(-1, arg9, arg5, arg5, true, arg6 + local73 & 0x3, local17, local69, local126, arg7, local144, local167);
					}
				}
			}
		}
	}
}
