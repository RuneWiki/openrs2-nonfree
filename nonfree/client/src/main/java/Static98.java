import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "Lclient!mba;")
	public static Class230 aClass230_2;

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_54 = new Class251(61, 4);

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "[B")
	public static final byte[] aByteArray25 = new byte[2048];

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIII)Z")
	public static boolean method1620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static109.aClass263_2.method8440(arg0, arg1, arg2, Static5.anIntArray4);
		@Pc(20) int local20 = Static5.anIntArray4[2];
		if (local20 < 50) {
			return false;
		} else {
			Static5.anIntArray4[2] = local20;
			Static5.anIntArray4[1] = Static5.anIntArray4[1] * Static581.anInt9592 / local20 + Static370.anInt6294;
			Static5.anIntArray4[0] = Static553.anInt9261 + Static214.anInt3758 * Static5.anIntArray4[0] / local20;
			return true;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!jc;)Lclient!kw;")
	public static Class74_Sub2 method1621(@OriginalArg(1) Class14_Sub21 arg0) {
		return new Class74_Sub2(arg0.method7752(), arg0.method7752(), arg0.method7752(), arg0.method7752(), arg0.method7752(), arg0.method7752(), arg0.method7752(), arg0.method7752(), arg0.method7719(), arg0.method7695(115));
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!jc;B)Ljava/lang/String;")
	public static String method1622(@OriginalArg(0) Class14_Sub21 arg0) {
		return Static538.method7932(arg0);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method1623(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(9) Class14_Sub2_Sub9 local9 = Static499.method7527((long) arg0, 2);
		local9.method4004();
		local9.aString55 = arg1;
	}
}
