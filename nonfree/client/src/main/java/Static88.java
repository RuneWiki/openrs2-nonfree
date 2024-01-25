import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!dk", name = "t", descriptor = "F")
	public static float aFloat18;

	@OriginalMember(owner = "client!dk", name = "y", descriptor = "[[Lclient!rga;")
	public static Class8_Sub3[][] aClass8_Sub3ArrayArray2;

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "(I)V")
	public static void method1540() {
		@Pc(20) byte[] local20;
		if (Static444.anObject13 == null) {
			@Pc(13) Class5_Sub2_Sub1 local13 = new Class5_Sub2_Sub1();
			local20 = local13.method2064();
			Static444.anObject13 = Static476.method6489(local20);
		}
		if (Static86.anObject1 == null) {
			@Pc(31) Class5_Sub1_Sub1 local31 = new Class5_Sub1_Sub1();
			local20 = local31.method94();
			Static86.anObject1 = Static476.method6489(local20);
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZ)I")
	public static int method1541(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
