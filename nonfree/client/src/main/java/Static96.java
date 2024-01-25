import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "F")
	public static float aFloat31;

	@OriginalMember(owner = "client!ep", name = "x", descriptor = "Lclient!vh;")
	public static Class250 aClass250_20;

	@OriginalMember(owner = "client!ep", name = "t", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_26 = new Class237(58, 0);

	@OriginalMember(owner = "client!ep", name = "w", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_28 = new Class84("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!ep", name = "z", descriptor = "Lclient!lf;")
	public static final Class145 aClass145_1 = new Class145("stellardawn", 1);

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I[BIIBLclient!ht;IZ)Lclient!cq;")
	public static Class13_Sub1_Sub1 method1521(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(5) Class109_Sub1 arg2, @OriginalArg(6) int arg3) {
		if (arg2.aBoolean172 || Static304.method4356(arg3) && Static304.method4356(arg0)) {
			return new Class13_Sub1_Sub1(arg2, 3553, 6406, arg3, arg0, false, arg1, 6406);
		} else if (arg2.aBoolean156) {
			return new Class13_Sub1_Sub1(arg2, 34037, 6406, arg3, arg0, false, arg1, 6406);
		} else {
			return new Class13_Sub1_Sub1(arg2, 6406, arg3, arg0, Static100.method1552(arg3), Static100.method1552(arg0), arg1, 6406);
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!mv;Lclient!qa;Z)I")
	public static int method1522(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class109 arg1) {
		if (arg0.anInt4627 != -1) {
			return arg0.anInt4627;
		}
		if (arg0.anInt4636 != -1) {
			@Pc(28) Class151 local28 = arg1.anInterface7_9.method4836(arg1.method4703() ? arg0.anInt4636 : arg0.anInt4630);
			if (!local28.aBoolean291) {
				return local28.aShort49;
			}
		}
		return arg0.anInt4635;
	}
}
