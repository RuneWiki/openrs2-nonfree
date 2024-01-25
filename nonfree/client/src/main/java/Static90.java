import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "[Lclient!iaa;")
	public static final Class6_Sub26[] aClass6_Sub26Array1 = new Class6_Sub26[300];

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
	public static int anInt1698 = 0;

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "Lclient!bt;")
	public static final Class43 aClass43_3 = new Class43();

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method1508(@OriginalArg(1) int arg0) {
		@Pc(19) byte[] local19;
		if (arg0 == 100 && Static243.anInt4303 > 0) {
			local19 = Static57.aByteArrayArray7[--Static243.anInt4303];
			Static57.aByteArrayArray7[Static243.anInt4303] = null;
			return local19;
		} else if (arg0 == 5000 && Static511.anInt6139 > 0) {
			local19 = Static34.aByteArrayArray3[--Static511.anInt6139];
			Static34.aByteArrayArray3[Static511.anInt6139] = null;
			return local19;
		} else if (arg0 == 30000 && Static36.anInt870 > 0) {
			local19 = Static270.aByteArrayArray13[--Static36.anInt870];
			Static270.aByteArrayArray13[Static36.anInt870] = null;
			return local19;
		} else {
			if (Static158.aByteArrayArrayArray3 != null) {
				for (@Pc(82) int local82 = 0; local82 < Static474.anIntArray457.length; local82++) {
					if (arg0 == Static474.anIntArray457[local82] && Static245.anIntArray254[local82] > 0) {
						@Pc(109) byte[] local109 = Static158.aByteArrayArrayArray3[local82][--Static245.anIntArray254[local82]];
						Static158.aByteArrayArrayArray3[local82][Static245.anIntArray254[local82]] = null;
						return local109;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I[B)V")
	public static synchronized void method1510(@OriginalArg(1) byte[] arg0) {
		if (arg0.length == 100 && Static243.anInt4303 < 1000) {
			Static57.aByteArrayArray7[Static243.anInt4303++] = arg0;
		} else if (arg0.length == 5000 && Static511.anInt6139 < 250) {
			Static34.aByteArrayArray3[Static511.anInt6139++] = arg0;
		} else if (arg0.length == 30000 && Static36.anInt870 < 50) {
			Static270.aByteArrayArray13[Static36.anInt870++] = arg0;
		} else if (Static158.aByteArrayArrayArray3 != null) {
			for (@Pc(69) int local69 = 0; local69 < Static474.anIntArray457.length; local69++) {
				if (Static474.anIntArray457[local69] == arg0.length && Static158.aByteArrayArrayArray3[local69].length > Static245.anIntArray254[local69]) {
					Static158.aByteArrayArrayArray3[local69][Static245.anIntArray254[local69]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!gga;B)V")
	public static void method1511(@OriginalArg(0) Class6_Sub23 arg0) {
		if (arg0.aByteArray101.length - arg0.anInt9901 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method8374();
		if (local19 < 0 || local19 > 1 || arg0.aByteArray101.length - arg0.anInt9901 < 2) {
			return;
		}
		@Pc(45) int local45 = arg0.method8363();
		if (local45 * 6 > arg0.aByteArray101.length - arg0.anInt9901) {
			return;
		}
		for (@Pc(59) int local59 = 0; local59 < local45; local59++) {
			@Pc(65) int local65 = arg0.method8363();
			@Pc(69) int local69 = arg0.method8369();
			if (Static466.anIntArray529.length > local65 && Static620.aBooleanArray33[local65] && (Static289.aClass275_1.method6856(local65).aChar2 != '1' || local69 >= -1 && local69 <= 1)) {
				Static466.anIntArray529[local65] = local69;
			}
		}
	}
}
