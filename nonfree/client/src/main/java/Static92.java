import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!dba", name = "e", descriptor = "Z")
	public static boolean aBoolean125;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(BILclient!ns;)V")
	public static void method1519(@OriginalArg(1) int arg0, @OriginalArg(2) Class20_Sub2_Sub2_Sub1 arg1) {
		if (arg1.anIntArray327 == null) {
			return;
		}
		@Pc(13) int local13 = arg1.anIntArray327[arg0 + 1];
		if (arg1.anInt5549 == local13) {
			return;
		}
		arg1.anInt5549 = local13;
		arg1.anInt5546 = 1;
		arg1.anInt5503 = 0;
		arg1.anInt5566 = 0;
		arg1.anInt5576 = arg1.anInt5574;
		arg1.anInt5502 = 0;
		if (arg1.anInt5549 != -1) {
			Static558.method8052(arg1.anInt5503, arg1, Static294.aClass373_2.method8738(arg1.anInt5549));
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(ZI)V")
	public static void method1521(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static487.aFloat145 = 3.0F;
		} else if (arg0 == 50) {
			Static487.aFloat145 = 4.0F;
		} else if (arg0 == 75) {
			Static487.aFloat145 = 6.0F;
		} else if (arg0 == 100) {
			Static487.aFloat145 = 8.0F;
		} else if (arg0 == 200) {
			Static487.aFloat145 = 16.0F;
		}
		Static414.anInt7551 = -1;
		Static414.anInt7551 = -1;
	}
}
