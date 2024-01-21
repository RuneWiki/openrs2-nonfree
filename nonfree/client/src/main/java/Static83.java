import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!q", name = "Jb", descriptor = "[Lclient!uc;")
	public static Class2_Sub1_Sub4_Sub3[] aClass2_Sub1_Sub4_Sub3Array4;

	@OriginalMember(owner = "client!q", name = "Qb", descriptor = "[I")
	public static int[] anIntArray297;

	@OriginalMember(owner = "client!q", name = "Vb", descriptor = "[I")
	public static int[] anIntArray298;

	@OriginalMember(owner = "client!q", name = "Gb", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1032 = Static2.method66("Loading wordpack )2 ");

	@OriginalMember(owner = "client!q", name = "qb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1025 = aClass39_1032;

	@OriginalMember(owner = "client!q", name = "Db", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1030 = Static2.method66("Could not complete login)3");

	@OriginalMember(owner = "client!q", name = "sb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1026 = aClass39_1030;

	@OriginalMember(owner = "client!q", name = "ub", descriptor = "I")
	public static int anInt2261 = 0;

	@OriginalMember(owner = "client!q", name = "vb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1027 = Static2.method66("Stufe)2");

	@OriginalMember(owner = "client!q", name = "Cb", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1029 = Static2.method66("Classic");

	@OriginalMember(owner = "client!q", name = "Ab", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1028 = aClass39_1029;

	@OriginalMember(owner = "client!q", name = "Bb", descriptor = "[I")
	public static int[] anIntArray296 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!q", name = "Ob", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1035 = Static2.method66("Your account is already logged in)3");

	@OriginalMember(owner = "client!q", name = "Eb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1031 = aClass39_1035;

	@OriginalMember(owner = "client!q", name = "Hb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1033 = Static2.method66("0(U");

	@OriginalMember(owner = "client!q", name = "Kb", descriptor = "I")
	public static int anInt2268 = 0;

	@OriginalMember(owner = "client!q", name = "Mb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1034 = Static2.method66("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!q", name = "Tb", descriptor = "I")
	public static int anInt2274 = 99;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V")
	public static void method1610() {
		aClass39_1029 = null;
		anIntArray298 = null;
		aClass39_1033 = null;
		aClass39_1034 = null;
		aClass39_1028 = null;
		aClass39_1031 = null;
		anIntArray296 = null;
		aClass39_1032 = null;
		aClass39_1035 = null;
		aClass39_1027 = null;
		aClass39_1026 = null;
		anIntArray297 = null;
		aClass2_Sub1_Sub4_Sub3Array4 = null;
		aClass39_1030 = null;
		aClass39_1025 = null;
	}

	@OriginalMember(owner = "client!q", name = "i", descriptor = "(I)V")
	public static void method1611() {
		@Pc(5) int local5 = Static55.anInt1553 * 128 + 64;
		@Pc(15) int local15 = Static50.anInt1407 * 128 + 64;
		@Pc(24) int local24 = Static51.method1779(local15, local5, Static18.anInt560) - Static89.anInt2357;
		if (local24 > Static5.anInt100) {
			Static5.anInt100 += Static31.anInt1763 + (local24 - Static5.anInt100) * Static12.anInt313 / 1000;
			if (local24 < Static5.anInt100) {
				Static5.anInt100 = local24;
			}
		}
		if (local24 < Static5.anInt100) {
			Static5.anInt100 -= Static12.anInt313 * (Static5.anInt100 - local24) / 1000 + Static31.anInt1763;
			if (Static5.anInt100 < local24) {
				Static5.anInt100 = local24;
			}
		}
		if (local15 > Static41.anInt1188) {
			Static41.anInt1188 += Static12.anInt313 * (local15 - Static41.anInt1188) / 1000 + Static31.anInt1763;
			if (local15 < Static41.anInt1188) {
				Static41.anInt1188 = local15;
			}
		}
		if (local5 > Static88.anInt1136) {
			Static88.anInt1136 += Static31.anInt1763 + Static12.anInt313 * (local5 - Static88.anInt1136) / 1000;
			if (Static88.anInt1136 > local5) {
				Static88.anInt1136 = local5;
			}
		}
		if (local15 < Static41.anInt1188) {
			Static41.anInt1188 -= Static31.anInt1763 + (Static41.anInt1188 - local15) * Static12.anInt313 / 1000;
			if (local15 > Static41.anInt1188) {
				Static41.anInt1188 = local15;
			}
		}
		if (Static88.anInt1136 > local5) {
			Static88.anInt1136 -= (Static88.anInt1136 - local5) * Static12.anInt313 / 1000 + Static31.anInt1763;
			if (Static88.anInt1136 < local5) {
				Static88.anInt1136 = local5;
			}
		}
		local15 = Static40.anInt1173 * 128 + 64;
		local5 = Static58.anInt1679 * 128 + 64;
		local24 = Static51.method1779(local15, local5, Static18.anInt560) - Static24.anInt658;
		@Pc(214) int local214 = local15 - Static41.anInt1188;
		@Pc(218) int local218 = local24 - Static5.anInt100;
		@Pc(223) int local223 = local5 - Static88.anInt1136;
		@Pc(234) int local234 = (int) Math.sqrt((double) (local214 * local214 + local223 * local223));
		@Pc(245) int local245 = (int) (Math.atan2((double) local218, (double) local234) * 325.949D) & 0x7FF;
		if (local245 < 128) {
			local245 = 128;
		}
		if (local245 > 383) {
			local245 = 383;
		}
		@Pc(270) int local270 = (int) (-325.949D * Math.atan2((double) local223, (double) local214)) & 0x7FF;
		@Pc(275) int local275 = local270 - Static41.anInt1190;
		if (Static64.anInt1897 < local245) {
			Static64.anInt1897 += (local245 - Static64.anInt1897) * Static46.anInt1243 / 1000 + Static55.anInt1567;
			if (Static64.anInt1897 > local245) {
				Static64.anInt1897 = local245;
			}
		}
		if (local245 < Static64.anInt1897) {
			Static64.anInt1897 -= Static55.anInt1567 + Static46.anInt1243 * (Static64.anInt1897 - local245) / 1000;
			if (Static64.anInt1897 < local245) {
				Static64.anInt1897 = local245;
			}
		}
		if (local275 > 1024) {
			local275 -= 2048;
		}
		if (local275 < -1024) {
			local275 += 2048;
		}
		if (local275 > 0) {
			Static41.anInt1190 += Static46.anInt1243 * local275 / 1000 + Static55.anInt1567;
			Static41.anInt1190 &= 0x7FF;
		}
		if (local275 < 0) {
			Static41.anInt1190 -= Static46.anInt1243 * -local275 / 1000 + Static55.anInt1567;
			Static41.anInt1190 &= 0x7FF;
		}
		@Pc(384) int local384 = local270 - Static41.anInt1190;
		if (local384 > 1024) {
			local384 -= 2048;
		}
		if (local384 < -1024) {
			local384 += 2048;
		}
		if (local384 < 0 && local275 > 0 || local384 > 0 && local275 < 0) {
			Static41.anInt1190 = local270;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Z[BIII)V")
	public static void method1612(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static78.aClass11_1 == null) {
			return;
		}
		if (Static30.anInt844 >= 0) {
			Static90.anInt2384 = arg2;
			if (Static30.anInt844 == 0) {
				Static10.anInt248 = 1;
			} else {
				@Pc(37) int local37 = Static94.method1793(Static30.anInt844);
				@Pc(41) int local41 = local37 - Static50.anInt1408;
				Static10.anInt248 = (local41 + 3600) / arg2;
				if (Static10.anInt248 < 1) {
					Static10.anInt248 = 1;
				}
			}
			Static21.anInt2668 = arg3;
			Static101.aBoolean126 = arg0;
			Static51.aByteArray22 = arg1;
		} else if (Static10.anInt248 == 0) {
			Static57.method1149(arg3, arg0, arg1);
		} else {
			Static51.aByteArray22 = arg1;
			Static21.anInt2668 = arg3;
			Static101.aBoolean126 = arg0;
		}
	}
}
