import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
	public static int anInt1720;

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "Lclient!vh;")
	public static Class250 aClass250_19;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "Lclient!sf;")
	public static Class1_Sub7_Sub3 aClass1_Sub7_Sub3_1;

	@OriginalMember(owner = "client!eh", name = "n", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_24 = new Class237(48, 3);

	@OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
	public static int anInt1726 = 0;

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(II)I")
	public static int method1467(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)V")
	public static void method1470() {
		@Pc(1) Class83 local1 = Static244.aClass83_38;
		synchronized (Static244.aClass83_38) {
			Static244.aClass83_38.method1663(5);
		}
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(II)V")
	public static void method1471(@OriginalArg(1) int arg0) {
		Static399.anInt6925 = 1000 / arg0;
	}
}
