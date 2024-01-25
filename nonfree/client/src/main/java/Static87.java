import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!eg", name = "B", descriptor = "[I")
	public static final int[] anIntArray146 = new int[1000];

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)Lclient!ah;")
	public static Class8 method1587(@OriginalArg(1) int arg0) {
		@Pc(16) Class8 local16 = (Class8) Static330.aClass68_38.method1787((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(26) byte[] local26 = Static185.aClass76_42.method2104(arg0, 1);
		local16 = new Class8();
		local16.anInt130 = arg0;
		if (local26 != null) {
			local16.method89(new Class4_Sub12(local26));
		}
		local16.method91();
		if (local16.anInt121 == 2 && Static18.aClass102_2.method2700((long) arg0) == null) {
			Static18.aClass102_2.method2703((long) arg0, new Class4_Sub37(Static194.anInt3688));
			Static392.aClass8Array1[Static194.anInt3688++] = local16;
		}
		Static330.aClass68_38.method1779((long) arg0, local16);
		return local16;
	}
}
