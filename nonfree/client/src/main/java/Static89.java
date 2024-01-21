import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
	public static int anInt1976;

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "Lclient!of;")
	public static Class1_Sub19 aClass1_Sub19_4;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
	public static final int anInt1973 = 7759444;

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "Lclient!id;")
	public static Class34 aClass34_978 = Static9.method266("huffman");

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
	public static int anInt1975 = 0;

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "Lclient!id;")
	public static Class34 aClass34_979 = Static9.method266(" <col=00ff80>");

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "Lclient!id;")
	public static Class34 aClass34_980 = Static9.method266("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "Lclient!id;")
	public static Class34 aClass34_981 = Static9.method266("Cabbage");

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
	public static void method1305() {
		aClass34_979 = null;
		aClass1_Sub19_4 = null;
		aClass34_980 = null;
		aClass34_978 = null;
		aClass34_981 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1306(@OriginalArg(0) Component arg0) {
		@Pc(5) Method local5 = Static25.aMethod1;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(19) Throwable local19) {
			}
		}
		arg0.addKeyListener(Static114.aClass76_1);
		arg0.addFocusListener(Static114.aClass76_1);
	}
}
