import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!ka", name = "nb", descriptor = "Lclient!nh;")
	public static Class62 aClass62_23;

	@OriginalMember(owner = "client!ka", name = "pb", descriptor = "I")
	public static int anInt2341;

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "Lclient!gh;")
	public static final Class4_Sub11_Sub1 aClass4_Sub11_Sub1_1 = new Class4_Sub11_Sub1(5000);

	@OriginalMember(owner = "client!ka", name = "ib", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_844 = Static177.method3050(":clanreq:");

	@OriginalMember(owner = "client!ka", name = "mb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_845 = Static177.method3050("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!ka", name = "ob", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_846 = Static177.method3050("VOLL");

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!a;II)I")
	public static int method1796(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArrayArray1 == null || arg0.anIntArrayArray1.length <= arg1) {
			return -2;
		}
		try {
			@Pc(24) int[] local24 = arg0.anIntArrayArray1[arg1];
			@Pc(31) int local31 = 0;
			@Pc(33) int local33 = 0;
			@Pc(35) byte local35 = 0;
			while (true) {
				@Pc(40) int local40 = local24[local31++];
				@Pc(42) int local42 = 0;
				@Pc(44) byte local44 = 0;
				if (local40 == 0) {
					return local33;
				}
				if (local40 == 15) {
					local44 = 1;
				}
				if (local40 == 16) {
					local44 = 2;
				}
				if (local40 == 17) {
					local44 = 3;
				}
				if (local40 == 1) {
					local42 = Static13.anIntArray39[local24[local31++]];
				}
				if (local40 == 2) {
					local42 = Static91.anIntArray224[local24[local31++]];
				}
				if (local40 == 3) {
					local42 = Static121.anIntArray274[local24[local31++]];
				}
				@Pc(112) int local112;
				@Pc(123) Class1 local123;
				@Pc(128) int local128;
				@Pc(141) int local141;
				if (local40 == 4) {
					local112 = local24[local31++] << 16;
					@Pc(119) int local119 = local112 + local24[local31++];
					local123 = Static154.method3136(local119);
					local128 = local24[local31++];
					if (local128 != -1 && (!Static83.method1663(local128).aBoolean109 || Static94.aBoolean106)) {
						for (local141 = 0; local141 < local123.anIntArray11.length; local141++) {
							if (local123.anIntArray11[local141] == local128 + 1) {
								local42 += local123.anIntArray2[local141];
							}
						}
					}
				}
				if (local40 == 5) {
					local42 = Static147.anIntArray64[local24[local31++]];
				}
				if (local40 == 6) {
					local42 = Class4_Sub11_Sub1.anIntArray154[Static91.anIntArray224[local24[local31++]] - 1];
				}
				if (local40 == 7) {
					local42 = Static147.anIntArray64[local24[local31++]] * 100 / 46875;
				}
				if (local40 == 8) {
					local42 = Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2107;
				}
				if (local40 == 9) {
					for (local112 = 0; local112 < 25; local112++) {
						if (Static176.aBooleanArray19[local112]) {
							local42 += Static91.anIntArray224[local112];
						}
					}
				}
				if (local40 == 10) {
					local112 = local24[local31++] << 16;
					local112 += local24[local31++];
					local123 = Static154.method3136(local112);
					local128 = local24[local31++];
					if (local128 != -1 && (!Static83.method1663(local128).aBoolean109 || Static94.aBoolean106)) {
						for (local141 = 0; local141 < local123.anIntArray11.length; local141++) {
							if (local123.anIntArray11[local141] == local128 + 1) {
								local42 = 999999999;
								break;
							}
						}
					}
				}
				if (local40 == 11) {
					local42 = Static153.anInt3513;
				}
				if (local40 == 12) {
					local42 = Static45.anInt1129;
				}
				if (local40 == 13) {
					local112 = Static147.anIntArray64[local24[local31++]];
					@Pc(331) int local331 = local24[local31++];
					local42 = (local112 & 0x1 << local331) == 0 ? 0 : 1;
				}
				if (local40 == 14) {
					local112 = local24[local31++];
					local42 = Static26.method438(local112);
				}
				if (local40 == 18) {
					local42 = Static103.anInt2610 + (Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2832 >> 7);
				}
				if (local40 == 19) {
					local42 = (Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2803 >> 7) + Static184.anInt4144;
				}
				if (local40 == 20) {
					local42 = local24[local31++];
				}
				if (local44 == 0) {
					if (local35 == 0) {
						local33 += local42;
					}
					if (local35 == 1) {
						local33 -= local42;
					}
					if (local35 == 2 && local42 != 0) {
						local33 /= local42;
					}
					if (local35 == 3) {
						local33 *= local42;
					}
					local35 = 0;
				} else {
					local35 = local44;
				}
			}
		} catch (@Pc(438) Exception local438) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(JI)V")
	public static void method1799(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static57.anInt1403; local14++) {
			if (Static129.aLongArray33[local14] == arg0) {
				Static57.anInt1403--;
				for (@Pc(32) int local32 = local14; local32 < Static57.anInt1403; local32++) {
					Static129.aLongArray33[local32] = Static129.aLongArray33[local32 + 1];
					Static153.aClass46Array23[local32] = Static153.aClass46Array23[local32 + 1];
				}
				Static122.anInt2963 = Static163.anInt3721;
				aClass4_Sub11_Sub1_1.method1285(205);
				aClass4_Sub11_Sub1_1.method1269(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZIILclient!nh;III)V")
	public static void method1800(@OriginalArg(3) Class62 arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		Static30.anInt765 = 2;
		Static135.anInt3221 = arg1;
		Static140.aClass62_35 = arg0;
		Static134.anInt3187 = 0;
		Static71.anInt1861 = 1;
		Static135.aBoolean135 = false;
		Static99.anInt2522 = arg2;
	}
}
