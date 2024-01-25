import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!dj", name = "w", descriptor = "Lclient!uaa;")
	public static final Class288 aClass288_7 = new Class288(4);

	@OriginalMember(owner = "client!dj", name = "E", descriptor = "[B")
	public static final byte[] aByteArray31 = new byte[2048];

	@OriginalMember(owner = "client!dj", name = "I", descriptor = "I")
	public static int anInt2142 = -1;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZ)V")
	public static void method1973(@OriginalArg(1) boolean arg0) {
		Static393.method5729(Static456.anInt7874, arg0, Static395.anInt7085, Static383.anInt6994);
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V")
	public static void method1976() {
		Static59.aClass18_1.method5978();
		Static280.aClass214_1.method6768();
		Static263.aClient1.method1279();
		Static209.aCanvas6.setBackground(Color.black);
		Static422.anInt7463 = -1;
		Static59.aClass18_1 = Static366.method5587(Static209.aCanvas6);
		Static280.aClass214_1 = Static4.method5498(Static209.aCanvas6);
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(IZ)V")
	public static void method1978(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static395.anInt7085 != -1) {
				Static492.method6830(Static395.anInt7085);
			}
			for (@Pc(23) Class5_Sub43 local23 = (Class5_Sub43) Static307.aClass42_24.method1103(); local23 != null; local23 = (Class5_Sub43) Static307.aClass42_24.method1105()) {
				if (!local23.method7426()) {
					local23 = (Class5_Sub43) Static307.aClass42_24.method1103();
					if (local23 == null) {
						break;
					}
				}
				Static343.method5317(true, false, local23);
			}
			Static395.anInt7085 = -1;
			Static307.aClass42_24 = new Class42(8);
			Static304.method4998();
			Static395.anInt7085 = Static314.anInt4187;
			method1973(false);
			Static544.method2108();
			Static266.method4402(Static395.anInt7085);
		}
		Static428.aBoolean536 = true;
	}
}
