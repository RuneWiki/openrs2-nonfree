import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!pd", name = "F", descriptor = "[I")
	public static int[] anIntArray232 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!pd", name = "G", descriptor = "[B")
	public static byte[] aByteArray22 = new byte[520];

	@OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
	public static int anInt2052 = 1;

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)V")
	public static void method1396() {
		anIntArray232 = null;
		aByteArray22 = null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)Lclient!v;")
	public static Class4_Sub3_Sub15 method1398(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub3_Sub15 local10 = (Class4_Sub3_Sub15) Static121.aClass12_26.method289((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static107.method1760(Static6.aClass10_5, arg0, Static61.aClass10_19);
		if (local10 != null) {
			Static121.aClass12_26.method290(local10, (long) arg0);
		}
		return local10;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BZ)V")
	public static void method1399(@OriginalArg(1) boolean arg0) {
		if (Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1440 >> 7 == Static106.anInt2495 && Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1407 >> 7 == Static127.anInt1133) {
			Static106.anInt2495 = 0;
		}
		@Pc(25) int local25 = Static125.anInt2830;
		if (arg0) {
			local25 = 1;
		}
		for (@Pc(31) int local31 = 0; local31 < local25; local31++) {
			@Pc(54) Class4_Sub3_Sub1_Sub2_Sub1 local54;
			@Pc(48) int local48;
			if (arg0) {
				local48 = 33538048;
				local54 = Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1;
			} else {
				local48 = Static118.anIntArray336[local31] << 14;
				local54 = Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[Static118.anIntArray336[local31]];
			}
			if (local54 != null && local54.method852()) {
				@Pc(71) int local71 = local54.anInt1440 >> 7;
				local54.aBoolean12 = false;
				if ((Static8.aBoolean3 && Static125.anInt2830 > 50 || Static125.anInt2830 > 200) && !arg0 && local54.anInt1389 == local54.anInt1399) {
					local54.aBoolean12 = true;
				}
				@Pc(101) int local101 = local54.anInt1407 >> 7;
				if (local71 >= 0 && local71 < 104 && local101 >= 0 && local101 < 104) {
					if (local54.aClass4_Sub3_Sub1_Sub7_1 == null || Static118.anInt2741 < local54.anInt419 || local54.anInt421 <= Static118.anInt2741) {
						if ((local54.anInt1440 & 0x7F) == 64 && (local54.anInt1407 & 0x7F) == 64) {
							if (Static125.anInt2831 == Static25.anIntArrayArray19[local71][local101]) {
								continue;
							}
							Static25.anIntArrayArray19[local71][local101] = Static125.anInt2831;
						}
						local54.anInt422 = Static55.method882(local54.anInt1407, local54.anInt1440, Static77.anInt1866);
						Static30.aClass48_1.method1046(Static77.anInt1866, local54.anInt1440, local54.anInt1407, local54.anInt422, 60, local54, local54.anInt1415, local48, local54.aBoolean44);
					} else {
						local54.aBoolean12 = false;
						local54.anInt422 = Static55.method882(local54.anInt1407, local54.anInt1440, Static77.anInt1866);
						Static30.aClass48_1.method1002(Static77.anInt1866, local54.anInt1440, local54.anInt1407, local54.anInt422, local54, local54.anInt1415, local48, local54.anInt409, local54.anInt412, local54.anInt425, local54.anInt418);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!sa;I)Lclient!sa;")
	public static Class4_Sub14 method1400(@OriginalArg(0) Class4_Sub14 arg0) {
		@Pc(7) Class4_Sub14 local7 = Static8.method77(arg0);
		if (local7 == null) {
			local7 = arg0.aClass4_Sub14_13;
		}
		return local7;
	}
}
