import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!dha", name = "F", descriptor = "Lclient!bt;")
	public static Class34 aClass34_21;

	@OriginalMember(owner = "client!dha", name = "D", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_46 = new Class151(42, 10);

	@OriginalMember(owner = "client!dha", name = "I", descriptor = "Lclient!bja;")
	public static final Class27 aClass27_10 = new Class27(9, 0, 4, 1);

	@OriginalMember(owner = "client!dha", name = "J", descriptor = "Lclient!fj;")
	public static final Class117 aClass117_2 = new Class117(5, 19);

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;I)V")
	public static void method1968(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1) {
		Static502.aHashtable5.put(arg1, arg0);
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(BILclient!kq;)Ljava/lang/String;")
	public static String method1969(@OriginalArg(1) int arg0, @OriginalArg(2) Class199 arg1) {
		if (!Static75.method1604(arg1).method814(arg0) && arg1.anObjectArray22 == null) {
			return null;
		} else if (arg1.aStringArray22 == null || arg1.aStringArray22.length <= arg0 || arg1.aStringArray22[arg0] == null || arg1.aStringArray22[arg0].trim().length() == 0) {
			return Static110.aBoolean147 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray22[arg0];
		}
	}

	@OriginalMember(owner = "client!dha", name = "i", descriptor = "(I)V")
	public static void method1971() {
		if (Static234.aBoolean164) {
			return;
		}
		Static427.method5929(Static21.aClass73ArrayArrayArray1);
		if (Static540.aClass73ArrayArrayArray3 != null) {
			Static427.method5929(Static540.aClass73ArrayArrayArray3);
		}
		Static234.aBoolean164 = true;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(B[B)[B")
	public static byte[] method1972(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) byte[] local19 = new byte[arg0.length];
			Static685.method6464(arg0, 0, local19, 0, arg0.length);
			return local19;
		}
	}
}
