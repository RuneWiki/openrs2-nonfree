import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!de", name = "s", descriptor = "Lclient!ka;")
	public static Class183 aClass183_1;

	@OriginalMember(owner = "client!de", name = "C", descriptor = "I")
	public static int anInt1982;

	@OriginalMember(owner = "client!de", name = "k", descriptor = "I")
	public static int anInt1972 = 0;

	@OriginalMember(owner = "client!de", name = "m", descriptor = "Lclient!tl;")
	public static final Class314 aClass314_2 = new Class314();

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([[BILclient!sca;)V")
	public static void method1739(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class231_Sub1 arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.anInt8038; local3++) {
			Static99.method1834();
			for (@Pc(11) int local11 = 0; local11 < Static500.anInt6888 >> 3; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static573.anInt9325 >> 3; local15++) {
					@Pc(25) int local25 = Static414.anIntArrayArrayArray16[local3][local11][local15];
					if (local25 != -1) {
						@Pc(35) int local35 = local25 >> 24 & 0x3;
						if (!arg1.aBoolean576 || local35 == 0) {
							@Pc(46) int local46 = local25 >> 1 & 0x3;
							@Pc(52) int local52 = local25 >> 14 & 0x3FF;
							@Pc(58) int local58 = local25 >> 3 & 0x7FF;
							@Pc(68) int local68 = (local52 / 8 << 8) + local58 / 8;
							for (@Pc(70) int local70 = 0; local70 < Static298.anIntArray348.length; local70++) {
								if (local68 == Static298.anIntArray348[local70] && arg0[local70] != null) {
									arg1.method6693(Static136.aClass12_8, (local58 & 0x7) * 8, arg0[local70], Static28.aClass94Array2, local15 * 8, (local52 & 0x7) * 8, local3, local35, local11 * 8, local46);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)Z")
	public static boolean method1741(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
	public static void method1742() {
		@Pc(12) Class1_Sub48 local12 = Static320.method4867(Static442.aClass170_2, Static416.aClass319_131);
		local12.aClass1_Sub20_Sub1_2.method4378(0);
		Static34.method813(local12);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method1743(@OriginalArg(0) String arg0) {
		return Static356.method5849(arg0);
	}
}
