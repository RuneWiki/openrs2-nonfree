import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
	public static int anInt1971;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZIFFF)F")
	public static float method1760(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		@Pc(12) float[] local12 = Static307.aFloatArrayArray35[arg0];
		return arg1 * local12[2] + local12[0] * arg2 + local12[1] * arg3;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!eu;)I")
	public static int method1761(@OriginalArg(1) Class4_Sub14 arg0) {
		@Pc(7) String local7 = Static311.method4739(arg0);
		@Pc(9) int[] local9 = null;
		if (Static383.method5405(arg0.anInt2132)) {
			local9 = Static139.aClass193_1.method4650((int) arg0.aLong69).anIntArray625;
		} else if (arg0.anInt2130 != -1) {
			local9 = Static139.aClass193_1.method4650(arg0.anInt2130).anIntArray625;
		} else if (Static258.method3303(arg0.anInt2132)) {
			@Pc(45) Class4_Sub44 local45 = (Class4_Sub44) Static80.aClass96_8.method2797((long) arg0.aLong69);
			if (local45 != null) {
				@Pc(50) Class11_Sub5_Sub2_Sub2 local50 = local45.aClass11_Sub5_Sub2_Sub2_2;
				@Pc(53) Class241 local53 = local50.aClass241_1;
				if (local53.anIntArray565 != null) {
					local53 = local53.method5593(Static67.aClass224_1);
				}
				if (local53 != null) {
					local9 = local53.anIntArray562;
				}
			}
		} else if (Static463.method6261(arg0.anInt2132)) {
			@Pc(91) Class139 local91;
			if (arg0.anInt2132 == 1007) {
				local91 = Static146.aClass228_1.method5203((int) arg0.aLong69);
			} else {
				local91 = Static146.aClass228_1.method5203((int) (arg0.aLong69 >>> 32 & 0x7FFFFFFFL));
			}
			if (local91.anIntArray344 != null) {
				local91 = local91.method3751(Static67.aClass224_1);
			}
			if (local91 != null) {
				local9 = local91.anIntArray343;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static418.method2688(local9);
		}
		@Pc(142) int local142 = Static296.aClass84_10.method2383(Static171.aClass2Array26, local7);
		if (arg0.aBoolean150) {
			local142 += Static151.aClass2_17.TA() + 4;
		}
		return local142;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IBI)Z")
	public static boolean method1764(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static347.method5055(arg1, arg0) & Static456.method6196(arg1, arg0);
	}
}
