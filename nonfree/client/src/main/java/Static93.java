import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!fk", name = "Y", descriptor = "Lclient!te;")
	public static final Class188 aClass188_2 = new Class188(16);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!ri;I)V")
	public static void method1567(@OriginalArg(0) Class8_Sub7 arg0) {
		arg0.aClass5_1 = null;
		@Pc(20) int local20 = arg0.aClass8_Sub2Array1.length;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			arg0.aClass8_Sub2Array1[local22].aBoolean22 = false;
		}
		@Pc(40) Class65[] local40 = Class13.aClass65Array1;
		synchronized (Class13.aClass65Array1) {
			if (Class13.aClass65Array1.length > local20 && Static329.anIntArray528[local20] < 200) {
				Class13.aClass65Array1[local20].method1458(arg0);
				@Pc(67) int local67 = Static329.anIntArray528[local20]++;
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!wh;ILclient!ir;)V")
	public static void method1568(@OriginalArg(0) Interface9 arg0, @OriginalArg(2) Class100 arg1) {
		Static123.anInterface9_2 = arg0;
		Static136.aClass100_62 = arg1;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZLclient!de;Ljava/lang/String;ZB)V")
	public static void method1569(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		if (!arg3) {
			Static140.method2315(arg2, arg1, 3);
			return;
		}
		@Pc(26) String local26;
		if (Static59.aString40.startsWith("win") && Static59.anInt1274 != 3) {
			local26 = null;
			if (arg1.anApplet1 != null) {
				local26 = arg1.anApplet1.getParameter("haveie6");
			}
			if (local26 == null || !local26.equals("1")) {
				@Pc(46) Class207 local46 = Static140.method2315(arg2, arg1, 0);
				Static81.aClass42_4 = arg1;
				Static9.aClass207_1 = local46;
				Static71.aString191 = arg2;
				return;
			}
		}
		if (Static59.aString40.startsWith("mac")) {
			local26 = null;
			if (arg1.anApplet1 != null) {
				local26 = arg1.anApplet1.getParameter("havefirefox");
			}
			if (local26 != null && local26.equals("1") && arg0) {
				Static140.method2315(arg2, arg1, 1);
				return;
			}
		}
		Static140.method2315(arg2, arg1, 2);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IC)Z")
	public static boolean method1570(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(35) char[] local35 = Static89.aCharArray12;
			for (@Pc(37) int local37 = 0; local37 < local35.length; local37++) {
				@Pc(43) char local43 = local35[local37];
				if (local43 == arg0) {
					return true;
				}
			}
		}
		return false;
	}
}
