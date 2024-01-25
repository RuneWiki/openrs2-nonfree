import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "Lclient!lt;")
	public static Class158 aClass158_22;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_26 = new Class231("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "[I")
	public static final int[] anIntArray168 = new int[200];

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
	public static int anInt1636 = 100;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBZ)Lclient!jd;")
	public static Class6_Sub17 method1523(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) long local17 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class6_Sub17) Static150.aClass137_14.method3175(local17);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IFIIIIIZ)[I")
	public static int[] method1525(@OriginalArg(1) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class6_Sub2_Sub11 local10 = new Class6_Sub2_Sub11();
		local10.anInt2228 = (int) (arg0 * 4096.0F);
		local10.anInt2214 = 35;
		local10.anInt2220 = 8;
		local10.anInt2222 = 4;
		local10.aBoolean167 = true;
		local10.anInt2218 = 8;
		local10.method5862();
		Static11.method147(1, 2048);
		local10.method2031(local6, 0);
		return local6;
	}
}
