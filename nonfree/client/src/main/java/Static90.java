import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "[Lclient!o;")
	public static Class85[] aClass85Array4;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "Lclient!um;")
	public static Class253 aClass253_2;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
	public static int anInt1210 = 2;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
	public static void method1063() {
		if (Static87.aBoolean140) {
			Static40.aClass85_1 = null;
			Static87.aBoolean140 = false;
			Static42.aClass85_5 = null;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!jp;B)V")
	public static void method1064(@OriginalArg(0) Class1_Sub19_Sub2 arg0) {
		for (@Pc(15) int local15 = 0; local15 < Static398.anInt6391; local15++) {
			@Pc(21) int local21 = Static438.anIntArray496[local15];
			@Pc(25) Class11_Sub1_Sub3_Sub2 local25 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local21];
			@Pc(29) int local29 = arg0.method2915();
			if ((local29 & 0x20) != 0) {
				local29 += arg0.method2915() << 8;
			}
			if ((local29 & 0x200) != 0) {
				local29 += arg0.method2915() << 16;
			}
			Static145.method1819(arg0, local29, local25, local21);
		}
	}
}
