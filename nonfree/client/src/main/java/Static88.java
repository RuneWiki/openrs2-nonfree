import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static88 {

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "Lclient!re;")
	public static Class56_Sub1 aClass56_Sub1_19;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "[I")
	public static int[] anIntArray256;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "Lclient!pe;")
	public static Class65 aClass65_820 = Static119.method1462("Clientscript error in: ");

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
	public static int anInt1888 = 0;

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3 = new byte[4][104][104];

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "[I")
	public static int[] anIntArray257 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "[Lclient!pe;")
	public static Class65[] aClass65Array45 = new Class65[200];

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILclient!ub;)V")
	public static void method1441(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub1_Sub4 arg1) {
		Static129.method1960(arg1.anInt1958, arg0, arg1.anInt1948);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
	public static void method1443() {
		aClass56_Sub1_19 = null;
		aByteArrayArrayArray3 = null;
		aClass65_820 = null;
		aClass65Array45 = null;
		anIntArray256 = null;
		anIntArray257 = null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)I")
	public static int method1444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = (arg1 & 0x7F) * arg0 / 128;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}
}
