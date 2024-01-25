import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
	public static int anInt2098;

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "Lclient!de;")
	public static Class49 aClass49_1;

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "[Lclient!na;")
	public static Class159[] aClass159Array2;

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_66 = new Class189("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
	public static final int anInt2105 = 4;

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
	public static int anInt2106 = 0;

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_67 = new Class189(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "([BI)[B")
	public static byte[] method1636(@OriginalArg(0) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static462.method4611(arg0, 0, local14, 0, local11);
		return local14;
	}
}
