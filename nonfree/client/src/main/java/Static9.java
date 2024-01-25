import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ak", name = "Z", descriptor = "I")
	public static int anInt195;

	@OriginalMember(owner = "client!ak", name = "A", descriptor = "[I")
	public static final int[] anIntArray12 = new int[1];

	@OriginalMember(owner = "client!ak", name = "N", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_8 = new Class214(96, 1);

	@OriginalMember(owner = "client!ak", name = "T", descriptor = "Lclient!ge;")
	public static final Class83 aClass83_3 = new Class83(64);

	@OriginalMember(owner = "client!ak", name = "V", descriptor = "[I")
	public static final int[] anIntArray13 = new int[1];

	@OriginalMember(owner = "client!ak", name = "W", descriptor = "I")
	public static int anInt192 = 0;

	@OriginalMember(owner = "client!ak", name = "X", descriptor = "I")
	public static int anInt193 = 1;

	@OriginalMember(owner = "client!ak", name = "Y", descriptor = "I")
	public static int anInt194 = -1;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method159(@OriginalArg(0) String arg0) {
		return Static429.method5905(arg0);
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)I")
	public static int method160(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		local60 /= 6.0D;
		@Pc(160) int local160 = (int) (local60 * 256.0D);
		@Pc(165) int local165 = (int) (local62 * 256.0D);
		if (local165 < 0) {
			local165 = 0;
		} else if (local165 > 255) {
			local165 = 255;
		}
		@Pc(184) int local184 = (int) (local68 * 256.0D);
		if (local184 < 0) {
			local184 = 0;
		} else if (local184 > 255) {
			local184 = 255;
		}
		if (local184 > 243) {
			local165 >>= 0x4;
		} else if (local184 > 217) {
			local165 >>= 0x3;
		} else if (local184 > 192) {
			local165 >>= 0x2;
		} else if (local184 > 179) {
			local165 >>= 0x1;
		}
		return (local184 >> 1) + (local165 >> 5 << 7) + ((local160 >> 2 & 0x3F) << 10);
	}
}
