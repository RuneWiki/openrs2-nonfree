import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!pc", name = "x", descriptor = "Lclient!fd;")
	public static Class24 aClass24_25;

	@OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
	public static int anInt2284;

	@OriginalMember(owner = "client!pc", name = "A", descriptor = "[Lclient!kd;")
	public static Class2_Sub1_Sub2_Sub1[] aClass2_Sub1_Sub2_Sub1Array74;

	@OriginalMember(owner = "client!pc", name = "q", descriptor = "Lclient!ac;")
	public static Class3 aClass3_14 = new Class3();

	@OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
	public static int anInt2283 = 0;

	@OriginalMember(owner = "client!pc", name = "w", descriptor = "[J")
	public static long[] aLongArray7 = new long[200];

	@OriginalMember(owner = "client!pc", name = "z", descriptor = "Lclient!ob;")
	public static Class55 aClass55_70 = new Class55(500);

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public static void method1590() {
		for (@Pc(7) int local7 = 0; local7 < Static58.anInt1521; local7++) {
			@Pc(13) int local13 = Static73.anIntArray202[local7];
			@Pc(17) Class2_Sub1_Sub1_Sub3_Sub2 local17 = Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local13];
			@Pc(21) int local21 = Static7.aClass2_Sub9_Sub1_1.method640();
			if ((local21 & 0x2) != 0) {
				local21 += Static7.aClass2_Sub9_Sub1_1.method640() << 8;
			}
			Static101.method1797(local17, local13, local21);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method1593(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(18) String local18;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(23) RuntimeException_Sub1 local23 = (RuntimeException_Sub1) arg0;
			arg0 = local23.aThrowable1;
			local18 = local23.aString5 + " | ";
		} else {
			local18 = "";
		}
		@Pc(40) StringWriter local40 = new StringWriter();
		@Pc(45) PrintWriter local45 = new PrintWriter(local40);
		arg0.printStackTrace(local45);
		local45.close();
		@Pc(53) String local53 = local40.toString();
		@Pc(61) BufferedReader local61 = new BufferedReader(new StringReader(local53));
		@Pc(64) String local64 = local61.readLine();
		while (true) {
			while (true) {
				@Pc(67) String local67 = local61.readLine();
				if (local67 == null) {
					return local18 + "| " + local64;
				}
				@Pc(73) int local73 = local67.indexOf(40);
				@Pc(80) int local80 = local67.indexOf(41, local73 + 1);
				if (local73 >= 0 && local80 >= 0) {
					@Pc(94) String local94 = local67.substring(local73 + 1, local80);
					@Pc(98) int local98 = local94.indexOf(".java:");
					if (local98 >= 0) {
						local94 = local94.substring(0, local98) + local94.substring(local98 + 5);
						local18 = local18 + local94 + ' ';
						continue;
					}
					local67 = local67.substring(0, local73);
				}
				local67 = local67.trim();
				local67 = local67.substring(local67.lastIndexOf(32) + 1);
				local67 = local67.substring(local67.lastIndexOf(9) + 1);
				local18 = local18 + local67 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	public static void method1595() {
		aClass55_70 = null;
		aLongArray7 = null;
		aClass2_Sub1_Sub2_Sub1Array74 = null;
		aClass24_25 = null;
		aClass3_14 = null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BII)Z")
	public static boolean method1598(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 >> arg1 + 1 & 0x1) != 0;
	}
}
