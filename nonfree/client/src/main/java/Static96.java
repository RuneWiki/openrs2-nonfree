import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!qe", name = "qb", descriptor = "[I")
	public static int[] anIntArray182;

	@OriginalMember(owner = "client!qe", name = "wb", descriptor = "Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3 aClass3_Sub1_Sub5_Sub3_13;

	@OriginalMember(owner = "client!qe", name = "Ob", descriptor = "I")
	public static int anInt1443;

	@OriginalMember(owner = "client!qe", name = "Sb", descriptor = "I")
	public static int anInt1447;

	@OriginalMember(owner = "client!qe", name = "Zb", descriptor = "Lclient!cd;")
	public static Class14 aClass14_3;

	@OriginalMember(owner = "client!qe", name = "dc", descriptor = "[Lclient!nb;")
	public static Class3_Sub1_Sub5_Sub4[] aClass3_Sub1_Sub5_Sub4Array9;

	@OriginalMember(owner = "client!qe", name = "wc", descriptor = "I")
	public static int anInt1468;

	@OriginalMember(owner = "client!qe", name = "Cc", descriptor = "I")
	public static int anInt1474;

	@OriginalMember(owner = "client!qe", name = "lb", descriptor = "Lclient!na;")
	private static Class53 aClass53_660 = Static109.method1737("Walk here");

	@OriginalMember(owner = "client!qe", name = "zb", descriptor = "I")
	public static int anInt1429 = 0;

	@OriginalMember(owner = "client!qe", name = "Db", descriptor = "I")
	public static int anInt1433 = -1;

	@OriginalMember(owner = "client!qe", name = "Tb", descriptor = "I")
	public static int anInt1448 = 255;

	@OriginalMember(owner = "client!qe", name = "Ub", descriptor = "Lclient!na;")
	public static Class53 aClass53_661 = Static109.method1737("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AN>");

	@OriginalMember(owner = "client!qe", name = "ic", descriptor = "Lclient!na;")
	public static Class53 aClass53_663 = Static109.method1737("blinken3:");

	@OriginalMember(owner = "client!qe", name = "pc", descriptor = "Lclient!na;")
	public static Class53 aClass53_664 = Static109.method1737("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!qe", name = "rc", descriptor = "I")
	public static int anInt1464 = -1;

	@OriginalMember(owner = "client!qe", name = "sc", descriptor = "Lclient!na;")
	public static Class53 aClass53_665 = Static109.method1737("gr-Un:");

	@OriginalMember(owner = "client!qe", name = "zc", descriptor = "I")
	public static int anInt1471 = -1;

	@OriginalMember(owner = "client!qe", name = "Ec", descriptor = "Lclient!na;")
	public static Class53 aClass53_666 = aClass53_660;

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(II)Z")
	public static boolean method1030(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "(I)V")
	public static void method1033() {
		aClass53_664 = null;
		aClass53_661 = null;
		aClass3_Sub1_Sub5_Sub4Array9 = null;
		anIntArray182 = null;
		aClass53_663 = null;
		aClass53_665 = null;
		aClass3_Sub1_Sub5_Sub3_13 = null;
		aClass53_666 = null;
		aClass14_3 = null;
		aClass53_660 = null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!vb;B)V")
	public static void method1037(@OriginalArg(0) Class3_Sub1_Sub15 arg0) {
		@Pc(15) int local15 = arg0.anInt2712;
		@Pc(97) int local97;
		if (local15 >= 1 && local15 <= 100 || !(local15 < 701 || local15 > 800)) {
			if (Static44.anInt1256 == 0) {
				if (local15 == 1) {
					arg0.aClass53_1346 = Static50.aClass53_1383;
					arg0.anInt2682 = 0;
					return;
				}
				if (local15 == 2) {
					arg0.anInt2682 = 0;
					arg0.aClass53_1346 = Static118.aClass53_1369;
					return;
				}
			}
			if (Static44.anInt1256 == 1) {
				if (local15 == 1) {
					arg0.aClass53_1346 = Static95.aClass53_1093;
					arg0.anInt2682 = 0;
					return;
				}
				if (local15 == 2) {
					arg0.anInt2682 = 0;
					arg0.aClass53_1346 = Static118.aClass53_1377;
					return;
				}
				if (local15 == 3) {
					arg0.aClass53_1346 = Static86.aClass53_991;
					arg0.anInt2682 = 0;
					return;
				}
			}
			if (local15 <= 700) {
				local15--;
			} else {
				local15 -= 601;
			}
			local97 = Static68.anInt1724;
			if (Static44.anInt1256 != 2) {
				local97 = 0;
			}
			if (local97 <= local15) {
				arg0.anInt2682 = 0;
				arg0.aClass53_1346 = Static35.aClass53_476;
			} else {
				arg0.aClass53_1346 = Static52.aClass53Array11[local15];
				arg0.anInt2682 = 1;
			}
		} else if (local15 >= 101 && local15 <= 200 || local15 >= 801 && local15 <= 900) {
			if (local15 > 800) {
				local15 -= 701;
			} else {
				local15 -= 101;
			}
			local97 = Static68.anInt1724;
			if (Static44.anInt1256 != 2) {
				local97 = 0;
			}
			if (local15 >= local97) {
				arg0.aClass53_1346 = Static35.aClass53_476;
				arg0.anInt2682 = 0;
			} else {
				if (Static120.anIntArray405[local15] == 0) {
					arg0.aClass53_1346 = Static103.method1689(new Class53[] { Static120.aClass53_1386, Static21.aClass53_265 });
				} else if (Static120.anIntArray405[local15] >= 5000) {
					if (Static31.anInt1056 == Static120.anIntArray405[local15]) {
						arg0.aClass53_1346 = Static103.method1689(new Class53[] { Static105.aClass53_1211, Static44.aClass53_562, Static108.method1725(Static120.anIntArray405[local15] - 5000) });
					} else {
						arg0.aClass53_1346 = Static103.method1689(new Class53[] { Static66.aClass53_746, Static44.aClass53_562, Static108.method1725(Static120.anIntArray405[local15] - 5000) });
					}
				} else if (Static120.anIntArray405[local15] == Static31.anInt1056) {
					arg0.aClass53_1346 = Static103.method1689(new Class53[] { Static105.aClass53_1211, Static108.aClass53_1244, Static108.method1725(Static120.anIntArray405[local15]) });
				} else {
					arg0.aClass53_1346 = Static103.method1689(new Class53[] { Static66.aClass53_746, Static108.aClass53_1244, Static108.method1725(Static120.anIntArray405[local15]) });
				}
				arg0.anInt2682 = 1;
			}
		} else if (local15 == 203) {
			local97 = Static68.anInt1724;
			if (Static44.anInt1256 != 2) {
				local97 = 0;
			}
			arg0.anInt2669 = local97 * 15 + 20;
			if (arg0.anInt2669 <= arg0.anInt2703) {
				arg0.anInt2669 = arg0.anInt2703 + 1;
			}
		} else if (local15 >= 401 && local15 <= 500) {
			local15 -= 401;
			if (local15 == 0 && Static44.anInt1256 == 0) {
				arg0.anInt2682 = 0;
				arg0.aClass53_1346 = Static102.aClass53_1163;
			} else if (local15 == 1 && Static44.anInt1256 == 0) {
				arg0.aClass53_1346 = Static118.aClass53_1369;
				arg0.anInt2682 = 0;
			} else {
				local97 = Static23.anInt737;
				if (Static44.anInt1256 == 0) {
					local97 = 0;
				}
				if (local15 >= local97) {
					arg0.anInt2682 = 0;
					arg0.aClass53_1346 = Static35.aClass53_476;
				} else {
					arg0.aClass53_1346 = Static106.method1712(Static39.aLongArray4[local15]).method1263();
					arg0.anInt2682 = 1;
				}
			}
		} else if (local15 == 503) {
			arg0.anInt2669 = Static23.anInt737 * 15 + 20;
			if (arg0.anInt2703 >= arg0.anInt2669) {
				arg0.anInt2669 = arg0.anInt2703 + 1;
			}
		} else if (local15 == 324) {
			if (Static124.anInt2887 == -1) {
				Static104.anInt2534 = arg0.anInt2664;
				Static124.anInt2887 = arg0.anInt2675;
			}
			if (Static81.aClass34_2.aBoolean45) {
				arg0.anInt2675 = Static124.anInt2887;
			} else {
				arg0.anInt2675 = Static104.anInt2534;
			}
		} else if (local15 == 325) {
			if (Static124.anInt2887 == -1) {
				Static124.anInt2887 = arg0.anInt2675;
				Static104.anInt2534 = arg0.anInt2664;
			}
			if (Static81.aClass34_2.aBoolean45) {
				arg0.anInt2675 = Static104.anInt2534;
			} else {
				arg0.anInt2675 = Static124.anInt2887;
			}
		} else if (local15 == 327) {
			arg0.anInt2723 = 150;
			arg0.anInt2717 = (int) (Math.sin((double) Static27.anInt843 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt2700 = 5;
			arg0.anInt2721 = 0;
		} else if (local15 == 328) {
			arg0.anInt2723 = 150;
			arg0.anInt2717 = (int) (Math.sin((double) Static27.anInt843 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt2721 = 1;
			arg0.anInt2700 = 5;
		} else if (local15 == 600) {
			arg0.aClass53_1346 = Static103.method1689(new Class53[] { Static35.aClass53_473, Static35.aClass53_465 });
		} else if (local15 == 620) {
			if (Static105.anInt2436 < 1) {
				arg0.aClass53_1346 = Static35.aClass53_476;
			} else if (Static101.aBoolean100) {
				arg0.anInt2672 = 16711680;
				arg0.aClass53_1346 = Static75.aClass53_834;
			} else {
				arg0.aClass53_1346 = Static29.aClass53_390;
				arg0.anInt2672 = 16777215;
			}
		}
	}
}
