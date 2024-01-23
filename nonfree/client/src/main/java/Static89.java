import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!gi", name = "Y", descriptor = "Lclient!bn;")
	public static Class1_Sub2_Sub1_Sub2 aClass1_Sub2_Sub1_Sub2_3;

	@OriginalMember(owner = "client!gi", name = "V", descriptor = "I")
	public static int anInt1997 = 2;

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(II)I")
	public static int method1556(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = arg0 * 6 - 61440;
		@Pc(24) int local24 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(32) int local32 = (arg0 * local14 >> 12) + 40960;
		return local24 * local32 >> 12;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIB)Z")
	public static boolean method1557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		@Pc(32) Class181 local32 = Static183.method3511(arg0);
		return local32.method4423(arg1);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZI)I")
	public static int method1558(@OriginalArg(1) int arg0) {
		@Pc(12) double local12 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = local21;
		@Pc(25) double local25 = 0.0D;
		@Pc(34) double local34 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		if (local34 > local21) {
			local23 = local34;
		}
		if (local23 < local12) {
			local23 = local12;
		}
		@Pc(48) double local48 = local21;
		if (local21 > local34) {
			local48 = local34;
		}
		if (local48 > local12) {
			local48 = local12;
		}
		@Pc(68) double local68 = (local23 + local48) / 2.0D;
		@Pc(75) double local75 = 0.0D;
		@Pc(80) int local80 = (int) (local68 * 256.0D);
		if (local80 < 0) {
			local80 = 0;
		} else if (local80 > 255) {
			local80 = 255;
		}
		if (local23 != local48) {
			if (local23 == local21) {
				local25 = (local34 - local12) / (local23 - local48);
			} else if (local34 == local23) {
				local25 = (local12 - local21) / (local23 - local48) + 2.0D;
			} else if (local12 == local23) {
				local25 = (local21 - local34) / (-local48 + local23) + 4.0D;
			}
			if (local68 < 0.5D) {
				local75 = (local23 - local48) / (local23 + local48);
			}
			if (local68 >= 0.5D) {
				local75 = (local23 - local48) / ((2.0D - local23) - local48);
			}
		}
		@Pc(181) int local181 = (int) (local75 * 256.0D);
		local25 /= 6.0D;
		if (local181 < 0) {
			local181 = 0;
		} else if (local181 > 255) {
			local181 = 255;
		}
		@Pc(206) int local206 = (int) (local25 * 256.0D);
		if (local80 > 243) {
			local181 >>= 0x4;
		} else if (local80 > 217) {
			local181 >>= 0x3;
		} else if (local80 > 192) {
			local181 >>= 0x2;
		} else if (local80 > 179) {
			local181 >>= 0x1;
		}
		return (local80 >> 1) + (local206 >> 2 << 10) + (local181 >> 5 << 7);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BC)Z")
	public static boolean method1559(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "(II)V")
	public static void method1560() {
		Static296.aClass135_41.method3320(5);
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(Z)V")
	public static void method1561() {
		@Pc(3) int local3;
		@Pc(15) int local15;
		for (local3 = -1; local3 < Static278.anInt5374; local3++) {
			if (local3 == -1) {
				local15 = 2047;
			} else {
				local15 = Static17.anIntArray444[local3];
			}
			@Pc(25) Class14_Sub2_Sub1 local25 = Static98.aClass14_Sub2_Sub1Array1[local15];
			if (local25 != null && local25.anInt4628 > 0) {
				local25.anInt4628--;
				if (local25.anInt4628 == 0) {
					local25.aString272 = null;
				}
			}
		}
		for (local3 = 0; local3 < Static233.anInt4582; local3++) {
			local15 = Static281.anIntArray464[local3];
			@Pc(61) Class14_Sub2_Sub2 local61 = Static254.aClass14_Sub2_Sub2Array1[local15];
			if (local61 != null && local61.anInt4628 > 0) {
				local61.anInt4628--;
				if (local61.anInt4628 == 0) {
					local61.aString272 = null;
				}
			}
		}
	}
}
