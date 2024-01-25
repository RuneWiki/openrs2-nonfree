import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!cs", name = "l", descriptor = "I")
	public static int anInt1868;

	@OriginalMember(owner = "client!cs", name = "k", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!cs", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray8 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)Lclient!eq;")
	public static Class110 method1527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class110 local14 = new Class110();
		local14.anInt2726 = -1;
		local14.anInt2719 = arg1 + 6;
		local14.anInt2725 = arg0 + 5 + 1;
		local14.anInt2712 = -1;
		local14.anIntArrayArray14 = new int[local14.anInt2719][local14.anInt2725];
		local14.method2365();
		return local14;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!nga;Z)Z")
	public static boolean method1530(@OriginalArg(0) Class34_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static582.aClass35Array3 == Static368.aClass35Array1;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method7856();
		if (arg0.aShort98 < 0 || arg0.aShort99 < 0 || arg0.aShort97 >= Static133.anInt2551 || arg0.aShort96 >= Static155.anInt2874) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort98; local36 <= arg0.aShort97; local36++) {
			for (local40 = arg0.aShort99; local40 <= arg0.aShort96; local40++) {
				@Pc(47) Class368 local47 = Static172.method2744(arg0.aByte132, local36, local40);
				if (local47 != null) {
					@Pc(53) Class205 local53 = Static285.method4143(arg0);
					@Pc(56) Class205 local56 = local47.aClass205_4;
					if (local56 == null) {
						local47.aClass205_4 = local53;
					} else {
						while (local56.aClass205_3 != null) {
							local56 = local56.aClass205_3;
						}
						local56.aClass205_3 = local53;
					}
					if (local6 && (Static403.anIntArrayArray59[local36][local40] & 0xFF000000) != 0) {
						local8 = Static403.anIntArrayArray59[local36][local40];
						local10 = Static465.aShortArrayArray8[local36][local40];
						local12 = Static510.aByteArrayArray12[local36][local40];
					}
					if (!arg1 && local47.aClass34_Sub1_Sub2_1 != null && local47.aClass34_Sub1_Sub2_1.aShort49 > local33) {
						local33 = local47.aClass34_Sub1_Sub2_1.aShort49;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort98; local40 <= arg0.aShort97; local40++) {
				for (@Pc(136) int local136 = arg0.aShort99; local136 <= arg0.aShort96; local136++) {
					if ((Static403.anIntArrayArray59[local40][local136] & 0xFF000000) == 0) {
						Static403.anIntArrayArray59[local40][local136] = local8;
						Static465.aShortArrayArray8[local40][local136] = local10;
						Static510.aByteArrayArray12[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static579.aClass34_Sub1_Sub1Array1[Static23.anInt559++] = arg0;
		} else {
			local40 = Static582.aClass35Array3 == Static368.aClass35Array1 ? 1 : 0;
			if (!arg0.method7845()) {
				arg0.aClass34_Sub1_23 = Static392.aClass34_Sub1Array4[local40];
				Static392.aClass34_Sub1Array4[local40] = arg0;
			} else if (arg0.method7853()) {
				arg0.aClass34_Sub1_23 = Static218.aClass34_Sub1Array2[local40];
				Static218.aClass34_Sub1Array2[local40] = arg0;
			} else {
				arg0.aClass34_Sub1_23 = Static368.aClass34_Sub1Array3[local40];
				Static368.aClass34_Sub1Array3[local40] = arg0;
				Static182.aBoolean246 = true;
			}
		}
		if (arg1) {
			arg0.anInt9622 -= local33;
		}
		return true;
	}
}
