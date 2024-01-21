import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!ke", name = "x", descriptor = "[Lclient!bg;")
	public static Class2_Sub2_Sub3_Sub2[] aClass2_Sub2_Sub3_Sub2Array9;

	@OriginalMember(owner = "client!ke", name = "r", descriptor = "Lclient!ge;")
	public static Class30 aClass30_2 = new Class30();

	@OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
	public static int anInt3146 = 0;

	@OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
	public static int anInt3147 = 0;

	@OriginalMember(owner = "client!ke", name = "S", descriptor = "Lclient!ua;")
	public static Class82 aClass82_46 = new Class82(50);

	@OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
	public static int anInt3148 = 0;

	@OriginalMember(owner = "client!ke", name = "U", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1154 = Static146.method2172("(Udns");

	@OriginalMember(owner = "client!ke", name = "V", descriptor = "[I")
	public static int[] anIntArray464 = new int[5];

	@OriginalMember(owner = "client!ke", name = "W", descriptor = "Z")
	public static boolean aBoolean125 = true;

	@OriginalMember(owner = "client!ke", name = "X", descriptor = "Lclient!ua;")
	public static Class82 aClass82_47 = new Class82(64);

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
	public static void method2210() {
		aClass77_1154 = null;
		aClass82_47 = null;
		anIntArray464 = null;
		aClass82_46 = null;
		aClass30_2 = null;
		aClass2_Sub2_Sub3_Sub2Array9 = null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method2216(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString2 + " | ";
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(50) String local50 = local32.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			while (true) {
				@Pc(64) String local64 = local58.readLine();
				if (local64 == null) {
					return local10 + "| " + local61;
				}
				@Pc(70) int local70 = local64.indexOf(40);
				@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
				if (local70 >= 0 && local77 >= 0) {
					@Pc(91) String local91 = local64.substring(local70 + 1, local77);
					@Pc(95) int local95 = local91.indexOf(".java:");
					if (local95 >= 0) {
						local91 = local91.substring(0, local95) + local91.substring(local95 + 5);
						local10 = local10 + local91 + ' ';
						continue;
					}
					local64 = local64.substring(0, local70);
				}
				local64 = local64.trim();
				local64 = local64.substring(local64.lastIndexOf(32) + 1);
				local64 = local64.substring(local64.lastIndexOf(9) + 1);
				local10 = local10 + local64 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!qf;II)Lclient!sg;")
	public static Class77 method2226(@OriginalArg(0) Class66 arg0, @OriginalArg(2) int arg1) {
		if (!Static174.method2941(Static63.method1160(arg0), arg1) && arg0.anObjectArray6 == null) {
			return null;
		} else if (arg0.aClass77Array19 == null || arg0.aClass77Array19.length <= arg1 || arg0.aClass77Array19[arg1] == null || arg0.aClass77Array19[arg1].method2505().method2532() == 0) {
			return Static150.aBoolean150 ? Static146.method2168(new Class77[] { Static141.aClass77_1225, Static2.method61(arg1) }) : null;
		} else {
			return arg0.aClass77Array19[arg1];
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!ke;)V")
	public static void method2227(@OriginalArg(1) Class43 arg0) {
		Static51.aClass43_14 = arg0;
	}
}
