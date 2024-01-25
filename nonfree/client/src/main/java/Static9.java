import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "J")
	public static long aLong271;

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
	public static int anInt8933 = 765;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/lang/String;ZC)I")
	public static int method7343(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			if (arg1 == arg0.charAt(local17)) {
				local7++;
			}
		}
		return local7;
	}
}
