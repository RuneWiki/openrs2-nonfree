import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "[Lclient!o;")
	public static Class85[] aClass85Array5;

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
	public static int anInt1224;

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas2;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method1066(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local14 > local11 && Static103.method5186(arg0.charAt(local11))) {
			local11++;
		}
		while (local14 > local11 && Static103.method5186(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(52) int local52 = local14 - local11;
		if (local52 < 1 || local52 > 12) {
			return null;
		}
		@Pc(67) StringBuffer local67 = new StringBuffer(local52);
		for (@Pc(69) int local69 = local11; local69 < local14; local69++) {
			@Pc(75) char local75 = arg0.charAt(local69);
			if (Static140.method1767(local75)) {
				@Pc(83) char local83 = Static286.method3792(local75);
				if (local83 != '\u0000') {
					local67.append(local83);
				}
			}
		}
		if (local67.length() == 0) {
			return null;
		} else {
			return local67.toString();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)Z")
	public static boolean method1067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!wm;I)Lclient!wq;")
	public static Class46_Sub4 method1070(@OriginalArg(0) Class1_Sub19 arg0) {
		return new Class46_Sub4(arg0.method2929(), arg0.method2929(), arg0.method2929(), arg0.method2929(), arg0.method2929(), arg0.method2929(), arg0.method2929(), arg0.method2929(), arg0.method2881(), arg0.method2915());
	}
}
