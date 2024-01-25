import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!df", name = "r", descriptor = "Z")
	public static boolean aBoolean170 = false;

	@OriginalMember(owner = "client!df", name = "s", descriptor = "I")
	public static int anInt2333 = -1;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIFIIZII)[I")
	public static int[] method1976(@OriginalArg(2) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(15) Class3_Sub6_Sub7 local15 = new Class3_Sub6_Sub7();
		local15.anInt2854 = 4;
		local15.anInt2853 = 8;
		local15.anInt2856 = (int) (arg0 * 4096.0F);
		local15.anInt2857 = 35;
		local15.aBoolean196 = true;
		local15.anInt2846 = 8;
		local15.method8012();
		Static15.method152(1, 2048);
		local15.method2362(local6, 0);
		return local6;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I[B)[B")
	public static byte[] method1977(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static604.method6225(arg0, 0, local9, 0, local6);
		return local9;
	}
}
