import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
	public static int anInt1898 = 0;

	@OriginalMember(owner = "client!hg", name = "y", descriptor = "I")
	public static int anInt1901 = 3353893;

	@OriginalMember(owner = "client!hg", name = "A", descriptor = "Z")
	public static boolean aBoolean138 = true;

	@OriginalMember(owner = "client!hg", name = "B", descriptor = "[I")
	public static int[] anIntArray256 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)V")
	public static void method1624(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static57.aFloat32 = 3.0F;
		} else if (arg0 == 50) {
			Static57.aFloat32 = 4.0F;
		} else if (arg0 == 75) {
			Static57.aFloat32 = 6.0F;
		} else if (arg0 == 100) {
			Static57.aFloat32 = 8.0F;
		} else if (arg0 == 200) {
			Static57.aFloat32 = 16.0F;
		}
		Static274.anInt5464 = -1;
		Static274.anInt5464 = -1;
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)V")
	public static void method1625() {
		if (Static220.method3518() != 2) {
			return;
		}
		@Pc(20) byte local20 = (byte) (Static152.anInt2841 - 4 & 0xFF);
		@Pc(29) int local29 = Static152.anInt2841 % 104;
		@Pc(31) int local31;
		@Pc(36) int local36;
		for (local31 = 0; local31 < 4; local31++) {
			for (local36 = 0; local36 < 104; local36++) {
				Static119.aByteArrayArrayArray21[local31][local29][local36] = local20;
			}
		}
		if (Static159.anInt2978 == 3) {
			return;
		}
		for (local31 = 0; local31 < 2; local31++) {
			Static98.anIntArray251[local31] = -1000000;
			Static140.anIntArray316[local31] = 1000000;
			Static275.anIntArray650[local31] = 0;
			Static265.anIntArray618[local31] = 1000000;
			Static107.anIntArray265[local31] = 0;
		}
		if (Static109.anInt2057 != 1) {
			local31 = Static124.method1919(Static159.anInt2978, Static182.anInt3398, Static68.anInt4743);
			if (local31 - Static185.anInt3457 < 800 && (Static242.aByteArrayArrayArray23[Static159.anInt2978][Static182.anInt3398 >> 7][Static68.anInt4743 >> 7] & 0x4) != 0) {
				Static165.method2521(Static182.anInt3398 >> 7, false, Static68.anInt4743 >> 7, Static130.aClass1_Sub19ArrayArrayArray1, 1);
			}
			return;
		}
		if ((Static242.aByteArrayArrayArray23[Static159.anInt2978][Static28.aClass6_Sub6_Sub2_1.anInt4562 >> 7][Static28.aClass6_Sub6_Sub2_1.anInt4569 >> 7] & 0x4) != 0) {
			Static165.method2521(Static28.aClass6_Sub6_Sub2_1.anInt4562 >> 7, false, Static28.aClass6_Sub6_Sub2_1.anInt4569 >> 7, Static130.aClass1_Sub19ArrayArrayArray1, 0);
		}
		if (Static77.anInt1548 >= 310) {
			return;
		}
		local31 = Static182.anInt3398 >> 7;
		local36 = Static68.anInt4743 >> 7;
		@Pc(140) int local140 = Static28.aClass6_Sub6_Sub2_1.anInt4562 >> 7;
		@Pc(152) int local152;
		if (local140 <= local31) {
			local152 = local31 - local140;
		} else {
			local152 = local140 - local31;
		}
		@Pc(164) int local164 = Static28.aClass6_Sub6_Sub2_1.anInt4569 >> 7;
		@Pc(176) int local176;
		if (local164 <= local36) {
			local176 = local36 - local164;
		} else {
			local176 = local164 - local36;
		}
		if (local152 == 0 && local176 == 0 || local152 <= -104 || local152 >= 104 || local176 <= -104 || local176 >= 104) {
			Static6.method149(null, "RC: " + local31 + "," + local36 + " " + local140 + "," + local164 + " " + Static224.anInt4695 + "," + Static158.anInt2961);
			return;
		}
		@Pc(250) int local250;
		@Pc(252) int local252;
		if (local176 < local152) {
			local250 = local176 * 65536 / local152;
			local252 = 32768;
			while (local31 != local140) {
				if (local31 < local140) {
					local31++;
				} else if (local140 < local31) {
					local31--;
				}
				if ((Static242.aByteArrayArrayArray23[Static159.anInt2978][local31][local36] & 0x4) != 0) {
					Static165.method2521(local31, false, local36, Static130.aClass1_Sub19ArrayArrayArray1, 1);
					break;
				}
				local252 += local250;
				if (local252 >= 65536) {
					local252 -= 65536;
					if (local36 < local164) {
						local36++;
					} else if (local36 > local164) {
						local36--;
					}
					if ((Static242.aByteArrayArrayArray23[Static159.anInt2978][local31][local36] & 0x4) != 0) {
						Static165.method2521(local31, false, local36, Static130.aClass1_Sub19ArrayArrayArray1, 1);
						break;
					}
				}
			}
			return;
		}
		local250 = local152 * 65536 / local176;
		local252 = 32768;
		while (local164 != local36) {
			if (local36 < local164) {
				local36++;
			} else if (local164 < local36) {
				local36--;
			}
			if ((Static242.aByteArrayArrayArray23[Static159.anInt2978][local31][local36] & 0x4) != 0) {
				Static165.method2521(local31, false, local36, Static130.aClass1_Sub19ArrayArrayArray1, 1);
				break;
			}
			local252 += local250;
			if (local252 >= 65536) {
				local252 -= 65536;
				if (local31 < local140) {
					local31++;
				} else if (local31 > local140) {
					local31--;
				}
				if ((Static242.aByteArrayArrayArray23[Static159.anInt2978][local31][local36] & 0x4) != 0) {
					Static165.method2521(local31, false, local36, Static130.aClass1_Sub19ArrayArrayArray1, 1);
					break;
				}
			}
		}
	}
}
