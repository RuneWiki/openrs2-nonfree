import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
	public static int anInt7964 = 0;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "Z")
	public static volatile boolean aBoolean583 = false;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!wh;)V")
	public static void method6302(@OriginalArg(1) Class71_Sub8 arg0) {
		arg0.aClass11_Sub5_Sub2_1 = null;
		if (Static215.anInt4620 < 20) {
			Static422.aClass273_7.method6247(arg0);
			Static215.anInt4620++;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)I")
	public static int method6309(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = arg0 - 1;
		@Pc(16) int local16 = local10 | local10 >>> 1;
		@Pc(22) int local22 = local16 | local16 >>> 2;
		@Pc(28) int local28 = local22 | local22 >>> 4;
		@Pc(34) int local34 = local28 | local28 >>> 8;
		@Pc(40) int local40 = local34 | local34 >>> 16;
		return local40 + 1;
	}
}
