import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!qb", name = "z", descriptor = "Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1 aClass2_Sub2_Sub1_Sub1_51;

	@OriginalMember(owner = "client!qb", name = "E", descriptor = "[I")
	public static int[] anIntArray414;

	@OriginalMember(owner = "client!qb", name = "R", descriptor = "Lclient!re;")
	public static Class9 aClass9_58;

	@OriginalMember(owner = "client!qb", name = "v", descriptor = "Lclient!u;")
	public static Class74 aClass74_1721 = Static72.method1077("Aus");

	@OriginalMember(owner = "client!qb", name = "U", descriptor = "Lclient!u;")
	public static Class74 aClass74_1736 = Static72.method1077("");

	@OriginalMember(owner = "client!qb", name = "w", descriptor = "Lclient!u;")
	public static Class74 aClass74_1722 = aClass74_1736;

	@OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
	public static int anInt2889 = 0;

	@OriginalMember(owner = "client!qb", name = "O", descriptor = "Lclient!u;")
	private static Class74 aClass74_1734 = Static72.method1077("No matching objects found)1 please shorten search");

	@OriginalMember(owner = "client!qb", name = "y", descriptor = "Lclient!u;")
	public static Class74 aClass74_1723 = aClass74_1734;

	@OriginalMember(owner = "client!qb", name = "A", descriptor = "Lclient!u;")
	public static Class74 aClass74_1724 = aClass74_1736;

	@OriginalMember(owner = "client!qb", name = "B", descriptor = "Lclient!u;")
	public static Class74 aClass74_1725 = aClass74_1736;

	@OriginalMember(owner = "client!qb", name = "C", descriptor = "Lclient!u;")
	public static Class74 aClass74_1726 = aClass74_1736;

	@OriginalMember(owner = "client!qb", name = "D", descriptor = "Lclient!u;")
	public static Class74 aClass74_1727 = aClass74_1736;

	@OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
	public static int anInt2891 = 0;

	@OriginalMember(owner = "client!qb", name = "H", descriptor = "Lclient!u;")
	public static Class74 aClass74_1728 = Static72.method1077("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!qb", name = "I", descriptor = "Lclient!u;")
	public static Class74 aClass74_1729 = Static72.method1077("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!qb", name = "K", descriptor = "Lclient!u;")
	public static Class74 aClass74_1730 = Static72.method1077(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!qb", name = "L", descriptor = "Lclient!u;")
	public static Class74 aClass74_1731 = Static72.method1077("Freunde");

	@OriginalMember(owner = "client!qb", name = "M", descriptor = "Lclient!u;")
	public static Class74 aClass74_1732 = aClass74_1736;

	@OriginalMember(owner = "client!qb", name = "N", descriptor = "Lclient!u;")
	public static Class74 aClass74_1733 = aClass74_1736;

	@OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
	public static final int anInt2893 = 2301979;

	@OriginalMember(owner = "client!qb", name = "S", descriptor = "Lclient!u;")
	public static Class74 aClass74_1735 = Static72.method1077("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
	public static int anInt2894 = 0;

	@OriginalMember(owner = "client!qb", name = "W", descriptor = "Lclient!u;")
	public static Class74 aClass74_1737 = aClass74_1736;

	@OriginalMember(owner = "client!qb", name = "X", descriptor = "Lclient!u;")
	public static Class74 aClass74_1738 = Static72.method1077("Lade)3)3)3");

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
	public static void method1936() {
		aClass74_1728 = null;
		aClass2_Sub2_Sub1_Sub1_51 = null;
		aClass74_1732 = null;
		aClass74_1735 = null;
		aClass74_1734 = null;
		aClass74_1724 = null;
		anIntArray414 = null;
		aClass74_1725 = null;
		aClass74_1723 = null;
		aClass74_1730 = null;
		aClass9_58 = null;
		aClass74_1722 = null;
		aClass74_1733 = null;
		aClass74_1726 = null;
		aClass74_1731 = null;
		aClass74_1736 = null;
		aClass74_1737 = null;
		aClass74_1729 = null;
		aClass74_1727 = null;
		aClass74_1738 = null;
		aClass74_1721 = null;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBI[Lclient!ha;[I[I)V")
	public static void method1937(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class32[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(10) int local10 = (arg0 + arg1) / 2;
		@Pc(14) int local14 = arg0 + 1;
		@Pc(18) int local18 = arg1 - 1;
		@Pc(22) Class32 local22 = arg2[local10];
		arg2[local10] = arg2[arg1];
		arg2[arg1] = local22;
		while (local18 < local14) {
			@Pc(36) boolean local36 = true;
			@Pc(39) int local39;
			@Pc(74) int local74;
			@Pc(56) int local56;
			do {
				local14--;
				for (local39 = 0; local39 < 4; local39++) {
					if (arg3[local39] == 2) {
						local74 = arg2[local14].anInt990;
						local56 = local22.anInt990;
					} else if (arg3[local39] == 1) {
						local56 = local22.anInt986;
						if (local56 == -1 && arg4[local39] == 1) {
							local56 = 2001;
						}
						local74 = arg2[local14].anInt986;
						if (local74 == -1 && arg4[local39] == 1) {
							local74 = 2001;
						}
					} else if (arg3[local39] == 3) {
						local56 = local22.aBoolean38 ? 1 : 0;
						local74 = arg2[local14].aBoolean38 ? 1 : 0;
					} else {
						local74 = arg2[local14].anInt988;
						local56 = local22.anInt988;
					}
					if (local74 != local56) {
						if ((arg4[local39] != 1 || local74 <= local56) && (arg4[local39] != 0 || local74 >= local56)) {
							local36 = false;
						}
						break;
					}
					if (local39 == 3) {
						local36 = false;
					}
				}
			} while (local36);
			local36 = true;
			do {
				local18++;
				for (local39 = 0; local39 < 4; local39++) {
					if (arg3[local39] == 2) {
						local74 = arg2[local18].anInt990;
						local56 = local22.anInt990;
					} else if (arg3[local39] == 1) {
						local56 = local22.anInt986;
						if (local56 == -1 && arg4[local39] == 1) {
							local56 = 2001;
						}
						local74 = arg2[local18].anInt986;
						if (local74 == -1 && arg4[local39] == 1) {
							local74 = 2001;
						}
					} else if (arg3[local39] == 3) {
						local56 = local22.aBoolean38 ? 1 : 0;
						local74 = arg2[local18].aBoolean38 ? 1 : 0;
					} else {
						local74 = arg2[local18].anInt988;
						local56 = local22.anInt988;
					}
					if (local74 != local56) {
						if ((arg4[local39] != 1 || local74 >= local56) && (arg4[local39] != 0 || local56 >= local74)) {
							local36 = false;
						}
						break;
					}
					if (local39 == 3) {
						local36 = false;
					}
				}
			} while (local36);
			if (local14 > local18) {
				@Pc(322) Class32 local322 = arg2[local18];
				arg2[local18] = arg2[local14];
				arg2[local14] = local322;
			}
		}
		method1937(local14, arg1, arg2, arg3, arg4);
		method1937(arg0, local14 + 1, arg2, arg3, arg4);
	}
}
