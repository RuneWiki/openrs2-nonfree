import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!dba", name = "j", descriptor = "Lclient!tm;")
	public static Class338 aClass338_238;

	@OriginalMember(owner = "client!dba", name = "d", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray167 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!dba", name = "e", descriptor = "[I")
	public static int[] anIntArray961 = new int[1];

	@OriginalMember(owner = "client!dba", name = "k", descriptor = "[I")
	public static final int[] anIntArray962 = new int[8];

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIB)B")
	public static byte method9375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(III)Z")
	public static boolean method9376(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method9379(@OriginalArg(1) String arg0) {
		@Pc(17) String local17 = Static491.method7085(Static59.method1278(arg0));
		if (local17 == null) {
			local17 = "";
		}
		return local17;
	}

	@OriginalMember(owner = "client!dba", name = "c", descriptor = "(B)V")
	public static void method9381() throws IOException {
		if (Static559.aClass269_1 == null || Static57.anInt1186 <= 0) {
			return;
		}
		Static469.aClass3_Sub25_7.anInt9765 = 0;
		while (true) {
			@Pc(21) Class3_Sub34 local21 = (Class3_Sub34) Static443.aClass338_171.method8177();
			if (local21 == null || Static469.aClass3_Sub25_7.aByteArray106.length - Static469.aClass3_Sub25_7.anInt9765 < local21.anInt5095) {
				Static559.aClass269_1.method6698(Static469.aClass3_Sub25_7.anInt9765, Static469.aClass3_Sub25_7.aByteArray106);
				Static213.anInt4078 = 0;
				Static214.anInt4083 += Static469.aClass3_Sub25_7.anInt9765;
				break;
			}
			Static469.aClass3_Sub25_7.method8637(local21.aClass3_Sub25_Sub1_2.aByteArray106, local21.anInt5095, 0);
			Static57.anInt1186 -= local21.anInt5095;
			local21.method9380();
			local21.aClass3_Sub25_Sub1_2.method8648();
			local21.method4668();
		}
	}
}
