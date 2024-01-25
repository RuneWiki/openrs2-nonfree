import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
	public static int anInt1921;

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_18 = new Class198(64);

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)Lclient!no;")
	public static Class145 method1575(@OriginalArg(0) int arg0) {
		@Pc(10) Class145 local10 = (Class145) Static10.aClass198_4.method5242((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static273.aClass100_109.method2319(0, arg0);
		local10 = new Class145();
		if (local20 != null) {
			local10.method3738(new Class3_Sub4(local20));
		}
		local10.method3736();
		Static10.aClass198_4.method5231((long) arg0, local10);
		return local10;
	}
}
