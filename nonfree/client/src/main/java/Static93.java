import java.awt.event.ActionEvent;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "[I")
	public static int[] anIntArray403;

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "Lclient!he;")
	public static Class1_Sub10 aClass1_Sub10_12;

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
	public static int anInt2398;

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1333 = null;

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1334 = Static106.method1849(" x ");

	@OriginalMember(owner = "client!qe", name = "q", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1335 = Static106.method1849(" loggt sich ein)3");

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V")
	public static void method1707(@OriginalArg(0) int arg0) {
		Static129.anInt2914 = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILjava/lang/Object;Lclient!bb;)V")
	public static void method1708(@OriginalArg(1) Object arg0, @OriginalArg(2) Class7 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 50 && arg1.anEventQueue1.peekEvent() != null; local15++) {
			Static13.method399(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method1709(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static134.method2056(arg0);
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
			if (Static19.aClass7_2.anApplet1 != null) {
				@Pc(103) Class32 local103 = Static19.aClass7_2.method284(new URL(Static19.aClass7_2.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static134.anInt2950 + "&u=" + Static102.aLong108 + "&v1=" + Static7.aString3 + "&v2=" + Static7.aString2 + "&e=" + local7));
				while (local103.anInt1494 == 0) {
					Static13.method399(1L);
				}
				if (local103.anInt1494 == 1) {
					@Pc(122) DataInputStream local122 = (DataInputStream) local103.anObject4;
					local122.read();
					local122.close();
				}
			}
		} catch (@Pc(129) Exception local129) {
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLclient!mc;)V")
	public static void method1710(@OriginalArg(1) Class1_Sub12 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static56.aClass72_4 != null) {
			@Pc(20) int local20;
			try {
				Static56.aClass72_4.method1942(0L);
				Static56.aClass72_4.method1937(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(43) Exception local43) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method1199(local8, 24);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	public static void method1711() {
		aClass66_1335 = null;
		aClass1_Sub10_12 = null;
		aClass66_1334 = null;
		anIntArray403 = null;
		aClass66_1333 = null;
	}
}
