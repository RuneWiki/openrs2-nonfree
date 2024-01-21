import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!q", name = "h", descriptor = "I")
	public static int anInt2872;

	@OriginalMember(owner = "client!q", name = "S", descriptor = "Lclient!pb;")
	public static Class1_Sub1_Sub4_Sub4 aClass1_Sub1_Sub4_Sub4_7;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1392 = Static108.method1915(")1j");

	@OriginalMember(owner = "client!q", name = "e", descriptor = "I")
	public static int anInt2869 = -1;

	@OriginalMember(owner = "client!q", name = "t", descriptor = "I")
	public static int anInt2879 = 0;

	@OriginalMember(owner = "client!q", name = "v", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1393 = Static108.method1915("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!q", name = "O", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1394 = Static108.method1915("Die Verbindung konnte");

	@OriginalMember(owner = "client!q", name = "Q", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1395 = Static108.method1915("nav");

	@OriginalMember(owner = "client!q", name = "W", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1396 = Static108.method1915("headicons_prayer");

	@OriginalMember(owner = "client!q", name = "Y", descriptor = "I")
	public static int anInt2898 = 0;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IZ)V")
	public static void method2002(@OriginalArg(1) boolean arg0) {
		if (Static71.aClass74_3 == null) {
			return;
		}
		try {
			@Pc(15) Class1_Sub18 local15 = new Class1_Sub18(4);
			local15.method2168(arg0 ? 2 : 3);
			local15.method2188(0);
			Static71.aClass74_3.method2055(local15.aByteArray96, 4);
		} catch (@Pc(36) IOException local36) {
			try {
				Static71.aClass74_3.method2047();
			} catch (@Pc(41) Exception local41) {
			}
			Static90.anInt2124++;
			Static71.aClass74_3 = null;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V")
	public static void method2004(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static3.method75(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static13.aClass79_1.anApplet1 != null) {
				@Pc(108) Class34 local108 = Static13.aClass79_1.method2094(new URL(Static13.aClass79_1.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static34.anInt1062 + "&u=" + Static33.aLong23 + "&v1=" + Static125.aString3 + "&v2=" + Static125.aString5 + "&e=" + local7));
				while (local108.anInt1567 == 0) {
					Static96.method1616(1L);
				}
				if (local108.anInt1567 == 1) {
					@Pc(124) DataInputStream local124 = (DataInputStream) local108.anObject2;
					local124.read();
					local124.close();
				}
			}
		} catch (@Pc(131) Exception local131) {
		}
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(IZ)I")
	public static int method2009(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
		@Pc(25) int local25 = (local9 & 0x33333333) + ((local9 & 0xCCCCCCCD) >>> 2);
		@Pc(38) int local38 = local25 + (local25 >>> 4) & 0xF0F0F0F;
		@Pc(44) int local44 = local38 + (local38 >>> 8);
		@Pc(50) int local50 = local44 + (local44 >>> 16);
		return local50 & 0xFF;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
	public static void method2018() {
		aClass39_1392 = null;
		aClass1_Sub1_Sub4_Sub4_7 = null;
		aClass39_1396 = null;
		aClass39_1393 = null;
		aClass39_1394 = null;
		aClass39_1395 = null;
	}
}
