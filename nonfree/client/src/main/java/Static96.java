import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!q", name = "Ab", descriptor = "Lclient!mf;")
	public static Class56_Sub1 aClass56_Sub1_19;

	@OriginalMember(owner = "client!q", name = "oc", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1377 = Static78.method1313("Add friend");

	@OriginalMember(owner = "client!q", name = "bb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1373 = aClass25_1377;

	@OriginalMember(owner = "client!q", name = "kb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1374 = Static78.method1313("b12_full");

	@OriginalMember(owner = "client!q", name = "sb", descriptor = "I")
	public static int anInt2797 = 0;

	@OriginalMember(owner = "client!q", name = "zb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1375 = Static78.method1313("chatback");

	@OriginalMember(owner = "client!q", name = "Db", descriptor = "Z")
	public static boolean aBoolean125 = false;

	@OriginalMember(owner = "client!q", name = "Ub", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1376 = Static78.method1313(":chalreq:");

	@OriginalMember(owner = "client!q", name = "jc", descriptor = "I")
	public static int anInt2830 = 0;

	@OriginalMember(owner = "client!q", name = "tc", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1378 = Static78.method1313("titlebutton");

	@OriginalMember(owner = "client!q", name = "e", descriptor = "(I)V")
	public static void method1972() {
		aClass25_1376 = null;
		aClass25_1374 = null;
		aClass25_1375 = null;
		aClass25_1377 = null;
		aClass25_1373 = null;
		aClass25_1378 = null;
		aClass56_Sub1_19 = null;
	}

	@OriginalMember(owner = "client!q", name = "f", descriptor = "(I)I")
	public static int method1975() {
		return 19;
	}

	@OriginalMember(owner = "client!q", name = "f", descriptor = "(B)V")
	public static void method1976() {
		@Pc(21) int local21;
		for (@Pc(12) int local12 = -1; local12 < anInt2797; local12++) {
			if (local12 == -1) {
				local21 = 2047;
			} else {
				local21 = Static28.anIntArray150[local12];
			}
			@Pc(29) Class1_Sub2_Sub3_Sub4_Sub2 local29 = Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[local21];
			if (local29 != null && local29.anInt2783 > 0) {
				local29.anInt2783--;
				if (local29.anInt2783 == 0) {
					local29.aClass25_1379 = null;
				}
			}
		}
		for (local21 = 0; local21 < Static13.anInt383; local21++) {
			@Pc(65) int local65 = Static106.anIntArray423[local21];
			@Pc(69) Class1_Sub2_Sub3_Sub4_Sub1 local69 = Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[local65];
			if (local69 != null && local69.anInt2783 > 0) {
				local69.anInt2783--;
				if (local69.anInt2783 == 0) {
					local69.aClass25_1379 = null;
				}
			}
		}
	}
}
