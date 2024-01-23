import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!kd", name = "V", descriptor = "[Lclient!rc;")
	public static Class2_Sub2_Sub16[] aClass2_Sub2_Sub16Array12;

	@OriginalMember(owner = "client!kd", name = "db", descriptor = "[I")
	public static int[] anIntArray242;

	@OriginalMember(owner = "client!kd", name = "S", descriptor = "Lclient!i;")
	private static Class41 aClass41_713 = Static184.method2923("Connection lost)3");

	@OriginalMember(owner = "client!kd", name = "T", descriptor = "Lclient!id;")
	public static Class43 aClass43_9 = new Class43(200);

	@OriginalMember(owner = "client!kd", name = "U", descriptor = "Lclient!i;")
	public static Class41 aClass41_714 = aClass41_713;

	@OriginalMember(owner = "client!kd", name = "X", descriptor = "[Z")
	public static boolean[] aBooleanArray13 = new boolean[100];

	@OriginalMember(owner = "client!kd", name = "Z", descriptor = "I")
	public static int anInt2417 = 0;

	@OriginalMember(owner = "client!kd", name = "ab", descriptor = "Lclient!i;")
	public static Class41 aClass41_715 = Static184.method2923("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!kd", name = "eb", descriptor = "[I")
	public static int[] anIntArray243 = new int[2000];

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIII[[[B[I[I[I[I[IIBII)V")
	public static void method1709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[][][] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(14) int arg12, @OriginalArg(15) int arg13) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static44.anInt1331 * 128) {
			arg0 = Static44.anInt1331 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static59.anInt1642 * 128) {
			arg2 = Static59.anInt1642 * 128 - 1;
		}
		Static86.anInt2170 = Class79.anIntArray377[arg3];
		Static177.anInt4128 = Class79.anIntArray375[arg3];
		Static151.anInt3441 = Class79.anIntArray377[arg4];
		Static144.anInt3296 = Class79.anIntArray375[arg4];
		Static65.anInt1729 = arg0;
		Static214.anInt4717 = arg1;
		Static191.anInt4374 = arg2;
		Static69.anInt1824 = arg0 / 128;
		Static77.anInt1993 = arg2 / 128;
		Static140.anInt3233 = arg5;
		Static141.anInt3249 = Static69.anInt1824 - Static135.anInt3149;
		if (Static141.anInt3249 < 0) {
			Static141.anInt3249 = 0;
		}
		Static89.anInt2200 = Static77.anInt1993 - Static135.anInt3149;
		if (Static89.anInt2200 < 0) {
			Static89.anInt2200 = 0;
		}
		Static5.anInt285 = Static69.anInt1824 + Static135.anInt3149;
		if (Static5.anInt285 > Static44.anInt1331) {
			Static5.anInt285 = Static44.anInt1331;
		}
		Static204.anInt4550 = Static77.anInt1993 + Static135.anInt3149;
		if (Static204.anInt4550 > Static59.anInt1642) {
			Static204.anInt4550 = Static59.anInt1642;
		}
		@Pc(104) int local104;
		@Pc(115) int local115;
		for (@Pc(101) int local101 = 0; local101 < Static135.anInt3149 + Static135.anInt3149 + 2; local101++) {
			for (local104 = 0; local104 < Static135.anInt3149 + Static135.anInt3149 + 2; local104++) {
				local115 = (local101 - Static135.anInt3149 << 7) - (Static65.anInt1729 & 0x7F);
				@Pc(125) int local125 = (local104 - Static135.anInt3149 << 7) - (Static191.anInt4374 & 0x7F);
				@Pc(131) int local131 = Static69.anInt1824 + local101 - Static135.anInt3149;
				@Pc(137) int local137 = Static77.anInt1993 + local104 - Static135.anInt3149;
				if (local131 >= 0 && local137 >= 0 && local131 < Static44.anInt1331 && local137 < Static59.anInt1642) {
					@Pc(161) int local161;
					if (Static139.anIntArrayArrayArray16 == null) {
						local161 = Static130.anIntArrayArrayArray19[0][local131][local137] + 128 - Static214.anInt4717;
					} else {
						local161 = Static139.anIntArrayArrayArray16[0][local131][local137] + 128 - Static214.anInt4717;
					}
					@Pc(186) int local186 = Static130.anIntArrayArrayArray19[3][local131][local137] - Static214.anInt4717 - 1000;
					Static44.aBooleanArrayArray2[local101][local104] = Static179.method2859(local115, local186, local161, local125);
				} else {
					Static44.aBooleanArrayArray2[local101][local104] = false;
				}
			}
		}
		for (local104 = 0; local104 < Static135.anInt3149 + Static135.anInt3149 + 1; local104++) {
			for (local115 = 0; local115 < Static135.anInt3149 + Static135.anInt3149 + 1; local115++) {
				Static17.aBooleanArrayArray1[local104][local115] = Static44.aBooleanArrayArray2[local104][local115] || Static44.aBooleanArrayArray2[local104 + 1][local115] || Static44.aBooleanArrayArray2[local104][local115 + 1] || Static44.aBooleanArrayArray2[local104 + 1][local115 + 1];
			}
		}
		Static218.anIntArray497 = arg7;
		Static40.anIntArray103 = arg8;
		Static163.anIntArray402 = arg9;
		Static129.anIntArray44 = arg10;
		Static180.anIntArray432 = arg11;
		Static170.method2735();
		Static104.method1779(arg0, arg1, arg2, arg6, arg12, arg13);
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)V")
	public static void method1710() {
		for (@Pc(6) Class2_Sub20 local6 = (Class2_Sub20) Static56.aClass108_4.method3322(); local6 != null; local6 = (Class2_Sub20) Static56.aClass108_4.method3331()) {
			if (local6.anInt3291 > 0) {
				local6.anInt3291--;
			}
			if (local6.anInt3291 != 0) {
				if (local6.anInt3284 > 0) {
					local6.anInt3284--;
				}
				if (local6.anInt3284 == 0 && local6.anInt3289 >= 1 && local6.anInt3282 >= 1 && local6.anInt3289 <= 102 && local6.anInt3282 <= 102 && (local6.anInt3281 < 0 || Static7.method244(local6.anInt3292, local6.anInt3281))) {
					Static100.method1728(local6.anInt3285, local6.anInt3293, local6.anInt3282, local6.anInt3292, local6.anInt3281, local6.anInt3298, local6.anInt3289);
					local6.anInt3284 = -1;
					if (local6.anInt3281 == local6.anInt3283 && local6.anInt3283 == -1) {
						local6.method3314();
					} else if (local6.anInt3281 == local6.anInt3283 && local6.anInt3294 == local6.anInt3298 && local6.anInt3290 == local6.anInt3292) {
						local6.method3314();
					}
				}
			} else if (local6.anInt3283 < 0 || Static7.method244(local6.anInt3290, local6.anInt3283)) {
				Static100.method1728(local6.anInt3285, local6.anInt3293, local6.anInt3282, local6.anInt3290, local6.anInt3283, local6.anInt3294, local6.anInt3289);
				local6.method3314();
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(IIIIIIII)V")
	public static void method1711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 0 || arg5 < 0 || arg1 >= 103 || arg5 >= 103) {
			return;
		}
		@Pc(45) int local45;
		if (arg2 == 0) {
			@Pc(35) Class71 local35 = Static170.method2736(arg4, arg1, arg5);
			if (local35 != null) {
				local45 = Integer.MAX_VALUE & (int) (local35.aLong100 >>> 32);
				if (arg0 == 2) {
					local35.aClass12_5 = new Class12_Sub5(local45, 2, arg3 + 4, arg4, arg1, arg5, arg6, false, local35.aClass12_5);
					local35.aClass12_6 = new Class12_Sub5(local45, 2, arg3 + 1 & 0x3, arg4, arg1, arg5, arg6, false, local35.aClass12_6);
				} else {
					local35.aClass12_5 = new Class12_Sub5(local45, arg0, arg3, arg4, arg1, arg5, arg6, false, local35.aClass12_5);
				}
			}
		}
		if (arg2 == 1) {
			@Pc(111) Class35 local111 = Static68.method1241(arg4, arg1, arg5);
			if (local111 != null) {
				local45 = (int) (local111.aLong44 >>> 32) & Integer.MAX_VALUE;
				if (arg0 == 4 || arg0 == 5) {
					local111.aClass12_1 = new Class12_Sub5(local45, 4, arg3, arg4, arg1, arg5, arg6, false, local111.aClass12_1);
				} else if (arg0 == 6) {
					local111.aClass12_1 = new Class12_Sub5(local45, 4, arg3 + 4, arg4, arg1, arg5, arg6, false, local111.aClass12_1);
				} else if (arg0 == 7) {
					local111.aClass12_1 = new Class12_Sub5(local45, 4, (arg3 + 2 & 0x3) + 4, arg4, arg1, arg5, arg6, false, local111.aClass12_1);
				} else if (arg0 == 8) {
					local111.aClass12_1 = new Class12_Sub5(local45, 4, arg3 + 4, arg4, arg1, arg5, arg6, false, local111.aClass12_1);
					local111.aClass12_2 = new Class12_Sub5(local45, 4, (arg3 + 2 & 0x3) + 4, arg4, arg1, arg5, arg6, false, local111.aClass12_2);
				}
			}
		}
		if (arg2 == 2) {
			if (arg0 == 11) {
				arg0 = 10;
			}
			@Pc(258) Class51 local258 = Static180.method2871(arg4, arg1, arg5);
			if (local258 != null) {
				local258.aClass12_4 = new Class12_Sub5((int) (local258.aLong69 >>> 32) & Integer.MAX_VALUE, arg0, arg3, arg4, arg1, arg5, arg6, false, local258.aClass12_4);
			}
		}
		if (arg2 != 3) {
			return;
		}
		@Pc(289) Class78 local289 = Static49.method969(arg4, arg1, arg5);
		if (local289 != null) {
			local289.aClass12_7 = new Class12_Sub5((int) (local289.aLong103 >>> 32) & Integer.MAX_VALUE, 22, arg3, arg4, arg1, arg5, arg6, false, local289.aClass12_7);
			return;
		}
	}
}
