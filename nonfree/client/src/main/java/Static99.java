import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!fg", name = "q", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_54 = new Class208(84, 14);

	@OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
	public static final int anInt2181 = 1400;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!tb;Lclient!oj;I)I")
	public static int method1732(@OriginalArg(0) Class214 arg0, @OriginalArg(1) Class48 arg1) {
		if (arg0.anInt6104 != -1) {
			return arg0.anInt6104;
		}
		if (arg0.anInt6099 != -1) {
			@Pc(25) Class166 local25 = arg1.anInterface3_4.method1278(arg1.method2453() ? arg0.anInt6099 : arg0.anInt6108);
			if (!local25.aBoolean339) {
				return local25.aShort62;
			}
		}
		return arg0.anInt6106;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "([BI)Lclient!ih;")
	public static Class2_Sub7_Sub8 method1733(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class2_Sub7_Sub8 local9 = new Class2_Sub7_Sub8();
		@Pc(14) Class2_Sub24 local14 = new Class2_Sub24(arg0);
		local14.anInt6669 = local14.aByteArray100.length - 2;
		@Pc(25) int local25 = local14.method5753();
		@Pc(36) int local36 = local14.aByteArray100.length - local25 - 12 - 2;
		local14.anInt6669 = local36;
		@Pc(43) int local43 = local14.method5776();
		local9.anInt3129 = local14.method5753();
		local9.anInt3135 = local14.method5753();
		local9.anInt3132 = local14.method5753();
		local9.anInt3133 = local14.method5753();
		@Pc(75) int local75 = local14.method5732();
		@Pc(83) int local83;
		@Pc(89) int local89;
		if (local75 > 0) {
			local9.aClass243Array1 = new Class243[local75];
			for (local83 = 0; local83 < local75; local83++) {
				local89 = local14.method5753();
				@Pc(96) Class243 local96 = new Class243(Static279.method4638(local89));
				local9.aClass243Array1[local83] = local96;
				while (local89-- > 0) {
					@Pc(107) int local107 = local14.method5776();
					@Pc(111) int local111 = local14.method5776();
					local96.method5968((long) local107, new Class2_Sub16(local111));
				}
			}
		}
		local14.anInt6669 = 0;
		local9.aString24 = local14.method5716();
		local9.anIntArray244 = new int[local43];
		local9.anIntArray243 = new int[local43];
		local9.aStringArray15 = new String[local43];
		local83 = 0;
		while (local36 > local14.anInt6669) {
			local89 = local14.method5753();
			if (local89 == 3) {
				local9.aStringArray15[local83] = local14.method5744().intern();
			} else if (local89 >= 100 || local89 == 21 || local89 == 38 || local89 == 39) {
				local9.anIntArray244[local83] = local14.method5732();
			} else {
				local9.anIntArray244[local83] = local14.method5776();
			}
			local9.anIntArray243[local83++] = local89;
		}
		return local9;
	}
}
