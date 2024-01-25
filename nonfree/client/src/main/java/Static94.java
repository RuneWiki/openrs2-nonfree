import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!cr", name = "I", descriptor = "Lclient!m;")
	public static final Class235 aClass235_9 = new Class235(10);

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIII)V")
	public static void method1278(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= Static85.anInt1313 && arg2 <= Static316.anInt6313) {
			@Pc(21) int local21 = Static27.method393(arg3, Static280.anInt5114, Static356.anInt6028);
			@Pc(27) int local27 = Static27.method393(arg0, Static280.anInt5114, Static356.anInt6028);
			Static679.method8950(arg2, arg1, local21, local27);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZII)B")
	public static byte method1280(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IBIII)V")
	public static void method1281(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(22) Class3_Sub4_Sub2 local22 = Static502.method7211(19, (long) arg2 | (long) arg1 << 32);
		local22.method630();
		local22.anInt805 = arg0;
		local22.anInt803 = arg3;
	}
}
