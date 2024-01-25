import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!eba", name = "o", descriptor = "I")
	public static int anInt2113;

	@OriginalMember(owner = "client!eba", name = "p", descriptor = "Lclient!ip;")
	public static Class141 aClass141_1;

	@OriginalMember(owner = "client!eba", name = "x", descriptor = "I")
	public static int anInt2118;

	@OriginalMember(owner = "client!eba", name = "F", descriptor = "Z")
	public static boolean aBoolean179 = false;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IILclient!et;)I")
	public static int method2034(@OriginalArg(1) int arg0, @OriginalArg(2) Class91 arg1) {
		if (!Static63.method1580(arg1).method1748(arg0) && arg1.anObjectArray30 == null) {
			return -1;
		} else if (arg1.anIntArray186 == null || arg1.anIntArray186.length <= arg0) {
			return -1;
		} else {
			return arg1.anIntArray186[arg0];
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;")
	public static String method2035(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(18) String local18;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(23) RuntimeException_Sub1 local23 = (RuntimeException_Sub1) arg0;
			arg0 = local23.aThrowable1;
			local18 = local23.aString125 + " | ";
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
			@Pc(67) String local67 = local61.readLine();
			if (local67 == null) {
				return local18 + "| " + local64;
			}
			@Pc(73) int local73 = local67.indexOf(40);
			@Pc(80) int local80 = local67.indexOf(41, local73 + 1);
			@Pc(88) String local88;
			if (local73 == -1) {
				local88 = local67;
			} else {
				local88 = local67.substring(0, local73);
			}
			local88 = local88.trim();
			local88 = local88.substring(local88.lastIndexOf(32) + 1);
			local88 = local88.substring(local88.lastIndexOf(9) + 1);
			local18 = local18 + local88;
			if (local73 != -1 && local80 != -1) {
				@Pc(132) int local132 = local67.indexOf(".java:", local73);
				if (local132 >= 0) {
					local18 = local18 + local67.substring(local132 + 5, local80);
				}
			}
			local18 = local18 + ' ';
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZB)V")
	public static void method2036(@OriginalArg(0) boolean arg0) {
		Static422.method6584();
		if (!Static215.method3993(Static186.anInt3863)) {
			return;
		}
		Static201.anInt4048++;
		if (Static201.anInt4048 < 50 && !arg0) {
			return;
		}
		Static201.anInt4048 = 0;
		if (!Static107.aBoolean189 && Static200.aClass134_2 != null) {
			Static216.method3997(Static384.aClass252_97);
			try {
				Static200.aClass134_2.method8117(Static259.aClass1_Sub17_Sub2_1.aByteArray58, Static259.aClass1_Sub17_Sub2_1.anInt4872);
				Static259.aClass1_Sub17_Sub2_1.anInt4872 = 0;
			} catch (@Pc(52) IOException local52) {
				Static107.aBoolean189 = true;
			}
		}
		Static422.method6584();
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(FIIIIIZI)[I")
	public static int[] method2037(@OriginalArg(0) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class1_Sub3_Sub2 local10 = new Class1_Sub3_Sub2();
		local10.aBoolean18 = true;
		local10.anInt313 = 4;
		local10.anInt315 = 8;
		local10.anInt314 = 35;
		local10.anInt306 = 8;
		local10.anInt309 = (int) (arg0 * 4096.0F);
		local10.method8197();
		Static338.method3566(2048, 1);
		local10.method512(local6, 0);
		return local6;
	}
}
