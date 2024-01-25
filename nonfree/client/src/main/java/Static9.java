import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!aea", name = "M", descriptor = "I")
	public static int anInt229 = -1;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Z)V")
	public static void method426() {
		if (!Static533.method8114()) {
			return;
		}
		if (Static379.aStringArray32 == null) {
			Static406.method6469();
		}
		Static143.anInt2848 = 0;
		Static231.aBoolean346 = true;
		try {
			Static305.aClipboard1 = Static125.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(21) Exception local21) {
		}
	}
}
