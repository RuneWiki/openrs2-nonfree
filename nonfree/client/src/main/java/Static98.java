import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static98 {

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "Lclient!nd;")
	public static Class238 aClass238_299;

	@OriginalMember(owner = "client!dfa", name = "c", descriptor = "[I")
	public static final int[] anIntArray742 = new int[1];

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(III)I")
	public static int method8917(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static474.anIntArray553[arg0 & 0x3] : Static293.anIntArray336[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lclient!sl;Z)Lclient!cf;")
	public static Class53_Sub1 method8919(@OriginalArg(0) Class2_Sub17 arg0) {
		return new Class53_Sub1(arg0.method2836(), arg0.method2836(), arg0.method2836(), arg0.method2836(), arg0.method2835(), arg0.method2859());
	}
}
