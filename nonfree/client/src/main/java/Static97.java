import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "[I")
	public static int[] anIntArray240;

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray13 = new int[4][13][13];

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
	public static int anInt2381 = 0;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!i;Z)V")
	public static void method1682(@OriginalArg(0) Class41 arg0) {
		Static18.aClass41_119 = arg0;
		Static177.method2840();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;)Lclient!i;")
	public static Class41 method1683(@OriginalArg(1) String arg0) {
		@Pc(9) byte[] local9;
		try {
			local9 = arg0.getBytes("ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = arg0.getBytes();
		}
		@Pc(18) Class41 local18 = new Class41();
		local18.anInt2012 = 0;
		local18.aByteArray26 = local9;
		for (@Pc(26) int local26 = 0; local26 < local9.length; local26++) {
			if (local9[local26] != 0) {
				local9[local18.anInt2012++] = local9[local26];
			}
		}
		return local18;
	}
}
