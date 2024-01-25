import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!di", name = "g", descriptor = "J")
	public static long aLong49;

	@OriginalMember(owner = "client!di", name = "h", descriptor = "F")
	public static float aFloat44;

	@OriginalMember(owner = "client!di", name = "b", descriptor = "Lclient!wd;")
	public static final Class358 aClass358_8 = new Class358(6, 0, 4, 2);

	@OriginalMember(owner = "client!di", name = "e", descriptor = "[Lclient!lb;")
	public static final Class185[] aClass185Array1 = new Class185[14];

	@OriginalMember(owner = "client!di", name = "i", descriptor = "I")
	public static int anInt1935 = 0;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "([II)Ljava/lang/String;")
	public static String method1753(@OriginalArg(0) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static536.anInt8597;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(24) Class218 local24 = Static382.aClass268_1.method6061(arg0[local13]);
			if (local24.anInt6029 != -1) {
				@Pc(37) Class14 local37 = (Class14) Static106.aClass6_9.method92((long) local24.anInt6029);
				if (local37 == null) {
					@Pc(45) Class279 local45 = Static604.method6161(Static552.aClass322_150, local24.anInt6029, 0);
					if (local45 != null) {
						local37 = Static505.aClass45_11.method7398(local45, true);
						Static106.aClass6_9.method106((long) local24.anInt6029, local37);
					}
				}
				if (local37 != null) {
					Static348.aClass14Array12[local11] = local37;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}
}
