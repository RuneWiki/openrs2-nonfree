import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "[Lclient!ns;")
	public static Class12_Sub1_Sub1_Sub1[] aClass12_Sub1_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!fl", name = "j", descriptor = "[Lclient!hb;")
	public static Class11_Sub5[] aClass11_Sub5Array1;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)I", line = 41)
	public static int method2106(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)V", line = 101)
	public static void method2109() {
		for (@Pc(11) int local11 = 0; local11 < 100; local11++) {
			Class2_Sub3_Sub10_Sub1.aBooleanArray59[local11] = true;
		}
	}
}
