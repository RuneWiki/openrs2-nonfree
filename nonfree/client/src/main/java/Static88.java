import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!re", name = "y", descriptor = "I")
	public static int anInt3261;

	@OriginalMember(owner = "client!re", name = "Q", descriptor = "J")
	public static long aLong115;

	@OriginalMember(owner = "client!re", name = "S", descriptor = "I")
	public static int anInt3274;

	@OriginalMember(owner = "client!re", name = "X", descriptor = "Lclient!md;")
	public static Class40_Sub1 aClass40_Sub1_44;

	@OriginalMember(owner = "client!re", name = "Y", descriptor = "I")
	public static int anInt3276;

	@OriginalMember(owner = "client!re", name = "D", descriptor = "I")
	public static int anInt3266 = 0;

	@OriginalMember(owner = "client!re", name = "J", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1369 = Static34.method846("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!re", name = "K", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1370 = Static34.method846("p12_full");

	@OriginalMember(owner = "client!re", name = "L", descriptor = "Lclient!mb;")
	public static Class38 aClass38_36 = new Class38(4096);

	@OriginalMember(owner = "client!re", name = "R", descriptor = "Z")
	public static boolean aBoolean166 = false;

	@OriginalMember(owner = "client!re", name = "T", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1371 = Static34.method846("(U5");

	@OriginalMember(owner = "client!re", name = "U", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1372 = Static34.method846("Registrierter Benutzer");

	@OriginalMember(owner = "client!re", name = "V", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1373 = Static34.method846("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!re", name = "W", descriptor = "I")
	public static final int anInt3275 = 50;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
	public static void method2089() {
		Static59.anInt1826 = 0;
		Static44.anInt2716 = 0;
		Static14.method512();
		Static96.method1855();
		Static13.method505();
		Static54.method1157();
		for (@Pc(19) int local19 = 0; local19 < Static44.anInt2716; local19++) {
			@Pc(25) int local25 = Static56.anIntArray163[local19];
			if (Static85.anInt2389 != Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[local25].anInt2739) {
				Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[local25] = null;
			}
		}
		if (Static63.anInt1889 != Static13.aClass6_Sub1_Sub1_2.anInt2209) {
			throw new RuntimeException("gpp1 pos:" + Static13.aClass6_Sub1_Sub1_2.anInt2209 + " psize:" + Static63.anInt1889);
		}
		for (@Pc(73) int local73 = 0; local73 < Static78.anInt2246; local73++) {
			if (Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[Static101.anIntArray283[local73]] == null) {
				throw new RuntimeException("gpp2 pos:" + local73 + " size:" + Static78.anInt2246);
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!bd;)V")
	public static void method2090(@OriginalArg(1) Class6_Sub2_Sub2_Sub1 arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static22.anIntArray64.length; local9++) {
			Static22.anIntArray64[local9] = 0;
		}
		@Pc(36) int local36;
		for (@Pc(26) int local26 = 0; local26 < 5000; local26++) {
			local36 = (int) (Math.random() * 128.0D * (double) 256);
			Static22.anIntArray64[local36] = (int) (Math.random() * 256.0D);
		}
		@Pc(55) int local55;
		@Pc(59) int local59;
		@Pc(68) int local68;
		for (local36 = 0; local36 < 20; local36++) {
			for (local55 = 1; local55 < 255; local55++) {
				for (local59 = 1; local59 < 127; local59++) {
					local68 = local59 + (local55 << 7);
					Static78.anIntArray218[local68] = (Static22.anIntArray64[local68 + 128] + Static22.anIntArray64[local68 - 1] + Static22.anIntArray64[local68 + 1] + Static22.anIntArray64[local68 - 128]) / 4;
				}
			}
			@Pc(109) int[] local109 = Static22.anIntArray64;
			Static22.anIntArray64 = Static78.anIntArray218;
			Static78.anIntArray218 = local109;
		}
		if (arg0 == null) {
			return;
		}
		local55 = 0;
		for (local59 = 0; local59 < arg0.anInt368; local59++) {
			for (local68 = 0; local68 < arg0.anInt364; local68++) {
				if (arg0.aByteArray4[local55++] != 0) {
					@Pc(146) int local146 = local68 + arg0.anInt366 + 16;
					@Pc(153) int local153 = arg0.anInt363 + local59 + 16;
					@Pc(159) int local159 = (local153 << 7) + local146;
					Static22.anIntArray64[local159] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!cb;IBI)V")
	public static void method2091(@OriginalArg(0) Class6_Sub2_Sub3_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((arg2 & 0x20) != 0) {
			arg0.aClass55_1155 = Static13.aClass6_Sub1_Sub1_2.method1461();
			if (arg0.aClass55_1155.method1648(0) == 126) {
				arg0.aClass55_1155 = arg0.aClass55_1155.method1673(1);
				Static14.method510(arg0.aClass55_245, 2, arg0.aClass55_1155);
			} else if (Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1 == arg0) {
				Static14.method510(arg0.aClass55_245, 2, arg0.aClass55_1155);
			}
			arg0.anInt2733 = 150;
			arg0.anInt2757 = 0;
			arg0.anInt2706 = 0;
		}
		if ((arg2 & 0x100) != 0) {
			arg0.anInt2730 = Static13.aClass6_Sub1_Sub1_2.method1505();
			arg0.anInt2753 = Static13.aClass6_Sub1_Sub1_2.method1489();
			arg0.anInt2696 = Static13.aClass6_Sub1_Sub1_2.method1495();
			arg0.anInt2724 = Static13.aClass6_Sub1_Sub1_2.method1464();
			arg0.anInt2742 = Static13.aClass6_Sub1_Sub1_2.method1500() + Static85.anInt2389;
			arg0.anInt2754 = Static13.aClass6_Sub1_Sub1_2.method1502() + Static85.anInt2389;
			arg0.anInt2702 = Static13.aClass6_Sub1_Sub1_2.method1464();
			arg0.method1824();
		}
		@Pc(127) int local127;
		@Pc(131) int local131;
		if ((arg2 & 0x1) != 0) {
			local127 = Static13.aClass6_Sub1_Sub1_2.method1495();
			local131 = Static13.aClass6_Sub1_Sub1_2.method1505();
			arg0.method1833(local131, local127, Static85.anInt2389);
			arg0.anInt2703 = Static85.anInt2389 + 300;
			arg0.anInt2704 = Static13.aClass6_Sub1_Sub1_2.method1495();
			arg0.anInt2725 = Static13.aClass6_Sub1_Sub1_2.method1489();
		}
		if ((arg2 & 0x2) != 0) {
			arg0.anInt2746 = Static13.aClass6_Sub1_Sub1_2.method1500();
			arg0.anInt2743 = Static13.aClass6_Sub1_Sub1_2.method1500();
		}
		if ((arg2 & 0x10) != 0) {
			local127 = Static13.aClass6_Sub1_Sub1_2.method1464();
			@Pc(180) byte[] local180 = new byte[local127];
			@Pc(185) Class6_Sub1 local185 = new Class6_Sub1(local180);
			Static13.aClass6_Sub1_Sub1_2.method1485(local127, local180);
			Static61.aClass6_Sub1Array1[arg1] = local185;
			arg0.method446(local185);
		}
		if ((arg2 & 0x200) != 0) {
			arg0.anInt2722 = Static13.aClass6_Sub1_Sub1_2.method1507();
			local127 = Static13.aClass6_Sub1_Sub1_2.method1486();
			arg0.anInt2714 = 0;
			if (arg0.anInt2722 == 65535) {
				arg0.anInt2722 = -1;
			}
			arg0.anInt2699 = 0;
			arg0.anInt2750 = Static85.anInt2389 + (local127 & 0xFFFF);
			arg0.anInt2700 = local127 >> 16;
			if (arg0.anInt2750 > Static85.anInt2389) {
				arg0.anInt2699 = -1;
			}
		}
		if ((arg2 & 0x8) != 0) {
			local127 = Static13.aClass6_Sub1_Sub1_2.method1502();
			if (local127 == 65535) {
				local127 = -1;
			}
			local131 = Static13.aClass6_Sub1_Sub1_2.method1495();
			Static59.method1259(local127, arg0, local131);
		}
		if ((arg2 & 0x400) != 0) {
			local127 = Static13.aClass6_Sub1_Sub1_2.method1505();
			local131 = Static13.aClass6_Sub1_Sub1_2.method1464();
			arg0.method1833(local131, local127, Static85.anInt2389);
			arg0.anInt2703 = Static85.anInt2389 + 300;
			arg0.anInt2704 = Static13.aClass6_Sub1_Sub1_2.method1464();
			arg0.anInt2725 = Static13.aClass6_Sub1_Sub1_2.method1495();
		}
		if ((arg2 & 0x4) != 0) {
			arg0.anInt2698 = Static13.aClass6_Sub1_Sub1_2.method1466();
			if (arg0.anInt2698 == 65535) {
				arg0.anInt2698 = -1;
			}
		}
		if ((arg2 & 0x80) == 0) {
			return;
		}
		local127 = Static13.aClass6_Sub1_Sub1_2.method1507();
		local131 = Static13.aClass6_Sub1_Sub1_2.method1495();
		@Pc(345) int local345 = Static13.aClass6_Sub1_Sub1_2.method1489();
		@Pc(348) int local348 = Static13.aClass6_Sub1_Sub1_2.anInt2209;
		if (arg0.aClass55_245 != null && arg0.aClass8_1 != null) {
			@Pc(359) long local359 = arg0.aClass55_245.method1639();
			@Pc(361) boolean local361 = false;
			if (local131 <= 1) {
				for (@Pc(368) int local368 = 0; local368 < Static12.anInt712; local368++) {
					if (Static29.aLongArray3[local368] == local359) {
						local361 = true;
						break;
					}
				}
			}
			if (!local361 && Static91.anInt2553 == 0) {
				Static58.aClass6_Sub1_2.anInt2209 = 0;
				Static13.aClass6_Sub1_Sub1_2.method1485(local345, Static58.aClass6_Sub1_2.aByteArray11);
				Static58.aClass6_Sub1_2.anInt2209 = 0;
				@Pc(415) Class55 local415 = Static35.method865(Static58.aClass6_Sub1_2).method1646();
				arg0.aClass55_1155 = local415.method1654();
				arg0.anInt2733 = 150;
				arg0.anInt2757 = local127 & 0xFF;
				arg0.anInt2706 = local127 >> 8;
				if (local131 == 2 || local131 == 3) {
					Static14.method510(Static89.method1698(new Class55[] { Static34.aClass55_505, arg0.aClass55_245 }), 1, local415);
				} else if (local131 == 1) {
					Static14.method510(Static89.method1698(new Class55[] { Static63.aClass55_750, arg0.aClass55_245 }), 1, local415);
				} else {
					Static14.method510(arg0.aClass55_245, 2, local415);
				}
			}
		}
		Static13.aClass6_Sub1_Sub1_2.anInt2209 = local345 + local348;
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V")
	public static void method2092() {
		aClass40_Sub1_44 = null;
		aClass55_1370 = null;
		aClass55_1371 = null;
		aClass55_1373 = null;
		aClass55_1369 = null;
		aClass55_1372 = null;
		aClass38_36 = null;
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V")
	public static void method2093() {
		@Pc(16) int local16;
		for (@Pc(9) int local9 = 10; local9 < 117; local9++) {
			local16 = (int) (Math.random() * 100.0D);
			if (local16 < 50) {
				Static32.anIntArray79[local9 + 32512] = 255;
			}
		}
		@Pc(47) int local47;
		@Pc(54) int local54;
		@Pc(60) int local60;
		for (local16 = 0; local16 < 100; local16++) {
			local47 = (int) (Math.random() * 124.0D) + 2;
			local54 = (int) (Math.random() * 128.0D) + 128;
			local60 = local47 + (local54 << 7);
			Static32.anIntArray79[local60] = 192;
		}
		for (local47 = 1; local47 < 255; local47++) {
			for (local54 = 1; local54 < 127; local54++) {
				local60 = local54 + (local47 << 7);
				Static106.anIntArray234[local60] = (Static32.anIntArray79[local60 + 128] + Static32.anIntArray79[local60 - 128] + Static32.anIntArray79[local60 + -1] + Static32.anIntArray79[local60 + 1]) / 4;
			}
		}
		Static4.anInt2360 += 128;
		if (Static4.anInt2360 > Static22.anIntArray64.length) {
			Static4.anInt2360 -= Static22.anIntArray64.length;
			local54 = (int) (Math.random() * 12.0D);
			method2090(Static50.aClass6_Sub2_Sub2_Sub1Array52[local54]);
		}
		@Pc(164) int local164;
		for (local54 = 1; local54 < 255; local54++) {
			for (local60 = 1; local60 < 127; local60++) {
				local164 = local60 + (local54 << 7);
				@Pc(184) int local184 = Static106.anIntArray234[local164 + 128] - Static22.anIntArray64[local164 + Static4.anInt2360 & Static22.anIntArray64.length + -1] / 5;
				if (local184 < 0) {
					local184 = 0;
				}
				Static32.anIntArray79[local164] = local184;
			}
		}
		for (local60 = 0; local60 < 255; local60++) {
			Static78.anIntArray217[local60] = Static78.anIntArray217[local60 + 1];
		}
		Static78.anIntArray217[255] = (int) (Math.sin((double) Static85.anInt2389 / 14.0D) * 16.0D + Math.sin((double) Static85.anInt2389 / 15.0D) * 14.0D + Math.sin((double) Static85.anInt2389 / 16.0D) * 12.0D);
		if (Static104.anInt3066 > 0) {
			Static104.anInt3066 -= 4;
		}
		if (Static111.anInt3169 > 0) {
			Static111.anInt3169 -= 4;
		}
		if (Static104.anInt3066 != 0 || Static111.anInt3169 != 0) {
			return;
		}
		local164 = (int) (Math.random() * 2000.0D);
		if (local164 == 0) {
			Static104.anInt3066 = 1024;
		}
		if (local164 == 1) {
			Static111.anInt3169 = 1024;
			return;
		}
	}
}
