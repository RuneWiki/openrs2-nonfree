import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "[Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array4;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "Lclient!qf;")
	public static Class60 aClass60_677 = Static59.method1195("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "Lclient!eb;")
	public static Class17 aClass17_27 = new Class17(50);

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "Lclient!qf;")
	public static Class60 aClass60_678 = Static59.method1195(" loggt sich aus)3");

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
	public static int anInt1559 = 0;

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "Lclient!qf;")
	public static Class60 aClass60_679 = Static59.method1195("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method1031(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static82.method1660(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static73.aClass74_3.anApplet1 != null) {
				@Pc(101) Class7 local101 = Static73.aClass74_3.method2125(new URL(Static73.aClass74_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static11.anInt344 + "&u=" + Static68.aLong77 + "&v1=" + Static116.aString3 + "&v2=" + Static116.aString5 + "&e=" + local7));
				while (local101.anInt148 == 0) {
					Static126.method2277(1L);
				}
				if (local101.anInt148 == 1) {
					@Pc(125) DataInputStream local125 = (DataInputStream) local101.anObject1;
					local125.read();
					local125.close();
				}
			}
		} catch (@Pc(132) Exception local132) {
		}
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V")
	public static void method1034() {
		aClass60_678 = null;
		aClass60_677 = null;
		aClass60_679 = null;
		aClass3_Sub1_Sub2_Sub4Array4 = null;
		aClass17_27 = null;
	}
}
