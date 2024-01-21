import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!kh", name = "mb", descriptor = "I")
	public static int anInt2511;

	@OriginalMember(owner = "client!kh", name = "nb", descriptor = "I")
	public static int anInt2512;

	@OriginalMember(owner = "client!kh", name = "pb", descriptor = "Lclient!jh;")
	public static Class3_Sub2_Sub2_Sub1_Sub1 aClass3_Sub2_Sub2_Sub1_Sub1_4;

	@OriginalMember(owner = "client!kh", name = "Z", descriptor = "Lclient!ib;")
	public static Class3_Sub8_Sub1 aClass3_Sub8_Sub1_3 = new Class3_Sub8_Sub1(5000);

	@OriginalMember(owner = "client!kh", name = "ab", descriptor = "Lclient!eh;")
	public static Class28 aClass28_783 = Static170.method3101("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!kh", name = "bb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_784 = Static170.method3101("Use");

	@OriginalMember(owner = "client!kh", name = "fb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_785 = Static170.method3101("<col=ffff00>*V");

	@OriginalMember(owner = "client!kh", name = "ib", descriptor = "I")
	public static int anInt2509 = 0;

	@OriginalMember(owner = "client!kh", name = "jb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_786 = aClass28_784;

	@OriginalMember(owner = "client!kh", name = "lb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_787 = Static170.method3101("::fpson");

	@OriginalMember(owner = "client!kh", name = "ob", descriptor = "Lclient!eh;")
	public static Class28 aClass28_788 = Static170.method3101("Schlie-8en");

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)V")
	public static void method1970() {
		aClass3_Sub8_Sub1_3 = null;
		aClass28_787 = null;
		aClass28_784 = null;
		aClass3_Sub2_Sub2_Sub1_Sub1_4 = null;
		aClass28_785 = null;
		aClass28_788 = null;
		aClass28_783 = null;
		aClass28_786 = null;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(III)V")
	public static void method1971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub20 local7 = Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass25_1 = null;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1972(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static127.aClass16_1);
		arg0.removeFocusListener(Static127.aClass16_1);
		Static92.anInt4203 = -1;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)Lclient!fe;")
	public static Class9 method1973() {
		try {
			return (Class9) Class.forName("Class9_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return new Class9_Sub2();
		}
	}
}
