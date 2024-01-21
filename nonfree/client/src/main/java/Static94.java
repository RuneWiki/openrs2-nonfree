import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "Lclient!re;")
	public static Class3_Sub1_Sub3_Sub4 aClass3_Sub1_Sub3_Sub4_22;

	@OriginalMember(owner = "client!lg", name = "s", descriptor = "Lclient!ha;")
	public static Class29 aClass29_7;

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
	public static int anInt2073 = 0;

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
	public static int anInt2078 = 1;

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1184 = Static122.method531(" x ");

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
	public static int anInt2079 = 0;

	@OriginalMember(owner = "client!lg", name = "n", descriptor = "Lclient!sc;")
	public static Class72 aClass72_29 = new Class72();

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
	public static void method1623() {
		aClass3_Sub1_Sub3_Sub4_22 = null;
		aClass29_7 = null;
		aClass72_29 = null;
		aClass73_1184 = null;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIII[Lclient!pf;I[BII)V")
	public static void method1624(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class60[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
				if (local3 + arg3 > 0 && local3 + arg3 < 103 && local7 + arg5 > 0 && arg5 + local7 < 103) {
					arg4[arg2].anIntArrayArray34[arg3 + local3][local7 + arg5] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(74) Class3_Sub12 local74 = new Class3_Sub12(arg6);
		for (@Pc(80) int local80 = 0; local80 < 4; local80++) {
			for (@Pc(84) int local84 = 0; local84 < 64; local84++) {
				for (@Pc(88) int local88 = 0; local88 < 64; local88++) {
					if (local80 == arg0 && local84 >= arg8 && local84 < arg8 + 8 && local88 >= arg1 && arg1 + 8 > local88) {
						Static101.method1772(0, arg7, 0, local74, Static180.method2780(local88 & 0x7, arg7, local84 & 0x7) + arg5, Static117.method2065(local84 & 0x7, arg7, local88 & 0x7) + arg3, arg2);
					} else {
						Static101.method1772(0, 0, 0, local74, -1, -1, 0);
					}
				}
			}
		}
	}
}
