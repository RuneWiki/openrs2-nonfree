import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!dfa", name = "e", descriptor = "I")
	public static int anInt6314;

	@OriginalMember(owner = "client!dfa", name = "b", descriptor = "I")
	public static int anInt6311 = 0;

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(B)V")
	public static void method5138() {
		if (Static51.aClass118_1.aBoolean301) {
			Static153.anInt3785 = 96;
			return;
		}
		try {
			@Pc(30) Method local30 = Runtime.class.getMethod("maxMemory");
			if (local30 != null) {
				try {
					@Pc(34) Runtime local34 = Runtime.getRuntime();
					@Pc(40) Long local40 = (Long) local30.invoke(local34, (Object[]) null);
					Static153.anInt3785 = (int) (local40 / 1048576L) + 1;
				} catch (@Pc(50) Throwable local50) {
				}
			}
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method5140(@OriginalArg(0) Class16 arg0) {
		Static87.aClass27_21 = Static611.method8308(arg0, Static241.anInt5385, true);
		Static184.aClass345_9 = Static524.method7460(arg0, Static241.anInt5385);
		Static634.aClass27_19 = Static611.method8308(arg0, Static19.anInt3643, true);
		Static446.aClass345_13 = Static524.method7460(arg0, Static19.anInt3643);
		Static206.aClass27_20 = Static611.method8308(arg0, Static25.anInt1036, true);
		Static469.aClass345_15 = Static524.method7460(arg0, Static25.anInt1036);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(II)V")
	public static void method5143(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class8 local5 = Static136.aClass253_11.method6593(); local5 != null; local5 = Static136.aClass253_11.method6595()) {
			if ((local5.aLong285 >> 48 & 0xFFFFL) == (long) arg0) {
				local5.method8640();
			}
		}
	}
}
