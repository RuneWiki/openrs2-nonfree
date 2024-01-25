import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!df", name = "tc", descriptor = "Lclient!mja;")
	public static final Class234 aClass234_1 = new Class234("stellardawn", "Stellar Dawn", 1);

	@OriginalMember(owner = "client!df", name = "Cc", descriptor = "I")
	public static int anInt1911 = 0;

	@OriginalMember(owner = "client!df", name = "Fc", descriptor = "Z")
	public static boolean aBoolean127 = false;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B[B)Ljava/lang/String;")
	public static String method1868(@OriginalArg(1) byte[] arg0) {
		return Static407.method2208(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(IIII)V")
	public static void method1871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class4_Sub5_Sub11 local9 = Static652.method8695((long) arg0, 9);
		local9.method3955();
		local9.anInt4425 = arg1;
		local9.anInt4427 = arg2;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I[BI)[B")
	public static byte[] method1878(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static685.method6464(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
