import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!de", name = "P", descriptor = "Lclient!gw;")
	public static Class127 aClass127_3;

	@OriginalMember(owner = "client!de", name = "Q", descriptor = "Lclient!vr;")
	public static Class33 aClass33_3;

	@OriginalMember(owner = "client!de", name = "L", descriptor = "Lclient!ee;")
	public static final Class83 aClass83_6 = new Class83(64);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!aj;II)Lclient!gfa;")
	public static Class117 method1747(@OriginalArg(1) Class15 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) byte[] local9 = arg0.method517(0, arg1);
		return local9 == null ? null : new Class117(local9);
	}

	@OriginalMember(owner = "client!de", name = "e", descriptor = "(B)V")
	public static void method1750() {
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			Class300.lb[local12] = false;
		}
		Static598.anInt9577 = Static57.anInt1188;
		Static316.anInt5288 = Static588.anInt9467;
		Static305.anInt5099 = Static520.anInt8367;
		Static72.anInt1357 = 0;
		Static428.anInt6834 = 5;
		Static676.anInt10886 = 0;
		Static187.anInt3785 = Static509.anInt8222;
		Static374.anInt5985 = Static146.anInt2945;
		Static153.anInt3036 = -1;
		Static410.anInt6542 = -1;
		Static169.anInt3338 = Static652.anInt10382;
		Static266.anInt4722 = -1;
		Static134.anInt2727 = -1;
	}
}
