import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!df", name = "r", descriptor = "I")
	public static int anInt9656;

	@OriginalMember(owner = "client!df", name = "m", descriptor = "Lclient!gda;")
	public static Class126 aClass126_274;

	@OriginalMember(owner = "client!df", name = "t", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_196 = new Class156(7, 3);

	@OriginalMember(owner = "client!df", name = "p", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_249 = new Class381(81, 7);

	@OriginalMember(owner = "client!df", name = "q", descriptor = "Z")
	public static boolean aBoolean677 = false;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IB)C")
	public static char method8227(@OriginalArg(1) byte arg0) {
		@Pc(13) int local13 = arg0 & 0xFF;
		if (local13 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local13, 16) + " provided");
		}
		if (local13 >= 128 && local13 < 160) {
			@Pc(52) char local52 = Static85.aCharArray15[local13 - 128];
			if (local52 == '\u0000') {
				local52 = '?';
			}
			local13 = local52;
		}
		return (char) local13;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(JJ)J")
	public static long method8232(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	public static String method8233(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(17) int local17 = arg0.indexOf(arg2); local17 != -1; local17 = arg0.indexOf(arg2, arg1.length() + local17)) {
			arg0 = arg0.substring(0, local17) + arg1 + arg0.substring(local17 + arg2.length());
		}
		return arg0;
	}
}
