import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!dh", name = "J", descriptor = "I")
	public static int anInt2817;

	@OriginalMember(owner = "client!dh", name = "A", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_37 = new Class73(60, 4);

	@OriginalMember(owner = "client!dh", name = "K", descriptor = "[I")
	public static final int[] anIntArray92 = new int[3];

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIB[B)Ljava/lang/String;")
	public static String method2380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(10) int local10 = 0;
		for (@Pc(23) int local23 = 0; local23 < arg0; local23++) {
			@Pc(33) int local33 = arg2[arg1 + local23] & 0xFF;
			if (local33 != 0) {
				if (local33 >= 128 && local33 < 160) {
					@Pc(52) char local52 = Static125.aCharArray7[local33 - 128];
					if (local52 == '\u0000') {
						local52 = '?';
					}
					local33 = local52;
				}
				local8[local10++] = (char) local33;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIBII)V")
	public static void method2382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static612.anInt10334 = arg5;
		Static94.anInt2721 = arg3;
		Static381.anInt7217 = arg0;
		Static608.anInt10294 = arg2;
		Static264.anInt5684 = arg4;
		Static462.anInt8286 = arg1;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILclient!ha;)Lclient!mv;")
	public static Class213 method2384(@OriginalArg(0) int arg0, @OriginalArg(2) Class5 arg1) {
		@Pc(17) Class259 local17 = Static212.method3804(arg0, true, arg1);
		return local17 == null ? null : local17.aClass213_13;
	}
}
