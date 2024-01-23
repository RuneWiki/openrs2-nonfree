import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
	public static int anInt2194;

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "Lclient!qi;")
	public static Class144 aClass144_5 = new Class144();

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString108 = "Members object";

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "[I")
	public static int[] anIntArray157 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method1892(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4) {
		@Pc(11) long local11 = Static243.method3054(arg1, arg3 + 0, arg2);
		@Pc(33) int local33;
		@Pc(26) int local26;
		@Pc(40) int local40;
		@Pc(44) Class143 local44;
		@Pc(76) int local76;
		@Pc(78) int[] local78;
		@Pc(74) int local74;
		if (local11 != 0L) {
			local26 = (int) local11 >> 14 & 0x1F;
			local33 = (int) local11 >> 20 & 0x3;
			local40 = (int) (local11 >>> 32) & Integer.MAX_VALUE;
			local44 = Static218.method3692(local40);
			if (local44.anInt4498 == -1) {
				local74 = (103 - arg2) * 512 * 4 + arg3 * 4 + 24624;
				local76 = arg4;
				local78 = Static160.anIntArray254;
				if (local11 > 0L) {
					local76 = arg0;
				}
				if (local26 == 0 || local26 == 2) {
					if (local33 == 0) {
						local78[local74] = local76;
						local78[local74 + 512] = local76;
						local78[local74 + 1024] = local76;
						local78[local74 + 1536] = local76;
					} else if (local33 == 1) {
						local78[local74] = local76;
						local78[local74 + 1] = local76;
						local78[local74 + 2] = local76;
						local78[local74 + 3] = local76;
					} else if (local33 == 2) {
						local78[local74 + 3] = local76;
						local78[local74 + 512 + 3] = local76;
						local78[local74 + 1024 + 3] = local76;
						local78[local74 + 1539] = local76;
					} else if (local33 == 3) {
						local78[local74 + 1536] = local76;
						local78[local74 + 1 + 1536] = local76;
						local78[local74 + 1536 + 2] = local76;
						local78[local74 + 3 + 1536] = local76;
					}
				}
				if (local26 == 3) {
					if (local33 == 0) {
						local78[local74] = local76;
					} else if (local33 == 1) {
						local78[local74 + 3] = local76;
					} else if (local33 == 2) {
						local78[local74 + 3 + 1536] = local76;
					} else if (local33 == 3) {
						local78[local74 + 1536] = local76;
					}
				}
				if (local26 == 2) {
					if (local33 == 3) {
						local78[local74] = local76;
						local78[local74 + 512] = local76;
						local78[local74 + 1024] = local76;
						local78[local74 + 1536] = local76;
					} else if (local33 == 0) {
						local78[local74] = local76;
						local78[local74 + 1] = local76;
						local78[local74 + 2] = local76;
						local78[local74 + 3] = local76;
					} else if (local33 == 1) {
						local78[local74 + 3] = local76;
						local78[local74 + 3 + 512] = local76;
						local78[local74 + 1024 + 3] = local76;
						local78[local74 + 1539] = local76;
					} else if (local33 == 2) {
						local78[local74 + 1536] = local76;
						local78[local74 + 1536 + 1] = local76;
						local78[local74 + 1536 + 2] = local76;
						local78[local74 + 1536 + 3] = local76;
					}
				}
			} else if (!Static71.method1332(arg3, local33, local44, arg2)) {
				return false;
			}
		}
		local11 = Static54.method1072(arg1, arg3 + 0, arg2);
		if (local11 != 0L) {
			local26 = (int) local11 >> 14 & 0x1F;
			local33 = (int) local11 >> 20 & 0x3;
			local40 = Integer.MAX_VALUE & (int) (local11 >>> 32);
			local44 = Static218.method3692(local40);
			if (local44.anInt4498 == -1) {
				if (local26 == 9) {
					local76 = 15658734;
					if (local11 > 0L) {
						local76 = 15597568;
					}
					local78 = Static160.anIntArray254;
					local74 = (103 - arg2) * 2048 + arg3 * 4 + 24624;
					if (local33 == 0 || local33 == 2) {
						local78[local74 + 1536] = local76;
						local78[local74 + 1024 + 1] = local76;
						local78[local74 + 512 + 2] = local76;
						local78[local74 + 3] = local76;
					} else {
						local78[local74] = local76;
						local78[local74 + 512 + 1] = local76;
						local78[local74 + 1024 + 2] = local76;
						local78[local74 + 1539] = local76;
					}
				}
			} else if (!Static71.method1332(arg3, local33, local44, arg2)) {
				return false;
			}
		}
		local11 = Static219.method3696(arg1, arg3 + 0, arg2);
		if (local11 != 0L) {
			local26 = (int) (local11 >>> 32) & Integer.MAX_VALUE;
			@Pc(578) Class143 local578 = Static218.method3692(local26);
			local33 = (int) local11 >> 20 & 0x3;
			if (local578.anInt4498 != -1 && !Static71.method1332(arg3, local33, local578, arg2)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIII)I")
	public static int method1894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static141.anIntArrayArrayArray4 == null) {
			return 0;
		}
		@Pc(12) int local12 = arg2 >> 7;
		@Pc(16) int local16 = arg1 >> 7;
		if (local12 < 0 || local16 < 0 || local12 > 103 || local16 > 103) {
			return 0;
		}
		@Pc(40) int local40 = arg2 & 0x7F;
		@Pc(42) int local42 = arg0;
		if (arg0 < 3 && (Static134.aByteArrayArrayArray9[1][local12][local16] & 0x2) == 2) {
			local42 = arg0 + 1;
		}
		@Pc(90) int local90 = Static141.anIntArrayArrayArray4[local42][local12][local16] * (128 - local40) + local40 * Static141.anIntArrayArrayArray4[local42][local12 + 1][local16] >> 7;
		@Pc(121) int local121 = Static141.anIntArrayArrayArray4[local42][local12 + 1][local16 + 1] * local40 + Static141.anIntArrayArrayArray4[local42][local12][local16 + 1] * (128 - local40) >> 7;
		@Pc(125) int local125 = arg1 & 0x7F;
		return local125 * local121 + (128 - local125) * local90 >> 7;
	}
}
