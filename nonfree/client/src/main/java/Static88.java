import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
	public static int anInt1565;

	@OriginalMember(owner = "client!ee", name = "J", descriptor = "I")
	public static int anInt1566;

	@OriginalMember(owner = "client!ee", name = "E", descriptor = "I")
	public static int anInt1562 = 0;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)I")
	public static int method1286(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(17) int local17 = local0 | local0 >>> 1;
		@Pc(23) int local23 = local17 | local17 >>> 2;
		@Pc(29) int local29 = local23 | local23 >>> 4;
		@Pc(35) int local35 = local29 | local29 >>> 8;
		@Pc(41) int local41 = local35 | local35 >>> 16;
		return local41 + 1;
	}
}
