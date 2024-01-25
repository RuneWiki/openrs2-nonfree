import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!df", name = "vb", descriptor = "[Lclient!ol;")
	public static Class253[] aClass253Array1;

	@OriginalMember(owner = "client!df", name = "wb", descriptor = "I")
	public static int anInt1910;

	@OriginalMember(owner = "client!df", name = "nb", descriptor = "Lclient!iv;")
	public static final Class168 aClass168_2 = new Class168(4);

	@OriginalMember(owner = "client!df", name = "ub", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_67 = new Class194(102, 3);

	@OriginalMember(owner = "client!df", name = "xb", descriptor = "I")
	public static int anInt1911 = 13156520;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IBILclient!kea;II)V")
	public static void method1578(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class187 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) Class3_Sub26 local13 = null;
		for (@Pc(20) Class3_Sub26 local20 = (Class3_Sub26) Static48.aClass216_69.method5457(); local20 != null; local20 = (Class3_Sub26) Static48.aClass216_69.method5458()) {
			if (local20.anInt5293 == arg3 && local20.anInt5296 == arg0 && local20.anInt5286 == arg1 && arg4 == local20.anInt5290) {
				local13 = local20;
				break;
			}
		}
		if (local13 == null) {
			local13 = new Class3_Sub26();
			local13.anInt5286 = arg1;
			local13.anInt5293 = arg3;
			local13.anInt5296 = arg0;
			local13.anInt5290 = arg4;
			Static48.aClass216_69.method5449(local13);
		}
		local13.aClass187_2 = arg2;
		local13.aBoolean386 = true;
		local13.aBoolean387 = false;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)Z")
	public static boolean method1581() {
		Static479.aBoolean538 = true;
		Static322.anInt6148++;
		return true;
	}
}
