import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!ds", name = "z", descriptor = "[I")
	public static int[] anIntArray154;

	@OriginalMember(owner = "client!ds", name = "v", descriptor = "Lclient!sv;")
	public static final Class311 aClass311_1 = new Class311();

	@OriginalMember(owner = "client!ds", name = "w", descriptor = "Lclient!ca;")
	public static final Class40 aClass40_2 = new Class40();

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZII)V")
	public static void method1765(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) Class6_Sub2_Sub7 local20 = Static401.method5861(arg1, 13);
		local20.method2582();
		local20.anInt2944 = arg0;
	}

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "(I)V")
	public static void method1768() {
		Static372.method5567();
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)I")
	public static int method1772(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(43) int local43 = Static210.method3728(arg1 - 1, arg0 + -1) + Static210.method3728(arg1 - 1, arg0 + 1) + Static210.method3728(arg1 + 1, arg0 + -1) + Static210.method3728(arg1 + 1, arg0 - -1);
		@Pc(75) int local75 = Static210.method3728(arg1, arg0 - 1) + Static210.method3728(arg1, arg0 + 1) + Static210.method3728(arg1 + -1, arg0) + Static210.method3728(arg1 + 1, arg0);
		@Pc(80) int local80 = Static210.method3728(arg1, arg0);
		return local80 / 4 + local43 / 16 + local75 / 8;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!oa;)V")
	public static void method1776(@OriginalArg(0) Class14 arg0) {
		for (@Pc(1) int local1 = Static128.anInt2923; local1 < Static107.anInt2060; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static401.anInt7022; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static555.anInt9182; local7++) {
					@Pc(16) Class276 local16 = Static270.aClass276ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class4_Sub5 local21 = local16.aClass4_Sub5_2;
						@Pc(24) Class4_Sub5 local24 = local16.aClass4_Sub5_3;
						if (local21 != null && local21.method7785()) {
							Static491.method6717(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method7785()) {
								Static491.method6717(arg0, local24, local1, local4, local7, 1, 1);
								local24.method7787(false, arg0, local21, 0, 0, 0);
								local24.method7782();
							}
							local21.method7782();
						}
						for (@Pc(70) Class267 local70 = local16.aClass267_3; local70 != null; local70 = local70.aClass267_2) {
							@Pc(74) Class4_Sub1 local74 = local70.aClass4_Sub1_2;
							if (local74 != null && local74.method7785()) {
								Static491.method6717(arg0, local74, local1, local4, local7, local74.aShort123 + 1 - local74.aShort126, local74.aShort124 - local74.aShort125 + 1);
								local74.method7782();
							}
						}
						@Pc(111) Class4_Sub3 local111 = local16.aClass4_Sub3_2;
						if (local111 != null && local111.method7785()) {
							Static380.method5625(arg0, local111, local1, local4, local7);
							local111.method7782();
						}
					}
				}
			}
		}
	}
}
