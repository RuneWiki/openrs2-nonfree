import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!de", name = "f", descriptor = "I")
	public static int anInt2688;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "Lclient!uw;")
	public static final Class350 aClass350_3 = new Class350("", 10);

	@OriginalMember(owner = "client!de", name = "e", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_23 = new Class94(47, 4);

	@OriginalMember(owner = "client!de", name = "g", descriptor = "[I")
	public static final int[] anIntArray129 = new int[32];

	@OriginalMember(owner = "client!de", name = "h", descriptor = "[I")
	public static int[] anIntArray130 = new int[2];

	@OriginalMember(owner = "client!de", name = "i", descriptor = "Lclient!kn;")
	public static final Class181 aClass181_3 = new Class181(4, 7);

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(B)Z")
	public static boolean method2532() {
		return Static614.anInt10750 != 0;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IJ)V")
	public static void method2533(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(15) InterruptedException local15) {
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/io/File;I)[B")
	public static byte[] method2534(@OriginalArg(0) int arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(14) byte[] local14 = new byte[arg0];
			Static174.method3641(local14, arg0, arg1);
			return local14;
		} catch (@Pc(22) IOException local22) {
			return null;
		}
	}
}
