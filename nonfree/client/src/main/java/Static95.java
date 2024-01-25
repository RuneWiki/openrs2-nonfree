import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!f", name = "n", descriptor = "Lclient!oh;")
	public static Class150 aClass150_6;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "Lclient!us;")
	public static final Class234 aClass234_127 = new Class234(82, 6);

	@OriginalMember(owner = "client!f", name = "l", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_94 = new Class57("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!f", name = "m", descriptor = "[Lclient!kn;")
	public static final Class135_Sub1[] aClass135_Sub1Array4 = new Class135_Sub1[29];

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!km;)I")
	public static int method5453(@OriginalArg(1) Class28_Sub1_Sub1_Sub1 arg0) {
		@Pc(13) Class61 local13 = arg0.aClass61_1;
		if (local13.anIntArray142 != null) {
			local13 = local13.method1216(Static331.aClass115_1);
			if (local13 == null) {
				return -1;
			}
		}
		@Pc(30) int local30 = local13.anInt1443;
		@Pc(34) Class36 local34 = arg0.method4014();
		if (arg0.aBoolean340) {
			local30 = local13.anInt1431;
		} else if (local34.anInt684 == arg0.anInt4333 || local34.anInt665 == arg0.anInt4333 || local34.anInt696 == arg0.anInt4333 || arg0.anInt4333 == local34.anInt659) {
			local30 = local13.anInt1430;
		} else if (arg0.anInt4333 == local34.anInt686 || local34.anInt664 == arg0.anInt4333 || local34.anInt685 == arg0.anInt4333 || local34.anInt697 == arg0.anInt4333) {
			local30 = local13.anInt1466;
		}
		return local30;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!mj;ILjava/lang/String;I)Lclient!kj;")
	public static Class133 method5463(@OriginalArg(0) Class156 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 == 0) {
			return arg0.method3663(arg2);
		}
		@Pc(39) Class133 local39;
		if (arg1 == 1) {
			try {
				Static398.method1715("openjs", arg0.anApplet1, new Object[] { (new URL(arg0.anApplet1.getCodeBase(), arg2)).toString() });
				local39 = new Class133();
				local39.anInt3257 = 1;
				return local39;
			} catch (@Pc(45) Throwable local45) {
				local39 = new Class133();
				local39.anInt3257 = 2;
				return local39;
			}
		} else if (arg1 == 2) {
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg2), "_blank");
				local39 = new Class133();
				local39.anInt3257 = 1;
				return local39;
			} catch (@Pc(79) Exception local79) {
				local39 = new Class133();
				local39.anInt3257 = 2;
				return local39;
			}
		} else if (arg1 == 3) {
			try {
				Static398.method1714(arg0.anApplet1, "loggedout");
			} catch (@Pc(101) Throwable local101) {
			}
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg2), "_top");
				local39 = new Class133();
				local39.anInt3257 = 1;
				return local39;
			} catch (@Pc(123) Exception local123) {
				local39 = new Class133();
				local39.anInt3257 = 2;
				return local39;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!hi;Lclient!b;Lclient!b;Lclient!b;I)Z")
	public static boolean method5491(@OriginalArg(0) Class3_Sub8_Sub4 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) Class20 arg3) {
		Static187.aClass20_46 = arg2;
		Static134.aClass20_38 = arg1;
		Static69.aClass3_Sub8_Sub4_1 = arg0;
		Static282.aClass20_65 = arg3;
		return true;
	}
}
