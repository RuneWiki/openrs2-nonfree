import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!dca", name = "h", descriptor = "Lclient!vg;")
	public static Class367 aClass367_4;

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "Lclient!dca;")
	public static final Class77 aClass77_1 = new Class77();

	@OriginalMember(owner = "client!dca", name = "e", descriptor = "Lclient!dca;")
	public static final Class77 aClass77_2 = new Class77();

	@OriginalMember(owner = "client!dca", name = "f", descriptor = "Lclient!dca;")
	public static final Class77 aClass77_3 = new Class77();

	@OriginalMember(owner = "client!dca", name = "g", descriptor = "Lclient!dca;")
	public static final Class77 aClass77_4 = new Class77();

	@OriginalMember(owner = "client!dca", name = "i", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_31 = new Class359(23, -2);

	@OriginalMember(owner = "client!dca", name = "j", descriptor = "I")
	public static int anInt2172 = -1;

	@OriginalMember(owner = "client!dca", name = "k", descriptor = "I")
	public static int anInt2173 = 0;

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(ILclient!wm;)I")
	public static int method1955(@OriginalArg(1) Class390 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method8905(Static215.anInt8107)) {
			local5++;
		}
		if (arg0.method8905(Static225.anInt4139)) {
			local5++;
		}
		if (arg0.method8905(Static168.anInt3362)) {
			local5++;
		}
		if (arg0.method8905(Static93.anInt2118)) {
			local5++;
		}
		if (arg0.method8905(Static267.anInt4951)) {
			local5++;
		}
		if (arg0.method8905(Static500.anInt8325)) {
			local5++;
		}
		if (arg0.method8905(Static175.anInt3413)) {
			local5++;
		}
		if (arg0.method8905(Static534.anInt8838)) {
			local5++;
		}
		if (arg0.method8905(Static408.anInt7226)) {
			local5++;
		}
		if (arg0.method8905(Static651.anInt10497)) {
			local5++;
		}
		if (arg0.method8905(Static64.anInt989)) {
			local5++;
		}
		if (arg0.method8905(Static482.anInt8085)) {
			local5++;
		}
		if (arg0.method8905(Static528.anInt8748)) {
			local5++;
		}
		if (arg0.method8905(Static365.anInt6631)) {
			local5++;
		}
		if (arg0.method8905(Static298.anInt5761)) {
			local5++;
		}
		if (arg0.method8905(Static145.anInt2975)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)V")
	public static void method1956() {
		if (Static570.aClass268_5.aBoolean645) {
			Static631.anInt10279 = 96;
			return;
		}
		try {
			@Pc(25) Method local25 = Runtime.class.getMethod("maxMemory");
			if (local25 != null) {
				try {
					@Pc(29) Runtime local29 = Runtime.getRuntime();
					@Pc(35) Long local35 = (Long) local25.invoke(local29, (Object[]) null);
					Static631.anInt10279 = (int) (local35 / 1048576L) + 1;
					return;
				} catch (@Pc(45) Throwable local45) {
					return;
				}
			}
		} catch (@Pc(47) Exception local47) {
			return;
		}
	}
}
