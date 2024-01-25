import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static83 {

	@OriginalMember(owner = "client!dca", name = "o", descriptor = "I")
	public static int anInt1567;

	@OriginalMember(owner = "client!dca", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString14 = null;

	@OriginalMember(owner = "client!dca", name = "T", descriptor = "Z")
	public static boolean aBoolean102 = false;

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(II)I")
	public static int method1448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static398.aShortArrayArray7 == null ? 0 : Static398.aShortArrayArray7[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(Lclient!um;Lclient!um;B)V")
	public static void method1449(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1) {
		if (arg1.aClass1_283 != null) {
			arg1.method7525();
		}
		arg1.aClass1_284 = arg0;
		arg1.aClass1_283 = arg0.aClass1_283;
		arg1.aClass1_283.aClass1_284 = arg1;
		arg1.aClass1_284.aClass1_283 = arg1;
	}
}
