import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "Lclient!hc;")
	public static Class51 aClass51_30;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString152 = "Loading sprites - ";

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
	public static int anInt2433 = -1;

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
	public static int anInt2434 = 0;

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "[I")
	public static int[] anIntArray179 = new int[2];

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!ql;)V")
	public static void method1842(@OriginalArg(1) Class1_Sub13 arg0) {
		while (arg0.anInt2395 < arg0.aByteArray29.length) {
			@Pc(14) boolean local14 = false;
			@Pc(16) int local16 = 0;
			@Pc(18) int local18 = 0;
			if (arg0.method1772() == 1) {
				local14 = true;
				local16 = arg0.method1772();
				local18 = arg0.method1772();
			}
			@Pc(37) int local37 = arg0.method1772();
			@Pc(41) int local41 = arg0.method1772();
			@Pc(53) int local53 = Static174.anInt3997 + Static46.anInt1376 - local41 * 64 - 1;
			@Pc(60) int local60 = local37 * 64 - Static209.anInt4574;
			@Pc(85) int local85;
			@Pc(89) int local89;
			if (local60 >= 0 && local53 - 63 >= 0 && Static124.anInt3160 > local60 + 63 && local53 < Static174.anInt3997) {
				local85 = local60 >> 6;
				local89 = local53 >> 6;
				for (@Pc(91) int local91 = 0; local91 < 64; local91++) {
					for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
						if (!local14 || local91 >= local16 * 8 && local16 * 8 + 8 > local91 && local18 * 8 <= local95 && local18 * 8 + 8 > local95) {
							@Pc(133) int local133 = arg0.method1772();
							if (local133 != 0) {
								@Pc(146) int local146;
								if ((local133 & 0x1) == 1) {
									local146 = arg0.method1772();
									if (Static45.aByteArrayArrayArray5[local85][local89] == null) {
										Static45.aByteArrayArrayArray5[local85][local89] = new byte[4096];
									}
									Static45.aByteArrayArrayArray5[local85][local89][local91 + (63 - local95 << 6)] = (byte) local146;
								}
								if ((local133 & 0x2) == 2) {
									local146 = arg0.method1773();
									if (Static25.anIntArrayArrayArray3[local85][local89] == null) {
										Static25.anIntArrayArrayArray3[local85][local89] = new int[4096];
									}
									Static25.anIntArrayArrayArray3[local85][local89][(63 - local95 << 6) + local91] = local146;
								}
								if ((local133 & 0x4) == 4) {
									local146 = arg0.method1773();
									if (Static228.anIntArrayArrayArray12[local85][local89] == null) {
										Static228.anIntArrayArrayArray12[local85][local89] = new int[4096];
									}
									local146--;
									@Pc(239) Class31 local239 = Static77.method1518(local146);
									if (local239.anIntArray100 != null) {
										local239 = local239.method935();
										if (local239 == null || local239.anInt1338 == -1) {
											continue;
										}
									}
									Static228.anIntArrayArrayArray12[local85][local89][(63 - local95 << 6) + local91] = local239.anInt1319 + 1;
									@Pc(277) Class1_Sub22 local277 = new Class1_Sub22();
									local277.anInt4150 = local53;
									local277.anInt4156 = local239.anInt1338;
									local277.anInt4154 = local60;
									Static225.aClass3_20.method28(local277);
								}
							}
						}
					}
				}
			} else {
				for (local85 = 0; local85 < (local14 ? 64 : 4096); local85++) {
					local89 = arg0.method1772();
					if (local89 != 0) {
						if ((local89 & 0x1) == 1) {
							arg0.anInt2395++;
						}
						if ((local89 & 0x2) == 2) {
							arg0.anInt2395 += 2;
						}
						if ((local89 & 0x4) == 4) {
							arg0.anInt2395 += 3;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)Z")
	public static boolean method1843(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(10) Class31 local10 = Static77.method1518(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local10.method923(arg0);
	}
}
