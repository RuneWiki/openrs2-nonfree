import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!e", name = "d", descriptor = "[Lclient!kd;")
	public static final Class14_Sub1[] aClass14_Sub1Array5 = new Class14_Sub1[30];

	@OriginalMember(owner = "client!e", name = "e", descriptor = "[I")
	public static final int[] anIntArray646 = new int[13];

	@OriginalMember(owner = "client!e", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString208 = null;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!za;)V")
	public static void method5740(@OriginalArg(0) Class163 arg0) {
		for (@Pc(1) int local1 = Static154.anInt2668; local1 < Static289.anInt4757; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static169.anInt2876; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static316.anInt5459; local7++) {
					@Pc(16) Class270 local16 = Static309.aClass270ArrayArrayArray3[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class3_Sub2 local21 = local16.aClass3_Sub2_3;
						@Pc(24) Class3_Sub2 local24 = local16.aClass3_Sub2_2;
						if (local21 != null && local21.method5277()) {
							Static249.method3170(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5277()) {
								Static249.method3170(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5281(local21, 0, false, 0, 0, arg0);
								local24.method5284();
							}
							local21.method5284();
						}
						for (@Pc(70) Class241 local70 = local16.aClass241_2; local70 != null; local70 = local70.aClass241_1) {
							@Pc(74) Class3_Sub4 local74 = local70.aClass3_Sub4_2;
							if (local74 != null && local74.method5277()) {
								Static249.method3170(arg0, local74, local1, local4, local7, local74.aShort91 + 1 - local74.aShort92, local74.aShort90 - local74.aShort89 + 1);
								local74.method5284();
							}
						}
						@Pc(111) Class3_Sub5 local111 = local16.aClass3_Sub5_2;
						if (local111 != null && local111.method5277()) {
							Static76.method1138(arg0, local111, local1, local4, local7);
							local111.method5284();
						}
					}
				}
			}
		}
	}
}
