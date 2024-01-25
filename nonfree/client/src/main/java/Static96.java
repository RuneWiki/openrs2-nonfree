import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!ga", name = "y", descriptor = "[I")
	public static final int[] anIntArray154 = new int[50];

	@OriginalMember(owner = "client!ga", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString74 = "Loading interfaces - ";

	@OriginalMember(owner = "client!ga", name = "O", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray16 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZ)V")
	public static void method1528(@OriginalArg(1) boolean arg0) {
		Static238.aBoolean402 = arg0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(88) int local88;
		@Pc(167) int local167;
		@Pc(178) int local178;
		@Pc(186) int local186;
		if (!Static238.aBoolean402) {
			local21 = Static142.aClass1_Sub21_Sub2_1.method5727();
			local25 = Static142.aClass1_Sub21_Sub2_1.method5715();
			local29 = Static142.aClass1_Sub21_Sub2_1.method5728();
			local33 = Static142.aClass1_Sub21_Sub2_1.method5728();
			@Pc(41) int local41 = (Static237.anInt4904 - Static142.aClass1_Sub21_Sub2_1.anInt6611) / 16;
			Static281.anIntArrayArray45 = new int[local41][4];
			for (local47 = 0; local47 < local41; local47++) {
				for (local51 = 0; local51 < 4; local51++) {
					Static281.anIntArrayArray45[local47][local51] = Static142.aClass1_Sub21_Sub2_1.method5735();
				}
			}
			local51 = Static142.aClass1_Sub21_Sub2_1.method5720();
			@Pc(84) boolean local84 = Static142.aClass1_Sub21_Sub2_1.method5720() == 1;
			local88 = Static142.aClass1_Sub21_Sub2_1.method5715();
			Static46.method936(local51);
			Static41.aByteArrayArray4 = new byte[local41][];
			Static242.aByteArrayArray15 = new byte[local41][];
			Static331.anIntArray354 = null;
			Static153.aByteArrayArray8 = new byte[local41][];
			Static219.anIntArray430 = new int[local41];
			Static166.anIntArray334 = new int[local41];
			Static274.aByteArrayArray20 = null;
			Static146.anIntArray446 = new int[local41];
			Static120.anIntArray242 = new int[local41];
			Static263.aByteArrayArray19 = new byte[local41][];
			Static287.anIntArray560 = new int[local41];
			@Pc(124) boolean local124 = false;
			if ((local29 / 8 == 48 || local29 / 8 == 49) && local33 / 8 == 48) {
				local124 = true;
			}
			local41 = 0;
			if (local29 / 8 == 48 && local33 / 8 == 148) {
				local124 = true;
			}
			for (local167 = (local29 - (Static43.anInt1151 >> 4)) / 8; local167 <= (local29 + (Static43.anInt1151 >> 4)) / 8; local167++) {
				for (local178 = (local33 - (Static260.anInt5348 >> 4)) / 8; local178 <= ((Static260.anInt5348 >> 4) + local33) / 8; local178++) {
					local186 = local178 + (local167 << 8);
					if (local124 && (local178 == 49 || local178 == 149 || local178 == 147 || local167 == 50 || local167 == 49 && local178 == 47)) {
						Static146.anIntArray446[local41] = local186;
						Static166.anIntArray334[local41] = -1;
						Static219.anIntArray430[local41] = -1;
						Static287.anIntArray560[local41] = -1;
						Static120.anIntArray242[local41] = -1;
					} else {
						Static146.anIntArray446[local41] = local186;
						Static166.anIntArray334[local41] = Static29.aClass134_12.method3018("m" + local167 + "_" + local178);
						Static219.anIntArray430[local41] = Static29.aClass134_12.method3018("l" + local167 + "_" + local178);
						Static287.anIntArray560[local41] = Static29.aClass134_12.method3018("um" + local167 + "_" + local178);
						Static120.anIntArray242[local41] = Static29.aClass134_12.method3018("ul" + local167 + "_" + local178);
					}
					local41++;
				}
			}
			Static172.method3082(local84, local29, local21, local33, false, local25, local88);
			return;
		}
		local21 = Static142.aClass1_Sub21_Sub2_1.method5715();
		local25 = Static142.aClass1_Sub21_Sub2_1.method5733();
		local29 = Static142.aClass1_Sub21_Sub2_1.method5720();
		local33 = Static142.aClass1_Sub21_Sub2_1.method5727();
		@Pc(369) boolean local369 = Static142.aClass1_Sub21_Sub2_1.method5743() == 1;
		local47 = Static142.aClass1_Sub21_Sub2_1.method5733();
		local51 = Static142.aClass1_Sub21_Sub2_1.method5712();
		Static46.method936(local29);
		Static142.aClass1_Sub21_Sub2_1.method5763();
		@Pc(393) int local393;
		for (@Pc(385) int local385 = 0; local385 < 4; local385++) {
			for (local88 = 0; local88 < Static43.anInt1151 >> 3; local88++) {
				for (local393 = 0; local393 < Static260.anInt5348 >> 3; local393++) {
					local167 = Static142.aClass1_Sub21_Sub2_1.method5756(1);
					if (local167 == 1) {
						Static320.anIntArrayArrayArray13[local385][local88][local393] = Static142.aClass1_Sub21_Sub2_1.method5756(26);
					} else {
						Static320.anIntArrayArrayArray13[local385][local88][local393] = -1;
					}
				}
			}
		}
		Static142.aClass1_Sub21_Sub2_1.method5759();
		local88 = (Static237.anInt4904 - Static142.aClass1_Sub21_Sub2_1.anInt6611) / 16;
		Static281.anIntArrayArray45 = new int[local88][4];
		for (local393 = 0; local393 < local88; local393++) {
			for (local167 = 0; local167 < 4; local167++) {
				Static281.anIntArrayArray45[local393][local167] = Static142.aClass1_Sub21_Sub2_1.method5716();
			}
		}
		Static287.anIntArray560 = new int[local88];
		Static153.aByteArrayArray8 = new byte[local88][];
		Static219.anIntArray430 = new int[local88];
		Static274.aByteArrayArray20 = null;
		Static331.anIntArray354 = null;
		Static146.anIntArray446 = new int[local88];
		Static263.aByteArrayArray19 = new byte[local88][];
		Static41.aByteArrayArray4 = new byte[local88][];
		Static120.anIntArray242 = new int[local88];
		Static166.anIntArray334 = new int[local88];
		Static242.aByteArrayArray15 = new byte[local88][];
		local88 = 0;
		for (local167 = 0; local167 < 4; local167++) {
			for (local178 = 0; local178 < Static43.anInt1151 >> 3; local178++) {
				for (local186 = 0; local186 < Static260.anInt5348 >> 3; local186++) {
					@Pc(544) int local544 = Static320.anIntArrayArrayArray13[local167][local178][local186];
					if (local544 != -1) {
						@Pc(553) int local553 = local544 >> 14 & 0x3FF;
						@Pc(559) int local559 = local544 >> 3 & 0x7FF;
						@Pc(570) int local570 = (local553 / 8 << 8) + (local559 / 8);
						for (@Pc(572) int local572 = 0; local572 < local88; local572++) {
							if (local570 == Static146.anIntArray446[local572]) {
								local570 = -1;
								break;
							}
						}
						if (local570 != -1) {
							Static146.anIntArray446[local88] = local570;
							@Pc(608) int local608 = local570 >> 8 & 0xFF;
							@Pc(612) int local612 = local570 & 0xFF;
							Static166.anIntArray334[local88] = Static29.aClass134_12.method3018("m" + local608 + "_" + local612);
							Static219.anIntArray430[local88] = Static29.aClass134_12.method3018("l" + local608 + "_" + local612);
							Static287.anIntArray560[local88] = Static29.aClass134_12.method3018("um" + local608 + "_" + local612);
							Static120.anIntArray242[local88] = Static29.aClass134_12.method3018("ul" + local608 + "_" + local612);
							local88++;
						}
					}
				}
			}
		}
		Static172.method3082(local369, local51, local33, local25, false, local47, local21);
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)V")
	public static void method1531() {
		@Pc(5) Class37 local5 = Static314.aClass37_102;
		synchronized (Static314.aClass37_102) {
			Static314.aClass37_102.method920(5);
		}
	}

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)I")
	public static int method1532() {
		if ((double) Static150.aFloat20 == 3.0D) {
			return 37;
		} else if ((double) Static150.aFloat20 == 4.0D) {
			return 50;
		} else if ((double) Static150.aFloat20 == 6.0D) {
			return 75;
		} else if ((double) Static150.aFloat20 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method1533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(12) int local12 = arg0; local12 <= arg3; local12++) {
			for (@Pc(16) int local16 = arg1; local16 <= arg4; local16++) {
				if (arg2 == Static37.anIntArrayArray7[local12][local16] && Static332.anIntArrayArray55[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
