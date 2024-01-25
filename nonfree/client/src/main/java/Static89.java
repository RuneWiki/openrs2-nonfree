import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "Lclient!tba;")
	public static Class315 aClass315_7;

	@OriginalMember(owner = "client!dea", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!dea", name = "d", descriptor = "I")
	public static int anInt2312 = 0;

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(III)Z")
	public static boolean method2280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static63.method1346(arg0, arg1) | (arg0 & 0x70000) != 0 || Static631.method8541(arg0, arg1);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "([BIBI)Ljava/lang/String;")
	public static String method2282(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(10) int local10 = 0;
		for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
			@Pc(30) int local30 = arg0[local20 + arg1] & 0xFF;
			if (local30 != 0) {
				if (local30 >= 128 && local30 < 160) {
					@Pc(46) char local46 = Static565.aCharArray7[local30 - 128];
					if (local46 == '\u0000') {
						local46 = '?';
					}
					local30 = local46;
				}
				local8[local10++] = (char) local30;
			}
		}
		return new String(local8, 0, local10);
	}
}
