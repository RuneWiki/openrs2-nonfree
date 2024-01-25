import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!er", name = "J", descriptor = "[I")
	public static int[] anIntArray100;

	@OriginalMember(owner = "client!er", name = "H", descriptor = "I")
	public static int anInt1683 = -2;

	@OriginalMember(owner = "client!er", name = "N", descriptor = "I")
	public static int anInt1688 = 0;

	@OriginalMember(owner = "client!er", name = "O", descriptor = "[I")
	public static final int[] anIntArray101 = new int[500];

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(Z)I")
	public static int method1335() {
		try {
			if (Static115.anInt2462 == 0) {
				if (Static215.aLong145 > Static53.method898() - 5000L) {
					return 0;
				}
				Static277.aClass207_7 = Static353.aClass42_5.method960(Static147.anInt2909, Static323.aString232);
				Static109.aLong90 = Static53.method898();
				Static115.anInt2462 = 1;
			}
			if (Static109.aLong90 + 30000L < Static53.method898()) {
				return Static258.method4380(1000);
			}
			@Pc(82) int local82;
			@Pc(119) int local119;
			if (Static115.anInt2462 == 1) {
				if (Static277.aClass207_7.anInt6346 == 2) {
					return Static258.method4380(1001);
				}
				if (Static277.aClass207_7.anInt6346 != 1) {
					return -1;
				}
				Static76.aClass16_2 = new Class16((Socket) Static277.aClass207_7.anObject7, Static353.aClass42_5);
				Static277.aClass207_7 = null;
				local82 = 0;
				if (Static323.aBoolean425) {
					local82 = Static190.anInt3979;
				}
				Static291.aClass3_Sub4_Sub2_3.anInt4268 = 0;
				Static291.aClass3_Sub4_Sub2_3.method3614(23);
				Static291.aClass3_Sub4_Sub2_3.method3650(local82);
				Static76.aClass16_2.method397(Static291.aClass3_Sub4_Sub2_3.aByteArray70, Static291.aClass3_Sub4_Sub2_3.anInt4268);
				if (Static348.aClass30_2 != null) {
					Static348.aClass30_2.method4515();
				}
				if (Static194.aClass30_1 != null) {
					Static194.aClass30_1.method4515();
				}
				local119 = Static76.aClass16_2.method394();
				if (Static348.aClass30_2 != null) {
					Static348.aClass30_2.method4515();
				}
				if (Static194.aClass30_1 != null) {
					Static194.aClass30_1.method4515();
				}
				if (local119 != 0) {
					return Static258.method4380(local119);
				}
				Static115.anInt2462 = 2;
			}
			if (Static115.anInt2462 == 2) {
				if (Static76.aClass16_2.method391() < 2) {
					return -1;
				}
				Static23.anInt577 = Static76.aClass16_2.method394();
				Static23.anInt577 <<= 0x8;
				Static23.anInt577 += Static76.aClass16_2.method394();
				Static269.aByteArray83 = new byte[Static23.anInt577];
				Static261.anInt5226 = 0;
				Static115.anInt2462 = 3;
			}
			if (Static115.anInt2462 != 3) {
				return -1;
			}
			local82 = Static76.aClass16_2.method391();
			if (local82 < 1) {
				return -1;
			}
			if (local82 > Static23.anInt577 - Static261.anInt5226) {
				local82 = Static23.anInt577 - Static261.anInt5226;
			}
			Static76.aClass16_2.method398(Static269.aByteArray83, Static261.anInt5226, local82);
			Static261.anInt5226 += local82;
			if (Static23.anInt577 > Static261.anInt5226) {
				return -1;
			} else if (Static245.method4179(Static269.aByteArray83)) {
				Static302.aClass58_Sub1Array2 = new Class58_Sub1[Static157.anInt3025];
				local119 = 0;
				for (@Pc(230) int local230 = Static216.anInt4416; local230 <= Static152.anInt2970; local230++) {
					@Pc(236) Class58_Sub1 local236 = Static219.method3808(local230);
					if (local236 != null) {
						Static302.aClass58_Sub1Array2[local119++] = local236;
					}
				}
				Static169.anInt3574 = 0;
				Static91.aClass3_Sub33_1 = null;
				Static76.aClass16_2.method392();
				Static267.anInt5393 = 0;
				Static269.aByteArray83 = null;
				Static76.aClass16_2 = null;
				Static115.anInt2462 = 0;
				Static215.aLong145 = Static53.method898();
				return 0;
			} else {
				return Static258.method4380(1002);
			}
		} catch (@Pc(268) IOException local268) {
			return Static258.method4380(1003);
		}
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(I)V")
	public static void method1336() {
		Static291.aClass3_Sub4_Sub2_3.anInt4268 = 0;
		Static306.anInt6046 = 0;
		Static307.anInt6101 = -1;
		Static312.anInt6287 = -1;
		Static20.aClass3_Sub4_Sub2_1.anInt4268 = 0;
		Static1.anInt8 = 0;
		Static170.anInt6276 = -1;
		Static92.anInt1818 = -1;
		Static37.anInt6453 = 0;
		Static152.method2450();
		Static190.method3408();
		for (@Pc(31) int local31 = 0; local31 < Static254.aClass5_Sub4_Sub4_Sub1Array1.length; local31++) {
			if (Static254.aClass5_Sub4_Sub4_Sub1Array1[local31] != null) {
				Static254.aClass5_Sub4_Sub4_Sub1Array1[local31].anInt4942 = -1;
			}
		}
		for (@Pc(49) int local49 = 0; local49 < Static244.aClass5_Sub4_Sub4_Sub2Array1.length; local49++) {
			if (Static244.aClass5_Sub4_Sub4_Sub2Array1[local49] != null) {
				Static244.aClass5_Sub4_Sub4_Sub2Array1[local49].anInt4942 = -1;
			}
		}
		Static21.method422();
		Static261.anInt5200 = 1;
		Static353.method5714(30);
		for (@Pc(74) int local74 = 0; local74 < 100; local74++) {
			Static159.aBooleanArray13[local74] = true;
		}
		Static227.method3951();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "([[[BLclient!tj;IIIIIIIIIII)V")
	public static void method1337(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg4 == 0 || arg7 == 0) {
			return;
		}
		if (arg4 == 9) {
			arg8 = arg8 + 1 & 0x3;
			arg4 = 1;
		}
		if (arg4 == 10) {
			arg4 = 1;
			arg8 = arg8 + 3 & 0x3;
		}
		if (arg4 == 11) {
			arg8 = arg8 + 3 & 0x3;
			arg4 = 8;
		}
		arg1.method4771(arg6, arg2, arg10, arg11, arg5, arg3, arg0[arg4 - 1][arg8], arg7, arg9);
	}
}
