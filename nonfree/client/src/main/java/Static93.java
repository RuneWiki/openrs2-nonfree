import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
	public static int anInt2429;

	@OriginalMember(owner = "client!rd", name = "P", descriptor = "J")
	public static long aLong77;

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1335 = Static75.method1216("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!rd", name = "t", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1336 = Static75.method1216("@cr1@");

	@OriginalMember(owner = "client!rd", name = "v", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1337 = Static75.method1216("*6n");

	@OriginalMember(owner = "client!rd", name = "B", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1338 = Static75.method1216("Username: ");

	@OriginalMember(owner = "client!rd", name = "G", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1339 = aClass4_1338;

	@OriginalMember(owner = "client!rd", name = "H", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1340 = Static75.method1216("backtop1");

	@OriginalMember(owner = "client!rd", name = "I", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1341 = aClass4_1335;

	@OriginalMember(owner = "client!rd", name = "N", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1342 = Static75.method1216("Menge eingeben:");

	@OriginalMember(owner = "client!rd", name = "O", descriptor = "I")
	public static int anInt2442 = 127;

	@OriginalMember(owner = "client!rd", name = "Q", descriptor = "I")
	public static int anInt2443 = 78;

	@OriginalMember(owner = "client!rd", name = "ab", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1343 = aClass4_1335;

	@OriginalMember(owner = "client!rd", name = "eb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1344 = Static75.method1216("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!uc;)V")
	public static void method1617(@OriginalArg(1) Class3_Sub1_Sub4_Sub3 arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static85.anIntArray260.length; local9++) {
			Static85.anIntArray260[local9] = 0;
		}
		@Pc(36) int local36;
		for (@Pc(26) int local26 = 0; local26 < 5000; local26++) {
			local36 = (int) (Math.random() * 128.0D * (double) 256);
			Static85.anIntArray260[local36] = (int) (Math.random() * 256.0D);
		}
		@Pc(53) int local53;
		@Pc(57) int local57;
		@Pc(66) int local66;
		for (local36 = 0; local36 < 20; local36++) {
			for (local53 = 1; local53 < 255; local53++) {
				for (local57 = 1; local57 < 127; local57++) {
					local66 = local57 + (local53 << 7);
					Static101.anIntArray311[local66] = (Static85.anIntArray260[local66 + 128] + Static85.anIntArray260[local66 - 128] + Static85.anIntArray260[local66 + 1] + Static85.anIntArray260[local66 + -1]) / 4;
				}
			}
			@Pc(108) int[] local108 = Static85.anIntArray260;
			Static85.anIntArray260 = Static101.anIntArray311;
			Static101.anIntArray311 = local108;
		}
		if (arg0 == null) {
			return;
		}
		local53 = 0;
		for (local57 = 0; local57 < arg0.anInt2606; local57++) {
			for (local66 = 0; local66 < arg0.anInt2604; local66++) {
				if (arg0.aByteArray22[local53++] != 0) {
					@Pc(146) int local146 = arg0.anInt2602 + local66 + 16;
					@Pc(154) int local154 = local57 + arg0.anInt2603 + 16;
					@Pc(161) int local161 = local146 + (local154 << 7);
					Static85.anIntArray260[local161] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
	public static void method1621() {
		aClass4_1335 = null;
		aClass4_1344 = null;
		aClass4_1342 = null;
		aClass4_1338 = null;
		aClass4_1336 = null;
		aClass4_1339 = null;
		aClass4_1340 = null;
		aClass4_1337 = null;
		aClass4_1341 = null;
		aClass4_1343 = null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIZLclient!aa;)Z")
	public static boolean method1623(@OriginalArg(2) boolean arg0, @OriginalArg(3) Class2 arg1) {
		return Static8.method192(arg0, arg1);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIZI)Lclient!ad;")
	private static Class4 method1628(@OriginalArg(1) int arg0) {
		@Pc(17) int local17 = 1;
		@Pc(21) int local21 = arg0 / 10;
		while (local21 != 0) {
			local21 /= 10;
			local17++;
		}
		@Pc(32) int local32 = local17;
		if (arg0 < 0) {
			local32 = local17 + 1;
		}
		@Pc(43) byte[] local43 = new byte[local32];
		if (arg0 < 0) {
			local43[0] = 45;
		}
		for (@Pc(59) int local59 = 0; local59 < local17; local59++) {
			@Pc(65) int local65 = arg0 % 10;
			arg0 /= 10;
			if (local65 < 0) {
				local65 = -local65;
			}
			if (local65 > 9) {
				local65 += 39;
			}
			local43[local32 - local59 - 1] = (byte) (local65 + 48);
		}
		@Pc(107) Class4 local107 = new Class4();
		local107.anInt238 = local32;
		local107.aByteArray1 = local43;
		return local107;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(II)Lclient!ad;")
	public static Class4 method1632(@OriginalArg(1) int arg0) {
		return method1628(arg0);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIII)V")
	public static void method1636(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(16) int local16 = arg1; local16 <= arg1 + arg3; local16++) {
			for (@Pc(20) int local20 = arg2; local20 <= arg0 + arg2; local20++) {
				if (local20 >= 0 && local20 < 104 && local16 >= 0 && local16 < 104) {
					Static18.aByteArrayArrayArray7[0][local20][local16] = 127;
					if (local20 == arg2 && local20 > 0) {
						Static38.anIntArrayArrayArray36[0][local20][local16] = Static38.anIntArrayArrayArray36[0][local20 - 1][local16];
					}
					if (arg0 + arg2 == local20 && local20 < 103) {
						Static38.anIntArrayArrayArray36[0][local20][local16] = Static38.anIntArrayArrayArray36[0][local20 + 1][local16];
					}
					if (arg1 == local16 && local16 > 0) {
						Static38.anIntArrayArrayArray36[0][local20][local16] = Static38.anIntArrayArrayArray36[0][local20][local16 - 1];
					}
					if (local16 == arg1 + arg3 && local16 < 103) {
						Static38.anIntArrayArrayArray36[0][local20][local16] = Static38.anIntArrayArrayArray36[0][local20][local16 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(BI)V")
	public static void method1639(@OriginalArg(1) int arg0) {
		if (!Static11.method1927()) {
			return;
		}
		if (Static21.aBoolean32) {
			Static60.anInt1461 = arg0;
		} else {
			Static34.method708(arg0);
		}
	}
}
