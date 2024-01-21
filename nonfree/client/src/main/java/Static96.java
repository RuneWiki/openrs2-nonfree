import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
	public static int anInt2517;

	@OriginalMember(owner = "client!ra", name = "T", descriptor = "Lclient!tb;")
	public static Class44 aClass44_55;

	@OriginalMember(owner = "client!ra", name = "W", descriptor = "Lclient!td;")
	public static Class3_Sub1_Sub16 aClass3_Sub1_Sub16_4;

	@OriginalMember(owner = "client!ra", name = "Q", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1373 = Static33.method650("Enter name:");

	@OriginalMember(owner = "client!ra", name = "G", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1370 = aClass56_1373;

	@OriginalMember(owner = "client!ra", name = "H", descriptor = "J")
	public static long aLong72 = 0L;

	@OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
	public static int anInt2515 = 0;

	@OriginalMember(owner = "client!ra", name = "K", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1371 = Static33.method650("@yel@*V");

	@OriginalMember(owner = "client!ra", name = "M", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1372 = Static33.method650("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!ra", name = "R", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1374 = Static33.method650("Wen m-Ochten Sie der Liste hinzuf-Ugen?");

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(B)V")
	public static void method1686() {
		aClass56_1371 = null;
		aClass56_1372 = null;
		aClass56_1374 = null;
		aClass56_1373 = null;
		aClass44_55 = null;
		aClass3_Sub1_Sub16_4 = null;
		aClass56_1370 = null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)V")
	public static void method1687(@OriginalArg(0) int arg0) {
		@Pc(4) int[] local4 = Static53.aClass3_Sub1_Sub1_Sub2_3.anIntArray101;
		@Pc(7) int local7 = local4.length;
		for (@Pc(9) int local9 = 0; local9 < local7; local9++) {
			local4[local9] = 0;
		}
		@Pc(38) int local38;
		@Pc(40) int local40;
		for (@Pc(25) int local25 = 1; local25 < 103; local25++) {
			local38 = (52736 - local25 * 512) * 4 + 24628;
			for (local40 = 1; local40 < 103; local40++) {
				if ((Static66.aByteArrayArrayArray3[arg0][local40][local25] & 0x18) == 0) {
					Static116.aClass14_1.method444(local4, local38, arg0, local40, local25);
				}
				if (arg0 < 3 && (Static66.aByteArrayArrayArray3[arg0 + 1][local40][local25] & 0x8) != 0) {
					Static116.aClass14_1.method444(local4, local38, arg0 + 1, local40, local25);
				}
				local38 += 4;
			}
		}
		local40 = (int) (Math.random() * 20.0D) + 228 << 16;
		Static53.aClass3_Sub1_Sub1_Sub2_3.method971();
		local38 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 228 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		@Pc(155) int local155;
		for (@Pc(151) int local151 = 1; local151 < 103; local151++) {
			for (local155 = 1; local155 < 103; local155++) {
				if ((Static66.aByteArrayArrayArray3[arg0][local155][local151] & 0x18) == 0) {
					Static109.method1135(local40, local155, arg0, local38, local151);
				}
				if (arg0 < 3 && (Static66.aByteArrayArrayArray3[arg0 + 1][local155][local151] & 0x8) != 0) {
					Static109.method1135(local40, local155, arg0 + 1, local38, local151);
				}
			}
		}
		Static46.anInt2273 = 0;
		for (local155 = 0; local155 < 104; local155++) {
			for (@Pc(217) int local217 = 0; local217 < 104; local217++) {
				@Pc(225) int local225 = Static116.aClass14_1.method419(Static94.anInt2470, local155, local217);
				if (local225 != 0) {
					local225 = local225 >> 14 & 0x7FFF;
					@Pc(241) int local241 = Static122.method1962(local225).anInt2716;
					if (local241 >= 0) {
						@Pc(245) int local245 = local155;
						@Pc(247) int local247 = local217;
						if (local241 != 22 && local241 != 29 && local241 != 34 && local241 != 36 && local241 != 46 && local241 != 47 && local241 != 48) {
							@Pc(275) int[][] local275 = Static115.aClass81Array1[Static94.anInt2470].anIntArrayArray29;
							for (@Pc(277) int local277 = 0; local277 < 10; local277++) {
								@Pc(284) int local284 = (int) (Math.random() * 4.0D);
								if (local284 == 0 && local245 > 0 && local245 > local155 - 3 && (local275[local245 - 1][local247] & 0x1280108) == 0) {
									local245--;
								}
								if (local284 == 1 && local245 < 103 && local245 < local155 + 3 && (local275[local245 + 1][local247] & 0x1280180) == 0) {
									local245++;
								}
								if (local284 == 2 && local247 > 0 && local217 - 3 < local247 && (local275[local245][local247 - 1] & 0x1280102) == 0) {
									local247--;
								}
								if (local284 == 3 && local247 < 103 && local247 < local217 + 3 && (local275[local245][local247 + 1] & 0x1280120) == 0) {
									local247++;
								}
							}
						}
						Static52.aClass3_Sub1_Sub1_Sub2Array32[Static46.anInt2273] = Static75.aClass3_Sub1_Sub1_Sub2Array41[local241];
						Static17.anIntArray30[Static46.anInt2273] = local245;
						Static117.anIntArray297[Static46.anInt2273] = local247;
						Static46.anInt2273++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(IB)Lclient!td;")
	public static Class3_Sub1_Sub16 method1688(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0xFFFF;
		@Pc(7) int local7 = arg0 >> 16;
		if (Static31.aClass3_Sub1_Sub16ArrayArray1[local7] == null || Static31.aClass3_Sub1_Sub16ArrayArray1[local7][local3] == null) {
			@Pc(32) boolean local32 = Static19.method398(local7);
			if (!local32) {
				return null;
			}
		}
		return Static31.aClass3_Sub1_Sub16ArrayArray1[local7][local3];
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILclient!tb;)Lclient!jc;")
	public static Class3_Sub10 method1689(@OriginalArg(0) int arg0, @OriginalArg(2) Class44 arg1) {
		@Pc(8) byte[] local8 = arg1.method1155(arg0);
		return local8 == null ? null : new Class3_Sub10(local8);
	}
}
