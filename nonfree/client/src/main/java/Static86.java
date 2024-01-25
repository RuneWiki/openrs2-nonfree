import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!eg", name = "E", descriptor = "[I")
	public static int[] anIntArray125;

	@OriginalMember(owner = "client!eg", name = "K", descriptor = "Lclient!fi;")
	public static Class77 aClass77_2;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI[F)[F")
	public static float[] method1642(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(11) float[] local11 = new float[arg0];
		Static462.method4616(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIII)V")
	public static void method1643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static1.anInt42 = arg3;
		Static237.anInt4547 = arg0;
		Static178.anInt3545 = arg1;
		Static356.anInt6078 = arg2;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
	public static void method1646() {
		Static85.anInt2106 = 0;
		Static358.anInt6085 = 0;
		Static186.anInt3735 = 0;
		Static382.anInt1873 = 0;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "([BIB)I")
	public static int method1647(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Static49.method871(0, arg1, arg0);
	}
}
