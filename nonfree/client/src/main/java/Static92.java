import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!df", name = "a", descriptor = "[Lclient!hu;")
	public static Class44[] aClass44Array17;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "I")
	public static int anInt9993;

	@OriginalMember(owner = "client!df", name = "f", descriptor = "I")
	public static int anInt9992 = 0;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!ha;IIIIIIZZ)V")
	public static void method8486(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static480.aClass126_12 = arg0;
		Static40.anInt704 = arg1;
		Static425.aBoolean601 = Static40.anInt704 > 1 && Static480.aClass126_12.method7043();
		Static162.anInt2830 = 9;
		Static407.anInt7012 = 0x1 << Static162.anInt2830;
		Static617.anInt10032 = Static407.anInt7012 >> 1;
		Math.sqrt((double) (Static617.anInt10032 * Static617.anInt10032 + Static617.anInt10032 * Static617.anInt10032));
		Static36.anInt662 = 4;
		Static129.anInt6336 = arg2;
		Static150.anInt2400 = arg3;
		Static597.anInt9765 = arg4;
		Static18.aClass179_1 = Static390.method5991();
		Static84.method1335();
		Static138.aClass156ArrayArrayArray1 = new Class156[4][Static129.anInt6336][Static150.anInt2400];
		Static492.aClass40Array3 = new Class40[4];
		if (arg5) {
			Static413.anIntArrayArray37 = new int[Static129.anInt6336][Static150.anInt2400];
			Static423.aByteArrayArray17 = new byte[Static129.anInt6336][Static150.anInt2400];
			Static402.aShortArrayArray19 = new short[Static129.anInt6336][Static150.anInt2400];
			Static573.aClass156ArrayArrayArray3 = new Class156[1][Static129.anInt6336][Static150.anInt2400];
			Static327.aClass40Array2 = new Class40[1];
		} else {
			Static413.anIntArrayArray37 = null;
			Static423.aByteArrayArray17 = null;
			Static402.aShortArrayArray19 = null;
			Static573.aClass156ArrayArrayArray3 = null;
			Static327.aClass40Array2 = null;
		}
		if (arg6) {
			Static484.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static580.aClass175Array12 = new Class175[65535];
			Static467.aBooleanArray48 = new boolean[65535];
			Static181.anInt3279 = 0;
		} else {
			Static484.aLongArrayArrayArray1 = null;
			Static580.aClass175Array12 = null;
			Static467.aBooleanArray48 = null;
			Static181.anInt3279 = 0;
		}
		Static113.method1651(false);
		Static250.aClass14_Sub1Array2 = new Class14_Sub1[2];
		Static151.aClass14_Sub1Array1 = new Class14_Sub1[2];
		Static469.aClass14_Sub1Array5 = new Class14_Sub1[2];
		Static444.aClass14_Sub1Array4 = new Class14_Sub1[10000];
		Static229.anInt3963 = 0;
		Static294.aClass14_Sub1Array3 = new Class14_Sub1[5000];
		Static113.anInt1784 = 0;
		Static53.aClass14_Sub1_Sub1Array1 = new Class14_Sub1_Sub1[5000];
		Static594.anInt9723 = 0;
		Static601.aBooleanArrayArray17 = new boolean[Static597.anInt9765 + Static597.anInt9765 + 1][Static597.anInt9765 + Static597.anInt9765 + 1];
		Static192.aBooleanArrayArray15 = new boolean[Static597.anInt9765 + Static597.anInt9765 + 2][Static597.anInt9765 + Static597.anInt9765 + 2];
		Static636.anIntArray827 = new int[Static597.anInt9765 + Static597.anInt9765 + 2];
		Static599.aClass43_3 = Static599.aClass43_2;
		if (Static425.aBoolean601) {
			Static563.aBooleanArrayArrayArray2 = new boolean[4][Static597.anInt9765 + Static597.anInt9765 + 1][Static597.anInt9765 + Static597.anInt9765 + 1];
			Static176.aBooleanArrayArrayArray1 = new boolean[4][][];
			if (Static311.aClass301Array1 != null) {
				Static115.method1659();
			}
			Static311.aClass301Array1 = new Class301[Static40.anInt704];
			Static480.aClass126_12.method7007(Static311.aClass301Array1.length + 1);
			Static480.aClass126_12.method7049(0);
			for (@Pc(205) int local205 = 0; local205 < Static311.aClass301Array1.length; local205++) {
				Static311.aClass301Array1[local205] = new Class301(local205 + 1, Static480.aClass126_12);
				(new Thread(Static311.aClass301Array1[local205], "wr" + local205)).start();
			}
			@Pc(240) byte local240;
			if (Static40.anInt704 == 2) {
				local240 = 4;
				Static401.anInt8429 = 2;
			} else if (Static40.anInt704 == 3) {
				local240 = 6;
				Static401.anInt8429 = 3;
			} else {
				local240 = 8;
				Static401.anInt8429 = 4;
			}
			Static589.aClass350Array3 = new Class350[local240];
			for (@Pc(260) int local260 = 0; local260 < local240; local260++) {
				Static589.aClass350Array3[local260] = new Class350(Static397.aStringArrayArray2[Static40.anInt704 - 2][local260]);
			}
		} else {
			Static401.anInt8429 = 1;
		}
		Static466.anIntArray626 = new int[Static401.anInt8429 - 1];
		Static613.anIntArray806 = new int[Static401.anInt8429 - 1];
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "([ILclient!fs;[II[I)V")
	public static void method8490(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class14_Sub1_Sub1_Sub3_Sub2 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(11) int local11 = 0; local11 < arg3.length; local11++) {
			@Pc(17) int local17 = arg3[local11];
			@Pc(21) int local21 = arg2[local11];
			@Pc(25) int local25 = arg0[local11];
			for (@Pc(27) int local27 = 0; local21 != 0 && local27 < arg1.aClass299Array3.length; local27++) {
				if ((local21 & 0x1) != 0) {
					if (local17 == -1) {
						arg1.aClass299Array3[local27] = null;
					} else {
						@Pc(44) Class200 local44 = Static396.aClass359_2.method8415(local17);
						@Pc(47) int local47 = local44.anInt4871;
						@Pc(52) Class299 local52 = arg1.aClass299Array3[local27];
						if (local52 != null) {
							if (local52.anInt8050 == local17) {
								if (local47 == 0) {
									local52 = arg1.aClass299Array3[local27] = null;
								} else if (local47 == 1) {
									local52.anInt8047 = local25;
									local52.anInt8045 = 0;
									local52.anInt8049 = 1;
									local52.anInt8044 = 0;
									local52.anInt8048 = 0;
									if (!arg1.aBoolean255) {
										Static270.method4083(local44, 0, arg1);
									}
								} else if (local47 == 2) {
									local52.anInt8048 = 0;
								}
							} else if (local44.anInt4870 >= Static396.aClass359_2.method8415(local52.anInt8050).anInt4870) {
								local52 = arg1.aClass299Array3[local27] = null;
							}
						}
						if (local52 == null) {
							local52 = arg1.aClass299Array3[local27] = new Class299();
							local52.anInt8048 = 0;
							local52.anInt8045 = 0;
							local52.anInt8047 = local25;
							local52.anInt8049 = 1;
							local52.anInt8050 = local17;
							local52.anInt8044 = 0;
							if (!arg1.aBoolean255) {
								Static270.method4083(local44, 0, arg1);
							}
						}
					}
				}
				local21 >>>= 0x1;
			}
		}
	}
}
