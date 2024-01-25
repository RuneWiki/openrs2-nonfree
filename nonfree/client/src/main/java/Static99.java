import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!en", name = "G", descriptor = "Lclient!od;")
	public static Class180 aClass180_2;

	@OriginalMember(owner = "client!en", name = "y", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_22 = new Class179(6, -1);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZIBII)V")
	public static void method1777(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static125.method2231(arg3)) {
			Static327.method4647(arg2, arg1, -1, Static437.aClass251ArrayArray2[arg3], arg0);
		}
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(Z)V")
	public static void method1780() {
		@Pc(8) int local8 = Static38.aClass135_Sub1_1.method4241(Static143.anInt2766);
		if (local8 == 0) {
			Static22.aByteArrayArrayArray10 = null;
			Static118.method2147(0);
		} else if (local8 == 1) {
			Static383.method5177((byte) 0);
			Static118.method2147(512);
			if (Static2.aByteArrayArrayArray1 != null) {
				Static77.method1518();
			}
		} else {
			Static383.method5177((byte) (Static244.anInt4494 - 4 & 0xFF));
			Static118.method2147(2);
		}
		Static39.anInt791 = Static357.anInt5881;
	}
}
