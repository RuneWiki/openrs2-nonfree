import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "Lclient!ce;")
	public static Class13 aClass13_1;

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
	public static int anInt318;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Lclient!wb;")
	public static Class65 aClass65_159 = Static24.method441(" )2> @yel@");

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "Lclient!wb;")
	private static Class65 aClass65_162 = Static24.method441("Please remove ");

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "Lclient!wb;")
	public static Class65 aClass65_160 = aClass65_162;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "Z")
	public static boolean aBoolean25 = false;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "Lclient!wb;")
	public static Class65 aClass65_161 = Static24.method441("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
	public static int anInt314 = 0;

	@OriginalMember(owner = "client!bc", name = "A", descriptor = "Lclient!wb;")
	private static Class65 aClass65_166 = Static24.method441("Loaded title screen");

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "Lclient!wb;")
	public static Class65 aClass65_163 = aClass65_166;

	@OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
	public static int anInt319 = 0;

	@OriginalMember(owner = "client!bc", name = "u", descriptor = "Lclient!wb;")
	public static Class65 aClass65_164 = aClass65_162;

	@OriginalMember(owner = "client!bc", name = "x", descriptor = "Lclient!wb;")
	public static Class65 aClass65_165 = Static24.method441("gr-Un:");

	@OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
	public static int anInt321 = 0;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public static void method160() {
		Static39.anInt1251 = 0;
		Static12.anInt416 = 0;
		Static99.method1567();
		Static97.method1659();
		Static35.method728();
		Static59.method1070();
		@Pc(27) int local27;
		for (@Pc(21) int local21 = 0; local21 < Static12.anInt416; local21++) {
			local27 = Static68.anIntArray276[local21];
			if (Static108.anInt2902 != Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local27].anInt1544) {
				Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local27] = null;
			}
		}
		if (Static57.anInt1718 != Static59.aClass2_Sub8_Sub1_19.anInt2342) {
			throw new RuntimeException("gpp1 pos:" + Static59.aClass2_Sub8_Sub1_19.anInt2342 + " psize:" + Static57.anInt1718);
		}
		for (local27 = 0; local27 < Static54.anInt1640; local27++) {
			if (Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[Static24.anIntArray99[local27]] == null) {
				throw new RuntimeException("gpp2 pos:" + local27 + " size:" + Static54.anInt1640);
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
	public static void method161() {
		aClass65_164 = null;
		aClass65_165 = null;
		aClass65_159 = null;
		aClass13_1 = null;
		aClass65_160 = null;
		aClass65_163 = null;
		aClass65_161 = null;
		aClass65_166 = null;
		aClass65_162 = null;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
	public static void method166() {
		for (@Pc(11) Class2_Sub12 local11 = (Class2_Sub12) Static13.aClass52_3.method1587(); local11 != null; local11 = (Class2_Sub12) Static13.aClass52_3.method1588()) {
			if (local11.anInt1690 == -1) {
				local11.anInt1700 = 0;
				Static33.method1408(local11);
			} else {
				local11.method1794();
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)V")
	public static void method168() {
		Static21.aClass21_32.method743();
	}
}
