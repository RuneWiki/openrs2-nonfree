import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!sd", name = "ed", descriptor = "Lclient!rd;")
	public static Class64 aClass64_68;

	@OriginalMember(owner = "client!sd", name = "gd", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray42;

	@OriginalMember(owner = "client!sd", name = "Xc", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1299 = Static75.method1216("Please remove ");

	@OriginalMember(owner = "client!sd", name = "bd", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1300 = Static75.method1216("On");

	@OriginalMember(owner = "client!sd", name = "hd", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1301 = aClass4_1299;

	@OriginalMember(owner = "client!sd", name = "md", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1303 = aClass4_1300;

	@OriginalMember(owner = "client!sd", name = "nd", descriptor = "Z")
	public static boolean aBoolean195 = true;

	@OriginalMember(owner = "client!sd", name = "yd", descriptor = "I")
	public static int anInt2368 = 0;

	@OriginalMember(owner = "client!sd", name = "zd", descriptor = "B")
	public static byte aByte3 = 0;

	@OriginalMember(owner = "client!sd", name = "Ad", descriptor = "I")
	public static int anInt2369 = 0;

	@OriginalMember(owner = "client!sd", name = "Bd", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1304 = Static75.method1216("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!sd", name = "Ed", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1305 = aClass4_1299;

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "(B)V")
	public static void method1555() {
		aClass4_1300 = null;
		aClass4_1305 = null;
		aClass64_68 = null;
		aClass4_1304 = null;
		aByteArrayArrayArray42 = null;
		aClass4_1299 = null;
		aClass4_1301 = null;
		aClass4_1303 = null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1556(@OriginalArg(1) Component arg0) {
		@Pc(10) Method local10 = Static2.aMethod2;
		if (local10 != null) {
			try {
				local10.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(24) Throwable local24) {
			}
		}
		arg0.addKeyListener(Static5.aClass68_1);
		arg0.addFocusListener(Static5.aClass68_1);
	}
}
