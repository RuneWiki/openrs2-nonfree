import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "Lclient!ik;")
	public static Class182 aClass182_20;

	@OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
	public static int anInt2031;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)I")
	public static int method1877() {
		return Static488.anInt7680 == 1 ? Static182.anInt3160 : Static316.anInt5077;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V")
	public static void method1878() {
		Static575.method7436();
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IB)Lclient!b;")
	public static Class3_Sub7_Sub1 method1881(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub7_Sub1 local10 = (Class3_Sub7_Sub1) Static604.aClass214_3.method4927((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static259.aClass182_68.method3985(0, arg0);
		if (local21 == null || local21.length <= 1) {
			return null;
		}
		try {
			local10 = Static536.method7118(local21);
		} catch (@Pc(45) Exception local45) {
			throw new RuntimeException(local45.getMessage() + " S: " + arg0);
		}
		Static604.aClass214_3.method4928(local10, (long) arg0);
		return local10;
	}
}
