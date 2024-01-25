import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
	public static int anInt2187;

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "Lclient!vn;")
	public static Class211 aClass211_8;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
	public static int anInt2186 = -1;

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "Z")
	public static boolean aBoolean140 = false;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString132 = "Ok";

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "[I")
	public static final int[] anIntArray128 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method2012(@OriginalArg(1) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static19.anInt548 > 0) {
			local21 = Static158.aByteArrayArray9[--Static19.anInt548];
			Static158.aByteArrayArray9[Static19.anInt548] = null;
			return local21;
		} else if (arg0 == 5000 && Static24.anInt2003 > 0) {
			local21 = Static272.aByteArrayArray18[--Static24.anInt2003];
			Static272.aByteArrayArray18[Static24.anInt2003] = null;
			return local21;
		} else if (arg0 == 30000 && Static56.anInt1365 > 0) {
			local21 = Static24.aByteArrayArray5[--Static56.anInt1365];
			Static24.aByteArrayArray5[Static56.anInt1365] = null;
			return local21;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!am;BIIII)Ljava/awt/Frame;")
	public static Frame method2014(@OriginalArg(0) Class10 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (!arg0.method313()) {
			return null;
		}
		@Pc(25) Class43[] local25 = Static276.method4705(arg0);
		if (local25 == null) {
			return null;
		}
		@Pc(31) boolean local31 = false;
		for (@Pc(33) int local33 = 0; local33 < local25.length; local33++) {
			if (arg1 == local25[local33].anInt1217 && local25[local33].anInt1214 == arg2 && (!local31 || local25[local33].anInt1213 > arg3)) {
				local31 = true;
				arg3 = local25[local33].anInt1213;
			}
		}
		if (!local31) {
			return null;
		}
		@Pc(106) Class60 local106 = arg0.method320(arg2, arg3, arg1);
		while (local106.anInt1838 == 0) {
			Static105.method2138(10L);
		}
		@Pc(118) Frame local118 = (Frame) local106.anObject2;
		if (local118 == null) {
			return null;
		} else if (local106.anInt1838 == 2) {
			Static138.method2590(local118, arg0);
			return null;
		} else {
			return local118;
		}
	}
}
