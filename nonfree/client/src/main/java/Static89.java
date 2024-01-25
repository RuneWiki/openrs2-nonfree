import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
	public static int anInt2126;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "[I")
	public static int[] anIntArray77;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "[Lclient!lia;")
	public static Class206[] aClass206Array1;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
	public static String method2004(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(23) int local23 = arg0[arg2 + local12] & 0xFF;
			if (local23 != 0) {
				if (local23 >= 128 && local23 < 160) {
					@Pc(44) char local44 = Static66.aCharArray1[local23 - 128];
					if (local44 == '\u0000') {
						local44 = '?';
					}
					local23 = local44;
				}
				local8[local10++] = (char) local23;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLclient!ha;I)Lclient!qt;")
	public static Class282 method2005(@OriginalArg(1) Class5 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class95 local9 = Static558.method8036(arg0, arg1, true);
		return local9 == null ? null : local9.aClass282_2;
	}
}
