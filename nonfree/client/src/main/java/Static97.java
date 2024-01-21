import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!ki", name = "U", descriptor = "Lclient!a;")
	public static Class1_Sub1 aClass1_Sub1_15;

	@OriginalMember(owner = "client!ki", name = "bb", descriptor = "I")
	public static int anInt2061;

	@OriginalMember(owner = "client!ki", name = "cb", descriptor = "I")
	public static int anInt2062;

	@OriginalMember(owner = "client!ki", name = "db", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!ki", name = "R", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_832 = Static120.method1824("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!ki", name = "V", descriptor = "Lclient!of;")
	public static Class70 aClass70_9 = new Class70();

	@OriginalMember(owner = "client!ki", name = "ab", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_833 = Static120.method1824("rect_debug=");

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIB)I")
	public static int method1462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (local12 + arg1) / arg0 - local12;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I[Lclient!rh;[BIIII)V")
	public static void method1465(@OriginalArg(1) Class82[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 64; local11++) {
				for (local15 = 0; local15 < 64; local15++) {
					if (arg2 + local11 > 0 && arg2 + local11 < 103 && arg4 + local15 > 0 && local15 + arg4 < 103) {
						arg0[local7].anIntArrayArray38[local11 + arg2][local15 + arg4] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(87) Class3_Sub17 local87 = new Class3_Sub17(arg1);
		for (local15 = 0; local15 < 4; local15++) {
			for (@Pc(93) int local93 = 0; local93 < 64; local93++) {
				for (@Pc(97) int local97 = 0; local97 < 64; local97++) {
					Static56.method826(local93 + arg2, arg3, 0, local15, arg5, local87, local97 + arg4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI)V")
	public static void method1466(@OriginalArg(0) boolean arg0) {
		if (Static88.aClass78_2 == null) {
			return;
		}
		try {
			@Pc(11) Class3_Sub17 local11 = new Class3_Sub17(4);
			local11.method2108(arg0 ? 2 : 3);
			local11.method2096(0);
			Static88.aClass78_2.method2419(local11.aByteArray40, 4);
		} catch (@Pc(32) IOException local32) {
			try {
				Static88.aClass78_2.method2417();
			} catch (@Pc(37) Exception local37) {
			}
			Static88.aClass78_2 = null;
			Static112.anInt2525++;
		}
	}
}
