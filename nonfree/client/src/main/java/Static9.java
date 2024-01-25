import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
	public static int anInt132;

	@OriginalMember(owner = "client!ah", name = "l", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
	public static void method121() {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static166.anInt2852; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static426.anInt6923; local18++) {
				if (Static64.method959(true, local18, local12, local14, Static309.aClass270ArrayArrayArray3)) {
					local12++;
				}
				if (local12 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZLclient!dc;)V")
	public static void method122(@OriginalArg(1) Class3_Sub4_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt4898 - Static266.anInt4392;
		@Pc(19) int local19 = arg0.anInt4907 * 128 + arg0.method4009() * 64;
		@Pc(30) int local30 = arg0.anInt4920 * 128 + arg0.method4009() * 64;
		arg0.anInt6833 += (local19 - arg0.anInt6833) / local8;
		arg0.anInt4978 = 0;
		arg0.anInt6835 += (local30 - arg0.anInt6835) / local8;
		if (arg0.anInt4926 == 0) {
			arg0.method4003(8192);
		}
		if (arg0.anInt4926 == 1) {
			arg0.method4003(12288);
		}
		if (arg0.anInt4926 == 2) {
			arg0.method4003(0);
		}
		if (arg0.anInt4926 == 3) {
			arg0.method4003(4096);
		}
	}
}
