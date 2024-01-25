import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ea", name = "K", descriptor = "Lclient!cg;")
	public static Class36 aClass36_1;

	@OriginalMember(owner = "client!ea", name = "L", descriptor = "I")
	public static int anInt1573;

	@OriginalMember(owner = "client!ea", name = "O", descriptor = "I")
	public static int anInt1575 = 0;

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "(I)V")
	public static void method1382() {
		Static160.method2323(Static371.aClass124_10);
		Static230.anInt4043++;
		if (Static145.aBoolean232 && Static310.aBoolean608) {
			@Pc(33) int local33 = Static62.aClass96_1.method3872();
			@Pc(39) int local39 = Static62.aClass96_1.method3870();
			local39 -= Static237.anInt4218;
			local33 -= Static148.anInt2545;
			if (Static209.anInt3757 > local33) {
				local33 = Static209.anInt3757;
			}
			if (Static401.aClass124_12.anInt3376 + Static209.anInt3757 < Static371.aClass124_10.anInt3376 + local33) {
				local33 = Static401.aClass124_12.anInt3376 + Static209.anInt3757 - Static371.aClass124_10.anInt3376;
			}
			if (Static159.anInt2655 > local39) {
				local39 = Static159.anInt2655;
			}
			if (Static401.aClass124_12.anInt3356 + Static159.anInt2655 < local39 - -Static371.aClass124_10.anInt3356) {
				local39 = Static159.anInt2655 + Static401.aClass124_12.anInt3356 - Static371.aClass124_10.anInt3356;
			}
			@Pc(112) int local112 = local33 + Static401.aClass124_12.anInt3390 - Static209.anInt3757;
			@Pc(120) int local120 = Static401.aClass124_12.anInt3418 + local39 - Static159.anInt2655;
			@Pc(137) Class1_Sub40 local137;
			if (Static62.aClass96_1.method3878()) {
				if (Static230.anInt4043 > Static371.aClass124_10.anInt3366) {
					@Pc(216) int local216 = local33 - Static16.anInt317;
					@Pc(221) int local221 = local39 - Static57.anInt1094;
					if (local216 > Static371.aClass124_10.anInt3394 || -Static371.aClass124_10.anInt3394 > local216 || Static371.aClass124_10.anInt3394 < local221 || -Static371.aClass124_10.anInt3394 > local221) {
						Static109.aBoolean554 = true;
					}
				}
				if (Static371.aClass124_10.anObjectArray30 != null && Static109.aBoolean554) {
					local137 = new Class1_Sub40();
					local137.anInt6789 = local112;
					local137.anObjectArray36 = Static371.aClass124_10.anObjectArray30;
					local137.anInt6793 = local120;
					local137.aClass124_14 = Static371.aClass124_10;
					Static298.method4076(local137);
				}
			} else {
				if (Static109.aBoolean554) {
					Static124.method5684();
					if (Static371.aClass124_10.anObjectArray13 != null) {
						local137 = new Class1_Sub40();
						local137.anObjectArray36 = Static371.aClass124_10.anObjectArray13;
						local137.aClass124_14 = Static371.aClass124_10;
						local137.aClass124_13 = Static219.aClass124_5;
						local137.anInt6793 = local120;
						local137.anInt6789 = local112;
						Static298.method4076(local137);
					}
					if (Static219.aClass124_5 != null && Static55.method977(Static371.aClass124_10) != null) {
						Static337.method4519(Static371.aClass124_10, Static219.aClass124_5);
					}
				} else if ((Static40.anInt703 == 1 || Static218.method3184()) && Static118.anInt2201 > 2) {
					Static382.method5592(Static16.anInt317 + Static148.anInt2545, Static237.anInt4218 + Static57.anInt1094);
				} else if (Static235.method3391()) {
					Static382.method5592(Static16.anInt317 + Static148.anInt2545, Static237.anInt4218 + Static57.anInt1094);
				}
				Static371.aClass124_10 = null;
			}
		} else if (Static230.anInt4043 > 1) {
			Static371.aClass124_10 = null;
		}
	}
}
