import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "Z")
	public static boolean aBoolean94 = false;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!gr;IIIII)V")
	public static void method1282(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt4161 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) int local16 = Static117.anIntArrayArrayArray9[arg1][local4][local7];
				@Pc(18) int local18 = 0;
				while (true) {
					label49: while (true) {
						if (local18 > 24) {
							continue label54;
						}
						@Pc(25) int local25 = local16 >>> local18 & 0xFF;
						if (local25 <= 0) {
							continue label54;
						}
						@Pc(33) Class11_Sub5_Sub1 local33 = Static171.aClass11_Sub5_Sub1Array2[local25 - 1];
						for (@Pc(35) int local35 = 0; local35 < arg0.anInt4161; local35++) {
							if (arg0.aClass11_Sub5_Sub1Array3[local35] == local33) {
								local18 += 8;
								continue label49;
							}
						}
						arg0.aClass11_Sub5_Sub1Array3[arg0.anInt4161++] = local33;
						if (arg0.anInt4161 == 4) {
							break label56;
						}
						local18 += 8;
					}
				}
			}
		}
		for (local7 = arg0.anInt4161; local7 < 4; local7++) {
			arg0.aClass11_Sub5_Sub1Array3[local7] = null;
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BIIJ)V")
	public static void method1283(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		@Pc(10) int local10 = (int) arg2 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg2 >> 20 & 0x3;
		@Pc(34) int local34 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static81.method1214(Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0], Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0], local10, 0, arg1, local17, arg0, 0, 0, true);
			return;
		}
		@Pc(49) Class84 local49 = Static108.method1650(local34);
		@Pc(59) int local59;
		@Pc(62) int local62;
		if (local17 == 0 || local17 == 2) {
			local59 = local49.anInt1988;
			local62 = local49.anInt2035;
		} else {
			local62 = local49.anInt1988;
			local59 = local49.anInt2035;
		}
		@Pc(73) int local73 = local49.anInt2029;
		if (local17 != 0) {
			local73 = (local73 << local17 & 0xF) + (local73 >> 4 - local17);
		}
		Static81.method1214(Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0], Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0], 0, local59, arg1, 0, arg0, local73, local62, true);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)Z")
	public static boolean method1284() {
		try {
			return Static184.method3191();
		} catch (@Pc(17) IOException local17) {
			Static118.method1787();
			return true;
		} catch (@Pc(22) Exception local22) {
			@Pc(63) String local63 = "T2 - " + Static34.anInt635 + "," + Static196.anInt4002 + "," + Static132.anInt2475 + " - " + Static315.anInt6163 + "," + (Static182.anInt3662 + Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0]) + "," + (Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0] + Static169.anInt6312) + " - ";
			for (@Pc(65) int local65 = 0; local65 < Static315.anInt6163 && local65 < 50; local65++) {
				local63 = local63 + Static246.aClass11_Sub25_Sub1_3.aByteArray93[local65] + ",";
			}
			Static38.method554(local22, local63);
			Static25.method5367();
			return true;
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZIILclient!ms;)V")
	public static void method1285(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class137 arg2) {
		Static193.anInt3961 = arg0;
		Static263.anInt5386 = arg1;
		Static237.aClass137_13 = arg2;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)Lclient!nn;")
	public static Class11_Sub4_Sub12 method1286() {
		@Pc(13) Class11_Sub4_Sub12 local13 = (Class11_Sub4_Sub12) Static86.aClass74_5.method1294();
		if (local13 != null) {
			local13.method5701();
			local13.method5580();
			return local13;
		}
		do {
			local13 = (Class11_Sub4_Sub12) Static64.aClass74_4.method1294();
			if (local13 == null) {
				return null;
			}
			if (local13.method3860() > Static268.method4627()) {
				return null;
			}
			local13.method5701();
			local13.method5580();
		} while ((local13.aLong208 & Long.MIN_VALUE) == 0L);
		return local13;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(B[B)[B")
	public static byte[] method1287(@OriginalArg(1) byte[] arg0) {
		@Pc(14) int local14 = arg0.length;
		@Pc(17) byte[] local17 = new byte[local14];
		Static363.method1668(arg0, 0, local17, 0, local14);
		return local17;
	}
}
