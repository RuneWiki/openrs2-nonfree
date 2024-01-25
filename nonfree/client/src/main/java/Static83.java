import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
	public static int anInt1515;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_10 = new Class26(50);

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "[Z")
	public static final boolean[] aBooleanArray8 = new boolean[100];

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!pn;Lclient!pn;I)V")
	public static void method1220(@OriginalArg(0) Class11_Sub4 arg0, @OriginalArg(1) Class11_Sub4 arg1) {
		if (arg0.aClass11_Sub4_61 != null) {
			arg0.method5580();
		}
		arg0.aClass11_Sub4_62 = arg1.aClass11_Sub4_62;
		arg0.aClass11_Sub4_61 = arg1;
		arg0.aClass11_Sub4_61.aClass11_Sub4_62 = arg0;
		arg0.aClass11_Sub4_62.aClass11_Sub4_61 = arg0;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
	public static void method1222() {
		if (Static262.aClass129_9 != null) {
			Static262.aClass129_9.method5010();
			Static297.aClass9_4 = null;
			Static262.aClass129_9 = null;
		}
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)V")
	public static void method1226() {
		@Pc(1) Class26 local1 = Static276.aClass26_50;
		synchronized (Static276.aClass26_50) {
			Static276.aClass26_50.method333();
		}
	}
}
