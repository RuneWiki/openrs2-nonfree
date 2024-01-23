import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!gi", name = "C", descriptor = "[I")
	public static int[] anIntArray167;

	@OriginalMember(owner = "client!gi", name = "D", descriptor = "[Z")
	public static boolean[] aBooleanArray39 = new boolean[112];

	@OriginalMember(owner = "client!gi", name = "H", descriptor = "[I")
	public static int[] anIntArray169 = new int[14];

	@OriginalMember(owner = "client!gi", name = "M", descriptor = "Z")
	public static boolean aBoolean141 = false;

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(B)Lclient!e;")
	public static Class3_Sub4_Sub7 method1412() {
		@Pc(14) Class3_Sub4_Sub7 local14 = (Class3_Sub4_Sub7) Static208.aClass115_8.method2879();
		if (local14 != null) {
			local14.method5013();
			local14.method5022();
			return local14;
		}
		do {
			local14 = (Class3_Sub4_Sub7) Static156.aClass115_6.method2879();
			if (local14 == null) {
				return null;
			}
			if (local14.method969() > Static128.method2196()) {
				return null;
			}
			local14.method5013();
			local14.method5022();
		} while ((Long.MIN_VALUE & local14.aLong245) == 0L);
		return local14;
	}
}
