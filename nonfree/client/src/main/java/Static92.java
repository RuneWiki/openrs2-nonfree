import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
	public static int anInt3571;

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "Lclient!wp;")
	public static final Class217 aClass217_8 = new Class217();

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "[Lclient!qg;")
	public static final Class1_Sub4_Sub19[] aClass1_Sub4_Sub19Array6 = new Class1_Sub4_Sub19[14];

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray33 = new String[5];

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIII)V")
	public static void method3294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = arg2 * Static167.anInt3605 >> 8;
		if (local5 != 0 && arg1 != -1) {
			Static228.method4251(arg1, Static44.aClass216_10, local5);
			Static82.aBoolean192 = true;
		}
	}
}
