import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "Lclient!wn;")
	public static Class391 aClass391_9;

	@OriginalMember(owner = "client!cs", name = "f", descriptor = "I")
	public static int anInt9954 = 0;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method8410(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BLclient!kf;)V")
	public static void method8412(@OriginalArg(1) Class2_Sub1_Sub1_Sub3_Sub2 arg0) {
		for (@Pc(17) Class6_Sub35 local17 = (Class6_Sub35) Static247.aClass362_20.method8538(); local17 != null; local17 = (Class6_Sub35) Static247.aClass362_20.method8530()) {
			if (local17.aClass2_Sub1_Sub1_Sub3_Sub2_1 == arg0) {
				if (local17.aClass6_Sub8_Sub5_2 != null) {
					Static106.aClass6_Sub8_Sub3_2.method4258(local17.aClass6_Sub8_Sub5_2);
					local17.aClass6_Sub8_Sub5_2 = null;
				}
				local17.method9174();
				return;
			}
		}
	}
}
