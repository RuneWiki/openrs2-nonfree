import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!gg", name = "K", descriptor = "Lclient!pk;")
	public static Class132 aClass132_35;

	@OriginalMember(owner = "client!gg", name = "Q", descriptor = "[I")
	public static int[] anIntArray128;

	@OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
	public static int anInt1896 = 0;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BI)V")
	public static void method1439(@OriginalArg(1) int arg0) {
		if (arg0 == Static87.anInt1862) {
			@Pc(18) Interface5 local18 = Static246.anInterface5Array1[arg0];
			local18.method4314(Static60.anInt1300);
		}
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(III)V")
	public static void method1440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static92.method1483(arg1)) {
			Static266.method4008(arg0, Static210.aClass159ArrayArray6[arg1]);
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method1441(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return "<col=ffff00>" + arg0 + "</col>";
		} else if (arg0 >= 10000000) {
			return "<col=00ff80>" + arg0 / 1000000 + Static10.aString11 + "</col>";
		} else {
			return "<col=ffffff>" + arg0 / 1000 + Static169.aString117 + "</col>";
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!vb;Lclient!vb;)V")
	public static void method1443(@OriginalArg(1) Class8 arg0, @OriginalArg(2) Class8 arg1) {
		if (arg0.aClass8_228 != null) {
			arg0.method4273();
		}
		arg0.aClass8_229 = arg1;
		arg0.aClass8_228 = arg1.aClass8_228;
		arg0.aClass8_228.aClass8_229 = arg0;
		arg0.aClass8_229.aClass8_228 = arg0;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void method1444(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static273.method4054(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static58.method1726(local7);
			local7 = Static77.method1226(":", "%3a", local7);
			local7 = Static77.method1226("@", "%40", local7);
			local7 = Static77.method1226("&", "%26", local7);
			local7 = Static77.method1226("#", "%23", local7);
			if (Static141.aClass17_2.anApplet1 == null) {
				return;
			}
			@Pc(110) Class163 local110 = Static141.aClass17_2.method451(new URL(Static141.aClass17_2.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static273.anInt5363 + "&u=" + Static222.aLong165 + "&v1=" + Static26.aString28 + "&v2=" + Static26.aString26 + "&e=" + local7));
			while (local110.anInt5259 == 0) {
				Static162.method2645(1L);
			}
			if (local110.anInt5259 == 1) {
				@Pc(134) DataInputStream local134 = (DataInputStream) local110.anObject7;
				local134.read();
				local134.close();
			}
		} catch (@Pc(141) Exception local141) {
		}
	}
}
