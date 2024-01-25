import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static89 {

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIII)I")
	public static int method1599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg0 >>= 0x4;
		} else if (arg2 > 217) {
			arg0 >>= 0x3;
		} else if (arg2 > 192) {
			arg0 >>= 0x2;
		} else if (arg2 > 179) {
			arg0 >>= 0x1;
		}
		return (arg2 >> 1) + (((arg1 >> 2 & 0x3F) << 10) + (arg0 >> 5 << 7));
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1601(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			Static429.method5476(Static327.aClass215_76);
			Static3.aClass4_Sub12_Sub1_5.method2551(Static269.method3856(arg0));
			Static3.aClass4_Sub12_Sub1_5.method2518(arg0);
		}
	}
}
