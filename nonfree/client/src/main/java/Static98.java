import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!db", name = "d", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_31 = new Class397(78, 3);

	@OriginalMember(owner = "client!db", name = "g", descriptor = "I")
	public static int anInt2139 = 0;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "I")
	public static int anInt2140 = 0;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIZIII)V")
	public static void method1974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static580.aClass3_Sub22_24.aClass21_Sub16_1.method5404() != 0 && arg0 != 0 && Static385.anInt5974 < 50 && arg4 != -1) {
			Static149.aClass398Array1[Static385.anInt5974++] = new Class398((byte) 2, arg4, arg0, arg2, arg3, arg1, arg5, (Class9_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "([IZLclient!kt;II)V")
	public static void method1975(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class9_Sub1_Sub1_Sub2 arg2, @OriginalArg(3) int arg3) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg2.anIntArray641 != null) {
			local6 = true;
			for (local8 = 0; local8 < arg2.anIntArray641.length; local8++) {
				if (arg2.anIntArray641[local8] != arg0[local8]) {
					local6 = false;
					break;
				}
			}
			@Pc(43) Class45 local43 = arg2.aClass45_10;
			if (local6 && local43.method6572()) {
				@Pc(58) Class149 local58 = arg2.aClass45_10.method6579();
				@Pc(61) int local61 = local58.anInt3736;
				if (local61 == 1) {
					local43.method6567(arg3);
				}
				if (local61 == 2) {
					local43.method6580();
				}
			}
		}
		local6 = true;
		for (local8 = 0; local8 < arg0.length; local8++) {
			if (arg0[local8] != -1) {
				local6 = false;
			}
			if (arg2.anIntArray641 == null || arg2.anIntArray641[local8] == -1 || Static592.aClass155_2.method3422(arg0[local8]).anInt3741 >= Static592.aClass155_2.method3422(arg2.anIntArray641[local8]).anInt3741) {
				arg2.anIntArray641 = arg0;
				arg2.aClass45_10.method6594(arg3);
				if (arg1) {
					arg2.anInt8816 = arg2.anInt8817;
				}
			}
		}
		if (!local6) {
			return;
		}
		arg2.anIntArray641 = arg0;
		arg2.aClass45_10.method6594(arg3);
		if (arg1) {
			arg2.anInt8816 = arg2.anInt8817;
			return;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IILclient!tc;IIII)Z")
	public static boolean method1976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class354 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (!Static42.aBoolean87 || !Static497.aBoolean530) {
			return false;
		} else if (Static532.anInt8283 < 100) {
			return false;
		} else if (arg4 != arg5 || arg0 != arg3) {
			for (@Pc(60) int local60 = arg5; local60 <= arg4; local60++) {
				for (@Pc(80) int local80 = arg3; local80 <= arg0; local80++) {
					if (Static466.anIntArrayArrayArray12[arg1][local60][local80] == -Static414.anInt6386) {
						return false;
					}
				}
			}
			if (Static709.method9464(arg2)) {
				Static456.anInt7106++;
				return true;
			} else {
				return false;
			}
		} else if (!Static323.method4705(arg1, arg3, arg5)) {
			return false;
		} else if (Static709.method9464(arg2)) {
			Static456.anInt7106++;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZBZI)I")
	public static int method1977(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class3_Sub38 local10 = Static14.method503(false, arg0);
		if (local10 == null) {
			return 0;
		}
		@Pc(17) int local17 = 0;
		for (@Pc(25) int local25 = 0; local25 < local10.anIntArray410.length; local25++) {
			if (local10.anIntArray410[local25] >= 0 && Static606.aClass62_2.anInt2047 > local10.anIntArray410[local25]) {
				@Pc(55) Class275 local55 = Static606.aClass62_2.method1887(local10.anIntArray410[local25]);
				@Pc(65) int local65 = local55.method6283(Static583.aClass150_2.method3385(arg2).anInt8150, arg2);
				if (arg1) {
					local17 += local10.anIntArray411[local25] * local65;
				} else {
					local17 += local65;
				}
			}
		}
		return local17;
	}
}
