import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!dea", name = "p", descriptor = "Lclient!vd;")
	public static Class353 aClass353_20;

	@OriginalMember(owner = "client!dea", name = "o", descriptor = "[I")
	public static int[] anIntArray127 = new int[1];

	@OriginalMember(owner = "client!dea", name = "q", descriptor = "I")
	public static final int anInt1920 = 1401;

	@OriginalMember(owner = "client!dea", name = "t", descriptor = "Lclient!fa;")
	public static final Class89 aClass89_10 = new Class89(0, 2, 2, 1);

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IIII)I")
	public static int method1584(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 243) {
			arg2 >>= 0x4;
		} else if (arg1 > 217) {
			arg2 >>= 0x3;
		} else if (arg1 > 192) {
			arg2 >>= 0x2;
		} else if (arg1 > 179) {
			arg2 >>= 0x1;
		}
		return (arg2 >> 5 << 7) + ((arg0 >> 2 & 0x3F) << 10) + (arg1 >> 1);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ILclient!ha;ILclient!ada;I)V")
	public static void method1585(@OriginalArg(1) Class100 arg0, @OriginalArg(3) Class8 arg1) {
		Static485.aClass8_56.method154();
		if (Static83.aBoolean118) {
			return;
		}
		for (@Pc(20) Class6_Sub45 local20 = (Class6_Sub45) arg1.method149(); local20 != null; local20 = (Class6_Sub45) arg1.method155()) {
			@Pc(28) Class105 local28 = Static487.aClass337_4.method8119(local20.anInt9417);
			if (Static292.method5057(local28)) {
				@Pc(40) boolean local40 = Static526.method7816(arg0, local28, local20);
				if (local40) {
					Static11.method215(arg0, local20, local28);
				}
			}
		}
	}
}
