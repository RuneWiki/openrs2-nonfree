import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!ij", name = "j", descriptor = "Lclient!wa;")
	public static Class23 aClass23_34;

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "Lclient!bb;")
	public static final Class8 aClass8_18 = new Class8(64);

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "[I")
	public static final int[] anIntArray182 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!ij", name = "i", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_675 = Static161.method2452("null");

	@OriginalMember(owner = "client!ij", name = "k", descriptor = "J")
	public static volatile long aLong105 = 0L;

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_676 = Static161.method2452("l");

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(BIIII)V")
	public static void method1440(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg1;
		@Pc(15) int local15 = -arg1;
		@Pc(17) int local17 = -1;
		@Pc(19) int local19 = 0;
		Static27.method409(arg0 + arg1, arg2, Static9.anIntArrayArray1[arg3], arg0 - arg1);
		while (local19 < local7) {
			local17 += 2;
			local19++;
			local15 += local17;
			if (local15 >= 0) {
				local7--;
				@Pc(52) int[] local52 = Static9.anIntArrayArray1[arg3 + local7];
				local15 -= local7 << 1;
				@Pc(62) int local62 = local19 + arg0;
				@Pc(68) int[] local68 = Static9.anIntArrayArray1[arg3 - local7];
				@Pc(73) int local73 = arg0 - local19;
				Static27.method409(local62, arg2, local52, local73);
				Static27.method409(local62, arg2, local68, local73);
			}
			@Pc(90) int local90 = arg0 + local7;
			@Pc(94) int local94 = arg0 - local7;
			@Pc(101) int[] local101 = Static9.anIntArrayArray1[arg3 - local19];
			@Pc(107) int[] local107 = Static9.anIntArrayArray1[local19 + arg3];
			Static27.method409(local90, arg2, local107, local94);
			Static27.method409(local90, arg2, local101, local94);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)I")
	public static int method1441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			arg0--;
			local7 = arg1 & 0x1 | local7 << 1;
			arg1 >>>= 0x1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)I")
	public static int method1442() {
		@Pc(3) int local3 = 3;
		if (Static80.anInt1806 < 310) {
			@Pc(12) int local12 = Static4.anInt109 >> 7;
			@Pc(16) int local16 = Static104.anInt2182 >> 7;
			if ((Static168.aByteArrayArrayArray13[Static111.anInt2327][local12][local16] & 0x4) != 0) {
				local3 = Static111.anInt2327;
			}
			@Pc(36) int local36 = Static210.aClass1_Sub2_Sub2_2.anInt2241 >> 7;
			@Pc(41) int local41 = Static210.aClass1_Sub2_Sub2_2.anInt2234 >> 7;
			@Pc(53) int local53;
			if (local36 <= local12) {
				local53 = local12 - local36;
			} else {
				local53 = local36 - local12;
			}
			@Pc(72) int local72;
			if (local41 <= local16) {
				local72 = local16 - local41;
			} else {
				local72 = local41 - local16;
			}
			@Pc(88) int local88;
			@Pc(90) int local90;
			if (local72 < local53) {
				local88 = local72 * 65536 / local53;
				local90 = 32768;
				while (local12 != local36) {
					local90 += local88;
					if (local36 > local12) {
						local12++;
					} else if (local12 > local36) {
						local12--;
					}
					if ((Static168.aByteArrayArrayArray13[Static111.anInt2327][local12][local16] & 0x4) != 0) {
						local3 = Static111.anInt2327;
					}
					if (local90 >= 65536) {
						local90 -= 65536;
						if (local41 > local16) {
							local16++;
						} else if (local41 < local16) {
							local16--;
						}
						if ((Static168.aByteArrayArrayArray13[Static111.anInt2327][local12][local16] & 0x4) != 0) {
							local3 = Static111.anInt2327;
						}
					}
				}
			} else {
				local88 = local53 * 65536 / local72;
				local90 = 32768;
				while (local41 != local16) {
					local90 += local88;
					if (local16 < local41) {
						local16++;
					} else if (local16 > local41) {
						local16--;
					}
					if ((Static168.aByteArrayArrayArray13[Static111.anInt2327][local12][local16] & 0x4) != 0) {
						local3 = Static111.anInt2327;
					}
					if (local90 >= 65536) {
						local90 -= 65536;
						if (local36 > local12) {
							local12++;
						} else if (local36 < local12) {
							local12--;
						}
						if ((Static168.aByteArrayArrayArray13[Static111.anInt2327][local12][local16] & 0x4) != 0) {
							local3 = Static111.anInt2327;
						}
					}
				}
			}
		}
		if ((Static168.aByteArrayArrayArray13[Static111.anInt2327][Static210.aClass1_Sub2_Sub2_2.anInt2241 >> 7][Static210.aClass1_Sub2_Sub2_2.anInt2234 >> 7] & 0x4) != 0) {
			local3 = Static111.anInt2327;
		}
		return local3;
	}
}
