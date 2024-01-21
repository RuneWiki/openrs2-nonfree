import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!lg", name = "w", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray41;

	@OriginalMember(owner = "client!lg", name = "z", descriptor = "Lclient!ah;")
	public static Class7 aClass7_67;

	@OriginalMember(owner = "client!lg", name = "A", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1474 = Static170.method3101("Prepared sound engine");

	@OriginalMember(owner = "client!lg", name = "s", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1473 = aClass28_1474;

	@OriginalMember(owner = "client!lg", name = "x", descriptor = "I")
	public static int anInt4203 = 0;

	@OriginalMember(owner = "client!lg", name = "D", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1475 = Static170.method3101("<col=00ffff>");

	@OriginalMember(owner = "client!lg", name = "G", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1477 = Static170.method3101("Login");

	@OriginalMember(owner = "client!lg", name = "E", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1476 = aClass28_1477;

	@OriginalMember(owner = "client!lg", name = "F", descriptor = "Z")
	public static boolean aBoolean194 = true;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZI)V")
	public static void method3170(@OriginalArg(0) boolean arg0) {
		if (Static121.aClass38_2 == null) {
			return;
		}
		try {
			@Pc(11) Class3_Sub8 local11 = new Class3_Sub8(4);
			local11.method1550(arg0 ? 2 : 3);
			local11.method1526(0);
			Static121.aClass38_2.method1633(4, local11.aByteArray19);
		} catch (@Pc(32) IOException local32) {
			try {
				Static121.aClass38_2.method1632();
			} catch (@Pc(37) Exception local37) {
			}
			Static44.anInt3938++;
			Static121.aClass38_2 = null;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IILclient!ah;I)[Lclient!dh;")
	public static Class3_Sub2_Sub2_Sub3[] method3171(@OriginalArg(1) int arg0, @OriginalArg(2) Class7 arg1, @OriginalArg(3) int arg2) {
		return Static162.method3012(arg2, arg0, arg1) ? Static150.method2831() : null;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(Z)V")
	public static void method3172() {
		anIntArrayArrayArray41 = null;
		aClass28_1474 = null;
		aClass28_1475 = null;
		aClass7_67 = null;
		aClass28_1473 = null;
		aClass28_1476 = null;
		aClass28_1477 = null;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIIIILclient!kb;IZJ)Z")
	public static boolean method3173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class3_Sub2_Sub1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= Static90.anInt2564 || local4 >= Static87.anInt2536) {
					return false;
				}
				@Pc(25) Class3_Sub20 local25 = Static149.aClass3_Sub20ArrayArrayArray1[arg0][local1][local4];
				if (local25 != null && local25.anInt3336 >= 5) {
					return false;
				}
			}
		}
		@Pc(49) Class32 local49 = new Class32();
		local49.aLong49 = arg11;
		local49.anInt1441 = arg0;
		local49.anInt1438 = arg5;
		local49.anInt1444 = arg6;
		local49.anInt1445 = arg7;
		local49.aClass3_Sub2_Sub1_3 = arg8;
		local49.anInt1443 = arg9;
		local49.anInt1450 = arg1;
		local49.anInt1449 = arg2;
		local49.anInt1439 = arg1 + arg3 - 1;
		local49.anInt1447 = arg2 + arg4 - 1;
		for (@Pc(92) int local92 = arg1; local92 < arg1 + arg3; local92++) {
			for (@Pc(95) int local95 = arg2; local95 < arg2 + arg4; local95++) {
				@Pc(98) int local98 = 0;
				if (local92 > arg1) {
					local98++;
				}
				if (local92 < arg1 + arg3 - 1) {
					local98 += 4;
				}
				if (local95 > arg2) {
					local98 += 8;
				}
				if (local95 < arg2 + arg4 - 1) {
					local98 += 2;
				}
				for (@Pc(124) int local124 = arg0; local124 >= 0; local124--) {
					if (Static149.aClass3_Sub20ArrayArrayArray1[local124][local92][local95] == null) {
						Static149.aClass3_Sub20ArrayArrayArray1[local124][local92][local95] = new Class3_Sub20(local124, local92, local95);
					}
				}
				@Pc(157) Class3_Sub20 local157 = Static149.aClass3_Sub20ArrayArrayArray1[arg0][local92][local95];
				local157.aClass32Array3[local157.anInt3336] = local49;
				local157.anIntArray576[local157.anInt3336] = local98;
				local157.anInt3342 |= local98;
				local157.anInt3336++;
			}
		}
		if (arg10) {
			Static90.aClass32Array1[Static11.anInt411++] = local49;
		}
		return true;
	}
}
