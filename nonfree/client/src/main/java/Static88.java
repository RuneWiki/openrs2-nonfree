import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!of", name = "m", descriptor = "I")
	public static int anInt2447;

	@OriginalMember(owner = "client!of", name = "n", descriptor = "I")
	public static int anInt2448;

	@OriginalMember(owner = "client!of", name = "i", descriptor = "Lclient!he;")
	private static Class26 aClass26_1272 = Static6.method100("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!of", name = "b", descriptor = "Lclient!he;")
	public static Class26 aClass26_1269 = aClass26_1272;

	@OriginalMember(owner = "client!of", name = "c", descriptor = "Lclient!he;")
	private static Class26 aClass26_1270 = Static6.method100(" seconds)3");

	@OriginalMember(owner = "client!of", name = "h", descriptor = "Lclient!he;")
	public static Class26 aClass26_1271 = Static6.method100("Benutzername: ");

	@OriginalMember(owner = "client!of", name = "j", descriptor = "Lclient!he;")
	public static Class26 aClass26_1273 = aClass26_1270;

	@OriginalMember(owner = "client!of", name = "q", descriptor = "Lclient!he;")
	private static Class26 aClass26_1277 = Static6.method100("Location");

	@OriginalMember(owner = "client!of", name = "k", descriptor = "Lclient!he;")
	public static Class26 aClass26_1274 = aClass26_1277;

	@OriginalMember(owner = "client!of", name = "o", descriptor = "Lclient!he;")
	private static Class26 aClass26_1276 = Static6.method100("Please remove ");

	@OriginalMember(owner = "client!of", name = "l", descriptor = "Lclient!he;")
	public static Class26 aClass26_1275 = aClass26_1276;

	@OriginalMember(owner = "client!of", name = "r", descriptor = "Lclient!he;")
	public static Class26 aClass26_1278 = aClass26_1276;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!nc;)Z")
	public static boolean method1628(@OriginalArg(1) Class3_Sub14 arg0) {
		if (Static27.aBoolean56) {
			if (Static89.method1641(arg0) != 0) {
				return false;
			}
			if (arg0.anInt2204 == 0) {
				return false;
			}
		}
		return arg0.aBoolean118;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
	public static void method1629() {
		for (@Pc(3) int local3 = 0; local3 < Static8.anInt195; local3++) {
			@Pc(9) int local9 = Static40.anIntArray136[local3]--;
			if (Static40.anIntArray136[local3] >= -10) {
				@Pc(82) Class36 local82 = Static76.aClass36Array1[local3];
				if (local82 == null) {
					local82 = Static136.method1154(Static107.aClass16_Sub1_16, Static32.anIntArray106[local3], 0);
					if (local82 == null) {
						continue;
					}
					Static40.anIntArray136[local3] += local82.method1155();
					Static76.aClass36Array1[local3] = local82;
				}
				if (Static40.anIntArray136[local3] < 0) {
					@Pc(203) int local203;
					if (Static1.anIntArray1[local3] == 0) {
						local203 = Static29.anInt1009;
					} else {
						@Pc(122) int local122 = Static1.anIntArray1[local3] >> 16 & 0xFF;
						@Pc(132) int local132 = local122 * 128 + 64 - Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2733;
						@Pc(140) int local140 = (Static1.anIntArray1[local3] & 0xFF) * 128;
						if (local132 < 0) {
							local132 = -local132;
						}
						@Pc(153) int local153 = Static1.anIntArray1[local3] >> 8 & 0xFF;
						@Pc(163) int local163 = local153 * 128 + 64 - Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2731;
						if (local163 < 0) {
							local163 = -local163;
						}
						@Pc(178) int local178 = local132 + local163 - 128;
						if (local178 > local140) {
							Static40.anIntArray136[local3] = -100;
							continue;
						}
						if (local178 < 0) {
							local178 = 0;
						}
						local203 = (local140 - local178) * Static115.anInt3051 / local140;
					}
					if (local203 > 0) {
						@Pc(214) Class3_Sub5_Sub1 local214 = local82.method1157().method1371(Static12.aClass9_1);
						@Pc(219) Class3_Sub3_Sub3 local219 = Static139.method1840(local214, local203);
						local219.method1829(Static18.anIntArray54[local3] - 1);
						Static5.aClass3_Sub3_Sub2_63.method1072(local219);
					}
					Static40.anIntArray136[local3] = -100;
				}
			} else {
				Static8.anInt195--;
				for (@Pc(25) int local25 = local3; local25 < Static8.anInt195; local25++) {
					Static32.anIntArray106[local25] = Static32.anIntArray106[local25 + 1];
					Static76.aClass36Array1[local25] = Static76.aClass36Array1[local25 + 1];
					Static18.anIntArray54[local25] = Static18.anIntArray54[local25 + 1];
					Static40.anIntArray136[local25] = Static40.anIntArray136[local25 + 1];
					Static1.anIntArray1[local25] = Static1.anIntArray1[local25 + 1];
				}
				local3--;
			}
		}
		if (Static42.aBoolean70 && !Static7.method113()) {
			if (Static56.anInt1720 != 0 && Static4.anInt138 != -1) {
				Static113.method2067(Static56.anInt1720, Static89.aClass16_Sub1_12, 0, Static4.anInt138);
			}
			Static42.aBoolean70 = false;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
	public static void method1630() {
		Static58.anInt1778 = 0;
		Static19.anInt512 = 0;
		Static1.method6();
		Static6.method99();
		Static96.method1775();
		@Pc(30) int local30;
		for (@Pc(24) int local24 = 0; local24 < Static58.anInt1778; local24++) {
			local30 = Static96.anIntArray311[local24];
			if (Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1[local30].anInt2722 != Static4.anInt136) {
				Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1[local30].aClass3_Sub1_Sub3_1 = null;
				Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1[local30] = null;
			}
		}
		if (Static33.aClass3_Sub11_Sub1_2.anInt1562 != Static104.anInt2841) {
			throw new RuntimeException("gnp1 pos:" + Static33.aClass3_Sub11_Sub1_2.anInt1562 + " psize:" + Static104.anInt2841);
		}
		for (local30 = 0; local30 < Static133.anInt560; local30++) {
			if (Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1[Static48.anIntArray151[local30]] == null) {
				throw new RuntimeException("gnp2 pos:" + local30 + " size:" + Static133.anInt560);
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
	public static void method1631() {
		aClass26_1270 = null;
		aClass26_1277 = null;
		aClass26_1276 = null;
		aClass26_1275 = null;
		aClass26_1278 = null;
		aClass26_1269 = null;
		aClass26_1273 = null;
		aClass26_1272 = null;
		aClass26_1271 = null;
		aClass26_1274 = null;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B[BII)I")
	public static int method1632(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = -1;
		for (@Pc(14) int local14 = arg1; local14 < arg2; local14++) {
			local12 = Class46.anIntArray199[(arg0[local14] ^ local12) & 0xFF] ^ local12 >>> 8;
		}
		return ~local12;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
	public static void method1633() {
		try {
			if (Static70.anInt1540 == 1) {
				@Pc(10) int local10 = Static1.aClass3_Sub3_Sub1_1.method226();
				if (local10 > 0 && Static1.aClass3_Sub3_Sub1_1.method239()) {
					local10 -= Static33.anInt1080;
					if (local10 < 0) {
						local10 = 0;
					}
					Static1.aClass3_Sub3_Sub1_1.method232(local10);
					return;
				}
				Static1.aClass3_Sub3_Sub1_1.method230();
				Static1.aClass3_Sub3_Sub1_1.method215();
				Static3.aClass3_Sub19_1 = null;
				if (Static110.aClass16_136 == null) {
					Static70.anInt1540 = 0;
				} else {
					Static70.anInt1540 = 2;
				}
				Static33.aClass81_1 = null;
			}
		} catch (@Pc(57) Exception local57) {
			local57.printStackTrace();
			Static1.aClass3_Sub3_Sub1_1.method230();
			Static110.aClass16_136 = null;
			Static33.aClass81_1 = null;
			Static3.aClass3_Sub19_1 = null;
			Static70.anInt1540 = 0;
		}
	}
}
