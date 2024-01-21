import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
	public static int anInt2522;

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "Lclient!cb;")
	public static Class2_Sub1_Sub3_Sub1 aClass2_Sub1_Sub3_Sub1_16;

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "Lclient!cb;")
	public static Class2_Sub1_Sub3_Sub1 aClass2_Sub1_Sub3_Sub1_17;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "Lclient!lc;")
	public static Class31 aClass31_869 = Static56.method1206("Enter name:");

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "Lclient!lc;")
	public static Class31 aClass31_870 = Static56.method1206("(Y");

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "[Lclient!m;")
	public static Class2_Sub1_Sub4_Sub6_Sub2[] aClass2_Sub1_Sub4_Sub6_Sub2Array1 = new Class2_Sub1_Sub4_Sub6_Sub2[16384];

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "[Lclient!lc;")
	public static Class31[] aClass31Array15 = new Class31[5];

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "Lclient!lc;")
	public static Class31 aClass31_871 = Static56.method1206("Loaded input handler");

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "Lclient!lc;")
	public static Class31 aClass31_872 = Static56.method1206(" more options");

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "Lclient!lc;")
	public static Class31 aClass31_873 = Static56.method1206("Last password change:*6n@gre@");

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
	public static void method1577() {
		aClass31_870 = null;
		aClass31Array15 = null;
		aClass31_871 = null;
		aClass2_Sub1_Sub3_Sub1_17 = null;
		aClass31_869 = null;
		aClass31_873 = null;
		aClass31_872 = null;
		aClass2_Sub1_Sub4_Sub6_Sub2Array1 = null;
		aClass2_Sub1_Sub3_Sub1_16 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLclient!kc;)V")
	public static void method1578(@OriginalArg(1) Class11 arg0) {
		Static70.aClass11_13 = arg0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	public static void method1579() {
		@Pc(9) int local9 = Static69.aClass2_Sub1_Sub3_Sub3_5.method961(Static13.aClass31_183);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static59.anInt2044; local11++) {
			local19 = Static69.aClass2_Sub1_Sub3_Sub3_5.method967(Static85.aClass31Array14[local11]);
			if (local19 > local9) {
				local9 = local19;
			}
		}
		local9 += 8;
		local19 = Static59.anInt2044 * 15 + 21;
		@Pc(80) int local80;
		@Pc(94) int local94;
		if (Static105.anInt2783 > 4 && Static15.anInt649 > 4 && Static105.anInt2783 < 516 && Static15.anInt649 < 338) {
			Static64.anInt601 = 0;
			Static15.anInt650 = local9;
			Static105.aBoolean154 = true;
			anInt2522 = Static59.anInt2044 * 15 + 22;
			local80 = Static105.anInt2783 - local9 / 2 - 4;
			if (local80 + local9 > 512) {
				local80 = 512 - local9;
			}
			local94 = Static15.anInt649 - 4;
			if (local80 < 0) {
				local80 = 0;
			}
			if (local19 + local94 > 334) {
				local94 = 334 - local19;
			}
			Static25.anInt1109 = local80;
			if (local94 < 0) {
				local94 = 0;
			}
			Static100.anInt2717 = local94;
		}
		if (Static105.anInt2783 > 553 && Static15.anInt649 > 205 && Static105.anInt2783 < 743 && Static15.anInt649 < 466) {
			anInt2522 = Static59.anInt2044 * 15 + 22;
			Static64.anInt601 = 1;
			Static15.anInt650 = local9;
			Static105.aBoolean154 = true;
			local80 = Static105.anInt2783 - local9 / 2 - 553;
			if (local80 < 0) {
				local80 = 0;
			} else if (local80 + local9 > 190) {
				local80 = 190 - local9;
			}
			Static25.anInt1109 = local80;
			local94 = Static15.anInt649 - 205;
			if (local94 < 0) {
				local94 = 0;
			} else if (local19 + local94 > 261) {
				local94 = 261 - local19;
			}
			Static100.anInt2717 = local94;
		}
		if (Static105.anInt2783 <= 17 || Static15.anInt649 <= 357 || Static105.anInt2783 >= 496 || Static15.anInt649 >= 453) {
			return;
		}
		Static105.aBoolean154 = true;
		anInt2522 = Static59.anInt2044 * 15 + 22;
		Static15.anInt650 = local9;
		local80 = Static105.anInt2783 - local9 / 2 - 17;
		if (local80 < 0) {
			local80 = 0;
		} else if (local80 + local9 > 479) {
			local80 = 479 - local9;
		}
		Static64.anInt601 = 2;
		local94 = Static15.anInt649 - 357;
		Static25.anInt1109 = local80;
		if (local94 < 0) {
			local94 = 0;
		} else if (local19 + local94 > 96) {
			local94 = 96 - local19;
		}
		Static100.anInt2717 = local94;
	}
}
