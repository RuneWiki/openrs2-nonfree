import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
	public static int anInt1989;

	@OriginalMember(owner = "client!eq", name = "n", descriptor = "Lclient!hr;")
	public static Class111 aClass111_1;

	@OriginalMember(owner = "client!eq", name = "s", descriptor = "I")
	public static int anInt1995 = 0;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(FFIF)F")
	public static float method1708(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return arg0 * (arg1 - arg2) + arg2;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)[Lclient!tb;")
	public static Class234[] method1710() {
		if (Static45.aClass234Array1 == null) {
			@Pc(9) Class234[] local9 = Static294.method3885(Static230.aClass61_4);
			@Pc(13) Class234[] local13 = new Class234[local9.length];
			@Pc(15) int local15 = 0;
			@Pc(65) int local65;
			@Pc(71) Class234 local71;
			label63: for (@Pc(17) int local17 = 0; local17 < local9.length; local17++) {
				@Pc(23) Class234 local23 = local9[local17];
				if ((local23.anInt6125 <= 0 || local23.anInt6125 >= 24) && local23.anInt6123 >= 800 && local23.anInt6121 >= 600 && (Static268.anInt4537 >= 96 || Static377.anInt6113 != 0 || local23.anInt6123 <= 1024 && local23.anInt6121 <= 768)) {
					for (local65 = 0; local65 < local15; local65++) {
						local71 = local13[local65];
						if (local71.anInt6123 == local23.anInt6123 && local71.anInt6121 == local23.anInt6121) {
							if (local23.anInt6125 > local71.anInt6125) {
								local13[local65] = local23;
							}
							continue label63;
						}
					}
					local13[local15] = local23;
					local15++;
				}
			}
			Static45.aClass234Array1 = new Class234[local15];
			Static464.method3637(local13, 0, Static45.aClass234Array1, 0, local15);
			@Pc(131) int[] local131 = new int[Static45.aClass234Array1.length];
			for (local65 = 0; local65 < Static45.aClass234Array1.length; local65++) {
				local71 = Static45.aClass234Array1[local65];
				local131[local65] = local71.anInt6121 * local71.anInt6123;
			}
			Static90.method1617(local131, Static45.aClass234Array1);
		}
		return Static45.aClass234Array1;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)V")
	public static void method1712() {
		Static257.method3428(Static130.aClass153_Sub1_1.aBoolean344);
		Static243.aClass7_Sub8_Sub3_3 = new Class7_Sub8_Sub3();
		Static243.aClass7_Sub8_Sub3_3.method4493();
		Static99.aClass116_1 = Static373.method4779(Static95.aCanvas3, 0, Static230.aClass61_4, 22050);
		Static99.aClass116_1.method5577(Static243.aClass7_Sub8_Sub3_3);
		Static215.method3052(Static32.aClass178_12, Static271.aClass178_82, Static243.aClass7_Sub8_Sub3_3, Static282.aClass178_86);
		Static247.aClass116_3 = Static373.method4779(Static95.aCanvas3, 1, Static230.aClass61_4, 2048);
		Static452.aClass7_Sub8_Sub1_2 = new Class7_Sub8_Sub1();
		Static247.aClass116_3.method5577(Static452.aClass7_Sub8_Sub1_2);
		Static97.aClass257_1 = new Class257(22050, Static208.anInt3680);
		Static242.anInt4146 = Static122.aClass178_39.method3836("scape main");
	}
}
