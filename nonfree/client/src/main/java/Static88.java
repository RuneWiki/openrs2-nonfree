import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!dfa", name = "t", descriptor = "Lclient!vg;")
	public static final Class340 aClass340_2 = new Class340();

	@OriginalMember(owner = "client!dfa", name = "G", descriptor = "Lclient!oe;")
	public static final Class244 aClass244_18 = new Class244();

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IZII)I")
	public static int method2068(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 4095 - arg2;
		} else {
			return 4095 - arg1;
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IBIII)V")
	public static void method2070(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static455.anInt3442 / (float) Static455.anInt3445;
		@Pc(11) int local11 = arg0;
		@Pc(13) int local13 = arg1;
		if (local9 < 1.0F) {
			local13 = (int) (local9 * (float) arg0);
		} else {
			local11 = (int) ((float) arg1 / local9);
		}
		@Pc(40) int local40 = arg2 - (arg1 - local13) / 2;
		@Pc(53) int local53 = arg3 - (arg0 - local11) / 2;
		Class1_Sub4_Sub4_Sub2.lb = -1;
		Static480.anInt10076 = Static455.anInt3442 - Static455.anInt3442 * local40 / local13;
		Static189.anInt3714 = -1;
		Static529.anInt9422 = local53 * Static455.anInt3445 / local11;
		Static484.method7227();
	}

	@OriginalMember(owner = "client!dfa", name = "b", descriptor = "(I)V")
	public static void method2071() {
		@Pc(1) Class223 local1 = Static9.aClass223_2;
		synchronized (Static9.aClass223_2) {
			Static9.aClass223_2.method5400();
		}
	}
}
