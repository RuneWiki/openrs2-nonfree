import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!pc", name = "Vc", descriptor = "Lclient!r;")
	public static Class5_Sub2_Sub6_Sub3 aClass5_Sub2_Sub6_Sub3_3;

	@OriginalMember(owner = "client!pc", name = "dd", descriptor = "Lclient!sd;")
	public static Class29 aClass29_57;

	@OriginalMember(owner = "client!pc", name = "Wc", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1017 = Static63.method1251("backbase1");

	@OriginalMember(owner = "client!pc", name = "Xc", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1018 = Static63.method1251("Null");

	@OriginalMember(owner = "client!pc", name = "Yc", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1019 = Static63.method1251("Loaded update list");

	@OriginalMember(owner = "client!pc", name = "bd", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1021 = Static63.method1251("glow2:");

	@OriginalMember(owner = "client!pc", name = "Zc", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1020 = aClass45_1021;

	@OriginalMember(owner = "client!pc", name = "ad", descriptor = "I")
	public static int anInt2444 = 0;

	@OriginalMember(owner = "client!pc", name = "gd", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1022 = aClass45_1019;

	@OriginalMember(owner = "client!pc", name = "hd", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1023 = Static63.method1251("Name des Gegenstands eingeben:");

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "(Z)V")
	public static void method1625() {
		aClass45_1021 = null;
		aClass45_1023 = null;
		aClass45_1018 = null;
		aClass5_Sub2_Sub6_Sub3_3 = null;
		aClass45_1019 = null;
		aClass45_1020 = null;
		aClass45_1017 = null;
		aClass45_1022 = null;
		aClass29_57 = null;
	}

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "(Z)V")
	public static void method1626() {
		Static103.aBoolean122 = true;
		Static43.aBoolean57 = true;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!ia;I)Z")
	public static boolean method1627(@OriginalArg(0) Class5_Sub2_Sub8 arg0) {
		if (arg0.anIntArray211 == null) {
			return false;
		}
		for (@Pc(20) int local20 = 0; local20 < arg0.anIntArray211.length; local20++) {
			@Pc(27) int local27 = Static93.method1728(arg0, local20);
			@Pc(32) int local32 = arg0.anIntArray206[local20];
			if (arg0.anIntArray211[local20] == 2) {
				if (local27 >= local32) {
					return false;
				}
			} else if (arg0.anIntArray211[local20] == 3) {
				if (local27 <= local32) {
					return false;
				}
			} else if (arg0.anIntArray211[local20] == 4) {
				if (local32 == local27) {
					return false;
				}
			} else if (local32 != local27) {
				return false;
			}
		}
		return true;
	}
}
