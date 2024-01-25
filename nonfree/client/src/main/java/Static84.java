import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!ee", name = "w", descriptor = "[Lclient!pd;")
	public static Class186[] aClass186Array1;

	@OriginalMember(owner = "client!ee", name = "y", descriptor = "J")
	public static long aLong72;

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_37 = new Class119(66, 6);

	@OriginalMember(owner = "client!ee", name = "u", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_38 = new Class119(92, 5);

	@OriginalMember(owner = "client!ee", name = "v", descriptor = "Lclient!og;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
	public static int anInt2097 = 0;

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V")
	public static void method1632() {
		if (Static374.aClass20_Sub1_1.method1814(Static105.anInt2382) || Static228.anInt4246 == Static6.anInt93) {
			Static447.method5903(Static121.aClass172_3);
			if (Static297.anInt5327 != Static6.anInt93) {
				Static416.method5340();
			}
		} else {
			Static226.method3380(false, Static373.anInt6270, false, Static417.anInt6837);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLclient!bu;)I")
	public static int method1634(@OriginalArg(1) Class32 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method800(Static60.anInt1568)) {
			local5++;
		}
		if (arg0.method800(Static272.anInt6025)) {
			local5++;
		}
		if (arg0.method800(Static56.anInt1518)) {
			local5++;
		}
		if (arg0.method800(Static123.anInt2626)) {
			local5++;
		}
		if (arg0.method800(Static31.anInt6065)) {
			local5++;
		}
		if (arg0.method800(Static247.anInt4704)) {
			local5++;
		}
		if (arg0.method800(Static90.anInt2163)) {
			local5++;
		}
		if (arg0.method800(Static165.anInt3381)) {
			local5++;
		}
		if (arg0.method800(Static399.anInt6607)) {
			local5++;
		}
		if (arg0.method800(Static249.anInt4739)) {
			local5++;
		}
		if (arg0.method800(Static19.anInt480)) {
			local5++;
		}
		if (arg0.method800(Static246.anInt4692)) {
			local5++;
		}
		if (arg0.method800(Static138.anInt2892)) {
			local5++;
		}
		if (arg0.method800(Static332.anInt5708)) {
			local5++;
		}
		if (arg0.method800(Static52.anInt1375)) {
			local5++;
		}
		if (arg0.method800(Static257.anInt4899)) {
			local5++;
		}
		return local5;
	}
}
