import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!ea", name = "y", descriptor = "Lclient!ha;")
	public static Class35 aClass35_13;

	@OriginalMember(owner = "client!ea", name = "x", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_62 = new Class202("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!ej;Z)Z")
	public static boolean method1914(@OriginalArg(0) Interface6 arg0) {
		@Pc(10) Class129 local10 = Static505.aClass206_4.method5326(arg0.method7688());
		if (local10.anInt3666 == -1) {
			return true;
		} else {
			@Pc(22) Class313 local22 = Static537.aClass112_4.method2955(local10.anInt3666);
			return local22.anInt9320 == -1 ? true : local22.method7746();
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[I)Ljava/lang/String;")
	public static String method1916(@OriginalArg(1) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static186.anInt3405;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(29) Class285 local29 = Static221.aClass225_1.method5907(arg0[local13]);
			if (local29.anInt8612 != -1) {
				@Pc(42) Class35 local42 = (Class35) Static392.aClass231_57.method6228((long) local29.anInt8612);
				if (local42 == null) {
					@Pc(50) Class241 local50 = Static558.method6373(Static460.aClass53_147, local29.anInt8612, 0);
					if (local50 != null) {
						local42 = Static103.aClass39_3.method6018(local50);
						Static392.aClass231_57.method6232(local42, (long) local29.anInt8612);
					}
				}
				if (local42 != null) {
					Static376.aClass35Array31[local11] = local42;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)Z")
	public static boolean method1917(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static498.method7327(arg0, arg1) & Static188.method254(arg1, arg0);
	}
}
