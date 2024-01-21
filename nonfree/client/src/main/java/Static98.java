import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!r", name = "B", descriptor = "Lclient!v;")
	public static Class76 aClass76_1039 = Static134.method2017("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!r", name = "H", descriptor = "I")
	public static volatile int anInt2267 = -1;

	@OriginalMember(owner = "client!r", name = "I", descriptor = "Lclient!v;")
	public static Class76 aClass76_1040 = Static134.method2017("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!r", name = "J", descriptor = "Lclient!v;")
	private static Class76 aClass76_1041 = Static134.method2017("Error loading your profile)3");

	@OriginalMember(owner = "client!r", name = "K", descriptor = "Lclient!v;")
	public static Class76 aClass76_1042 = aClass76_1041;

	@OriginalMember(owner = "client!r", name = "M", descriptor = "[I")
	public static int[] anIntArray319 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!r", name = "U", descriptor = "Lclient!v;")
	public static Class76 aClass76_1043 = Static134.method2017("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!r", name = "V", descriptor = "I")
	public static int anInt2275 = 0;

	@OriginalMember(owner = "client!r", name = "X", descriptor = "Lclient!v;")
	public static Class76 aClass76_1044 = Static134.method2017("scrollbar");

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BII)V")
	public static void method1570(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class78 local7 = Static124.aClass78ArrayArrayArray1[Static124.anInt2712][arg0][arg1];
		if (local7 == null) {
			Static54.aClass81_10.method1996(Static124.anInt2712, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class4_Sub4_Sub3_Sub3 local23 = null;
		@Pc(30) Class4_Sub4_Sub3_Sub3 local30;
		for (local30 = (Class4_Sub4_Sub3_Sub3) local7.method1916(); local30 != null; local30 = (Class4_Sub4_Sub3_Sub3) local7.method1920()) {
			@Pc(39) Class4_Sub4_Sub7 local39 = Static61.method1040(local30.anInt1200);
			@Pc(42) int local42 = local39.anInt1291;
			if (local39.anInt1270 == 1) {
				local42 *= local30.anInt1202 + 1;
			}
			if (local42 > local21) {
				local21 = local42;
				local23 = local30;
			}
		}
		if (local23 == null) {
			Static54.aClass81_10.method1996(Static124.anInt2712, arg0, arg1);
			return;
		}
		local7.method1915(local23);
		local30 = (Class4_Sub4_Sub3_Sub3) local7.method1916();
		@Pc(94) Class4_Sub4_Sub3_Sub3 local94 = null;
		@Pc(102) int local102 = (arg1 << 7) + (arg0 + 1610612736);
		@Pc(104) Class4_Sub4_Sub3_Sub3 local104 = null;
		while (local30 != null) {
			if (local30.anInt1200 != local23.anInt1200) {
				if (local94 == null) {
					local94 = local30;
				}
				if (local94.anInt1200 != local30.anInt1200 && local104 == null) {
					local104 = local30;
				}
			}
			local30 = (Class4_Sub4_Sub3_Sub3) local7.method1920();
		}
		Static54.aClass81_10.method1988(Static124.anInt2712, arg0, arg1, Static67.method1133(Static124.anInt2712, arg0 * 128 + 64, arg1 * 128 + 64), local23, local102, local94, local104);
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IIII)I")
	public static int method1571(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(B)Lclient!ie;")
	public static Class4_Sub4_Sub5_Sub2 method1573() {
		@Pc(9) Class4_Sub4_Sub5_Sub2 local9 = new Class4_Sub4_Sub5_Sub2();
		local9.anInt1333 = Static55.anInt1464;
		local9.anInt1330 = Static34.anIntArray107[0];
		@Pc(21) byte[] local21 = Static38.aByteArrayArray3[0];
		local9.anInt1331 = Static102.anIntArray321[0];
		local9.anInt1332 = Static25.anIntArray80[0];
		local9.anInt1329 = Static31.anIntArray96[0];
		@Pc(42) int local42 = local9.anInt1330 * local9.anInt1332;
		local9.anInt1334 = Static18.anInt350;
		local9.anIntArray166 = new int[local42];
		for (@Pc(56) int local56 = 0; local56 < local42; local56++) {
			local9.anIntArray166[local56] = Static49.anIntArray159[local21[local56] & 0xFF];
		}
		Static57.method1000();
		return local9;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
	public static void method1575(@OriginalArg(0) int arg0) {
		Static127.method1918();
		Static57.method992();
		@Pc(19) int local19 = Static38.method735(arg0).anInt716;
		if (local19 == 0) {
			return;
		}
		@Pc(29) int local29 = Static124.anIntArray393[arg0];
		if (local19 == 1) {
			if (local29 == 1) {
				Static37.method719(0.9D);
				((Class29) Static37.anInterface1_1).method781(0.9D);
			}
			if (local29 == 2) {
				Static37.method719(0.8D);
				((Class29) Static37.anInterface1_1).method781(0.8D);
			}
			if (local29 == 3) {
				Static37.method719(0.7D);
				((Class29) Static37.anInterface1_1).method781(0.7D);
			}
			if (local29 == 4) {
				Static37.method719(0.6D);
				((Class29) Static37.anInterface1_1).method781(0.6D);
			}
			Static97.method1561();
		}
		if (local19 == 3) {
			@Pc(89) short local89 = 0;
			if (local29 == 0) {
				local89 = 255;
			}
			if (local29 == 1) {
				local89 = 192;
			}
			if (local29 == 2) {
				local89 = 128;
			}
			if (local29 == 3) {
				local89 = 64;
			}
			if (local29 == 4) {
				local89 = 0;
			}
			if (Static32.anInt808 != local89) {
				if (Static32.anInt808 == 0 && Static118.anInt2556 != -1) {
					Static99.method1943(Static118.anInt2556, local89, 0, Static50.aClass17_Sub1_12);
					Static18.aBoolean22 = false;
				} else if (local89 == 0) {
					Static84.method1425();
					Static18.aBoolean22 = false;
				} else {
					Static84.method1423(local89);
				}
				Static32.anInt808 = local89;
			}
		}
		if (local19 == 5) {
			Static8.anInt167 = local29;
		}
		if (local19 == 4) {
			if (local29 == 0) {
				Static45.anInt1205 = 127;
			}
			if (local29 == 1) {
				Static45.anInt1205 = 96;
			}
			if (local29 == 2) {
				Static45.anInt1205 = 64;
			}
			if (local29 == 3) {
				Static45.anInt1205 = 32;
			}
			if (local29 == 4) {
				Static45.anInt1205 = 0;
			}
		}
		if (local19 == 10) {
			if (local29 == 0) {
				Static36.anInt1021 = 127;
			}
			if (local29 == 1) {
				Static36.anInt1021 = 96;
			}
			if (local29 == 2) {
				Static36.anInt1021 = 64;
			}
			if (local29 == 3) {
				Static36.anInt1021 = 32;
			}
			if (local29 == 4) {
				Static36.anInt1021 = 0;
			}
		}
		if (local19 == 9) {
			Static105.anInt2348 = local29;
		}
		if (local19 == 6) {
			Static81.anInt2010 = local29;
		}
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V")
	public static void method1576() {
		aClass76_1043 = null;
		aClass76_1041 = null;
		aClass76_1044 = null;
		anIntArray319 = null;
		aClass76_1039 = null;
		aClass76_1040 = null;
		aClass76_1042 = null;
	}
}
