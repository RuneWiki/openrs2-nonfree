import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!de", name = "a", descriptor = "I")
	public static int anInt2269 = 0;

	@OriginalMember(owner = "client!de", name = "f", descriptor = "I")
	public static int anInt2274 = -50;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III[BII)V")
	public static void method1909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg3) {
			return;
		}
		arg0 += arg1;
		@Pc(20) int local20 = arg3 - arg1 >> 2;
		while (true) {
			local20--;
			if (local20 < 0) {
				local20 = arg3 - arg1 & 0x3;
				while (true) {
					local20--;
					if (local20 < 0) {
						return;
					}
					arg2[arg0++] = 1;
				}
			}
			@Pc(25) int local25 = arg0 + 1;
			arg2[arg0] = 1;
			@Pc(30) int local30 = local25 + 1;
			arg2[local25] = 1;
			@Pc(35) int local35 = local30 + 1;
			arg2[local30] = 1;
			arg0 = local35 + 1;
			arg2[local35] = 1;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZII)Lclient!uca;")
	public static Class2_Sub43 method1915(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(17) long local17 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
		return (Class2_Sub43) Static55.aClass323_5.method7484(local17);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)C")
	public static char method1918(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(41) char local41 = Static45.aCharArray1[local7 - 128];
			if (local41 == '\u0000') {
				local41 = '?';
			}
			local7 = local41;
		}
		return (char) local7;
	}
}
