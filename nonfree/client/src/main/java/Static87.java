import java.applet.Applet;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!de", name = "J", descriptor = "I")
	public static int anInt2167;

	@OriginalMember(owner = "client!de", name = "K", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!de", name = "M", descriptor = "[Z")
	public static boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!de", name = "N", descriptor = "Lclient!co;")
	public static Class6_Sub10_Sub1 aClass6_Sub10_Sub1_1;

	@OriginalMember(owner = "client!de", name = "D", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray9 = new String[200];

	@OriginalMember(owner = "client!de", name = "F", descriptor = "I")
	public static int anInt2163 = -1;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;II)Z")
	public static boolean method1963(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (Static414.aClass246_5.aBoolean534) {
			Static293.aClass275_2 = new Class275();
			Static293.aClass275_2.aString100 = arg0;
			Static293.aClass275_2.anInt7968 = arg1;
			if (Static230.aClass123_8 != Static186.aClass123_6) {
				Static293.aClass275_2.anInt7972 = Static293.aClass275_2.anInt7968 + 40000;
				Static293.aClass275_2.anInt7971 = Static293.aClass275_2.anInt7968 + 50000;
			}
			if (arg1 < Static199.aClass116_Sub1Array1.length && Static199.aClass116_Sub1Array1[arg1] != null) {
				Static167.anInt3844 = Static199.aClass116_Sub1Array1[arg1].anInt3892;
			}
			return true;
		}
		@Pc(56) String local56 = "";
		if (Static186.aClass123_6 != Static230.aClass123_8) {
			local56 = ":" + (arg1 + 7000);
		}
		@Pc(71) String local71 = "";
		if (Static166.aString38 != null) {
			local71 = "/p=" + Static166.aString38;
		}
		@Pc(119) String local119 = "http://" + arg0 + local56 + "/l=" + Static286.anInt5468 + "/a=" + Static294.anInt5607 + local71 + "/j" + (Static214.aBoolean361 ? "1" : "0") + ",o" + (Static445.aBoolean599 ? "1" : "0") + ",a2";
		try {
			Static363.aClient1.getAppletContext().showDocument(new URL(local119), "_self");
			return true;
		} catch (@Pc(129) Exception local129) {
			return false;
		}
	}
}
