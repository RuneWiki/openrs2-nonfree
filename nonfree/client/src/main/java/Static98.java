import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!dq", name = "k", descriptor = "Lclient!sv;")
	public static Class124 aClass124_1;

	@OriginalMember(owner = "client!dq", name = "m", descriptor = "I")
	public static int anInt2284;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
	public static int anInt2275 = 0;

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "Z")
	public static final boolean aBoolean194 = false;

	@OriginalMember(owner = "client!dq", name = "h", descriptor = "Z")
	public static boolean aBoolean195 = false;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIII)V")
	public static void method2076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static383.aClass12_Sub8_Sub2_1.anInt6217 = 0;
		Static383.aClass12_Sub8_Sub2_1.method5214(Static17.aClass137_7.anInt4298);
		Static383.aClass12_Sub8_Sub2_1.method5214(arg1);
		Static383.aClass12_Sub8_Sub2_1.method5214(arg3);
		Static383.aClass12_Sub8_Sub2_1.method5190(arg2);
		Static383.aClass12_Sub8_Sub2_1.method5190(arg0);
		Static96.anInt2249 = 0;
		Static194.anInt4316 = -3;
		Static267.anInt5373 = 0;
		Static175.anInt3980 = 1;
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V")
	public static void method2077() {
		Static305.method4966(Static208.aClass12_Sub10_Sub1_1.anInt2235);
		@Pc(17) int local17 = (Static61.anInt1459 >> 3) + (Static368.anInt6832 >> 10);
		Static56.anInt1418 = Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99 = 0;
		@Pc(30) int local30 = (Static203.anInt4534 >> 3) + (Static6.anInt93 >> 10);
		Static440.aClass30_Sub1_Sub1_Sub1_2.method782(8, 8);
		Static143.anIntArray236 = new int[18];
		Static427.aByteArrayArray26 = new byte[18][];
		Static174.anIntArrayArray38 = new int[18][4];
		Static13.anIntArray19 = new int[18];
		Static230.aByteArrayArray9 = new byte[18][];
		Static395.anIntArray494 = new int[18];
		Static443.anIntArray607 = new int[18];
		Static120.anIntArray222 = new int[18];
		Static28.aByteArrayArray10 = new byte[18][];
		Static100.anIntArray203 = new int[18];
		Static344.aByteArrayArray18 = new byte[18][];
		Static73.aByteArrayArray4 = new byte[18][];
		@Pc(81) int local81 = 0;
		@Pc(101) int local101;
		for (@Pc(90) int local90 = (local17 - (Static37.anInt7512 >> 4)) / 8; local90 <= (local17 + (Static37.anInt7512 >> 4)) / 8; local90++) {
			for (local101 = (local30 - (Static329.anInt6247 >> 4)) / 8; local101 <= ((Static329.anInt6247 >> 4) + local30) / 8; local101++) {
				@Pc(109) int local109 = local101 + (local90 << 8);
				Static443.anIntArray607[local81] = local109;
				Static120.anIntArray222[local81] = Static129.aClass16_119.method420("m" + local90 + "_" + local101);
				Static100.anIntArray203[local81] = Static129.aClass16_119.method420("l" + local90 + "_" + local101);
				Static13.anIntArray19[local81] = Static129.aClass16_119.method420("n" + local90 + "_" + local101);
				Static395.anIntArray494[local81] = Static129.aClass16_119.method420("um" + local90 + "_" + local101);
				Static143.anIntArray236[local81] = Static129.aClass16_119.method420("ul" + local90 + "_" + local101);
				if (Static13.anIntArray19[local81] == -1) {
					Static120.anIntArray222[local81] = -1;
					Static100.anIntArray203[local81] = -1;
					Static395.anIntArray494[local81] = -1;
					Static143.anIntArray236[local81] = -1;
				}
				local81++;
			}
		}
		for (local101 = local81; local101 < Static13.anIntArray19.length; local101++) {
			Static13.anIntArray19[local101] = -1;
			Static120.anIntArray222[local101] = -1;
			Static100.anIntArray203[local101] = -1;
			Static395.anIntArray494[local101] = -1;
			Static143.anIntArray236[local101] = -1;
		}
		@Pc(289) byte local289;
		if (Static96.anInt2243 == 1 || Static96.anInt2243 == 2) {
			local289 = 3;
		} else {
			local289 = 7;
		}
		Static253.method4365(local30, local289, local17, false);
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)V")
	public static void method2078() {
		@Pc(7) int local7 = 0;
		for (@Pc(17) int local17 = 0; local17 < Static37.anInt7512; local17++) {
			for (@Pc(21) int local21 = 0; local21 < Static329.anInt6247; local21++) {
				if (Static512.method7597(Static120.aClass37ArrayArrayArray1, local7, local17, true, local21)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
