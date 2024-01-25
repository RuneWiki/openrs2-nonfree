import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!db", name = "n", descriptor = "Lclient!ok;")
	public static Class25 aClass25_1;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "Lclient!kd;")
	public static Class188 aClass188_1;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!ha;ILclient!v;BI)V")
	public static void method1561(@OriginalArg(0) Class132 arg0, @OriginalArg(2) Class362 arg1) {
		Static473.aClass362_54.method8543();
		if (Static228.aBoolean234) {
			return;
		}
		for (@Pc(20) Class6_Sub24 local20 = (Class6_Sub24) arg1.method8538(); local20 != null; local20 = (Class6_Sub24) arg1.method8530()) {
			@Pc(28) Class318 local28 = Static528.aClass280_3.method6911(local20.anInt3909);
			if (Static452.method6552(local28)) {
				@Pc(40) boolean local40 = Static127.method1292(arg0, local28, local20);
				if (local40) {
					Static167.method2409(local28, arg0, local20);
				}
			}
		}
	}
}
