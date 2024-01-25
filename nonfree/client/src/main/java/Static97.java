import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!en", name = "a", descriptor = "I")
	public static int anInt2088;

	@OriginalMember(owner = "client!en", name = "g", descriptor = "I")
	public static int anInt2093 = 0;

	@OriginalMember(owner = "client!en", name = "h", descriptor = "I")
	public static int anInt2094 = -1;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!qa;)V")
	public static void method1572(@OriginalArg(0) Class30 arg0) {
		for (@Pc(1) int local1 = Static219.anInt4078; local1 < Static338.anInt5952; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static301.anInt5434; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static241.anInt4414; local7++) {
					@Pc(16) Class53 local16 = Static40.aClass53ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class6_Sub1 local21 = local16.aClass6_Sub1_1;
						@Pc(24) Class6_Sub1 local24 = local16.aClass6_Sub1_2;
						if (local21 != null && local21.method5633()) {
							Static332.method4500(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5633()) {
								Static332.method4500(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5636(local21, arg0, 0, false, 0, 0);
								local24.method5634();
							}
							local21.method5634();
						}
						for (@Pc(70) Class165 local70 = local16.aClass165_1; local70 != null; local70 = local70.aClass165_2) {
							@Pc(74) Class6_Sub2 local74 = local70.aClass6_Sub2_2;
							if (local74 != null && local74.method5633()) {
								Static332.method4500(arg0, local74, local1, local4, local7, local74.aShort84 + 1 - local74.aShort82, local74.aShort83 - local74.aShort85 + 1);
								local74.method5634();
							}
						}
						@Pc(111) Class6_Sub4 local111 = local16.aClass6_Sub4_1;
						if (local111 != null && local111.method5633()) {
							Static12.method316(arg0, local111, local1, local4, local7);
							local111.method5634();
						}
					}
				}
			}
		}
	}
}
