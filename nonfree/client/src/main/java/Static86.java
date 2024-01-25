import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_73 = new Class103(41, 3);

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIBI)Lclient!ob;")
	public static Class3 method1409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg2 * 32147369L ^ (long) arg0 * 475427L ^ (long) arg1 * 97549L ^ (long) arg3 * 67481L ^ (long) arg5 * 986053L ^ (long) arg4 * 76724863L;
		@Pc(39) Class3 local39 = (Class3) Static311.aClass102_43.method2258(local33);
		if (local39 == null) {
			local39 = Static383.aClass34_11.method5733(arg3, arg1, arg0, arg5, arg2, arg4);
			Static311.aClass102_43.method2272(local33, local39);
			return local39;
		} else {
			return local39;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)Z")
	public static boolean method1410(@OriginalArg(1) int arg0) {
		Static223.aBoolean668 = true;
		Static8.anInt128 = arg0 + 1 & 0xFFFF;
		return true;
	}
}
