import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!dfa", name = "G", descriptor = "D")
	public static double aDouble7;

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "([BB)Lclient!sw;")
	public static Class5_Sub5_Sub19 method1585(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class5_Sub5_Sub19 local9 = new Class5_Sub5_Sub19();
		@Pc(14) Class5_Sub22 local14 = new Class5_Sub22(arg0);
		local14.anInt6629 = local14.aByteArray71.length - 2;
		@Pc(25) int local25 = local14.method5968();
		@Pc(36) int local36 = local14.aByteArray71.length - local25 - 2 - 12;
		local14.anInt6629 = local36;
		@Pc(43) int local43 = local14.method5913();
		local9.anInt9044 = local14.method5968();
		local9.anInt9046 = local14.method5968();
		local9.anInt9041 = local14.method5968();
		local9.anInt9043 = local14.method5968();
		@Pc(67) int local67 = local14.method5966();
		@Pc(83) int local83;
		@Pc(89) int local89;
		if (local67 > 0) {
			local9.aClass273Array1 = new Class273[local67];
			for (local83 = 0; local83 < local67; local83++) {
				local89 = local14.method5968();
				@Pc(96) Class273 local96 = new Class273(Static613.method8740(local89));
				local9.aClass273Array1[local83] = local96;
				while (local89-- > 0) {
					@Pc(107) int local107 = local14.method5913();
					@Pc(111) int local111 = local14.method5913();
					local96.method6585((long) local107, new Class5_Sub41(local111));
				}
			}
		}
		local14.anInt6629 = 0;
		local9.aString102 = local14.method5942();
		local9.anIntArray495 = new int[local43];
		local9.aStringArray71 = new String[local43];
		local9.anIntArray494 = new int[local43];
		local83 = 0;
		while (local36 > local14.anInt6629) {
			local89 = local14.method5968();
			if (local89 == 3) {
				local9.aStringArray71[local83] = local14.method5937().intern();
			} else if (local89 >= 100 || local89 == 21 || local89 == 38 || local89 == 39) {
				local9.anIntArray494[local83] = local14.method5966();
			} else {
				local9.anIntArray494[local83] = local14.method5913();
			}
			local9.anIntArray495[local83++] = local89;
		}
		return local9;
	}
}
