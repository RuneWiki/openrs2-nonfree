import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "Lclient!w;")
	public static Class55_Sub1 aClass55_Sub1_16;

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "[I")
	public static int[] anIntArray320;

	@OriginalMember(owner = "client!rd", name = "w", descriptor = "Lclient!u;")
	public static Class62 aClass62_43;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
	public static int anInt2389 = 0;

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "[J")
	public static long[] aLongArray29 = new long[32];

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
	public static int anInt2390 = 0;

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
	public static volatile int anInt2391 = 0;

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1339 = Static15.method178("Add ignore");

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1338 = aClass23_1339;

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1340 = Static15.method178("Create a free account");

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1341 = Static15.method178("Offline");

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1342 = aClass23_1341;

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "[Lclient!w;")
	public static Class55_Sub1[] aClass55_Sub1Array1 = new Class55_Sub1[256];

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1343 = aClass23_1340;

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
	public static final int anInt2394 = 50;

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1344 = Static15.method178("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!rd", name = "v", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1345 = Static15.method178("k");

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method1523(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(15) String local15;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(5) RuntimeException_Sub1 local5 = (RuntimeException_Sub1) arg0;
			local15 = local5.aString8 + " | ";
			arg0 = local5.aThrowable1;
		} else {
			local15 = "";
		}
		@Pc(30) StringWriter local30 = new StringWriter();
		@Pc(35) PrintWriter local35 = new PrintWriter(local30);
		arg0.printStackTrace(local35);
		local35.close();
		@Pc(47) String local47 = local30.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local47));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			while (true) {
				@Pc(61) String local61 = local55.readLine();
				if (local61 == null) {
					return local15 + "| " + local58;
				}
				@Pc(67) int local67 = local61.indexOf(40);
				@Pc(74) int local74 = local61.indexOf(41, local67 + 1);
				if (local67 >= 0 && local74 >= 0) {
					@Pc(88) String local88 = local61.substring(local67 + 1, local74);
					@Pc(92) int local92 = local88.indexOf(".java:");
					if (local92 >= 0) {
						local88 = local88.substring(0, local92) + local88.substring(local92 + 5);
						local15 = local15 + local88 + ' ';
						continue;
					}
					local61 = local61.substring(0, local67);
				}
				local61 = local61.trim();
				local61 = local61.substring(local61.lastIndexOf(32) + 1);
				local61 = local61.substring(local61.lastIndexOf(9) + 1);
				local15 = local15 + local61 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZI)V")
	public static void method1524(@OriginalArg(1) int arg0) {
		if (arg0 == Static98.anInt2537) {
			return;
		}
		if (Static98.anInt2537 == 0) {
			Static9.method105();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static54.anInt1678 = 0;
			Static10.anInt208 = 0;
			Static26.anInt847 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static32.aClass68_2 != null) {
			Static32.aClass68_2.method1935();
			Static32.aClass68_2 = null;
		}
		if (Static98.anInt2537 == 25 || Static98.anInt2537 == 40) {
			Static96.method1113();
			Static24.method1576();
		}
		if (Static98.anInt2537 == 25) {
			Static27.anInt855 = 1;
			Static14.anInt274 = 0;
			Static109.anInt2833 = 1;
			Static87.anInt2853 = 0;
			Static11.anInt211 = 0;
		}
		if (arg0 == 35) {
			Static77.method1339();
			Static114.method1930();
			if (Static77.aClass34_58 == null) {
				Static77.aClass34_58 = Static114.method1928(765, Static26.aCanvas1, 503);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static77.aClass34_58 = null;
			Static77.method1339();
			Static115.method1936(Static87.aClass55_Sub1_18, Static26.aCanvas1, aClass55_Sub1_16);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			Static77.aClass34_58 = null;
			Static114.method1930();
			Static108.method1839(Static26.aCanvas1, aClass55_Sub1_16);
		}
		Static54.aBoolean86 = true;
		Static98.anInt2537 = arg0;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	public static void method1525() {
		aClass23_1344 = null;
		aLongArray29 = null;
		aClass23_1345 = null;
		aClass23_1341 = null;
		aClass55_Sub1_16 = null;
		aClass62_43 = null;
		aClass23_1340 = null;
		aClass23_1342 = null;
		anIntArray320 = null;
		aClass23_1339 = null;
		aClass23_1343 = null;
		aClass23_1338 = null;
		aClass55_Sub1Array1 = null;
	}
}
