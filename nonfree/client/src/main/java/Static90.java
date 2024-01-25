import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_30 = new Class71(112, 0);

	@OriginalMember(owner = "client!dca", name = "c", descriptor = "I")
	public static int anInt2539 = 500;

	@OriginalMember(owner = "client!dca", name = "d", descriptor = "I")
	public static int anInt2540 = 0;

	@OriginalMember(owner = "client!dca", name = "e", descriptor = "S")
	public static short aShort27 = 256;

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IZ)V")
	public static void method2150(@OriginalArg(0) int arg0) {
		@Pc(12) Class8_Sub5_Sub8 local12 = Static509.method7344(3, arg0);
		local12.method3512();
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(II)V")
	public static void method2151(@OriginalArg(0) int arg0) {
		Static233.aLong132 = 1000000000L / (long) arg0;
	}
}
